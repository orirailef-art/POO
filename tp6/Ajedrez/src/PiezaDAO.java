import java.sql.*;
import java.time.LocalDate;

public class PiezaDAO {

    private Connection con;

    public PiezaDAO() {
        AccesoDatos acceso = new AccesoDatos();
        this.con = acceso.getConexion();
    }

    //  insertar
    public void insertarPieza(Pieza pieza) {
        String sql = "INSERT INTO pieza (Descripcion, idColor, idTipoPieza, Posicion, "
                   + "Movimiento, Comportamiento, Velocidad, Fecha_Creacion) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {

            int idColor = obtenerIdColor(pieza.getColor());
            int idTipo = obtenerIdTipoPieza(pieza.getTipo());

            if (idColor == -1 || idTipo == -1) {
                System.err.println("No se pudo obtener el color o el tipo de pieza.");
                return;
            }

            stmt.setString(1, pieza.getDescripcion());
            stmt.setInt(2, idColor);
            stmt.setInt(3, idTipo);
            stmt.setString(4, pieza.getPosicion());
            stmt.setString(5, pieza.getMovimiento());
            stmt.setString(6, pieza.getComportamiento());
            stmt.setString(7, pieza.getVelocidad());
            stmt.setDate(8, Date.valueOf(LocalDate.now()));

            stmt.executeUpdate();
            System.out.println("Pieza insertada con éxito.");
        } catch (SQLException e) {
            System.err.println("Error al insertar la pieza.");
            e.printStackTrace();
        }
    }

    // Busca el color; si no existe, lo crea
    private int obtenerIdColor(String descripcion) throws SQLException {
        String sql = "SELECT idColor FROM color WHERE Descripcion = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, descripcion);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return rs.getInt("idColor");
            }
        }
        String insert = "INSERT INTO color (Descripcion) VALUES (?)";
        try (PreparedStatement ps = con.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, descripcion);
            ps.executeUpdate();
            try (ResultSet keys = ps.getGeneratedKeys()) {
                return keys.next() ? keys.getInt(1) : -1;
            }
        }
    }

    // Busca el tipo de pieza; si no existe, lo crea
    private int obtenerIdTipoPieza(String descripcion) throws SQLException {
        String sql = "SELECT idTipoPieza FROM tipopieza WHERE DescripciondePieza = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, descripcion);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return rs.getInt("idTipoPieza");
            }
        }
        String insert = "INSERT INTO tipopieza (DescripciondePieza) VALUES (?)";
        try (PreparedStatement ps = con.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, descripcion);
            ps.executeUpdate();
            try (ResultSet keys = ps.getGeneratedKeys()) {
                return keys.next() ? keys.getInt(1) : -1;
            }
        }
    }

    // listar
    public void listarPiezas() {
        String sql = "SELECT P.idPieza, TP.DescripciondePieza AS TipoPieza, C.Descripcion AS Color, "
                   + "P.Descripcion AS ResumenPieza, P.Posicion, P.Movimiento, "
                   + "P.Comportamiento, P.Velocidad, P.Fecha_Creacion "
                   + "FROM pieza P INNER JOIN tipopieza TP ON P.idTipoPieza = TP.idTipoPieza "
                   + "INNER JOIN color C ON P.idColor = C.idColor";
        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(rs.getInt("idPieza") + " | "
                    + rs.getString("TipoPieza") + " | "
                    + rs.getString("Color") + " | "
                    + rs.getString("ResumenPieza") + " | "
                    + rs.getString("Posicion") + " | "
                    + rs.getString("Movimiento") + " | "
                    + rs.getString("Comportamiento") + " | "
                     + rs.getString("Velocidad") + " | "
                    + rs.getDate("Fecha_Creacion"));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar las piezas.");
            e.printStackTrace();
        }
    }

    // Cierra la conexión al terminar
    public void cerrar() {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

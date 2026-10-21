import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // CREAR TABLERO
        Casillero[][] casilleros = new Casillero[8][8];

        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {

                String color;

                if ((fila + columna) % 2 == 0) {
                    color = "Blanco";
                } else {
                    color = "Negro";
                }
                 casilleros[fila][columna] = new Casillero(
                    color,
                    fila,
                    columna
                );
            }   
        }

        Tablero tablero = new Tablero(casilleros);

        //CREAR PIEZAS

        Peon[] peonesBlancos = new Peon[8];
        for (int i = 0; i < 8; i++) {
            peonesBlancos[i] = new Peon(
                "Blanco",
                "agresor",
                "lentas",
                "ladino"
            );
        }

        Peon[] peonesNegros = new Peon[8];
        for (int i = 0; i < 8; i++) {
            peonesNegros[i] = new Peon(
                "Negro",
                "agresor",
                "lentas",
                "ladino"
            );
        }

        Torre[] torresBlancas = new Torre[2];
        for (int i = 0; i < 2; i++) {
            torresBlancas[i] = new Torre(
                "Blanco",
                "homérica",
                "lentas",
                "directa"
            );
        }

        Torre[] torresNegras = new Torre[2];
        for (int i = 0; i < 2; i++) {
            torresNegras[i] = new Torre(
                "Negro",
                "homérica",
                "lentas",
                "directa"
            );
        }

        Caballo[] caballosBlancos = new Caballo[2];
        for (int i = 0; i < 2; i++) {
            caballosBlancos[i] = new Caballo(
                "Blanco",
                "ligero",
                "lentas",
                ""
            );
        }

        Caballo[] caballosNegros = new Caballo[2];
        for (int i = 0; i < 2; i++) {
            caballosNegros[i] = new Caballo(
                "Negro",
                "ligero",
                "lentas",
                ""
            );
        }

        Alfil[] alfilesBlancos = new Alfil[2];
        for (int i = 0; i < 2; i++) {
            alfilesBlancos[i] = new Alfil(
                "Blanco",
                "oblicuo",
                "lentas",
                "sesgo"
            );
        }

        Alfil[] alfilesNegros = new Alfil[2];
        for (int i = 0; i < 2; i++) {
            alfilesNegros[i] = new Alfil(
                "Negro",
                "oblicuo",
                "lentas",
                "sesgo"
            );
        }

        Reina[] reinaBlanca = new Reina[1];
        reinaBlanca[0] = new Reina(
            "Blanco",
            "armada",
            "lentas",
            "encarnizada"
        );

        Reina[] reinaNegra = new Reina[1];
        reinaNegra[0] = new Reina(
            "Negro",
            "armada",
            "lentas",
            "encarnizada"
        );

        Rey[] reyBlanco = new Rey[1];
        reyBlanco[0] = new Rey(
            "Blanco",
            "postrero",
            "lentas",
            "tenue"
        );

        Rey[] reyNegro = new Rey[1];
        reyNegro[0] = new Rey(
            "Negro",
            "postrero",
            "lentas",
            "tenue"
        );

        // D. MOSTRAR PIEZAS BLANCAS
        for (int i = 0; i < peonesBlancos.length; i++) {

            System.out.println("Peón " + (i + 1));
            System.out.println("Color: " + peonesBlancos[i].getColor());
            System.out.println("Comportamiento: " + peonesBlancos[i].getComportamiento());
            System.out.println("Velocidad: " + peonesBlancos[i].getVelocidad());
            System.out.println("Movimiento: " + peonesBlancos[i].getMovimiento());

            System.out.println();
        }

        for (int i = 0; i < torresBlancas.length; i++) {
            System.out.println("Torre " + (i + 1));
            System.out.println("Color: " + torresBlancas[i].getColor());
            System.out.println("Comportamiento: " + torresBlancas[i].getComportamiento());
            System.out.println("Velocidad: " + torresBlancas[i].getVelocidad());
            System.out.println("Movimiento: " + torresBlancas[i].getMovimiento());

            System.out.println();
        }

        for (int i = 0; i < caballosBlancos.length; i++) {
            System.out.println("Caballo " + (i + 1));
            System.out.println("Color: " + caballosBlancos[i].getColor());
            System.out.println("Comportamiento: " + caballosBlancos[i].getComportamiento());
            System.out.println("Velocidad: " + caballosBlancos[i].getVelocidad());
            System.out.println("Movimiento: " + caballosBlancos[i].getMovimiento());

            System.out.println();
        }

        for (int i = 0; i < alfilesBlancos.length; i++) {
            System.out.println("Alfil " + (i + 1));
            System.out.println("Color: " + alfilesBlancos[i].getColor());
            System.out.println("Comportamiento: " + alfilesBlancos[i].getComportamiento());
            System.out.println("Velocidad: " + alfilesBlancos[i].getVelocidad());
            System.out.println("Movimiento: " + alfilesBlancos[i].getMovimiento());

            System.out.println();
        }

        for (int i = 0; i < reinaBlanca.length; i++) {
            System.out.println("Reina " + (i + 1));
            System.out.println("Color: " + reinaBlanca[i].getColor());
            System.out.println("Comportamiento: " + reinaBlanca[i].getComportamiento());
            System.out.println("Velocidad: " + reinaBlanca[i].getVelocidad());
            System.out.println("Movimiento: " + reinaBlanca[i].getMovimiento());

            System.out.println();
        }

        for (int i = 0; i < reyBlanco.length; i++) {
            System.out.println("Rey " + (i + 1));
            System.out.println("Color: " + reyBlanco[i].getColor());
            System.out.println("Comportamiento: " + reyBlanco[i].getComportamiento());
            System.out.println("Velocidad: " + reyBlanco[i].getVelocidad());
            System.out.println("Movimiento: " + reyBlanco[i].getMovimiento());

            System.out.println();
        }
                // ASIGNAR POSICIONES INICIALES
        String letras = "ABCDEFGH";
        for (int i = 0; i < 8; i++) {
            peonesBlancos[i].setPosicion(letras.charAt(i) + "2");
            peonesNegros[i].setPosicion(letras.charAt(i) + "7");
        }
        torresBlancas[0].setPosicion("A1");   torresBlancas[1].setPosicion("H1");
        caballosBlancos[0].setPosicion("B1"); caballosBlancos[1].setPosicion("G1");
        alfilesBlancos[0].setPosicion("C1");  alfilesBlancos[1].setPosicion("F1");
        reinaBlanca[0].setPosicion("D1");     reyBlanco[0].setPosicion("E1");

        torresNegras[0].setPosicion("A8");    torresNegras[1].setPosicion("H8");
        caballosNegros[0].setPosicion("B8");  caballosNegros[1].setPosicion("G8");
        alfilesNegros[0].setPosicion("C8");   alfilesNegros[1].setPosicion("F8");
        reinaNegra[0].setPosicion("D8");      reyNegro[0].setPosicion("E8");

        // JUNTAR TODAS LAS PIEZAS EN UNA LISTA
        ArrayList<Pieza> todas = new ArrayList<>();
        Collections.addAll(todas, peonesBlancos);
        Collections.addAll(todas, peonesNegros);
        Collections.addAll(todas, torresBlancas);
        Collections.addAll(todas, torresNegras);
        Collections.addAll(todas, caballosBlancos);
        Collections.addAll(todas, caballosNegros);
        Collections.addAll(todas, alfilesBlancos);
        Collections.addAll(todas, alfilesNegros);
        Collections.addAll(todas, reinaBlanca);
        Collections.addAll(todas, reinaNegra);
        Collections.addAll(todas, reyBlanco);
        Collections.addAll(todas, reyNegro);

        // GUARDAR EN LA BASE
        PiezaDAO dao = new PiezaDAO();
        for (Pieza p : todas) {
            dao.insertarPieza(p);
        }

        // LISTAR LO GUARDADO
        dao.listarPiezas();
        dao.cerrar();
    
    }
}




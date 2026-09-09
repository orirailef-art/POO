public class Main {

    public static void main(String[] args) {

        //  FLOR DEL TEXTO LITERARIO
        Flor florDelTexto = new Flor(
            "un poco vanidosa",
            "muy hermosa",
            "agradecida",
            3
        );

        //  FLOR HECHA A MEDIDA
        Flor miFlor = new Flor(
            "muy tranquila",
            "pequeña y azul",
            "feliz",
            5
        );

        // TEXTO DINÁMICO - FLOR DEL TEXTO
        System.out.println("----- FLOR DEL TEXTO -----");

        System.out.println(
            "El principito tenía una flor que amaba mucho. "
            + "La flor era " + florDelTexto.getApariencia()
            + " y " + florDelTexto.getActitud() + "."
        );

        System.out.println(
            "La flor estaba " + florDelTexto.getEstado() + "."
        );

        //  TEXTO DINÁMICO - FLOR INVENTADA

        System.out.println("\n----- MI FLOR -----");

        System.out.println(
            "El principito tenía una flor que amaba mucho. "
            + "La flor era " + miFlor.getApariencia()
            + " y " + miFlor.getActitud() + "."
        );

        System.out.println(
            "La flor estaba " + miFlor.getEstado() + "."
        );
       
        // CREAR AL PRINCIPITO
        Principito principito = new Principito(florDelTexto);

        // COMPORTAMIENTOS
        principito.cuidar();
        principito.regar();
        principito.amar();
        principito.quitar();
        principito.explorar();

        // PUNTO 3 DEL TP
        principito.imprimirFlorPrincipito();
    }
}

public class Main {

    public static void main(String[] args) {

        // FLOR DEL TEXTO LITERARIO
        Flor florDelTexto = new Flor(
            "un poco vanidosa",
            "muy hermosa",
            "agradecida",
            3
        );

        // FLOR HECHA A MEDIDA
        Flor miFlor = new Flor(
            "muy tranquila",
            "pequeña y azul",
            "feliz",
            5
        );

        // TEXTO CON LA FLOR DEL TEXTO
        System.out.println("\n----- FLOR DEL TEXTO LITERARIO -----");

        System.out.println(
            "El principito tenía una flor que amaba mucho. "
            +"Cuidaba de ella todos los días, la regaba y le quitaba las orugas. "
            +"La flor, aunque " + florDelTexto.getActitud()
            + ", era " + florDelTexto.getApariencia()
            + " y agradecía al principito por su dedicación. "
            + "Un día, el principito decidió explorar otros planetas y,"
            + "aunque no quería dejar sola a su flor, sabía que debía "
            + "continuar su viaje para aprender más sobre el universo."
        );

        // TEXTO CON MI FLOR
       System.out.println("\n----- MI FLOR -----");

        System.out.println(
            "El principito tenía una flor que amaba mucho. "
            +"Cuidaba de ella todos los días, la regaba y le quitaba las orugas. "
            +"La flor, aunque " + miFlor.getActitud()
            + ", era " + miFlor.getApariencia()
            + " y agradecía al principito por su dedicación. "
            + "Un día, el principito decidió explorar otros planetas y, "
            + "aunque no quería dejar sola a su flor, sabía que debía "
            + "continuar su viaje para aprender más sobre el universo."
        );
        
        // CREAR AL PRINCIPITO
        Principito principito = new Principito(florDelTexto);

        // COMPORTAMIENTOS
        principito.cuidar();
        principito.regar();
        principito.amar();
        principito.quitar();
        principito.explorar();

        principito.imprimirFlorPrincipito();
    }
}

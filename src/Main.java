	public class Main {
    public static void main(String[] args) {
        var numeroif = 1;
        if (numeroif >= 0) {
            System.out.println("Positivo");
        } else if (numeroif == 0) {
            System.out.println("0");
        } else {
            System.out.println("Negativo");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile+" while");
            numeroWhile = numeroWhile + 1;
        }

        int numeroDoWhile = 2;
        do {
            System.out.println(numeroDoWhile+" do while");
            numeroDoWhile = numeroDoWhile + 1;
        }
        while (numeroDoWhile < 3);


        for (int numeroFor = 0; numeroFor<= 3; numeroFor = numeroFor + 1 ) {
            System.out.println(numeroFor+" for");}



            var estacion = "A";

            switch (estacion) {
                case "VERANO":
                    System.out.println(" ES VERANO");
                    break;
                case "INVIERNO":
                    System.out.println("ES INVIERNO");
                    break;
                case "OTOÑO":
                    System.out.println("ES OTOÑO");
                    break;
                case "PRIMAVERA":
                    System.out.println(" ESPRIMAVERA");
                    break;
                default:
                    System.out.println("No es una estacion");
            }




        }
}

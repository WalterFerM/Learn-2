public class Main {
    public static void main(String[] args) {
        int numeroIf=10;
        int numeroWhile = 0;
        var estacion = "verano";

        //if loop
        if(numeroIf > 0){
            System.out.println("positivo");
        } else {
            System.out.println("negative");
        }

        //while Loop
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //do while Loop
        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        //for Loop
        for(int numeroFor = 0; numeroFor<= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //switch
        switch (estacion){
            case"verano":
                System.out.println("Es verano");
                break;
            case"invierno":
                System.out.println("Es invierno");
                break;
            case"primavera":
                System.out.println("Es primavera");
                break;
            case"otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("no es una estación");
        }

    }
}


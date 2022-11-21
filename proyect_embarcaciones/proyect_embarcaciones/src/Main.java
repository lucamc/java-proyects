public class Main {
    public static void main(String[] args) {


        Capitan cap = new Capitan("Lucas", "Custodio", "123");

        Embarcacion yate1 = new EmbarcacionYate(1000.0,350.0,2021,90.0, cap, 4);
        Embarcacion yate2 = new EmbarcacionYate(1600.0,750.0,2022,120.0, cap, 6);

        //Yate más lujoso
        if(((EmbarcacionYate) yate1).compareTo(yate2) > 0) {
            System.out.println("El yate1 es el más lujoso");
            System.out.println("Cuenta con " + ((EmbarcacionYate) yate1).getCantidadCamarotes() + " Camarotes");
        } else {
            if(((EmbarcacionYate) yate1).compareTo(yate2) < 0) {
                System.out.println("El yate2 es el más lujoso");
                System.out.println("Cuenta con " + ((EmbarcacionYate) yate2).getCantidadCamarotes() + " Camarotes");
            } else {
                System.out.println("Ambos yates cuantan con los mismos camarotes");
            }
        }


        //Velero
        Embarcacion velero = new EmbarcacionVelero(1200.0,500.0,2022,120.0, cap, 5);

        Double alquilerVelero = ((EmbarcacionVelero)velero).calcularMontoAlquiler();
        System.out.println("El alquiler del velero es de: $" + alquilerVelero);

        if(((EmbarcacionVelero) velero).esGrande()) {
            System.out.println("El velero es Grande");
        } else {
            System.out.println("El velero No es Grande");
        }
    }
}
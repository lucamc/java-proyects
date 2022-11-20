import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Duenio duenio = new Duenio("Luca", "Custodio", "12345");

        Propiedad campo1 = new PropiedadCampo(LocalDate.of(2022, 8, 12), 2000.0, "km25", false, duenio, true, 12);

        Propiedad casa1 = new PropiedadCasa(LocalDate.of(2021,5,12), 1200.0, "Amezanga 1245", false, duenio,5,120.0);
        Propiedad casa2 = new PropiedadCasa(LocalDate.of(2020,2,18), 1800.0, "Bv.Artigas 3225", true, duenio,3,80.0);


        //Se puede vender el campo
        if (((PropiedadCampo) campo1).sePuedeVender()) {
            System.out.println("El campo se puede vender");
        } else {
            System.out.println("El campo No se puede vender");
        }

        //El campo es apto para cultivo
        if (((PropiedadCampo) campo1).esAptoParaCultivo()) {
            System.out.println("El campo es Apto para cultivo");
        } else {
            System.out.println("No es Apto para cultivo");
        }

        //Casa con más Ambientes
        if(((PropiedadCasa) casa1).compareTo(casa2) > 0) {
            System.out.println("La Casa1 tiene más Ambientes");
        } else {
            if((((PropiedadCasa) casa1).compareTo(casa2)) < 0) {
                System.out.println("La Casa2 tiene más Ambientes");
            } else {
                System.out.println("Las dos casas tienen los mismo ambientes");
            }
        }

    }
}
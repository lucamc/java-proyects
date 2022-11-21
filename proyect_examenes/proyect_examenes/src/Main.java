public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Lucas","Custodio","12345");
        Alumno alumno2 = new Alumno("Marin","Costa","123");

        Examen exaFin1 = new ExamenFinal("Programación Java","Realizar ejercicios",7,alumno1,8,"Buen examen");
        Examen exaFin2 = new ExamenFinal("Programación Java","Realizar ejercicios",4,alumno2,5,"Regular");

        if(((ExamenFinal) exaFin1).compareTo(exaFin2) > 0 ) {
            System.out.println("El Examen con Mayor promedio es del Alumno");
            System.out.println(alumno1.toString());
            System.out.println("Promedio: " + ((ExamenFinal) exaFin1).calcularPromedio());
        } else {
            if (((ExamenFinal) exaFin1).compareTo(exaFin2) < 0 ) {
                System.out.println("El Examen con Mayor promedio es del Alumno" );
                System.out.println(alumno2.toString());
                System.out.println("Promedio: " + ((ExamenFinal) exaFin2).calcularPromedio());

            } else {
                System.out.println("Promedio de los Alumnos son Iguales");
            }
        }

    }
}
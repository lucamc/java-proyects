import clases.Paciente;
import exception.PacienteException;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {


        //Instancia de paciente, fecha internación posterior fecha actual.
        try {
            Paciente paciente1 = new Paciente("Lucas", "Custodio", "123", LocalDate.of(2023, 11, 26));

        } catch (PacienteException e) {
            System.out.println(e.toString());
        }



        //Instancia de paciente, fecha de internación igual/anterior fecha actual
        try {
            Paciente paciente1 = new Paciente("Lucas", "Custodio", "123", LocalDate.of(2022, 11, 26));
            System.out.println(paciente1.toString());

            //Alta al paciente, fecha de Alta anterior a fecha de internación.
            paciente1.darAlta(LocalDate.of(2021, 11, 26));


        } catch (PacienteException e) {
            System.out.println(e.toString());
        }


        //Instancia de paciente, fecha de internación igual/anterior fecha actual
        try {
            Paciente paciente1 = new Paciente("Lucas", "Custodio", "123", LocalDate.of(2022, 11, 26));

            //Alta al paciente, fecha de Alta igual/posterior a fecha de internación.
            paciente1.darAlta(LocalDate.of(2023, 11, 26));
            System.out.println(paciente1.toString());


        } catch (PacienteException e) {
            System.out.println(e.toString());
        }


    }
}
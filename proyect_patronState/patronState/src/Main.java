import clases.Tamagochi;

public class Main {
    public static void main(String[] args) {

        Tamagochi tamagochi = new Tamagochi("Luca");

        System.out.println(tamagochi.getState().getClass());
        tamagochi.beber();
        System.out.println(tamagochi.getState().getClass());
        tamagochi.comer();
        System.out.println(tamagochi.getState().getClass());
        tamagochi.beber();
        System.out.println(tamagochi.getState().getClass());

    }
}
package clases;

import interfaces.StateTamagochi;

public class Triste implements StateTamagochi {

    private Tamagochi tamagochi;



    //Constructor
    public Triste(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }



    //Methods the interface
    @Override
    public void beber() {
        System.out.println("Beep Beep Beep");
    }

    @Override
    public void comer() {
        System.out.println("Beep Beep - Puaaaajjjjj ******");
    }

    //Cambio de estado a Feliz
    @Override
    public void mimar() {
        this.tamagochi.setState(new Feliz(tamagochi));
    }
}

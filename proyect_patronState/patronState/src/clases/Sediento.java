package clases;

import interfaces.StateTamagochi;

public class Sediento implements StateTamagochi {



    private Tamagochi tamagochi;



    //Constructor
    public Sediento(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }



    //Methods the interface

    //Cambio de estado a Feliz
    @Override
    public void beber() {
        this.tamagochi.setState(new Feliz(tamagochi));
    }

    //Cambio de estado a Triste
    @Override
    public void comer() {
        this.tamagochi.setState(new Triste(tamagochi));
    }

    @Override
    public void mimar() {
        System.out.println("Sin cambio");
    }
}

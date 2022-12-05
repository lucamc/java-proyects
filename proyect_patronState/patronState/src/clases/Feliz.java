package clases;

import interfaces.StateTamagochi;

//Estado implementa la interface
public class Feliz implements StateTamagochi {

    private Tamagochi tamagochi;

    //Constructor
    public Feliz(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }


    //Methods the interface

    //Cambio de estado a Hambriento
    @Override
    public void beber() {
        this.tamagochi.setState(new Hambriento(tamagochi));
    }

    //Cambio de estado a Sediento
    @Override
    public void comer() {
        this.tamagochi.setState(new Sediento(tamagochi));
    }


    @Override
    public void mimar() {
        System.out.println("Sin cambios");
    }
}

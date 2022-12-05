package clases;

import interfaces.StateTamagochi;

public class Hambriento implements StateTamagochi {




    private Tamagochi tamagochi;



    //Constructor
    public Hambriento(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }



    //Methods the interface
    @Override
    public void beber() {
        this.tamagochi.setState(new Triste(tamagochi));
    }

    @Override
    public void comer() {
        this.tamagochi.setState(new Feliz(tamagochi));
    }

    @Override
    public void mimar() {
        System.out.println("Sin cambio");
    }
}

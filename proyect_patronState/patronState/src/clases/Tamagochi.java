package clases;

import interfaces.StateTamagochi;

public class Tamagochi  {

    private String nombre;
    private StateTamagochi state;


    public Tamagochi(String nombre) {
        this.nombre = nombre;
        this.state = new Feliz(this);
    }


    //Un set del state para poder cambiar el estado del tamagochi
    public void setState(StateTamagochi state) {
        this.state = state;
    }

    public StateTamagochi getState() {
        return state;
    }

    public void beber() {
        state.beber();
    }

    public void comer() {
        state.comer();
    }

    public void mimar(){
        state.mimar();
    }
}

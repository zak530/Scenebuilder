package com.example.prova1;

public class Dato {
    private int valore;


    public Dato() {
        this.valore = 0;
    }


    public Dato(int valore) {
        this.valore = valore;
    }


    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    @Override
    public String toString() {
        return String.valueOf(this.valore);
    }
}
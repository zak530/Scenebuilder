package com.example.prova1;

public class Nodo {
    private Dato dato;
    private Nodo next;

    public Nodo() {
        this.dato = new Dato();
        this.next = null;
    }

    public Nodo(int valore) {
        this.dato = new Dato(valore);
        this.next = null;
    }


    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
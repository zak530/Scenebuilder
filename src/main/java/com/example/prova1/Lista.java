package com.example.prova1;

public class Lista {
    private int size;
    private Nodo head;
    private Nodo cursor;

    public Lista() {
        this.size = 0;
        this.head = null;
        this.cursor = null;
    }

    public int getSize() {
        return size;
    }

    public void inserimentoInTesta(int valore) {
        Nodo newNode = new Nodo(valore);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public String stampaTutti() {
        StringBuilder risultato = new StringBuilder();
        Nodo current = head;

        while (current != null) {
            risultato.append(current.getDato()).append("\n");
            current = current.getNext();
        }

        return risultato.toString();
    }
}
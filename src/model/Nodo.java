package model;

public class Nodo<Element> {

    private Element valor;
    private Nodo<Element> siguiente;

    public Nodo(Element value) {
        this.valor = value;
        this.siguiente = null;
    }

    public Element getValor() {
        return valor;
    }

    public void setValor(Element valor) {
        this.valor = valor;
    }

    public Nodo<Element> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<Element> siguiente) {
        this.siguiente = siguiente;
    }

}

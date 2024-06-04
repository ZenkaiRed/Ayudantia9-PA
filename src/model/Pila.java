package model;

public class Pila<Element> {

    private Nodo<Element> cima;
    private Integer tamanio;

    public Pila() {
        this.cima = null;
        this.tamanio = 0;
    }

    // push()
    public void agregar(Element valor) {

        Nodo<Element> nuevoNodo = new Nodo<>(valor);

        nuevoNodo.setSiguiente(this.cima);
        this.cima = nuevoNodo;

        this.tamanio++;
    }

    public Element sacar() {

        if (this.cima == null) {
            throw new IllegalStateException("La pila está vacía");
        }

        Element dato = this.cima.getValor();
        this.cima = this.cima.getSiguiente();

        this.tamanio--;
        return dato;
    }

}

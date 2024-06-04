package model;

public class Cola<Element> {

    private Nodo<Element> frente;
    private Nodo<Element> fin;
    private Integer tamanio;

    public Cola() {
        this.frente = null;
        this.fin = null;
        this.tamanio = 0;
    }

    // push()
    public void agregar(Element valor) {

        Nodo<Element> nuevoNodo = new Nodo<>(valor);

        if (this.fin != null) {
            this.fin.setSiguiente(nuevoNodo);
        }

        this.fin = nuevoNodo;

        if (this.frente == null) {
            this.frente = nuevoNodo;
        }

        this.tamanio++;
    }

    public Element sacar() {

        if (this.frente == null) {
            throw new IllegalStateException("La cola/fila está vacía");
        }

        Element dato = this.frente.getValor();
        this.frente = this.frente.getSiguiente();

        if (this.frente == null) {
            this.fin = null;
        }

        this.tamanio--;
        return dato;
    }




}

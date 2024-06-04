import model.Cola;
import model.Libro;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 100, true);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 200, false);
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 300, true);
        Libro libro4 = new Libro("La Odisea", "Homero", 400, false);
        Libro libro5 = new Libro("La Iliada", "Homero", 500, true);
        Libro libro6 = new Libro("El arte de la guerra", "Sun Tzu", 600, false);
        Libro libro7 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 700, true);

        Cola<Libro> filaLibros = new Cola<>();

        filaLibros.agregar(libro1);
        filaLibros.agregar(libro2);

        Libro libroObtenido = filaLibros.sacar();

        System.out.println(libroObtenido);

        filaLibros.agregar(libroObtenido);

        libroObtenido = filaLibros.sacar();

        System.out.println(libroObtenido);

        libroObtenido = filaLibros.sacar();

        System.out.println(libroObtenido);


    }
}
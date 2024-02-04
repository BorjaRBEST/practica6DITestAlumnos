import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Esta clase representa una biblioteca que administra préstamos de libros y el inventario de copias de libros disponibles.
 */
public class Biblioteca {
    /**
     * Mapa que almacena los préstamos por usuario. La clave es el nombre de usuario y el valor es una lista de libros prestados.
     */
    public Map<String, List<String>> prestamosPorUsuario;

    /**
     * Mapa que almacena el número de copias disponibles por libro. La clave es el nombre del libro y el valor es la cantidad de copias disponibles.
     */
    public Map<String, Integer> copiasPorLibro;

    /**
     * Constructor de la clase Biblioteca. Inicializa los mapas de préstamos por usuario y copias por libro.
     */
    public Biblioteca() {
        this.prestamosPorUsuario = new HashMap<>();
        this.copiasPorLibro = new HashMap<>();
    }

    /**
     * Realiza un préstamo de un libro a un usuario.
     *
     * @param usuario El nombre del usuario que realiza el préstamo.
     * @param libro   El nombre del libro a prestar.
     * @throws IllegalArgumentException Si el libro no está disponible o no existen copias disponibles.
     */
    public void prestarLibro(String usuario, String libro) {
        // Verifica si el libro está disponible
        if (!this.copiasPorLibro.containsKey(libro)) {
            throw new IllegalArgumentException("El libro " + libro + " no está disponible.");
        }
        // Verifica si hay copias disponibles
        if (this.copiasPorLibro.get(libro) == 0) {
            throw new IllegalArgumentException("No hay copias disponibles del libro " + libro + ".");
        }
        // Si el usuario no tiene un registro, crea uno
        if (!this.prestamosPorUsuario.containsKey(usuario)) {
            this.prestamosPorUsuario.put(usuario, new ArrayList<>());
        }
        // Agrega el libro prestado al usuario y disminuye la cantidad de copias disponibles
        this.prestamosPorUsuario.get(usuario).add(libro);
        this.copiasPorLibro.put(libro, this.copiasPorLibro.get(libro) - 1);
    }

    /**
     * Devuelve un libro prestado por un usuario.
     *
     * @param usuario El nombre del usuario que devuelve el libro.
     * @param libro   El nombre del libro a devolver.
     * @throws IllegalArgumentException Si el usuario no ha prestado ningún libro o no ha prestado el libro especificado.
     */
    public void devolverLibro(String usuario, String libro) {
        // Verifica si el usuario ha prestado libros
        if (!this.prestamosPorUsuario.containsKey(usuario)) {
            throw new IllegalArgumentException("El usuario " + usuario + " no ha prestado ningún libro.");
        }
        // Verifica si el usuario ha prestado el libro especificado
        if (!this.prestamosPorUsuario.get(usuario).contains(libro)) {
            throw new IllegalArgumentException("El usuario " + usuario + " no ha prestado el libro " + libro + ".");
        }
        // Remueve el libro devuelto del usuario y aumenta la cantidad de copias disponibles
        this.prestamosPorUsuario.get(usuario).remove(libro);
        this.copiasPorLibro.put(libro, this.copiasPorLibro.get(libro) + 1);
    }

    /**
     * Agrega un libro al inventario con la cantidad especificada.
     *
     * @param libro     El nombre del libro a agregar.
     * @param cantidad  La cantidad de copias disponibles para el libro.
     * @throws IllegalArgumentException Si la cantidad es menor que cero.
     */
    public void agregarLibro(String libro, int cantidad) {
        // Verifica si la cantidad es válida
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad de copias debe ser mayor o igual a cero.");
        }
        // Agrega el libro al inventario con la cantidad especificada
        this.copiasPorLibro.put(libro, cantidad);
    }

    /**
     * Obtiene la cantidad de copias disponibles para un libro.
     *
     * @param libro El nombre del libro para el cual se desea conocer la cantidad de copias disponibles.
     * @return La cantidad de copias disponibles para el libro especificado.
     * @throws IllegalArgumentException Si el libro no existe en la biblioteca.
     */
    public int obtenerCopiasDisponibles(String libro) {
        // Verifica si el libro existe en el inventario
        if (!this.copiasPorLibro.containsKey(libro)) {
            throw new IllegalArgumentException("El libro " + libro + " no existe en la biblioteca.");
        }
        // Retorna la cantidad de copias disponibles para el libro
        return this.copiasPorLibro.get(libro);
    }
}

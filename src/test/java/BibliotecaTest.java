import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @Before
    public void inicializar() {
        biblioteca = new Biblioteca();
        biblioteca.agregarLibro("El principito", 3);
        biblioteca.agregarLibro("Don Quijote de la Mancha", 2);
    }


}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

package uvg.edu;

public class LicuadoraTest {

    private Licuadora licuadora;

    @Before
    public void setUp() {
        licuadora = new Licuadora();
    }

    @Test
    public void testEncender() {
        licuadora.encender();
        assertTrue(licuadora.encendida);
    }

    @Test
    public void testLlenar() {
        licuadora.llenar("frutas");
        assertTrue(licuadora.estaLlena());
    }

    @Test
    public void testAumentarVelocidad() {
        licuadora.encender();
        licuadora.llenar("frutas");
        licuadora.aumentarVelocidad();
        assertEquals(1, licuadora.obtenerVelocidad());
    }

    @Test
    public void testDisminuirVelocidad() {
        licuadora.encender();
        licuadora.llenar("frutas");
        licuadora.aumentarVelocidad();
        licuadora.disminuirVelocidad();
        assertEquals(0, licuadora.obtenerVelocidad());
    }

}
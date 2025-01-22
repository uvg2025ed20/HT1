package uvg.edu;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LicuadoraTest {

    private Licuadora licuadora;

    @Before
    public void setUp() {
        licuadora = new Licuadora();
    }

    @Test
    public void testEncender() {
        System.out.println("------------------------------");
        System.out.println("Inicio del test: testEncender");

        licuadora.encender();
        System.out.println("Estado después de encender: " + (licuadora.isEncendida() ? "Encendida" : "Apagada"));

        assertTrue(licuadora.isEncendida());
        System.out.println("Prueba completada: licuadora se encendió correctamente.");
        System.out.println("------------------------------\n");
    }

    @Test
    public void testLlenar() {
        System.out.println("------------------------------");
        System.out.println("Inicio del test: testLlenar");

        licuadora.llenar("frutas");
        System.out.println("Estado después de llenar: " + (licuadora.estaLlena() ? "Llena" : "Vacía"));

        assertTrue(licuadora.estaLlena());
        System.out.println("Prueba completada: licuadora se llenó correctamente.");
        System.out.println("------------------------------\n");
    }

    @Test
    public void testAumentarVelocidad() {
        System.out.println("------------------------------");
        System.out.println("Inicio del test: testAumentarVelocidad");

        licuadora.encender();
        licuadora.llenar("frutas");
        licuadora.aumentarVelocidad();

        int velocidad = licuadora.obtenerVelocidad();
        System.out.println("Velocidad después de aumentar: " + velocidad);

        assertEquals(1, velocidad);
        System.out.println("Prueba completada: velocidad aumentó correctamente.");
        System.out.println("------------------------------\n");
    }

    @Test
    public void testDisminuirVelocidad() {
        System.out.println("------------------------------");
        System.out.println("Inicio del test: testDisminuirVelocidad");

        licuadora.encender();
        licuadora.llenar("frutas");
        licuadora.aumentarVelocidad();
        licuadora.disminuirVelocidad();

        int velocidad = licuadora.obtenerVelocidad();
        System.out.println("Velocidad después de disminuir: " + velocidad);

        assertEquals(0, velocidad);
        System.out.println("Prueba completada: velocidad disminuyó correctamente.");
        System.out.println("------------------------------\n");
    }
}

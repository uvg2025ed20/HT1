package uvg.edu;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlenderTest {

    private Blender blender;

    @Before
    public void setUp() {
        blender = new Blender();
    }

    @Test
    public void testSwitchPowerStatus() {
        System.out.println("------------------------------");
        System.out.println("Inicio del test: testSwitchPowerStatus");

        assertEquals(0, blender.checkPowerStatus());
        blender.switchPowerStatus();
        assertEquals(1, blender.checkPowerStatus());
        System.out.println("Prueba completada: Power status cambió correctamente.");
        System.out.println("------------------------------\n");
    }

    @Test
    public void testFillBlender() {
        System.out.println("------------------------------");
        System.out.println("Inicio del test: testFillBlender");

        blender.fillBlender("Frutas", 500);
        assertEquals(500, blender.actualCapacity(), 0.01);
        assertFalse(blender.isFull());

        blender.fillBlender("Frutas", 600);
        assertEquals(1000, blender.actualCapacity(), 0.01);
        assertTrue(blender.isFull());

        System.out.println("Prueba completada: Blender se llenó correctamente.");
        System.out.println("------------------------------\n");
    }

    @Test
    public void testIncreaseSpeed() {
        System.out.println("------------------------------");
        System.out.println("Inicio del test: testIncreaseSpeed");

        blender.switchPowerStatus();
        blender.fillBlender("Frutas", 500);
        blender.increaseSpeed();

        assertEquals(1, blender.checkSpeed());

        blender.increaseSpeed();
        assertEquals(2, blender.checkSpeed());

        System.out.println("Prueba completada: Velocidad aumentó correctamente.");
        System.out.println("------------------------------\n");
    }

    @Test
    public void testDecreaseSpeed() {
        System.out.println("------------------------------");
        System.out.println("Inicio del test: testDecreaseSpeed");

        blender.switchPowerStatus();
        blender.fillBlender("Frutas", 500);
        blender.increaseSpeed();
        blender.decreaseSpeed();

        assertEquals(0, blender.checkSpeed());

        System.out.println("Prueba completada: Velocidad disminuyó correctamente.");
        System.out.println("------------------------------\n");
    }

    @Test
    public void testEmptyBlender() {
        System.out.println("------------------------------");
        System.out.println("Inicio del test: testEmptyBlender");

        blender.fillBlender("Frutas", 500);
        blender.emptyBlender();

        assertEquals(0, blender.actualCapacity(), 0.01);
        assertFalse(blender.isFull());

        System.out.println("Prueba completada: Blender se vació correctamente.");
        System.out.println("------------------------------\n");
    }
}

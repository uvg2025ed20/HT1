package uvg.edu;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Licuadora licuadora = new Licuadora();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do{
            menu();
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    licuadora.encender();
                    break;
                case 2:
                    System.out.print("Ingrese el ingrediente:    ");
                    String ingrediente = scanner.next();
                    licuadora.llenar(ingrediente);
                    break;
                case 3:
                    licuadora.aumentarVelocidad();
                    break;
                case 4:
                    licuadora.disminuirVelocidad();
                    break;
                case 5:
                    System.out.println("La velocidad de la licuadora es: " + licuadora.obtenerVelocidad() + "\n");
                    break;
                case 6:
                    System.out.println("La licuadora esta llena: " + licuadora.estaLlena() + "\n");
                    break;
                case 7:
                    licuadora.vaciar();
                    break;
                case 8:
                    System.out.println("Adiooooos");
                    break;
                default:
                    System.out.println("Opción invalida\n");
                    break;
            }

        }while(opcion != 8);

        scanner.close();

    }

    static void menu(){
        System.out.println("1. Encender");
        System.out.println("2. Llenar");
        System.out.println("3. Aumentar velocidad");
        System.out.println("4. Disminuir velocidad");
        System.out.println("5. Obtener velocidad");
        System.out.println("6. Esta llena");
        System.out.println("7. Vaciar");
        System.out.println("8. Salir del programa\n");
        System.out.print("Seleccione una opción:   ");
    }
}

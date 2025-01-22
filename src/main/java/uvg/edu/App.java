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
        Blender blender = new Blender();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do{
            menu();
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println(blender.switchPowerStatus() == 1 ? "Blender is ON" : "Blender is OFF");
                    break;
                case 2:
                    System.out.print("Enter product: ");
                    String product = scanner.nextLine();
                    System.out.print("Enter amount in ml: ");
                    float amount = scanner.nextFloat();
                    if (blender.isFull()) {
                        System.out.println("Blender is already full.");
                    } else {
                        blender.fillBlender(product, amount);
                        System.out.println("Blender filled with " + amount + "ml of " + product);
                    }
                    break;
                case 3:
                    blender.increaseSpeed();
                    System.out.println("Speed increased to: " + blender.checkSpeed());
                    break;
                case 4:
                    blender.decreaseSpeed();
                    System.out.println("Speed decreased to: " + blender.checkSpeed());
                    break;
                case 5:
                    System.out.println("Current speed: " + blender.checkSpeed());
                    break;
                case 6:
                    System.out.println("Blender capacity: " + blender.actualCapacity() + "ml");
                    break;
                case 7:
                    blender.emptyBlender();
                    System.out.println("Blender is now empty.");
                    break;
                case 8:
                    System.out.println("Chau");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }while(option != 8);

        scanner.close();

    }

    static void menu(){
        System.out.println("\nBlender Menu:");
        System.out.println("1. Toggle Power");
        System.out.println("2. Fill Blender");
        System.out.println("3. Increase Speed");
        System.out.println("4. Decrease Speed");
        System.out.println("5. Check Speed");
        System.out.println("6. Check Capacity");
        System.out.println("7. Empty Blender");
        System.out.println("8. Exit");
        System.out.print("Choose an option: ");
    }
}

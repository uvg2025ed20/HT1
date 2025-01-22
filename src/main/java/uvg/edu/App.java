package uvg.edu;

import java.util.Scanner;

/**
 * Main application class for the Blender program.
 * Integrantes:
 *  * - Pablo Vásquez
 *  * - Carlos López
 *  * - Angel Sanabria
 */
public class App
{
    /**
     * Main method to run the Blender application.
     * @param args Command line arguments
     */
    public static void main( String[] args )
    {
        Blender blender = new Blender();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            menu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Toggle the power status of the blender
                    System.out.println(blender.switchPowerStatus() == 1 ? "Blender is ON" : "Blender is OFF");
                    break;
                case 2:
                    // Fill the blender with a product if the speed is 0
                    if (blender.checkSpeed() == 0) {
                        System.out.print("Enter product: ");
                        String product = scanner.nextLine();
                        scanner.nextLine();
                        System.out.print("Enter amount in ml: ");
                        float amount = scanner.nextFloat();
                        scanner.nextLine();
                        if (blender.isFull()) {
                            System.out.println("Blender is already full.");
                        } else {
                            blender.fillBlender(product, amount);
                            System.out.println("Blender filled with " + amount + "ml of " + product);
                        }
                        break;
                    } else {
                        System.out.println("Blender is on. Please turn it off before filling.");
                    }
                case 3:
                    // Increase the speed of the blender
                    blender.increaseSpeed();
                    System.out.println("Speed increased to: " + blender.checkSpeed());
                    break;
                case 4:
                    // Decrease the speed of the blender
                    blender.decreaseSpeed();
                    System.out.println("Speed decreased to: " + blender.checkSpeed());
                    break;
                case 5:
                    // Check the current speed of the blender
                    System.out.println("Current speed: " + blender.checkSpeed());
                    break;
                case 6:
                    // Check the current capacity of the blender
                    System.out.println("Blender capacity: " + blender.actualCapacity() + "ml");
                    break;
                case 7:
                    // Empty the blender if the speed is 0
                    if (blender.checkSpeed() == 0) {
                        blender.emptyBlender();
                        System.out.println("Blender emptied.");
                    } else {
                        System.out.println("Blender is on. Please turn it off before emptying.");
                    }
                    break;
                case 8:
                    // Exit the application
                    System.out.println("Chau");
                    break;
                default:
                    // Handle invalid menu options
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 8);

        scanner.close();
    }

    /**
     * Displays the menu options for the Blender application.
     */
    static void menu() {
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
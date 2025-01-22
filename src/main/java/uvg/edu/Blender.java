package uvg.edu;

/**
 * The Blender class implements the IBlender interface and provides
 * functionality to manage a blender's power status, speed, and capacity.
 * Integrantes:
 *  * - Pablo Vásquez
 *  * - Carlos López
 *  * - Angel Sanabria
 */
public class Blender implements IBlender {
    private byte powerStatus;
    private boolean isOn;
    private byte speed;
    private String product;
    private int capacity;
    private int maxCapacity;

    /**
     * Constructs a new Blender with default values.
     */
    public Blender(){
        this.isOn = false;
        this.powerStatus = 0;
        this.speed = 0;
        this.product = "";
        this.capacity = 0;
        this.maxCapacity = 532;
    }

    /**
     * Checks the power status of the blender.
     * @return 1 if the blender is on, 0 otherwise.
     */
    @Override
    public byte checkPowerStatus() {
        return (byte) (isOn ? 1 : 0);
    }

    /**
     * Toggles the power status of the blender.
     * @return the new power status of the blender.
     */
    @Override
    public byte switchPowerStatus() {
        isOn = !isOn;
        if (!isOn) speed = 0;
        return checkPowerStatus();
    }

    /**
     * Fills the blender with a specified product and amount.
     * @param prod the product to fill the blender with.
     * @param ml the amount of the product in milliliters.
     */
    @Override
    public void fillBlender(String prod, float ml) {
        if (isFull() || ml <= 0) return;
        product = prod;
        capacity += ml;
        if (capacity > maxCapacity) {
            capacity = maxCapacity;
        }
    }

    /**
     * Gets the current capacity of the blender.
     * @return the current capacity in milliliters.
     */
    @Override
    public float actualCapacity(){
        return this.capacity;
    }

    /**
     * Fills the blender with a specified product to its maximum capacity.
     * @param prod the product to fill the blender with.
     */
    @Override
    public void fillBlender(String prod){
        this.product = prod;
        this.capacity = this.maxCapacity;
    }

    /**
     * Increases the speed of the blender by one unit, up to a maximum of 10.
     */
    @Override
    public void increaseSpeed(){
        if(this.speed < 10){
            this.speed++;
        }
    }

    /**
     * Decreases the speed of the blender by one unit, down to a minimum of 0.
     */
    @Override
    public void decreaseSpeed(){
        if(this.speed > 0){
            this.speed--;
        }
    }

    /**
     * Checks the current speed of the blender.
     * @return the current speed.
     */
    @Override
    public byte checkSpeed(){
        return this.speed;
    }

    /**
     * Checks if the blender is full.
     * @return true if the blender is full, false otherwise.
     */
    @Override
    public boolean isFull(){
        return this.capacity == this.maxCapacity;
    }

    /**
     * Empties the blender.
     */
    @Override
    public void emptyBlender(){
        this.product = "";
        this.capacity = 0;
    }

    /**
     * Empties a specified amount from the blender.
     * @param ml the amount to empty in milliliters.
     */
    @Override
    public void emptyBlender(float ml){
        if(this.capacity - ml >= 0){
            this.capacity -= ml;
        }else{
            System.out.println("The blender is empty");
        }
    }
}
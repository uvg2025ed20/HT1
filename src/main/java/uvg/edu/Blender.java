package uvg.edu;

public class Blender implements IBlender {
    private byte powerStatus;
    private boolean isOn;
    private byte speed;
    private String product;
    private int capacity;
    private int maxCapacity;

    public Blender(){
        this.isOn = false;
        this.powerStatus = 0;
        this.speed = 0;
        this.product = "";
        this.capacity = 0;
        this.maxCapacity = 1000;
    }

    @Override
    public byte checkPowerStatus() {
        return (byte) (isOn ? 1 : 0);
    }

    @Override
    public byte switchPowerStatus() {
        isOn = !isOn;        if (!isOn) speed = 0;
        return checkPowerStatus();
    }

    @Override
    public void fillBlender(String prod, float ml) {
        if (isFull() || ml <= 0) return;
        product = prod;
        capacity += ml;
        if (capacity > maxCapacity) {
            capacity = maxCapacity;
        }
    }

    @Override
    public float actualCapacity(){
        return this.capacity;
    }

    @Override
    public void fillBlender(String prod){
        this.product = prod;
        this.capacity = this.maxCapacity;
    }

    @Override
    public void increaseSpeed(){
        if(this.speed < 10){
            this.speed++;
        }
    }

    @Override
    public void decreaseSpeed(){
        if(this.speed > 0){
            this.speed--;
        }
    }

    @Override
    public byte checkSpeed(){
        return this.speed;
    }

    @Override
    public boolean isFull(){
        return this.capacity == this.maxCapacity;
    }

    @Override
    public void emptyBlender(){
        this.product = "";
        this.capacity = 0;
    }

    @Override
    public void emptyBlender(float ml){
        if(this.capacity - ml >= 0){
            this.capacity -= ml;
        }else{
            System.out.println("The blender is empty");
        }
    }
}

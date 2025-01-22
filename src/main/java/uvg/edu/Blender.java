package uvg.edu;

public class Blender implements IBlender {
    private byte powerStatus;
    private byte speed;
    private String product;
    private int capacity;
    private int maxCapacity;

    public Blender(){
        this.powerStatus = 0;
        this.speed = 0;
        this.product = "";
        this.capacity = 0;
        this.maxCapacity = 1000;
    }

    public byte checkPowerStatus(){
        return this.powerStatus;
    }

    public byte switchPowerStatus(){
        if(this.powerStatus == 0){
            this.powerStatus = 1;
        }else{
            this.powerStatus = 0;
        }
        return this.powerStatus;
    }

    public void fillBlender(String prod, float ml){
        if(this.capacity + ml <= this.maxCapacity){
            this.product = prod;
            this.capacity += ml;
        }else{
            System.out.println("The blender is full");
        }
    }

    public int actualCapacity(){
        return this.capacity;
    }

    public void fillBlender(String prod){
        this.product = prod;
        this.capacity = this.maxCapacity;
    }

    public void increaseSpeed(){
        if(this.speed < 10){
            this.speed++;
        }
    }

    public void decreaseSpeed(){
        if(this.speed > 0){
            this.speed--;
        }
    }

    public byte checkSpeed(){
        return this.speed;
    }

    public boolean isFull(){
        return this.capacity == this.maxCapacity;
    }

    public void emptyBlender(){
        this.product = "";
        this.capacity = 0;
    }

    public void emptyBlender(float ml){
        if(this.capacity - ml >= 0){
            this.capacity -= ml;
        }else{
            System.out.println("The blender is empty");
        }
    }
}

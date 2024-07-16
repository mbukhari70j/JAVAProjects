package Package1;
class FanMain{
    public static void main(String[] args) {
        Ceiling ceiling = new Ceiling("Mitsubishi", 25, 56);


        ceiling.show();
        ceiling.start();
        ceiling.stop();
        ceiling.fast();
        ceiling.slow();
        Ceiling.display();

        ceiling.setBrand("IBM");
        ceiling.setSpeed(100);
        System.out.println(ceiling.getBrand());
        System.out.println(ceiling.getSpeed());
    }
}
abstract class Fan {
    private String brand;
    private int speed;

    private static int quantity;

    public Fan(String brand, int speed, int quantity) {
        this.brand = brand;
        this.speed = speed;
        Fan.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Fan.quantity = quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void show(){
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Speed: " + getQuantity());
    }
    public abstract void start();
    public abstract void stop();
    public abstract void fast();
    public abstract void slow();

    //Static method is in progress

    public static void display(){
        System.out.println("Static method");
        System.out.println("Static method completed");
    }
}
class Ceiling extends Fan {
    public Ceiling(String brand, int speed, int quantity){
        super(brand, speed, quantity);
    }
    public void start() {
        System.out.println("Fan is started");
    }
    public void stop() {
        System.out.println("Fan is stopped");
    }
    public void fast() {
        System.out.println("Fan is Fast");
    }
    public void slow() {
        System.out.println("Fan is slow");
    }
    public void show(){
        System.out.println("Welcome to Fan");
    }
}
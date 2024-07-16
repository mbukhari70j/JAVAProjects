package Package1;

public class Oven {
    private int length;
    private int width;
    private int height;

    //Default Constructor
    public Oven(){
        this.length = 10;
        this.width = 20;
        this.height = 30;
    }

    //Parameterized Constructor
    public Oven(int l, int w, int h){
        this.length = l;
        this.width = w;
        this.height = h;
    }

    //Copy Constructor
    public Oven(Oven other){
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    //Display Function
    public void display(){
        System.out.println("Oven Length: " + getLength());
        System.out.println("Oven Width: " + getWidth());
        System.out.println("Oven Height: " + getHeight());
    }
}

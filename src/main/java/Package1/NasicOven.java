package Package1;

public class NasicOven extends MicroWave{
    private int price;

    public NasicOven(int l, int w, int h, int wt, int p) {
        super(l, w, h, wt);
        this.price = p;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void display(){
        super.display();
        System.out.println("Price: " + getPrice());
    }
}

package Package1;

public class MicroWave extends Oven{
    private int weight;

    //Parameterized Constructor
    public MicroWave(int l, int w, int h, int wt){
        super(l, w, h);
        this.weight = wt;
    }

    //Copy Constructor
    public MicroWave(MicroWave other){
        super(other);
        this.weight = other.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public void display(){
        super.display();
        System.out.println("Weight: " + getWeight());
    }
}

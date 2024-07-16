public class CopyConst{
    private int length;
    private int width;
    private int height;

    public CopyConst(int l, int w, int h){
        this.length = l;
        this.width = w;
        this.height = h;
    }
    public CopyConst(CopyConst original){
        this.height = original.length;
        this.width = original.width;
        this.height = original.height;
    }
    public void display(){
        System.out.println("Length: " + length + "Width: " + width + "Height: " + height);
    }
    public static void main(String[] args){
        CopyConst copy = new CopyConst(4,5,6);
        copy.display();

    }
}
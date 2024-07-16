package Package1;
public class ArrayWork{
    private int[] arr;

    public ArrayWork(int[] arr){
        this.arr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            this.arr[i] = arr[i];
        }
    }
    public void getArrayWork(){
        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10};
        ArrayWork arraywork = new ArrayWork(arr);
        arraywork.getArrayWork();
    }
}
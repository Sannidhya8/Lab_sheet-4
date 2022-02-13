
public class Lab_3 {
    public static void main(String[] args) {
        int a=20;
        int b=45;
        int c=11;
        getSmallestNUm(a,b,c);
    }
    public static void getSmallestNUm(int x,int y, int z) {
        int smallest=x;
        if(y<smallest){
            smallest = y;
        }
        if(z<smallest){
            smallest=z;
        }
        System.out.println(smallest);
    }
    
}

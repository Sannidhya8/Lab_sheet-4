
public class Lab_4 {
    public static void main(String[] args) {
        float a=20;
        float b=45;
        float c=11;
        getAverage(a,b,c);
    }
    public static void getAverage(float x,float y, float z) {
      float average=0;
      average=x+y+z/3;
        
        System.out.println("The average is "+average);
    }
    
}

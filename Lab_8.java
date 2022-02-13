

public class Lab_8 {
    public static void getSumDigits(int num) {
        int sum=0;
        while(num>0){
            num=num%10;
            sum+=sum%10;
            num/=10;
        }
    }
    public static void main(String[] args) {
        int temp=0;
        int num=12345;
        temp=num;
        getSumDigits(temp);
        System.out.println(temp);
    }
    
}

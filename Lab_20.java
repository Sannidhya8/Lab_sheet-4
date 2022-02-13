import java.util.Scanner;
public class Lab_20{
    public static String getReplaceVowels( String s){
        String character=" ";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                character +=s.charAt(i)+1;
            }
            System.out.println(character);
        }
        return s;
       
    }
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("Enter any word:");
        String s=aa.next();
        aa.close();
        getReplaceVowels(s);
        
        
    }
}
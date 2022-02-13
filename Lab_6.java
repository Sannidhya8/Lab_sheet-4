

public class Lab_6 {
    public static void main(String[] args) {
       
        String cha="SANNIDHYA";
        CountVowel(cha);
    }
    
    public static void CountVowel(String s) {
        s=s.toLowerCase();
        int count=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
            count++;
            }

        }
       
        System.out.println("TOTAL VOWELS IN THE WORD SANNIDHYA IS: " +count);
    }
    
    
}

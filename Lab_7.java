
public class Lab_7 {
    public static void WordCount(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }System.out.print(count+1);
    }
    public static void main(String[] args) {
        String sentence ="My county name is Nepal.";
        WordCount(sentence);
        System.out.print(" is the total words in given sentence.");
        
    }
    

    
}

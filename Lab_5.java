
public class Lab_5 {
    public static void main(String[] args) {
        String odd="QWERTYU";
        String even="ZXCVBN";
        getMiddleCharacter(odd);
        getMiddleCharacter(even);

    }
    public static void getMiddleCharacter(String name) {
        int middle=name.length()/2;
        if(name.length()%2==0){
            System.out.println(name.charAt(middle-1)+""+name.charAt(middle));
        }
        else{
            System.out.println(name.charAt(middle));
        }  
    }
    
}

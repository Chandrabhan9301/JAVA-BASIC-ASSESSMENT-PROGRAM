package Assignment4;

public class CheckCharaterIsAlphabetDigitCharacter {
    public static void main(String []argu){
        char ch='=';

        if( (ch>='A' && ch<='Z') || (ch>='a' && ch<='z') ){
            System.out.println("Character is Alphabet");
        }else if( (ch>='0' && ch<='9') ){
            System.out.println("Charaters is Digit");
        }else{
            System.out.println("Character is other character");
        }
    }
}

package Assignment2;

public class RotateDigitsOfANumber {
    public static void main(String []args){
        int x=2346;
        int y=x%10;
        x = x/10;
        System.out.println(y+""+x);
    }
}

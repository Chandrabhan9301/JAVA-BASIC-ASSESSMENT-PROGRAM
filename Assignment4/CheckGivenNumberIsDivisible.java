package Assignment4;

public class CheckGivenNumberIsDivisible {
    public static void main(String []argu){
        int num =35;

        if(num%5==0 && num%7==0){
            System.out.println("This Number is Divisible by 5 or 7");
        }else{
            System.out.println("Not Divisible by 5 or 7");
        }
    }
}

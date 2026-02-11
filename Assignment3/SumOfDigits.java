package Assignment3;

public class SumOfDigits {
    public static void main(String []argu){
        int digit = 748,sum = 0;
        
        //with out using loop

        int num = digit%10;
        sum=sum+num;
        digit=digit/10;
        num = digit%10;
        sum = sum+num;
        digit=digit/10;
        num = digit%10;
        sum = sum+num;
        System.out.println(sum);
        
    }
    
}

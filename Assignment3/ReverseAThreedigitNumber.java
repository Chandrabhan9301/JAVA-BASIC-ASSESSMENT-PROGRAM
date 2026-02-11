package Assignment3;

public class ReverseAThreedigitNumber {
    public static void main(String []argu){
        int x = 234,num;
        num = x%10;
        System.out.print(num);
        x=x/10;
        num =x%10;
        System.out.print(num);
        x=x/10;
        num =x%10;
        System.out.print(num);
    }
}
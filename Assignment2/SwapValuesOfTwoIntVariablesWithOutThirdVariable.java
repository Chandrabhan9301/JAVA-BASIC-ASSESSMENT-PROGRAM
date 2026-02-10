package Assignment2;

public class SwapValuesOfTwoIntVariablesWithOutThirdVariable {
    public static void main(String []args){
        int x = 5, y= 9;
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x = "+x+", y = "+y);
    }
}

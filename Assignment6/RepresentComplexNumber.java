package Assignment6;
class Complex{
    int real, imaginary;

    void setValue(int x,int y){
        real = x;
        imaginary = y;
    }
    void printValue(){
        System.out.println(real+"+"+imaginary+"i");
    }
}

class RepresentComplexNumber {
    public static void main(String []argu){
        Complex S1 = new Complex();
        S1.setValue(7, 8);
        S1.printValue();
    }
}

package Assignment6;

class Circle{
    int radius;

    void setRadius(int radius){
        this.radius= radius;
    }
    void calculateArea(){
        float temp = (3.14f*radius*radius);
        System.out.println("Area of Circle is = "+temp);
    }
    void calculatedCircumference(){
        double temp1 = 2*3.14*radius;
        System.out.println("Circumference of Circle is = "+temp1);
    }
}

public class CalculatedCircle {
    public static void main(String []argu){
        Circle obj = new Circle();
        
        obj.setRadius(5);

        obj.calculateArea();
        obj.calculatedCircumference();  
        
    }
    
}

package Assignment8;

class Circle{
    Integer radius;

    public void setRadius(Integer r){
        radius = new Integer(r);
    }
    public void getRadius(){
        System.out.println("Radius = "+radius);
    }
    public void getArea(){
        System.out.println("Circle Area = "+(3.14*radius*radius));
    }
    public void getCircumferene(){
        System.out.println("Circumferene = "+(2*3.14*radius));
    }
}

public class CircleWrapper {
    public static void main(String[] args) {
        Circle obj = new Circle();

        obj.setRadius(3);

        obj.getRadius();
        obj.getArea();
        obj.getCircumferene();
    }
}

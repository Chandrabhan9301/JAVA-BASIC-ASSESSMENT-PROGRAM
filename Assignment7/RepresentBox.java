package Assignment7;

class Box{
    private int lenght;
    private int breadth;
    private int height;

    private static int boxCount;
    

    public void setDimension(int lenght, int breadth, int height){
        
        this.lenght = lenght;
        this.breadth = breadth;
        this.height = height;
    }

    public void showDimension(){
        int i = lenght*breadth*height;
        System.out.println("Dimension = "+i);
    }
     
    public static void displayBoxCount(){
        System.out.println("Display Box = "+boxCount);
    }

    public static Box setBoxCount(){
        boxCount++;
        return new Box();
    }
    
}

public class RepresentBox {
    public static void main(){
        Box b1 = Box.setBoxCount();
        Box b2 = Box.setBoxCount();

        b1.setDimension(4, 9, 5);

        b2.setDimension(3, 7, 9);
        
        b1.showDimension();
        b2.showDimension();
        
        Box.displayBoxCount();
    }
}

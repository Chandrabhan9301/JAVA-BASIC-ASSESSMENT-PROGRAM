package Assignment6;

class Cuboid{
    int length, width, Height;

    void setLength(int ln){
        length = ln;
    }
    void setWidth(int wid){
        width = wid;
    }
    void setHeight(int hei){
        Height = hei;
    }

    void getLength(){
        System.out.println("Coboid Length ="+length);
    }
    void getWidth(){
        System.out.println("Coboid Width ="+width);
    }
    void getHeight(){
        System.out.println("Coboid Heigth ="+Height);
    }

    void cuboidVolume(){
        System.out.println("Volume of Cuboid = "+(length*width*Height));
    }
    void surfaceArea(){
        System.out.println("Surface Area of Cuboid = "+2*((length*width)+(width*Height)+(Height*length)));
    }
     
    
}

public class CalculateVolumeAndSurface {
    public static void main(String []argu){
        Cuboid obj = new Cuboid();

        obj.setHeight(5);
        obj.setLength(4);
        obj.setWidth(3);
        obj.cuboidVolume();
        obj.surfaceArea();
    }
}

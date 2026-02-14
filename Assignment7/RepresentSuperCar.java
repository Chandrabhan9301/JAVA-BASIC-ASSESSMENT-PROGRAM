package Assignment7;

class SuperCar{
    String ownerName;
    double price;
    String colour,brand;

    void setOwnerName(String name){
        ownerName = name;
    }
    void setPrice(double pri){
        price = pri;
    }
    void setColur(String colour){
        this.colour = colour;
    }
    void setBrand(String brand){
        this.brand=  brand;
    }


    void getOwnerName(){
        System.out.println("Owner Name is = "+ownerName);
    }
    void getPrice(){
        System.out.println("Super Car Price = "+price);
    }
    void getColur(){
        System.out.println("Super Car Colure Name = "+colour);
    }
    void getBrand(){
        System.out.println("Super Car Brand Name = "+brand);
    }

    private static int instancecount;

    public static SuperCar getInstance(){
        if(instancecount==0){
            instancecount++;
            return new SuperCar();
        }
        return null;
    }

    
}

public class RepresentSuperCar {
    public static void main(String[] args) {
        SuperCar S1 = SuperCar.getInstance();
         
        S1.setOwnerName("Chandrabhan");
        S1.setPrice(10000000);
        S1.setColur("Black");
        S1.setBrand("Tata");

        S1.getOwnerName();
        S1.getPrice();
        S1.getColur();
        S1.getBrand();

    }
}

package Assignment6;

class Distance{
    int kilometre,metre,centimetres;

    void setDistance(int km, int m, int cm){
        kilometre = km;
        metre = m;
        centimetres = cm;
    }
    void displayDistance(){
        System.out.println(kilometre+"km "+metre+"m "+centimetres+"cm");
    }
    Distance addTwoDistance(Distance d2){
        
        Distance result = new Distance();

        result.kilometre = (this.kilometre+d2.kilometre);
        result.centimetres = (this.centimetres+d2.centimetres);
        result.metre = (this.metre+d2.metre);

        if(result.centimetres>=100){
            result.metre += result.centimetres/100;
            result.centimetres = result.centimetres%100;
        }

        if(result.metre>=1000){
            result.kilometre += result.kilometre/1000;
            result.metre = result.metre%1000;
        }

        return result;
    }
}

public class RepresentDistance {
    public static void main(String []argu){
        Distance d1 = new Distance();
        Distance d2 = new Distance();

        d1.setDistance(15, 800, 50);
        d2.setDistance(8, 900, 70);

        System.out.println("First Distance");
        d1.displayDistance();

        System.out.println("\nSecond Distance");
        d2.displayDistance();

        System.out.println("\nAdd Two Distance");
        Distance d3 = d1.addTwoDistance(d2);
        d3.displayDistance();
        
    }
}

package Assignment6;

class Time{
    int hour, minute, second;

    void setValue(int hr, int min, int sec){
        hour = hr;
        minute =min;
        second =sec;
    }
    void getValue(){
        System.out.println(hour+"hr  "+minute+"min "+second+"sec");
    }
}

public class RepresentTime {
    public static void main(String[] args) {
        Time S1 = new Time();
        S1.setValue(5, 39,32);
        S1.getValue();
    }
}

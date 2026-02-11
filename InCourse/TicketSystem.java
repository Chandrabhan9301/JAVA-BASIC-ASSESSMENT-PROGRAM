package InCourse;

public class TicketSystem {
    public static void main(String []argu){
        int age = 55;
        int gender = 'm';

        if(gender=='m'){

            if(age>50){
                System.out.println("Ticket Price 10");
            }
            else{
                System.out.println("Ticket Price 20");
            }
        }
        else{
            if(age<30){
                System.out.println("Ticket Price 50");
            }
            else{
                System.out.println("Ticket Price 40");
            }
        }
    }
}

package InCourse;

public class ExamGrade {
    public static void main(String []argu){
        int mask=80;

        if(mask>=90){
           System.out.println("A"); 
        }else if (mask>=80) {
            System.out.println("B");
        }else if (mask>=70) {
            System.out.println("C");
        }else if (mask>=60) {
            System.out.println("D");
        }else if (mask>=50) {
            System.out.println("E");
        }else{
            System.out.println("F");
        }
    }
}

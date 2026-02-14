package Assignment7;
import java.time.LocalDateTime;

class Batch{
    private int batchCode;

    private String courseName;

    private LocalDateTime startDate;

    private int studentCount;

    private LocalDateTime time;

    private String days;

    private static int totalBatches;




    public void setBatchCode(int batchCode){
        this.batchCode= batchCode;
    }

    public void setCourseName(String courseName){
        this.courseName= courseName;
    }

    public void setStudentCount(int studentCount){
        this.studentCount= studentCount;   
    }

    public void setdays(String days){
        this.days= days;
    }

    public static void setTotalBatches(int tatalBatches){
        Batch.totalBatches = tatalBatches;
    }

    public void setStartDate(LocalDateTime startDate){
        this.startDate = startDate;
    }
    public void setTime(LocalDateTime time){
        this.time= time;
    }






    public void getBatchCode(){
        System.out.println("Batch Code = "+batchCode);
    }

    public void getCourseName(){
        System.out.println("Course Name  = "+courseName);
    }

    public void getStudentCount(){
        System.out.println("Studene Count  = "+studentCount);
    }

    public void getDays(){
        System.out.println("Days ="+days);
    }

    public static void getTotalBatches(){
        System.out.println("Total Batches = "+totalBatches);
    }

    public LocalDateTime getStartDate(){
        return startDate;
    }

    public LocalDateTime getTime(){
        return time;
    }



}

public class EducationalBatch {
    public static void main(String[] args) {
        Batch obj = new Batch();

        obj.setBatchCode(87);
        obj.setCourseName("Neet");
        obj.setStudentCount(89);
        obj.setdays("7 Day");
        Batch.setTotalBatches(15);

        obj.getBatchCode();
        obj.getCourseName();
        obj.getStudentCount();
        obj.getDays();
        Batch.getTotalBatches();
    }
}

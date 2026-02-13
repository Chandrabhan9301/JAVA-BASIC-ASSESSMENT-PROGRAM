package Assignment6;

class Course{
    int courseId;
    String courseName;
    int duration;
    double free;

    void setCourseId(int id){
        courseId = id;
    }
    void setCourseName(String courseName){
        this.courseName = courseName;
    }
    void setDuration(int year){
        duration = year;
    }
    void setFree(double fee){
        free = fee;
    }

    void getCourseId(){
        System.out.println("Course Id = "+courseId);
    }
    void getCourseName(){
        System.out.println("Course Name = "+courseName);
    }
    void getDuration(){
        System.out.println("Course Duration = "+duration+"yr");
    }
    void getfree(){
        System.out.println("Course Free = "+free);
    }

}

public class RepresentCourse {
    public static void main(String []argu){
         
        Course obj = new Course();

        obj.setCourseId(2);
        obj.setCourseName("Neet");
        obj.setDuration(1);
        obj.setFree(10000.00);

        obj.getCourseId();
        obj.getCourseName();
        obj.getDuration();
        obj.getfree();
    }
}

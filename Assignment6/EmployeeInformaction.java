package Assignment6;

class Employee{
    int empId;
    String name;
    double salary;

    void setEmpId(int id){
        empId = id;
    }
    void setName(String empname){
        name = empname;
    }
    void setSalary(double sal){
        salary = sal;
    }

    void getEmpId(){
        System.out.println("Employee id = "+empId);
    }
    void getName(){
        System.out.println("Employee name = "+name);
    }
    void getSalary(){
        System.out.println("Employee salary = "+salary);
    }
}

public class EmployeeInformaction {
    public static void main(String []argu){
        Employee obj = new Employee();
        
        obj.setEmpId(9452);
        obj.setName("sujeet");
        obj.setSalary(3500.00);

        obj.getEmpId();
        obj.getName();
        obj.getSalary();
    }
}

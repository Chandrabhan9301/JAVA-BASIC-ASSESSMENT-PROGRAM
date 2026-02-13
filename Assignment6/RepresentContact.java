package Assignment6;

class Contact{
    int Id;
    String firstName,lastName;
    int mobileNumber;
    String emailId;

    void setId(int id){
        Id = id;
    }
    void setFirstName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    void setMobileNo(int number){
        mobileNumber = number;
    }
    void setEmailId(String email){
        emailId = email;
    }
    void getId(){
        System.out.println("Contact Id = ");
    }
    void getName(){
        System.out.println(firstName+" "+lastName);
    }
    void getMobileNumber(){
        System.out.println("Mobile Number"+mobileNumber);
    }
    void getEmailId(){
        System.out.println("Email = "+emailId);
    }

} 


public class RepresentContact {
    public static void main(String[] args) {
        Contact obj = new Contact();

        obj.setId(4);
        obj.setFirstName("Chandrabhan", "Sanodiya");
        obj.setMobileNo(1234567098);
        obj.setEmailId("xyz33@gamil.com");

        obj.getId();
        obj.getName();
        obj.getMobileNumber();
        obj.getEmailId();
    }
}

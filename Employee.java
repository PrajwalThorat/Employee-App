
public class Employee {
    String employeeId;
    String name;
    int age ;
    Address address;

    public Employee(String employeeId , String name , int age , Address address){
        this.employeeId = employeeId ;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void display(){
        System.out.println("Employee Id : "+employeeId+"\nName : "+name+"\nAge : "+age);
        address.display();
    }
}
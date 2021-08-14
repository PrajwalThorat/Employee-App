

public class EmployeeExecution {
    public static void main(String[] args) {
        Address address1 = new Address(32, "Tahasil Road", "Near HAnuman Temple", "Pune", 444112);
        Address address2 = new Address(23, "Lala Chowk", "Saniwara","Amravati", 444692);

        Employee emp1 = new Employee("BE12","Vishnu", 32, address1);
        Employee emp2 = new Employee("BE23", "Bhole", 45, address2);

        emp1.display();
        emp2.display();
    }
}

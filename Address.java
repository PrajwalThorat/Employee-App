public class Address {
    int doorNo;
    String street;
    String landMark;
    String city;
    int pinCode;
    public Address(int doorNo, String street, String landMark, String city, int pinCode) {
        this.doorNo = doorNo;
        this.street = street;
        this.landMark = landMark;
        this.city = city;
        this.pinCode = pinCode;
    }
    public void display(){
        System.out.println("Address : "+doorNo+" "+street+" "+landMark+" "+city+" "+pinCode);
    }
}

package MVC.Student;

public class Student {
    private final String name;
    private final String phoneNumber;
    private final String address;
    private final String registrationNumber;
    private final double gpa;

    public Student(String name, String phoneNumber, String address, String registrationNumber, double gpa) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.registrationNumber = registrationNumber;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public String getRegistrationNumber() { return registrationNumber; }
    public double getGpa() { return gpa; }
}

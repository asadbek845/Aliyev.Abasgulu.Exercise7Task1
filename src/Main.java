import java.util.Scanner;

class Person {
    protected String surname;
    protected String firstName;
    protected String street;
    protected String zipCode;
    protected String city;

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname:");
        surname = scanner.nextLine();
        System.out.println("Enter first name:");
        firstName = scanner.nextLine();
        System.out.println("Enter street:");
        street = scanner.nextLine();
        System.out.println("Enter zip code:");
        zipCode = scanner.nextLine();
        System.out.println("Enter city:");
        city = scanner.nextLine();
    }

    public void print() {
        System.out.println("Surname: " + surname);
        System.out.println("First Name: " + firstName);
        System.out.println("Street: " + street);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("City: " + city);
    }
}

class Staff extends Person {
    private String education;
    private String position;

    public void initialize1() {
        initialize(); // Call initialize method from Person class to populate basic fields
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter education:");
        education = scanner.nextLine();
        System.out.println("Enter position:");
        position = scanner.nextLine();
    }

    public void print1() {
        print(); // Call print method from Person class to print basic fields
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.initialize1();
        staff.print1();
    }
}
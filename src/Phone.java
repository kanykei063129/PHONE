import java.time.chrono.IsoEra;
import java.util.Arrays;
import java.util.Scanner;

public class Phone implements PhoneInterface {
    private String brand;
    private String name;
    private int password;
    private Contact[] contacts;

    public Phone(String brand, String name, int password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }

    @Override
    public void turnOn(int password) {
        Scanner scanner = new Scanner(System.in);
        int parol = scanner.nextInt();
        if (parol == password) {
            System.out.println("Telefon jandy.");
        } else {
            System.err.println("Parol tuura emes!!!");
        }
    }

    @Override
    public void call(int number) {
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();
        for (Contact c : contacts) {
            if (number1 == c.getPhoneNumber()) {
                System.out.println(c.getFullName() + " chalyp jatasyz.");
//            } else {
//                System.err.println("Belgisiz nomer!!!");
            }
        }
    }

    @Override
    public void call2() {
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        for (Contact co : contacts) {
            if (co.getFullName().equals(fullName)) {
                System.out.println("FullName: " + co.getFullName()+ " Phone number: " + co.getPhoneNumber() + " chalyp jatasyz");
//            } else {
//                System.err.println("Myndai contact jok!!!");
            }
        }
    }

    @Override
    public Contact searchContact(String name) {

        for (Contact con : contacts) {
            if (con.getFullName().equals(name)) {
                return con;
            }
        }
        return null;
    }

    @Override
    public Contact updateName(String name2, String name3){
        for (Contact conta:contacts) {
            if (conta.getFullName().equals(name2)){
                conta.setFullName(name3);
                return conta;
            }
        }
        return null;
    }

    @Override
    public void getAllContacts() {
        for (Contact cont:contacts) {
            System.out.println("*****Contacts*****");
            System.out.println(cont.getFullName()+" "+cont.getPhoneNumber());
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Contact contact = new Contact(574735683,"Khafiz");
   Contact contact1 = new Contact(748329334,"Davran");
   Contact contact2 = new Contact(463788303,"Aizat");
   Contact contact3 = new Contact(745892002,"Madina");
   Contact  contact4 = new Contact(931820493,"Oksana");
   Contact[]contacts = {contact,contact1,contact2,contact3,contact4};

   Phone phone = new Phone("8+","Iphone",6587,contacts);
   phone.turnOn(6587);
        System.out.println("__________________");
   phone.call(574735683);
        System.out.println("__________________");
   phone.call2();
        System.out.println("__________________");
   System.out.println(phone.searchContact(new Scanner(System.in).nextLine()));
        System.out.println("___________________");
        System.out.println(phone.updateName("Davran","AIMONA"));
        System.out.println("___________________");
   phone.getAllContacts();

    }
}
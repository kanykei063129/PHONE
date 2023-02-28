public interface PhoneInterface {
    public void turnOn(int password);

    public void call(int number);

    public void call2();

    public Contact searchContact(String name);

    public Contact updateName(String name2,String name3);

    public void getAllContacts();
}

package assignment1_example;

public class Contact {
    private String name;
    private String phone;
    private String email;
    private String address;

    public Contact(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", name, phone, email, address);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

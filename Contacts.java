public class Contacts {
    String firstName;
    String lastName;
    String Address;
    String city;
    String state;
    int zip;
    String phoneNumber;
    String email;

    public Contacts(String firstName, String lastName, String address, String city, int zip, String state, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        Address = address;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String toString() {
            return "Name: "+firstName+" "+lastName+"\nAddress:"+Address+"\nCity:"+city+"\nState:"+state+"\nzip:"+zip+"\nPhone number:"+phoneNumber+"\nEmail: "+email;
    }
}

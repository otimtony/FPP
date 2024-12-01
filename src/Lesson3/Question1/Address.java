package Lesson3.Question1;

// Address class representing an address
class Address {

    private String street, city, state, zip;

    // Constructor to initialize Address fields
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    //Getter for street
    public String getStreet() {
        return street;
    }

    //Setter for street
    public void setStreet(String street) {
        this.street = street;
    }

    //Getter for city
    public String getCity() {
        return city;
    }

    //Setter for city
    public void setCity(String city) {
        this.city = city;
    }

    //Getter for state
    public String getState() {
        return state;
    }

    //Setter for state
    public void setState(String state) {
        this.state = state;
    }

    //Getter for zip
    public String getZip() {
        return zip;
    }

    //Setter for Zip
    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }

}
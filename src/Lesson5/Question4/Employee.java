package Lesson5.Question4;

public abstract class Employee {
    String firstName;
    String lastName;
    String socialSecurityNumber;

    Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    abstract double getPayment();

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}

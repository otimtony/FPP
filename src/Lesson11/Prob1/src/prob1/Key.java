package Lesson11.Prob1.src.prob1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Key key = (Key) obj;
		return Objects.equals(firstName, key.firstName) &&
				Objects.equals(lastName, key.lastName);
	}

	// Override hashCode() to generate a unique hash based on firstName and lastName
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public String toString() {
		return "Key{firstName='" + firstName + "', lastName='" + lastName + "'}";
	}
}

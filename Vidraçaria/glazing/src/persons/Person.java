package persons;

import java.io.Serializable;

public abstract class Person implements Serializable, Cloneable{

	private String name;
	private String email;
	private String contact;

    public Person(String name, String email, String contact) {
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

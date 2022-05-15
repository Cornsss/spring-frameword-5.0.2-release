package mypropertyeditor;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Person {

	private String name;

	private Date birth;

	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", birth=" + birth +
				", address=" + address +
				'}';
	}
}

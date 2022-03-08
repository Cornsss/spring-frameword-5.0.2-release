package test;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	private int age;
	private Leg leg;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public void info(){
		System.out.println("name:"+getName()+" age:"+getAge()+" leg has "+leg.getNums());
	}
}

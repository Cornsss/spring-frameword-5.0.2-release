package constructor;

/**
 * @author zhuling
 * @Description
 * @create 2022-04-13 14:59
 */
public class User {
	private String userName;
	private int age;
	private String address;

	public User() {
	}

	public User(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}

	public User(String userName, String address) {
		this.userName = userName;
		this.address = address;
	}

	public User(String userName, int age, String address) {
		this.userName = userName;
		this.age = age;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User{" +
				"userName='" + userName + '\'' +
				", age=" + age +
				", address='" + address + '\'' +
				'}';
	}
}

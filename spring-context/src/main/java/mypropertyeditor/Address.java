package mypropertyeditor;

/**
 * @author zhuling
 * @Description
 * @create 2022-03-09 10:20
 */
public class Address {
	private String province;
	private String city;
	private String disctrict;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDisctrict() {
		return disctrict;
	}

	public void setDisctrict(String disctrict) {
		this.disctrict = disctrict;
	}

	@Override
	public String toString() {
		return "Address{" +
				"province='" + province + '\'' +
				", city='" + city + '\'' +
				", disctrict='" + disctrict + '\'' +
				'}';
	}
}

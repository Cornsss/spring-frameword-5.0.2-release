package test;

/**
 * @author zhuling
 * @Description
 * @create 2022-03-01 10:15
 */
public class Leg {
	private int nums;

	public Leg() {
		System.out.println("Leg No arg Constructor");
	}

	public Leg(int nums) {
		this.nums = nums;
	}

	public int getNums() {
		return nums;
	}

	public void setNums(int nums) {
		this.nums = nums;
	}

	public void info(){
		System.out.println("Leg has "+nums);
	}

	@Override
	public String toString() {
		return "Leg{" +
				"nums=" + nums +
				'}';
	}
}

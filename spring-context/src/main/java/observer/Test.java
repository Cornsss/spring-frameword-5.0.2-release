package observer;

/**
 * @author zhuling
 * @Description
 * @create 2022-04-06 9:58
 */
public class Test {
	public static void main(String[] args) {
		GoodGuy goodGuy = new GoodGuy();
		BadGuy badGuy = new BadGuy();
		badGuy.add(goodGuy);
		badGuy.run();
	}
}

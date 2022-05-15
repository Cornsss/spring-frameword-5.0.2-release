package observer;

/**
 * @author zhuling
 * @Description
 * @create 2022-04-06 9:57
 */
public class GoodGuy implements Observer{
	@Override
	public void doSomething(String sth) {
		System.out.println("goodguy is " + sth);
	}
}

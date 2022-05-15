package supply;

import java.util.function.Supplier;

/**
 * @author zhuling
 * @Description
 * @create 2022-04-13 15:00
 */
public class CreateUserSupplier {

	public static User getUser() {
		return new User("zhangsan");
	}
}

package conversion;

import mypropertyeditor.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.Date;

/**
 * @author zhuling
 * @Description
 * @create 2022-02-28 17:47
 */
// 使用注解必须要注明需要扫面哪些包
public class Test {

	public static void main(String[] args) {
		DefaultConversionService defaultConversionService = new DefaultConversionService();
		String date = "2022-04-07";
		Date convert = defaultConversionService.convert(date, Date.class);
		System.out.println(convert);
	}
}

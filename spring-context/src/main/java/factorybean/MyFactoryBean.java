package factorybean;

import mypropertyeditor.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhuling
 * @Description
 * @create 2022-04-07 21:14
 */
public class MyFactoryBean implements FactoryBean<Person> {

	@Override
	public Person getObject() throws Exception {
		Person person = new Person();
		person.setName("myFactoryBean Person");
		return person;
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
}

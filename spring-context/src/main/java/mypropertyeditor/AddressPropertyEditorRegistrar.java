package mypropertyeditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * @author zhuling
 * @Description
 * @create 2022-03-09 10:40
 */
public class AddressPropertyEditorRegistrar implements PropertyEditorRegistrar {
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		System.out.println("AddressPropertyEditorRegistrar.registerCustomEditors");
		registry.registerCustomEditor(Address.class, new MyPropertyEditorSupport());
	}
}

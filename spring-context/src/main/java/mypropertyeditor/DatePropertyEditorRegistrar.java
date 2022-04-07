package mypropertyeditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.util.Date;

/**
 * @author zhuling
 * @Description
 * @create 2022-03-09 10:40
 */
public class DatePropertyEditorRegistrar implements PropertyEditorRegistrar {
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		System.out.println("DatePropertyEditorRegistrar.registerCustomEditors");
		registry.registerCustomEditor(Date.class, new DatePropertyEditorSupport());
	}
}

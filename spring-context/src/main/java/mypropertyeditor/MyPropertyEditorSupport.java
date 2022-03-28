package mypropertyeditor;

import java.beans.PropertyEditorSupport;

/**
 * @author zhuling
 * @Description
 * @create 2022-03-08 11:28
 */
public class MyPropertyEditorSupport extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setDisctrict(s[2]);
		super.setValue(address);
	}
}

package mypropertyeditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhuling
 * @Description
 * @create 2022-03-08 11:28
 */
public class AddressPropertyEditorSupport extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println(text);
		Address address = new Address();
		String[] s = text.split("_");
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setDisctrict(s[2]);
		setValue(address);
	}
}

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
public class DatePropertyEditorSupport extends PropertyEditorSupport {

	private String format = "yyyy-MM-dd";

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println(text);
		SimpleDateFormat sdf = new SimpleDateFormat(format);

		try {
			Date parse = sdf.parse(text);
			setValue(parse);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}

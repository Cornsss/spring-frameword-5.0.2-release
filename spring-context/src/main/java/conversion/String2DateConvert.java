package conversion;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhuling
 * @Description
 * @create 2022-04-07 17:32
 */
public class String2DateConvert implements Converter<String, Date> {

	private String format = "yyyy-MM-dd";

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public Date convert(String source) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			Date parse = sdf.parse(source);
			return parse;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}

import com.jlm.exceptions.JaysRuntimeException;

public class MyFileUtils {

	public int subtract10FromLargrNumber(int number) throws Exception {
		if (number < 10) {
			throw new JaysRuntimeException("The number passed was smaller than 10.");
		}
		return number - 10;
	}

}

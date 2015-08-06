import java.util.*;
import java.util.regex.*;

public class Validator {

	public static boolean checkCourse(String s) {
		Pattern p = Pattern.compile("(\\w+ \\d+)");
		Matcher m = p.matcher(s);

		if (m.matches())
			return true;
		return false;
	}

	public static boolean checkCredits(String s) {
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(s);

		if (m.matches())
			return true;
		return false;
	}

	public static boolean checkGrade(String s) {
		Pattern p = Pattern.compile("[A-DF]");
		Matcher m = p.matcher(s);

		if (m.matches())
			return true;
		return false;
	}
}

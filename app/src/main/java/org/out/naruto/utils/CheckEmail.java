package org.out.naruto.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
	private static String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

	public static boolean ifemail(String username) {
		Pattern p = Pattern.compile(check);
		Matcher m = p.matcher(username);
		return m.matches();
	}
}

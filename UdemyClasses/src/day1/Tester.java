package day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
	
	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\d+");
		Matcher m=p.matcher("gstebs2");
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}

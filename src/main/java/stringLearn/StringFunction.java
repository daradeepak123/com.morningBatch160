package stringLearn;

import java.util.Scanner;

public class StringFunction {

	public static void main(String[] args) {
		
		String str="    Welcome to QualityTHought123W ";
		String ss="this is another string";
		
		
		System.out.println(str.charAt(3));
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointBefore(1));
		System.out.println(str.concat(" hello"));
		System.out.println(str.contains(" to 123"));
		System.out.println(str.contentEquals("Welcome to QualityTHought123"));
		System.out.println(str.endsWith("Welcome to QualityTHought123 "));
		System.out.println(str.equals("welcome to QualityTHought123 "));
		System.out.println(str.equalsIgnoreCase("welcome to qualityTHought123 "));
		System.out.println(str.concat(ss).indent(1).trim());
		System.out.println(str.indexOf('W'));
		System.out.println(str.lastIndexOf('W'));
		System.out.println(str.indexOf("t", 9, 20));
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		System.out.println(str.length());
		System.out.println(str.repeat(2));
		str=str.replace('W', 'A');
		System.out.println(str);
		System.out.println(str.replaceAll("o", " abc "));
		System.out.println(str.strip());
		System.out.println(str.substring(4));
		System.out.println(str.substring(6, 20));
		System.out.println(str.toLowerCase());
		
		char ch[]=str.toCharArray();
		
		for(char c:ch)
		{
			System.out.println(c);
		}
		
		
		
		String sa="mom and dad are going to meet madam";
		
		String words[]=sa.split(" ");
		
		for(String w:words)
		{
			System.out.println(w);
		}
		
		
		
		

	}

}

package com.auuid.codes;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface I {
	class a{}
}


public class AI{
	public static void main(String[] args) {
		Matcher matcher = Pattern.compile("a+ba").matcher("aaabU");
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.start());
			System.out.println(matcher.end());
			System.out.println("------------------");
		}
		System.out.println(matcher.matches());
		System.out.println(matcher.lookingAt());
		new File("aa/bb").mkdirs();
		for (int i = 1; i < 100; i++) {
			System.out.println(i + ":" + fib(i));
		}
	}
	
	public static long fib(long num) {
		if (num == 1 || num == 2) {
			return 1;
		}
		return fib(num - 1) + fib(num - 2);
	}
}
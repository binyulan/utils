package com.auuid.codes.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BasicFileOutput {
	static String file = "/Users/bradyhan/git/utils/src/main/java/com/auuid/codes/io/BasicFileOutput.out";

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				file)));
		//PrintWriter out = new PrintWriter(file) also buffered
		out.println("abcdefg");
		out.close();
	}
}
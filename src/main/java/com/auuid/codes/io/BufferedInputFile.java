package com.auuid.codes.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
	// Throw exceptions to console:
	public static String read(String filename) throws IOException{
		// Reading input by lines:
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		try {
			while ((s = in.readLine()) != null)
				sb.append(s + "\n");
			
		} finally {
			in.close();
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		System.out.print(read("/Users/bradyhan/git/utils/src/main/java/com/auuid/codes/io/BufferedInputFile.java"));
	}
}
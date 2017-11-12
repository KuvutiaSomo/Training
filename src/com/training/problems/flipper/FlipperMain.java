package com.training.problems.flipper;

import java.io.IOException;

import com.training.utils.FileLoader;

public class FlipperMain {
	public static void main(String[] args) throws IOException {
		FileLoader fileLoader = new FileLoader();
		// String filename = "D:\\Igor\\Education\\IT\\Projects\\Training\\src\\com\\training\\problems\\flipper\\A-small-practice.in";
		String filename = "/A-small-practice.in";

		String data = fileLoader.getFileContent(filename);
		System.out.println(data);
	}
}

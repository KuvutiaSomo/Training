package com.training.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FileLoader {

	public String getFileContent(String filename) throws IOException{
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream inputStream = classloader.getResourceAsStream(filename);

		if (inputStream != null){
			ByteArrayOutputStream result = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int length;
			while ((length = inputStream.read(buffer)) != -1) {
				result.write(buffer, 0, length);
			}
			// StandardCharsets.UTF_8.name() > JDK 7
			return result.toString(StandardCharsets.UTF_8.name());
		}
		return null;
	}
}

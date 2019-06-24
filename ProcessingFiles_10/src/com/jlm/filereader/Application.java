package com.jlm.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		File file = new File("myFile.txt");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader); /* Reads line by line */

			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}

		} catch (FileNotFoundException fnf) {
			System.out.println("File not Found: " + file);
		} catch (IOException e) {
			System.out.println("Problem reading the file: " + file.getName());
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}

			} catch (IOException e) {
				System.out.println("Unable to close file: " + file);

			}

		}

	}
}

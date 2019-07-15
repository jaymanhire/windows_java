package com.jlm.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			// read JSON file and map/convert to Java POJO:
			// data/sample-lite.json
			
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			// print first and last name
			System.out.println("First Name: " + theStudent.getFirstName());
			System.out.println("First Name: " + theStudent.getLastName());
			
			// print address street and city
			Address tempAddress = theStudent.getAddress();
			System.out.println("Street: " + tempAddress.getStreet());
			System.out.println("City: " + tempAddress.getCity());
			System.out.println("Street: " + tempAddress.getState());
			System.out.println("Country: " + tempAddress.getCountry());
			
			// print out languages
			for(String lang : theStudent.getLanguages()) {
				System.out.println(lang);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

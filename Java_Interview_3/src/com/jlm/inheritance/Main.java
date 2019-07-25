package com.jlm.inheritance;

public class Main {

	public static void main(String[] args) {

		MathTeacher mathTeacher = new MathTeacher(32, "Henry Ford Elementary", 9);

		System.out.println(mathTeacher.numberOfStudents);
		System.out.println(mathTeacher.school);
		System.out.println(mathTeacher.favoriteNumber);
		System.out.println(mathTeacher.getRole());
		
		Teacher teacher = new Teacher(33, "Hazel Park High School");
		System.out.println(teacher.numberOfStudents);
		System.out.println(teacher.school);
		System.out.println(teacher.getRole());

	}

}

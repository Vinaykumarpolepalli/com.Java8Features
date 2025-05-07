package com.java8Features;

import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String sname;
	int marks;

	public Student(String sname, int marks) {
		super();
		this.sname = sname;
		this.marks = marks;
	}

}

public class Feature11 {

	public static void main(String[] args) {
		Predicate<Student> p1 = (st) -> st.marks > 70;

		Function<Student, String> st = (students) -> {
			String grade = "";

			if (students.marks > 90) {
				grade = "A";
			} else if (students.marks > 80) {
				grade = "B";

			} else if (students.marks > 70) {
				grade = "C";
			} else if (students.marks > 60) {
				grade = "D";

			} else if (students.marks > 35) {
				grade = "Just pass";
			} else {
				grade = "fail";
			}

			return grade;
		};

		Student s1 = new Student("Vinay", 100);
		Student s2 = new Student("sai", 37);
		Student s3 = new Student("Guru", 65);
		Student s4 = new Student("Ravi", 78);

		Student[] s = { s1, s2, s3, s4 };
		for (Student student : s) {
			if (p1.test(student)) {
				System.out.println("*************************");

				// System.out.println(st.apply(student));
				System.out.println("Student name" + student.sname);
				System.out.println("Student Marks:" + student.marks);
				System.out.println("Student Grade: " + st.apply(student));
			}
		}
	}

}

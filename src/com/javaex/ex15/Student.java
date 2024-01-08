package com.javaex.ex15;
					// Person 상속
public class Student extends Person {

	//필드
	
	private String schoolName;
	
	//생성자
	public Student() {
		System.out.println("Student()");
	}
	public Student(String name, int age, String schoolName) {
		//부모생성자 호출
		
		//super(name, age);
		
		super();
		super.setName(name);
		super.setAge(age);
		
		//자신
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	/*
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	*/
	
	//메소드 g/s
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//메소드 일반
	public String toString() {
		return "학교: " + schoolName + " 이름:" + getName() + " 나이:" + getAge();
	}
	
}

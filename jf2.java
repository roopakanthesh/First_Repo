package com.kodnest.jfc;


class Student{
	int age;
	String name;
	
	public Student(int age,String name) {
		this.age = age;
		this.name = name;
	}

		//override the toString
		@Override
		public String toString() {
			return "A_L{name:"+name+",age:"+age+"}";
		
}
}

public class jf2 {
	public static void main(String[] args) {
		Student student = new Student(10,"Jhon");
		System.out.println(student);
		Student student1 = new Student(30,"Jack");
		System.out.println(student1);
	}
	

}

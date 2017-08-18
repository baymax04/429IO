package javaApp;

public class Student {

	int stuNo;
	String name;
	int age;
	public Student(int stuNo,String name,int age) {
		this.stuNo=stuNo;
		this.name=name;
		this.age=age;
	}
	public void outPut(){
		System.out.println("stuNo:"+stuNo+"\tname:"+name+"\tage:"+age);
	}
}


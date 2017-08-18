package demo53;

public class Student {
	public int id = 1001;
	public String name = "张三";
	public String sex = "男";

	public Student(){
		System.out.println("Student构造方法被执行=====");
	}
	
	/**
	 * 有参数构造方法为了给定类的全局变量赋值
	 * @param name
	 * @param sex
	 */
	public Student(String name,String sex){
		this.name = name;
		this.sex = sex;
		System.out.println("Student构造方法被执行=====name:"+name+";====sex:"+sex);
	}
		
	/**
	 * 在同一个类中才能构成重载
	 * 重载特点：方法名相同，参数列表不同（参数个数，顺序，参数类型）
	 * @return
	 */
	public String info(){
		// 局部变量
		String stuInfo = "info:"+name+","+sex;		
		//System.out.println(stuInfo);		
		return stuInfo;
	}
	
	public void info(String name,int age){
		String stuInfo = "info:"+name+","+sex;
	}
	
	public String info(int age,String username){
		String stuInfo = "info:"+name+","+sex;
		return stuInfo;
	}
	
	public void method(){
		// 当前对象，可以省略不写
		this.name="王五";
		id = 1002;
		// 局部变量超出作用域无法访问
		//stuInfo = "my info";
		System.out.println("method========name；"+name);
	}

}

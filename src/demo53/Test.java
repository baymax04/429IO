package demo53;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student student  = new Student();//Student():调用构造方法
		
		String info = student.info();
		student.info(26, "11");
		
		System.out.println(info);
		
		student.method();
		
		Student student1  = new Student("tidy","女");
		student1.info();
		
	}
	
	

}

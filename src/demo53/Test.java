package demo53;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student student  = new Student();//Student():���ù��췽��
		
		String info = student.info();
		student.info(26, "11");
		
		System.out.println(info);
		
		student.method();
		
		Student student1  = new Student("tidy","Ů");
		student1.info();
		
	}
	
	

}

package demo53;

public class SubClass extends Parents{
	
	public String sex;
	
	
	public void doSports(){
		System.out.println("==doSport====");
	}
	
	/**
	 * 重写/覆盖特点（前提：子类继承父类）：方法名一样，方法参数列表相同,返回值相同(即方法头信息相同)
	 */
	public void eat(){
		
		System.out.println("eat===SubClass===");
	}
	
	public int eat(int a){
		
		System.out.println("eat======");
		return 0;
	}
	
	public void sayHello(int age){
		
	}
}

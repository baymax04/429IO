package demo53;

public class SubClass extends Parents{
	
	public String sex;
	
	
	public void doSports(){
		System.out.println("==doSport====");
	}
	
	/**
	 * ��д/�����ص㣨ǰ�᣺����̳и��ࣩ��������һ�������������б���ͬ,����ֵ��ͬ(������ͷ��Ϣ��ͬ)
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

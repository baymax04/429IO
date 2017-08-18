package demo53;

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Parents parents = new Parents();
		parents.sayHello("tidy");
		
		// 引用子类实例
		// 可以访问父类中的方法和属性，如果子类重写父类中的方法则会执行子类中的方法即是重写/覆盖
		Parents parents1 = new SubClass();
		parents1.eat();
		
		// 子类和父类方法和属性均可访问,
		SubClass subClass = new SubClass();
		subClass.eat();
		SubTwoClass parents2=new SubTwoClass();
		parents2.drawing();
	
	}

}

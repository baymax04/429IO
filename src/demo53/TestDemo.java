package demo53;

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Parents parents = new Parents();
		parents.sayHello("tidy");
		
		// ��������ʵ��
		// ���Է��ʸ����еķ��������ԣ����������д�����еķ������ִ�������еķ���������д/����
		Parents parents1 = new SubClass();
		parents1.eat();
		
		// ����͸��෽�������Ծ��ɷ���,
		SubClass subClass = new SubClass();
		subClass.eat();
		SubTwoClass parents2=new SubTwoClass();
		parents2.drawing();
	
	}

}

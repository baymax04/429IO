package demo53;

public class Student {
	public int id = 1001;
	public String name = "����";
	public String sex = "��";

	public Student(){
		System.out.println("Student���췽����ִ��=====");
	}
	
	/**
	 * �в������췽��Ϊ�˸������ȫ�ֱ�����ֵ
	 * @param name
	 * @param sex
	 */
	public Student(String name,String sex){
		this.name = name;
		this.sex = sex;
		System.out.println("Student���췽����ִ��=====name:"+name+";====sex:"+sex);
	}
		
	/**
	 * ��ͬһ�����в��ܹ�������
	 * �����ص㣺��������ͬ�������б�ͬ������������˳�򣬲������ͣ�
	 * @return
	 */
	public String info(){
		// �ֲ�����
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
		// ��ǰ���󣬿���ʡ�Բ�д
		this.name="����";
		id = 1002;
		// �ֲ����������������޷�����
		//stuInfo = "my info";
		System.out.println("method========name��"+name);
	}

}

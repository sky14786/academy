package example;

public class example {

	public static void main(String[] args) {
		int a=100;
		long b = 10000L;
		float c = 234.567f;
		double d = 567.12356;
		char e = 'A';
		String f = "Hello world";
		boolean isbool = true;
		
		
		
		
		
		System.out.println(a+"\t"+b+"\t"+c+"\t"+"\t"+d+"\t"+e+"\t"+f+"\t"+isbool);
		
		String name,local,phone,email;
		int age;
		char gender;
		
		System.out.println("�̸�\t����\t����\t����\t��ȭ��ȣ\t\t�̸���");
		name = "ȫ�α�";
		age = 22;
		gender='��';
		local="����";
		phone="01012345678";
		email="myemail@email.com";
		System.out.println("------------------------------------------");
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s",name,age,gender,local,phone,email);
		System.out.println();
		
		name = "��浿";
		age = 50;
		gender='��';
		local="��⵵";
		phone="01098765432";
		email="mrgogo@email.com";
		System.out.println("------------------------------------------");
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s",name,age,gender,local,phone,email);
		System.out.println();
		
		
		
		
	}

}

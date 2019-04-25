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
		
		System.out.println("이름\t나이\t성별\t지역\t전화번호\t\t이메일");
		name = "홍두깨";
		age = 22;
		gender='남';
		local="서울";
		phone="01012345678";
		email="myemail@email.com";
		System.out.println("------------------------------------------");
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s",name,age,gender,local,phone,email);
		System.out.println();
		
		name = "고길동";
		age = 50;
		gender='남';
		local="경기도";
		phone="01098765432";
		email="mrgogo@email.com";
		System.out.println("------------------------------------------");
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s",name,age,gender,local,phone,email);
		System.out.println();
		
		
		
		
	}

}

package emp.run;

import emp.model.vo.Employee;
import product.model.vo.Products;
//실행용 클래스
public class TestEmp {

	public static void main(String[] agrs)
	{
		new Employee().printEmployee();
		new Products().printProduct();
	}
	
}

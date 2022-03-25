package forloop;

public class Example2 {

	public static void main(String[] args) {
		
		int employeeIds[]= {01,02,03,04};
		String employeeNames[]= {"aaa","bbb","ccc","ddd"};
		double employeeSalaries[]= {45000.45,34567.89,56789.34,23456.78};
		
		for(int employeeId: employeeIds)
		{
			System.out.println(employeeId);
		}
		
		System.out.println("--------------------");
		
		for(String employeeName: employeeNames)
		{
			System.out.println(employeeName);
		}
		
		System.out.println("--------------------");
		for(double employeeSalary: employeeSalaries)
		{
			System.out.println(employeeSalary);
		}
	}

}

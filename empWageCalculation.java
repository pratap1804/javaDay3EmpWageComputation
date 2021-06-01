public class empWageCalculation {
	public static void main(String[] args){
		double rand = (Math.random()*10);
		int remainder = (int)rand % 2;
		int emp_Hours=8;
		int wage_Per_Hour=20;
		int emp_Wage=0;
		if (remainder == 1){
			emp_Wage = emp_Hours * wage_Per_Hour;
			System.out.println("Employee is Present"+ "Total Wage is: "+ emp_Wage);
		}
		else
			System.out.println("Employee is Absent "+ "Total Wage is: "+ emp_Wage);
	}
}


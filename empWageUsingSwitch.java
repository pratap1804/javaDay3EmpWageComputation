public class empWageUsingSwitch {
	public static void main(String[] args){
		double rand = (Math.random()*10);
		int remainder = (int)rand % 3;
		int FullTime_Hours=12;
		int PartTime_Hours=8;
		int wage_Per_Hour=20;
		int emp_Wage=0;
		switch (remainder){
			case 0:
			emp_Wage = FullTime_Hours * wage_Per_Hour;
			System.out.println("Employee is Present");
			System.out.println("Total Wage is: "+ emp_Wage);
			break;

			case 1:
			emp_Wage=PartTime_Hours * wage_Per_Hour;
			System.out.println("Employee is PartTime Present");
			System.out.println("Total Wage is: "+ emp_Wage);
			break;

			case 2:
			System.out.println("Employee is Absent");
			System.out.println("Total Wage is: " +emp_Wage);
		}
	}
}


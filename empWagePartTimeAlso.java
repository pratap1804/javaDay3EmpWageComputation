public class empWagePartTimeAlso {
	public static void main(String[] args){
		double rand = (Math.random()*10);
		int remainder = (int)rand % 3;
		int FullTime_Hours=12;
		int PartTime_Hours=8;
		int wage_Per_Hour=20;
		int emp_Wage=0;
		if (remainder == 1){
			emp_Wage = FullTime_Hours * wage_Per_Hour;
			System.out.println("Employee is Present");
			System.out.println("Total Wage is: "+ emp_Wage);
		}
		else if (remainder ==2){
			emp_Wage=PartTime_Hours * wage_Per_Hour;
			System.out.println("Employee is PartTime Present");
			System.out.println("Total Wage is: "+ emp_Wage);
		}
		else
			System.out.println("Employee is Absent");
			System.out.println("Total Wage is: " +emp_Wage);
	}
}


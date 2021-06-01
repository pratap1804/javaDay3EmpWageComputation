public class attendanceProgram {
	public static void main(String[] args){
		double rand = (Math.random()*10);
		int remainder = (int)rand % 2;

		if (remainder == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}


public class EmpolyeeBuilder {

	public static void main(String[] args) {
		 int FULL_TIME = 1;
		 double emp_type =Math.floor(Math.random() * 100) % 2;
		 if (emp_type == FULL_TIME)
		 {
			 System.out.println("employee is present");
		 }
		 else
		 {
			 System.out.println("employee is absent");
		 }

	}

}

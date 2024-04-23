package methodsAssignments;

public class EligibleToVote {

	public static void main(String[] args) {
		
		EligibleToVote ev = new EligibleToVote(); 
		boolean flag = ev.personAge(25);
		if(flag == true) {
			System.out.println("Person is eligible to Vote");
		}
		else {
			System.out.println("Person is not eligible to Vote"); 
		}
	}

	public boolean personAge(int age) {
		
		if(age >=18) {
			return true;
		}
		else {
			return false;
		}
		
	}
}

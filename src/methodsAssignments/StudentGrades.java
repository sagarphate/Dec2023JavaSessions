package methodsAssignments;

public class StudentGrades {

	public static void main(String[] args) {
		
		String gred = displayGrads(95);
		System.out.println(gred);
	}

	public static String displayGrads(int mark) {
		
		switch (mark) {
		case 1:
			if(mark >91 || mark <100)
				return "AA";

		default:
			break;
		}
		return "FAIL";
	}
}

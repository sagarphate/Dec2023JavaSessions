package inheritanceConcept;

public class TestUnivercity {

	public static void main(String[] args) {
		
		ModernCollege mc = new ModernCollege();
		mc.puneUnivercity();
		mc.socialAwearness();
		mc.physics();
		mc.maths();
		mc.computerScience();
		mc.educationRule();
		mc.sanskrit();
		mc.homeEducationDetails();
		
		System.out.println("-------------------------------------------");
		
		DYPatilCollege dy = new DYPatilCollege();
		dy.puneUnivercity();
		dy.physics();
		dy.maths();
		dy.computerScience();
		dy.drawing();
		dy.ayurvedic();
		dy.homeEducationDetails();
		
		System.out.println("--------------------------------------------");
		
		FCCollege fc = new FCCollege();
		fc.computerScience();
		fc.puneUnivercity();
		fc.acting();
		fc.maths();
		fc.physics();
		fc.computerScience();
		fc.gurukul();
		fc.homeEducationDetails();
	}

}

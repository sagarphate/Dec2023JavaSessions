package javasessions;

public class Programs {

	public static void main(String[] args) {
		
		int a=78, b=87, c =25;
		
		if(a>b && a>c) {
			System.out.println("A is Greater Number is = "+a);
		}
		else if (b>a &&b>c) {
			System.out.println("B is Greater Number is = "+b);
		}
		else
			System.out.println("C is Greater Number is = "+c);
		
		
		int i=78, j=97, k =25, l=87;
		
		if(i>j && i>k && i>l) {
			System.out.println("I is Greater Number is = "+i);
		}
		else if (j>i && j>k && j>l) {
			System.out.println("J is Greater Number is = "+j);
		}
		else if(k>i && k>j && k>l) {
			System.out.println("K is Greater Number is = "+k);
		}
		else
			System.out.println("L is Greater Number is = "+l);

		
		int n=35, m=-11;
		if(n>0){
			System.out.println("Positive Number");
		}
		
		if(m<0) {
			System.out.println("Negative Number");
		}
			

		int num = 15;
		if(num%2 ==0) {
			System.out.println("Number is Even");
		}
		else
			System.out.println("Number is Odd");
			
		//a, e, i, o, u
		char ch = 'o';
		
		switch (ch) {
		case 'a':
			System.out.println("this is Vowel a");	
			break;
		case 'e':
			System.out.println("this is Vowel e");	
			break;
		case 'i':
			System.out.println("this is Vowel i");	
			break;
		case 'o':
			System.out.println("this is Vowel o");	
			break;
		case 'u':
			System.out.println("this is Vowel u");	
			break;

		default:
			System.out.println("This is Consonant");
			break;
		}
		
		// QA, Stage, Dev, UAT, Prod
		String testEnv = "UAT";
		
		switch (testEnv) {
		case "QA":
			System.out.println("This is QA Environment ");
			break;
		case "Stage":
			System.out.println("This is Stage Environment ");
			break;
		case "Dev":
			System.out.println("This is Dev Environment ");
			break;
		case "UAT":
			System.out.println("This is UAT Environment ");
			break;
		case "Prod":
			System.out.println("This is Prod Environment ");
			break;
		default:
			System.out.println("Please Pass Correct Environment Details");
			break;
		}
		
		// Car type = Mini, Sedan, SUV, Premium
		
		String carType = "Premium";
		switch (carType) {
		case "Mini":
			System.out.println("You have booked Mini car for ride");
			break;
		case "Sedan":
			System.out.println("You have booked Sedan car for ride");
			break;
		case "SUV":
			System.out.println("You have booked SUV car for ride");
			break;
		case "Premium":
			System.out.println("You have booked Premium car for ride");
			break;

		default:
			System.out.println("please select the correct right car type ");
			break;
		}
	
		//Browser: Chrome/Firefox/IE/Safari
	
		String browser = "IE", Browser = "Firefox";
		
		if(browser =="Chrome") {
			System.out.println("Launch Chrome Browser");
		}
		else if (browser == "Firefox") {
			System.out.println("Launch Firefox Browser");
		}
		else if (browser == "IE") {
			System.out.println("Launch IE Browser");
		}
		else if (browser == "Safari") {
			System.out.println("Launch Safari Browser");
		}
		else {
			System.out.println("Plese Pass Correct browser name");
		}
		
		switch (Browser) {
		case "Chrome":
			System.out.println("Launch Chrome Browser");
			break;
		case "Firefox":
			System.out.println("Launch Firefox Browser");
			break;
		case "IE":
			System.out.println("Launch IE Browser");
			break;
		case "Safari":
			System.out.println("Launch Safari Browser");
			break;

		default:
			System.out.println("Plese Pass Correct Browser name");
			break;
		}
		
		
		//Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
		String loanType = "Housing Loan";
		int salary = 40000;
		switch (loanType) {
		case "Car Loan":
			System.out.println("This is realated to Car Loan Department");
			System.out.println("interestRate = 6.5");
			break;
		case "Housing Loan":
			System.out.println("This is realated to Housing Loan Department");
			System.out.println("interestRate = 7.5");
			if(salary < 35000) {
				System.out.println("Customer is NOT APPLICABLE FOR Housing Loan");
			}
			else {
				System.out.println("Customer is APPLICABLE FOR Housing Loan");
			}
			break;
		case "Personal Loan":
			System.out.println("This is realated to Personal Loan Department");
			System.out.println("interestRate = 10.00");
			break;
		case "Education Loan":
			System.out.println("interestRate = 8.0");
			System.out.println("This is realated to Education Loan Department");
			break;
		default:
			System.out.println("Plese select Correct Loan Type");
			break;
		}
	}
}

package javasessions;

public class LogicalOperator {

	public static void main(String[] args) {
		
			int x = 10;
	        int y = 5;

	        if (x > 0 && y > 0 && x < y && x * 2 < y) {
	            System.out.println("Hi");
	        }
	        
	        if (x > 0 & y > 0 & x < y & x * 2 < y) {
	            System.out.println("Hello");
	        }
	        
	        
	        boolean a = true;
	        boolean b = false;
	        
	        boolean result = a && b;
	        System.out.println(result);
	        
	        boolean resultVal = a & b;
	        System.out.println(resultVal);
	        
	        
	        int k= 10, m =20, f=0;
	        f=k+m;
	        System.out.println("Addition is "+f);
	        
	        
	        String str = "Payment $200 paid";
	        System.out.println( str.charAt(2) );
	        
	        System.out.println( str.replace('2', '5') );
	        System.out.println( str.substring(8, 12));
	        
	        
	        System.out.println(str.charAt('$'));
	       
	     
	        //print lname="sagar" and fname="phate"
	        String fname = "sagar";
	        String lname = "phate";
	        
	        String name = fname + lname ;
	        System.out.println(name);
	        
	        lname = name.substring(0, name.length() - lname.length() );
	        System.out.println(lname);
	        fname = name.substring(lname.length());
	        System.out.println(fname);
	       
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}

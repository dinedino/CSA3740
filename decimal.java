importstaticorg.junit.Assert.assertTrue;

importjava.util.Scanner;
class binary

{ 
	publicstaticvoid main(String[] args) 
	{ Scannerin = new Scanner(System.in); 
	// decimal number
	intdecimal = in.nextInt(); 
	// convert decimal to binary
	String binary = Integer.toBinaryString(decimal); 
	
	System.out.println("BINARY IS " + binary); 
	//convert decimal to octal
	System.out.print("OCTAL IS "); 
	System.out.println(Integer.toOctalString(decimal));
	//assertEqual("1100" , binary);
	assertTrue(14== decimal);
	
	 }
	
	}

importstaticorg.junit.Assert.assertTrue;
importjava.util.Scanner;
class four
{ 
publicstaticvoid main(String[] args) 
{ 
intage,shrt;
Scanner scan = newScanner(System.in);
System.out.println(" Please enter your age");
age = scan.nextInt(); 
if(age>=18) 
{ 
System.out.println("Welcome to voting system Yo can Vote");
} 
else
{
	shrt= (18 - age);
System.out.println("Sorry,You can vote after :"+ shrt + " years");
assertTrue(age==shrt);

} } }

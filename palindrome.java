importjava.util.Scanner;
importstaticorg.junit.Assert.assertTrue;
publicclass palindrome
{
	publicstaticvoid main(String args[]) 
	{ 
		Scanner in = newScanner(System.in);
		intr, sum = 0, temp; intn = in.nextInt();
		temp = n; 
		while (n> 0) 
		{
			r = n % 10; n = n / 10;
			sum = (sum * 10)+r;
		}
		System.out.println(sum);
		assertTrue(787==sum);
		if(temp==sum)
			System.out.println(sum+" is palindrome number");
		else
			System.out.println(sum+" is not palindrome number");
		} 

	
	}

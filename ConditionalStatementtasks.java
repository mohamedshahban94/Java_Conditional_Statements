import java.util.Scanner;
class ConditionalStatementtasks{
	
	void find_divsible(int a)
	{
		if ((a%5==0)&&(a%11==0)){
			System.out.println("Given number is divisible by 5 and 11:"+a);
		}
		else
		{
			System.out.println("Not divisible");
		}
	}
	void find_vowel(char a)
	{
		if((a=='a')|(a=='e')|(a=='i')|(a=='o')|(a=='u')|(a=='A')|(a=='E')|(a=='I')|(a=='O')|(a=='U'))
		{
			System.out.println("vowels");
		}
		else
		{
			System.out.println("Consonants");
		}
	}
	
	void find_alphabet(int a)
	{	
		if(((a>=65)&&(a<=90))||((a>=97)&&(a<=122)))
		{
			System.out.println("Alphabets: "+ (char)a);
		}
		else
		{
			System.out.println("Not Alphabets");
		}
	}
	void find_case(int a)
	{
		if((a>=65)&&(a<=90)){
			System.out.println("Uppercase :"+ (char)a);
		}
		else if((a>=97)&&(a<=122)){
			System.out.println("lowercase:"+ (char)a);
		}
		else
		{
			System.out.println("Not valid character");
		}
	}
	void find_value(int a)
	{
		if(((a>=65)&&(a<=90))||((a>=97)&&(a<=122)))
		{
			System.out.println("Alphabets: "+ (char)a);
		}
		else if((a>=48)&&(a<=57))
		{
			System.out.println("Digits ");
		}
		else
		{
			System.out.println("Symbols: "+ (char)a);
		}
	}
	
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		ConditionalStatementtasks obj = new ConditionalStatementtasks();

		obj.find_divsible(55);
		
		obj.find_vowel('a');
		
		obj.find_alphabet(65);
		
		
		obj.find_case('A');
		
		char input = sc.next().charAt(0);
		obj.find_value(input);
		
	}
}
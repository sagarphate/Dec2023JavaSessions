package javasessions;

public class Loops {

	public static void main(String[] args) {

		for(int i=0; i<5;i++)
		{
			System.out.println("I am Batman﻿");
		}
		
		System.out.println("-----------------------------");
		
		for(int j=1; j<=9;j++)
		{
			System.out.println("I am Batman﻿"+" "+j);
		
		}
		
		System.out.println("while loop");
		// while loop
		
		int l = 10;
		while(l>0) {
			System.out.println(l);
			l--;
		}
		
		System.out.println("do while loop");
		int g =10;
		do {
			System.out.println(g);
			g--;
		}while(g>0);
		
		System.out.println("while loop print 10 time Hello world");
		
		String s = "Hello World";
		int q = 1;
		while(q<=10) {
			System.out.println(s);
			q++;
		}
			
		System.out.println("Multiplication of 5 from 1 to 100 while loop");
		//while loop
		int y = 1;
		while (y<=100) {	
			if(y%5 == 0)
			{
				System.out.println(y);
			}
				y++;
		}
		
		System.out.println("Multiplication of 5 from 1 to 100 for loop");
		for(int f = 1; f<=100 ; f++)
		{
			if(f%5 == 0)
			{
				System.out.println(f);
			}
		}
		
		System.out.println("Multiplication of 5 from 1 to 100 do while loop");
		
		int d=1;
		do {
			if(d%5 == 0)
			{
				System.out.println(d);
			}
			d++;
		}while(d<=100);
		
		
		System.out.println("all odd and even numbers between 1 to 100");
		for(int w = 1; w <=100; w++)
		{
			if(w%2 == 0)
				System.out.println("Even Number"+" "+w);
			else
				System.out.println("Odd Number"+" "+w);
		}
		
		/*
		int c = 1;
		while(c<=1){
			System.out.println("Hi Java"); // infinite Loop
		}
		*/ 
		
		System.out.println(" Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.");
		
		for(int c='A'; c<='Z'; c++)
		{
			System.out.println(c);
		}
		
		for(int ch='a'; ch<='z'; ch++)
		{
			System.out.println(ch);
		}
		
		for(char a='0';a<='9';a++)
		{
			System.out.println((int)a);
		}
		
		System.out.println("Print series 1.0 2.0 3.0  ...... 10.0 ");
		for(float e=1 ; e<=10 ; e++ )
		{
			System.out.println(e);
		}
		
		System.out.println("Print series 0 9 18 27 36 …99");
		for(int v=0;v<=99;v++)
		{
			if(v%9 == 0)
			{
				System.out.println(v);
			}
		}
	
		System.out.println("Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.");
		
		char cc = 'a';
		while(cc<='z') {
			if(cc == 'a' || cc == 'e' || cc == 'i' || cc == 'o' || cc == 'u' )
			{
				System.out.println(cc);
			}
			cc++;
		}
			
		System.out.println("----------------------");
		int x = 1;
		while(x<=10) {
			System.out.println(x);
			
			if(x%7 == 0)
			{
				System.out.println("bye, see you tomorrow");
				break;
			}
			x++;	
		}
	
	
		String product[] = {"Lenovo","Mackbook","Nikon"};
		for (String name : product) {
			System.out.println(name);
		}
		
		Object emp[] = {"Sagar", 35, 15.00, 'M', true};
		for (Object e : emp)
		{
			System.out.println(e);
		}
		
		System.out.println("------------");
		
		int i=0;
		i = i++ - --i + ++i - i--;
		System.out.println(i);
		
		System.out.println("------------");
		
		int a=11, b=22, c;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}

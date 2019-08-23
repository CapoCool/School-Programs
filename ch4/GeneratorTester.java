package ch4;

import java.util.*;

public class GeneratorTester 
{
	public static void main(String[] args)
	{
		int test;
		Random gen = new Random();
		
		test = gen.nextInt(14) + 1;
		System.out.print(test);
	}

}

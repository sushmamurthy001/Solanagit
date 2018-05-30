package Test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	
	void div()
	{
		int a, b, res;
		Scanner scan = new Scanner(System.in);
		
		try
		{
			System.out.println("enter a value");
			a=scan.nextInt();
			System.out.println("enter b value");
			b=scan.nextInt();
			res=a/b;
			System.out.println("result is " + res);
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("divide by 0 not possible");
		}
		
		catch (InputMismatchException e) 
		{
			System.out.println("String not allowed");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("pgms");
		}
		System.out.println("end of pgm");
		scan.close();
	}
	
	void m1() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("");
	}
	

	public static void main(String[] args) 
	{
		Division d = new Division();
		d.div();
		try {
			d.m1();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}}
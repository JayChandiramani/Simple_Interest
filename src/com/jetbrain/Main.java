package com.jetbrain;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner SIinfo= new Scanner(System.in);
	double P,R,T,SimpleInterest;
	int age;
	String name,currency;

	//User's Information
	System.out.println("Please enter your name and age.");
	System.out.print("Name: ");
	name= SIinfo.nextLine();
	System.out.print("Age: ");
	age=SIinfo.nextInt();
	System.out.println();

	//Input currency
	System.out.println("Please enter the currency you will be using. For example, INR or USD.");
	System.out.print("Currency: ");
	currency=SIinfo.next();
	System.out.println();

	//Input Simple Interest Info
	System.out.println("Please enter the principal amount which you invested, the number of years for which you invested, and the interest rate per annum.");
	System.out.print("Principal Amount: ");
	P= SIinfo.nextDouble();
	System.out.print("Rate: ");
	R= SIinfo.nextDouble();
	System.out.print("Number of Years: ");
	T= SIinfo.nextDouble();
	System.out.println();

	//Printing the simple interest
	SimpleInterest=(P*R*T)/100;
	System.out.println("The simple interest for "+P+currency+" at a rate of "+R+"% for "+T+" years would be "+SimpleInterest+currency+".");
	System.out.println();

	//Printing user info and simple interest.
	System.out.println("Summary");
	System.out.println("	Name: "+name);
	System.out.println("	Age: "+age);
	System.out.println("	Your simple interest is: "+SimpleInterest+currency);
    }
}

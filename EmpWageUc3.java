package practiseProblemsDay3;

import java.util.Scanner;

public class EmpWageUc3 {

	 public static int is_Part_Time =1;
	    public static int iS_Full_Time =2;
	    public static int emp_Rate_Per_Hour =20;
	    public static int empHrs=0;
	    public static int empWage=0;

	    private static double empCheck=(double) (Math.floor(Math.random() * 10) % 3);

	    public static void employeeWage(){
	        if (empCheck==is_Part_Time)
	            empHrs=4;
	        else if (empCheck==iS_Full_Time)
	            empHrs = 8;
	        else
	            empHrs=0;
	        empWage = empHrs * emp_Rate_Per_Hour;
	        System.out.printf("Employee Wage is "+empWage);
	    }
	    public static void main(String[ ] args){
	        employeeWage();
	    }
}

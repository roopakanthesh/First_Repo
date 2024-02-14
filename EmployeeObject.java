package demo.array3.com;

import java.util.Scanner;

class Employee{
	   
	   String name;
	   int age;
	   
	   //constructor with  2 parameters
	   public Employee(String name ,int age) {
		   this.name = name;
		   this.age = age;
		   
	   }
   }
   
public class EmployeeObject {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the number of employee");
		int size = scan.nextInt();
		
		// employee array of size 3
		Employee e[] = new Employee[size];
		 
		//read the employee details
		int j=1;
		System.out.println("User! please enter the employee details");
		System.out.println("----------------------------------------");
		for(int i=0;i<=e.length-1;i++) {
          System.out.println("enter the employee-"+(j)+ "name");
           String name = scan.next();
			System.out.println("enter the employee-"+(j)+ "age");
			int age = scan.nextInt();
		     e[i] = new Employee(name,age);
		     j++;
		}
			
	   //display the employee details
		System.out.println("The employee details are :");
			for(int i=0;i<=e.length-1;i++) {
				System.out.println(e[i].name);
				System.out.println(e[i].age);
			}
		}
		
		
	}

package demo.array3.com;

import java.util.Scanner;

class Student {
	   
	   String name;
	   int age;
	   
	   //constructor with  2 parameters
	   public Student(String name ,int age) {
		   this.name = name;
		   this.age = age;
		   
	   }
}

       public class StudentObject {
    		  public static void main(String[] args) {
    				Scanner scan = new Scanner(System.in);
    				System.out.println("User! please enter the number of student");
    				int size = scan.nextInt();
    				
    				// student array of size 4
    				Student e[] = new Student[4]; 
    				// size is declared(4)
    				 
    				//read the student details
    				int j=1;
    				System.out.println("User! please enter the student details");
    				System.out.println("----------------------------------------");
    				for(int i=0;i<=e.length-1;i++) {
    		          System.out.println("enter the student-"+(j)+ "name");
    		           String name = scan.next();
    					System.out.println("enter the student-"+(j)+ "age");
    					int age = scan.nextInt();
    				     e[i] = new Student(name,age);
    				     j++;
    				}
    					
    			   //display the student details
    				System.out.println("The student details are :");
    					for(int i=0;i<=e.length-1;i++) {
    						System.out.println(e[i].name);
    						System.out.println(e[i].age);
    					}
    				}
    				
    				
    			}

       

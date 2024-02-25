package com.kodnest.jfc;

import java.util.ArrayList;
import java.util.Collections;



class Stud implements Comparable<Stud> {
	int id;
	String name;
	
	public Stud(int id,String name) {
		super();
	this.id = id;
	this.name = name;
}

	
  @Override
  public String toString() {
	return id+"-"+name;
       }
 

  @Override
  public int compareTo(Stud o) {
	  if(this.id>o.id) {
		  return 1;
	  }
	  else if(this.id<o.id) {
		  return -1;
	  }
	  return 0;
  }
}
public class comparableAndCompare  {
	public static void main(String[] args) {
		Stud s1 = new Stud(10,"jhon");
		Stud s2 = new Stud(40,"jack");
		Stud s3 = new Stud(80,"Thor");
		Stud s4 = new Stud(25,"Ria");
		Stud s5 = new Stud(60,"Roman");
		
	 ArrayList<Stud> al = new ArrayList();
	 al.add(s1);
	 al.add(s2);
	 al.add(s3);
	 al.add(s4);
	 al.add(s5);
	 System.out.println(al);
	 Collections.sort(al);
	 System.out.println(al);
	}
}


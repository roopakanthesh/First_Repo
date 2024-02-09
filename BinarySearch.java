package demo.array.com;

import java.util.Arrays;

public class BinarySearch {
             public static void main(String[] args) {
            	 int a[] = {13,34,67,89,44,76};
	       Arrays.sort(a);
	       
	       int ele = 13;
	       int low = 0;
	       int high = 5;
	       int mid;
	       int flag = 0;
	       
	       
	     
	       while(low <= high) {
	    	   mid = (low+high)/2;
	       if(a[mid] == ele) {
	    	  System.out.println("element found");
	    	  flag++;
	    	  break;
	       }
	       else if(ele > a[mid]) {
	    	   low = mid+1;
	   }
	       else {
	    	   high = mid-1;
	       }
			}
	       if(flag==0) {
				System.out.println(" element not found");
			}
			}
}
// if(flag==false)
package intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*int [] arr = new int[5] ;
     arr[0]=1;  //array is static and arraylist is dynamic and have lots of built in method
     int [] arr2= {1,2,3,4,5,6};
     System.out.println(arr2[2]);
     for(int i=0;i< arr2.length;i++) {
    	 System.out.println(arr2[i]);
    	 
     }
     for(int j=arr2.length-1;j>=0;j--) {
    	 System.out.println(arr2[j]);
    	 
     }
     for(int i : arr2) {
    	 if(i%2==0) {
    	 System.out.println(i);}
     }
	}*/
    String[] s1= {"abc","xyz","wxz"};
    List<String> name=Arrays.asList(s1);
	ArrayList<String> a = new ArrayList<String>();
	
    a.add("rahul");
    System.out.println(a.get(0));
    System.out.println(a.isEmpty());
	for(String s:a) {
	
		System.out.println(s);
	}
	}

}

package intro;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="Hello world";   // String object creation with literal always check value if object is present in string constant pool if yes then it will not create new space in memory
         String obj= new String("Hello World");
         String obj1= new String("Hello World");// String object creation with new keyword always ceatte new object and acquire space in memory
         
         for(int i=0;i<str.length();i++) {
        	 System.out.println(str.charAt(i));
      }

}}

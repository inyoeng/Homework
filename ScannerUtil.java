package memo.access;

import java.util.Scanner;

import memo.model.Memo;

public class ScannerUtil {

	static Scanner sc= new Scanner(System.in);
	
	public static int readInt() {
		 String s = null;
	      int i = 0; 
	      
	      while(true) {
	         try {
	            System.out.println("Enter Number: ");
	            s = sc.next();
	            i = Integer.valueOf(s);
	            System.out.println( i );
	            break;
	         } 
	            catch(Exception e){
	               System.out.println("정수 값을 입력하세요.");
	               }
	         }
	      return i;

	} 
	
	public static String readStr() {
	     String s = null;
	      int i = 0;
	      
	      while(true) {
	         try {
	            System.out.println("Enter String: ");
	            s = sc.next();
	            i = Integer.valueOf(s);
	            System.out.println("문자 값을 입력하세요.");
	            } catch(Exception e){
	               System.out.println( s );
	               break;
	               }
	      }
	      return s;}
	      

	  	public static Memo readMemo() {//Friend 객체 받아와서 한 줄로 넣으면 따로
	  		System.out.println("내용, 날짜 입력");
	  		String result = sc.next();
	  		String [] arr = result.split(",");
	  		Memo memo = new Memo(arr[0],arr[1],arr[2]);
	  		
	  		return memo;
	  	}
	    		  
	    		  
}

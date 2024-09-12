package FurstAssignment;

import java.util.HashMap;
import java.util.Map;

public class Occurence {

	public static void main(String[] args) {
		String s="1122@#$aa2@@AbCg*'";
		String uc="",lc="",no="",sc=""; 
		int uccount=0,lccount=0,nocount=0,sccount=0;
		  for(int i=0;i<s.length();i++) 
		  { 
			  char ch=s.charAt(i); 
			  if(ch>='a'&& ch<='z') {
		      lc=lc+ch; 
		      lccount++;  
		     
		      } 
			  else if(ch>='A'&& ch<='Z') { 
			  uc=uc+ch; 
			  uccount++; 
			  }
		      else if(ch>='0'&& ch<='9') { 
		      no=no+ch;
		      nocount++; 
		      } 
		      else { 
		      sc=sc+ch;
		      sccount++; 
		      } 
		}
		  System.out.println("uppercase letter----"+uc+"---count is---"+uccount);
		  System.out.println("lowercase letter----"+lc+"---count is---"+lccount);
		  System.out.println("Specialcharacter----"+sc+"---count is---"+sccount);
		 System.out.println("Number----"+no+"---count is---"+nocount);
		 	}
}

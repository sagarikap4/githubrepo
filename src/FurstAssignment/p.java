package FurstAssignment;

import java.util.HashMap;
import java.util.Map;

public class p {

	public static void main(String[] args) {
		String s="aabba#####@@@@121212aacca",s1="";
		int uccount=0,lccount=0,nocount=0,sccount=0;
		String uc="",lc="",no="",sc=""; 
        HashMap<Character,Integer> hm=new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch,hm.get(ch)+1);
			}
			else
			{
				hm.put(ch,1);
			}
		}
		for(Map.Entry<Character,Integer> data:hm.entrySet())
		{
			if(data.getValue()>=1)
			{
				//System.out.print(data.getKey());
				s1=s1+data.getKey();
			}
		}
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='0')
			{
				continue;
			}
			else
			{
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
		}
		//System.out.println(hm);
		 System.out.println("uppercase letter----"+uc+"---count is---"+uccount);
		  System.out.println("lowercase letter----"+lc+"---count is---"+lccount);
		  System.out.println("Specialcharacter----"+sc+"---count is---"+sccount);
		 System.out.println("Number----"+no+"---count is---"+nocount);
	}

}








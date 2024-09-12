package FurstAssignment;

import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		String s="aabbaaacca",s1="";
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
		

	}

}

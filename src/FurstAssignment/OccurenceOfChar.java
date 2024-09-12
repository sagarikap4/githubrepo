package FurstAssignment;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfChar {

	public static void main(String[] args) {
		String s="aabbaaacca";
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
		System.out.println(hm);
	}

}

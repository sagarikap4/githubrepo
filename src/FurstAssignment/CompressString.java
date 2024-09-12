package FurstAssignment;

public class CompressString {

	public static void main(String[] args) {
		String s="aabbaaacca";
		int count=1,i;
		String op="";
		for( i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				op=op+s.charAt(i)+count;
				count=1;
			}
		}	
			if(i==s.length()-1)
			{
				op=op+s.charAt(i)+count;
			}
		
		System.out.println(op);

	}

}

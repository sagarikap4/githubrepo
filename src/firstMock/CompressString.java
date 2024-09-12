package firstMock;

public class CompressString {

	public static void main(String[] args) {
		String s="aabbabac";int count=1,i;String result="";
		for(i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				result=result+s.charAt(i)+count;
				count=1;
			}
		}
		if(i==s.length()-1)
		{
			result=result+s.charAt(i)+count;
		}
		System.out.println(result);

	}

}

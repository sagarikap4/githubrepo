package firstMock;

public class ReverseSentence {

	public static void main(String[] args) {
		String s="welcome to tp office";	
		String[] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
	}
}

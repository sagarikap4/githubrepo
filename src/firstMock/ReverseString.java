package firstMock;

public class ReverseString {

	public static void main(String[] args) {
		String s="india";
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            rev=s.charAt(i)+rev;
        }
        System.out.print(rev);

	}

}

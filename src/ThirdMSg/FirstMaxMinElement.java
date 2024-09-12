package ThirdMSg;

import java.util.Scanner;

public class FirstMaxMinElement {

	public static void main(String[] args) {
		int a[]= {12,32,2,54,23,21,25};
		int max = a[0],min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			else if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}

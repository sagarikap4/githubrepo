package FurstAssignment;

public class SecondMaxMinElement {

	public static void main(String[] args) {
		int a[]= {12,32,2,54,23,21,25};
		int max = a[0],min=a[0];
		int n=a.length;
		for(int i=0;i<n;i++)     //Use to hold the element
        {
            for(int j=i+1;j<n;j++)    //Use to compare with the rest of the elements 
            {
                if(a[i]<a[j])     //Check and swap
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        
        System.out.println("Second Largest element is "+a[1]);   //Display second largest element.
        System.out.println("Second Smallest element is "+a[n-2]);  

	

	}

}

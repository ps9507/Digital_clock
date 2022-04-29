  package program;

public class Arraydso {
public static void main(String[] args) {
	int [] arr={8,9,8,2,9,1,10};
	int temp=0;
	System.out.println("Elements of orignal aaray");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
	System.out.println("sort the array in dencending order");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(" ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
	
}
}

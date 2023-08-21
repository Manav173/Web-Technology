import java.util.Scanner;

class quicksort
{
	int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i = (low-1); 
		for (int j=low; j<high; j++)
		{
			if (arr[j] <= pivot)
			{
				i++;				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}

	void sort(int arr[], int low, int high)
	{
         
		if (low < high)
		{	
			int pi = partition(arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}
	
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int size=sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the numbers :-");
        for(int i=0;i<size;i++)
        {
            n[i]=sc.nextInt();
        }
		quicksort ob = new quicksort();
		ob.sort(n, 0, size-1);
		System.out.println("sorted array");
		printArray(n);
		sc.close();
	}
}

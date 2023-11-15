public class ArrayRotation {

	static void rotateLeft(int arr[], int p)
	{

		int lens = arr.length; //length of array
		p = p % lens; //if position p is greater than size of array
		
		reverseArray(arr, 0, p - 1);//reverse position p elements 
		reverseArray(arr, p, lens - 1);//reverse remaining elements
		reverseArray(arr, 0, lens - 1);//reverse the entire array
	}

	/*Reverse the arrays from start to end*/
	static void reverseArray(int arr[], int start, int end)
	{
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	static void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
			
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int p= 2;
		rotateLeft(arr, p); // Rotate array by position p
		printArray(arr); //will error out if you try to make p a negative number
	}
}
	
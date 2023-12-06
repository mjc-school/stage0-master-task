package Algorithm_and_Arrays;

public class Array_tasks {

	public  void seasonsArray() {
		String[] seasons = {"winter", "spring", "summer", "autumn"};
		
		for(String season : seasons) 
		{
			System.out.println(season);
		}
	}
	
	public void generateNumbers(int length) {
		if (length <=0)
		{
			System.out.println("Error");
			return;
		}
		
		int[] numbers = new int[length];
		
		for(int i = 0; i < length; i++)
		{
			numbers[i] = i + 1;
		}
		System.out.print("Length = " + length + " -> [ ");
		for(int number : numbers)
		{
			System.out.print(number);
			System.out.print(" ");
		}
		System.out.print("]");
	}
	public void totalSum(int[] arr) {
		int sum = 0;
		for (int num : arr) 
		{
			sum = sum + num;
		}
		System.out.println("Sum is equal to: " + sum);
	}
	
	public void findIndexofNumber(int[] arr, int number) {
	    int index = -1;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == number) {
	            index = i;
	            break; 
	        }
	    }
	    System.out.println(index);
	}
	
	public void reverseArray(String[] arr1) {
	    int first = 0;
	    int end = arr1.length - 1;
	    
	    System.out.print("Original array: [" );
	    
	    for (int i = 0; i < arr1.length; i++) 
	    {
            System.out.print(arr1[i]);
            if (i < arr1.length - 1) 
            {
                System.out.print(", ");
            }
        }
	    System.out.println("]");
	    
	    while (first < end) 
	    {
            arr1[first] = arr1[first] + arr1[end];
            arr1[end] = arr1[first].substring(0, arr1[first].length() - arr1[end].length());
            arr1[first] = arr1[first].substring(arr1[end].length());

            first++;
            end--;
        }

        System.out.print("Reversed array: [");
        for (int i = 0; i < arr1.length; i++) 
        {
            System.out.print(arr1[i]);
            if (i < arr1.length - 1) 
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
	
	public void getOnlyPositiveNumbers(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > 0) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}

	public static void main(String[] args) {
		
		Array_tasks myTask = new Array_tasks();
		int[] arr = {5, 7, -9};
		String[] arr1 = {"Bob", "Nick"};
		//myTask.seasonsArray();
		//myTask.generateNumbers(5);
		//myTask.totalSum(arr);
		//myTask.findIndexofNumber(arr, 7);
		//myTask.reverseArray(arr1);
		//myTask.getOnlyPositiveNumbers(arr);
		
		
		
	}

}

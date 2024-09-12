package sept11;

public class MergeTwoarray {

	//2 4 16 88 90 
	// 3 7 78 80 100
	
	//there are two array you need to create single array that should be sorted
	
	//you need to create new array that should be sorted
	
    public static void main(String[] args) {
	      
        int[] arr1 = {2, 4, 16, 88, 98};
        int[] arr2 = {3, 7, 78, 80, 100};

        int[] mergedArray = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        System.out.print("Merged and Sorted Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
  }
}


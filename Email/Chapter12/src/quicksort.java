import org.omg.Messaging.SyncScopeHelper;


public class quicksort {
	
	public static void main(String[] args){
		int k = 0;
		int[] array = new int[50000];
		long time = 0;
		for(int i=array.length-1;i>=0;i--){
			array[k] = (int)(Math.random() * 100000);
			k++;
		}
		//for(int i=0;i<array.length;i++)
		//	System.out.println(array[i] + " ");
		time = System.currentTimeMillis();
		quickSort(array, 0, array.length-1);
		time = System.currentTimeMillis() - time;
		for(int i=0;i<array.length;i++)
			System.out.println(array[i] + " ");
		System.out.println("시간 "+time);
	}
	
	public static void quickSort(int[] arr, int firstarr, int lastarr){
		int leftward, rightward;
		int pivot;
		if(lastarr > firstarr){
			pivot = arr[lastarr];
			leftward = firstarr - 1;
			rightward = lastarr;
			
			while(leftward < rightward){
				do {
					if(leftward == lastarr)
						break;
					leftward++;
				} while(arr[leftward] < pivot);
				do {
					if(rightward == firstarr)
						break;
					rightward--;
				} while(arr[rightward] > pivot);
				if(leftward<rightward)
					swap(arr, leftward, rightward);
			}
			swap(arr, leftward, lastarr);
			quickSort(arr, firstarr, leftward - 1);
			quickSort(arr, leftward + 1, lastarr);
		}
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

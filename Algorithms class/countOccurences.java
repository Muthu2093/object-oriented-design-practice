public class countOccurences{
	public int countOccurences(int[] arr, int target){

		int l=0, r=arr.length-1;
		int leftIndex = -1;
		while (l<=r){
			int m = (r-l)/2 + l;

			if (m == 0 || arr[m] == target && arr[m-1] != target){
				leftIndex = m;
				break;
			}
			else if (arr[m] >= target){
				l = m-1;
			}
			else{
				r = m+1;
			}
		}

		int rightIndex = arr.length-1;
		while (l<=r){
			int m = (r-l)/2 + l;

			if (m == arr.length-1 || arr[m] == target && arr[m+1] != target){
				rightIndex = m;
				break;
			}
			else if (arr[m] <= target){
				r = m+1;
			}
			else{
				l = m-1;
			}
		}

		return rightIndex-leftIndex+1;
	}

	public static void main(){
		int[] arr = {1,2,3,4,4,4,4,4,4,5,5,5,5};
		System.out.println(arr, 4);
		arr = {1,1,1,1,2,3,4,4,5,5,5,5};
		System.out.println(arr, 1);
		arr = {1,1,1,1,2,3,4,4,5,5,5,5};
		System.out.println(arr, 5);
	}
}
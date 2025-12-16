package practiceprogram;

public class Sorting {
	public static void main(String [] args) {
		int [] arr = {15,20,100,51,10,2};
		for(int i=0;i<arr.length; i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[arr.length-2]);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

}

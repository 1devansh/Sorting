
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {7,9,10,3,2,1,12,5,0,77};
		int temp;
		for(int j=0; j<arr1.length-1; j++) {
			for(int i=0; i<arr1.length-1; i++) {
				if (arr1[i]>arr1[i+1]) {
					temp=arr1[i+1];
					arr1[i+1]=arr1[i];
					arr1[i]=temp;
				}
			}
		}
		for(int k=0;k<arr1.length;k++) {
			System.out.println(arr1[k]);
		}
		

	}

}

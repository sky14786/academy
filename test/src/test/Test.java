package test;

public class Test {

	public static void main(String[] args){
		int[] arr = new int[10];
		int max = 1;
		int min = 50;
		for (int i =0; i<arr.length;i++){
		if ( arr[i]>=max ){
		if (arr[i]<=min){
		arr[i] = (int)Math.random();
		System.out.print(arr[i]+" ");
		}
		}
		System.out.println();
		System.out.println("최대값 :" );
		System.out.println("최소값 :" );
		}
	}
}

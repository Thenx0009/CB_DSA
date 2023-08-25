package ComparatorVsComparable;

public class CarsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars ar[] = new Cars[5];
		ar[0] = new Cars(100,10,"black");
		ar[1] = new Cars(200,20,"white");
		ar[2] = new Cars(300,30,"green");
		ar[3] = new Cars(400,40,"red");
		ar[4] = new Cars(500,50,"blue");
		Display(ar);
		bubbleSort(ar);
	}
	public static void Display(Cars ar[]) {
		for(int i=0;i<5;i++) {
			System.out.println(ar[i]+" ");
		}
	}
	public static <T>void bubbleSort(T arr[]) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}

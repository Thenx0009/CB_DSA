package ComparatorVsComparable;

import java.util.Comparator;

import java.util.*;

public class Cars1Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars1 ar[] = new Cars1[5];
		ar[0] = new Cars1(400, 10, "black");
		ar[1] = new Cars1(200, 20, "white");
		ar[2] = new Cars1(900, 50, "green");
		ar[3] = new Cars1(600, 40, "red");
		ar[4] = new Cars1(100, 30, "blue");
		Display(ar);
		//bubbleSort(ar, new Car1ComaparatorSpeed()); //made the object of speed class to sort on the basis of speed
		//bubbleSort(ar, new Car1ComparatorPrice());  //made the object of price class to sort on the basis of price
		//bubbleSort(ar, new Car1ComparatorColor());    // made the object of color class to sort on the basis of color
		
		//This is the main logic we use in programming
		Arrays.sort(ar, new Comparator<Cars1>() {	
			@Override
			public int compare(Cars1 o1, Cars1 o2) {
				// TODO Auto-generated method stub
				return o1.speed-o2.speed;
			}
		});
		
		System.out.println("****************");
		Display(ar);
	}
	
	public static void Display(Cars1 ar[]) {
		for (int i = 0; i < 5; i++) {
			System.out.println(ar[i] + " ");
		}
	}

	public static <T> void bubbleSort(T arr[], Comparator<T> camp) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (camp.compare(arr[j],arr[j+1])>0) { //here it is , compare method
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}

package Stacks;

public class Dynamic_Stack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int arr[] = new int[2 * data.length];
			for (int i = 0; i < data.length; i++) {
				arr[i] = this.data[i];
			}
			this.data = arr;// putting address of arr into data
		}

		super.push(item);
		//If we don't write super keyword then above function made a recursive call and calls the dynamic stack push function which gives StackOverflowError.
	 	// super keyword is used to call the parent class function

	}
}

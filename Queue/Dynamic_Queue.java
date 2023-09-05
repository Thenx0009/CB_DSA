package Queue;

public class Dynamic_Queue extends Queue {
	
	@Override
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			int arr2[] = new int[2*data.length];
			for(int i=0;i<data.length;i++) {
				int idx = (this.front+i)%data.length;
				arr2[i] = data[idx];
			}
			this.data = arr2;//putting address to arr
			this.front =0;//setting front to 0
		}
		super.Enqueue(item);
		//calling Enqueue of the parent class 
	}
}

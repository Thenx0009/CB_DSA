package Queue;

public class Dynamic_Queue extends Queue {
	
	@Override
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			int arr[] = new int[2*data.length];
			for(int i=0;i<data.length;i++) {
				int idx = (this.front+i)%data.length;
				arr[i] = data[idx];
			}                                   
			this.data = arr;//putting address to data
			this.front =0;//setting front to 0
		}
		super.Enqueue(item);
		//calling Enqueue of the parent class 
	}
}

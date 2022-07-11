/* 
Heaps uses
*/
package Heap;

class maxHeap{
	// [100,200,34,40,37]
	static int size = 0;
    public void upHeapify(int[] heap,int idx){
        //if index exceeding
//        if(idx >= heap.length){
//            return 0;
//        }
        // if comes root element We can't move root further
        if(idx == 0){
            return;
        }
        int parent_ind = (int) Math.floor((idx-1)/2);
        
        if(heap[parent_ind] < heap[idx]) {
        	// swap and recurse
        	int temp = heap[parent_ind];
        	heap[parent_ind] = heap[idx];
        	heap[idx] = temp;
        	upHeapify(heap,parent_ind);
        }else {
        	return;
        }
    }
    
    public void downHeapify(int[] heap,int idx){
    	int lc = 2*idx+1;
    	int rc = 2*idx+2;
    	// if its a last element
    	if(lc >= heap.length && rc >= heap.length) {
    		return;
    	}
    	int largest_val_idx = idx;
    	if(lc < heap.length && heap[lc] > heap[largest_val_idx]) {
    		largest_val_idx = lc;
    	}
    	if(rc < heap.length && heap[rc] > heap[largest_val_idx]) {
    		largest_val_idx = rc;
    	}
    	// now we got the largest value index out of three values
    	if(largest_val_idx == idx) {
    		return;
    	}
    	// otherwise we have to swap
    	int temp = heap[largest_val_idx];
    	heap[largest_val_idx] = heap[idx];
    	heap[idx] = temp;
    	downHeapify(heap, largest_val_idx);
    }
    public void popHeap(int[] heap){
    	//swap root with last leaf and call downHeapify for root. remove last leaf finally.
    	if(size == 0) {
    		return;
    	}
    	int last_leaf = heap[size];
    	int temp = heap[0];
    	heap[size] = heap[0];
    	heap[last_leaf] = temp;
    	heap[last_leaf] = 0;
    	downHeapify(heap, 0);
    	size = size - 1;
    	 
    }
    public void pushHeap(int[] heap,int val){
    	// push into leaf and call upHeapify
    	heap[size] = val;
    	upHeapify(heap,size);
    	size = size+1;
    }
    int heap_top(int[] heap){
        if(heap.length == 0){
            return 0;
        }
        return heap[0];
    }
    public static void main(String[] args){
    	int[] heap = new int[40];
    	int[] values = new int[] {5,30,330,33,44,33};
    	maxHeap m = new maxHeap();
    	for(int val: values) {
    		m.pushHeap(heap, val);
    	}
//    	System.out.println(heap[0]);
    	for(int val: heap) {
    		System.out.print(val+" ");
    	}
    	m.popHeap(heap);
    	System.out.println("size = "+size);
    	for(int val: heap) {
    		System.out.print(val+" ");
    	}
    }
}
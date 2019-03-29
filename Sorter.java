public class Sorter {
	public void InsertionSort(InvoiceLinkedList list) {
		int size = list.size();
        int i,j;
        int smallest;
        for(i = 0; i < size-1; i++){
            smallest = i;
            for(j = i+1; j < size; j++){
                if(list.get(j).compareTo(list.get(smallest)) < 0){
                    smallest  = j;
                
                }
            }
            list.swapValues(smallest, j);
        }
    }
}
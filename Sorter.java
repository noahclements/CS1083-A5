public class Sorter {
	public void InsertionSort(InvoiceLinkedList list) {
		int size = list.size();

		Invoice swap1;
        Invoice swap2;
        for(int i = 0; i < size-1; i++){
            swap1 = list.get(i);
            for(int j = i+1; j < size; j++){
                swap2 = list.get(j);
                if(swap1.compareTo(swap2) == 1){
                    list.swapValues(i,j);
                    swap1 = list.get(i);
                    swap2 = list.get(j);
                
                }
            }
        }
       list.print();
    }
		
		/*
		int min;
		int scan;
		InvoiceLinkedList temp;
		for(int index = 0; index < size-1; index++) {
			min = index;
			for(scan = index+1; scan < size; scan++) {
				if((list.get(scan).compareTo(list.get(min)) == 0)) {
					min = scan;
					System.out.println(min);
					list.swapValues(min, scan);
				}
			}
			
		}
		list.print();
	
	}


*/

}
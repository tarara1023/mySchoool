package myextras.dataStructure_Algoritms;

public class Array {
    private int [] items;
    private int count;
    public Array(int length) {
        items = new int [length];
    }
    public void print() {
        for(int i = 0; i< count; i++) {
            System.out.println(items[i]);

        }
    }
    public int indexOf(int item) {
        //Loops over if we find it, return index
        //Otherwise, return -1
        for(int i = 0; i< count; i++) {
            if (items[i] == item)
                return i;
        }
            return -1;

    }
    public void removeAt(int index) {
        //Valisate the index
        //Shift the items th the left to fill the hole
        if(index < 0 || index >= count) {
           throw new IllegalArgumentException();
        }else
            for(int i = index; i < count; i++) {
                items[i] = items[i+1];
                count--;
            }
    }
    public void insert(int item) {
        //If array is full we need to resize it
        if(items.length ==count) {
            //Create a new array(twicr the size)
            int [] newItems = new int[count * 2];
            //copy all the existing items
            for(int i =0; i < count; i++) {
                newItems[i] = items[i];
                items = newItems;
            }
            //Set "items" to this new array
        }
        //Add the new item at he end
        items[count++] = item;
    }

}

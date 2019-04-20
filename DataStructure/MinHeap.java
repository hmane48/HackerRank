package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class MinHeap {

    public static int array [];
    int index=0, size;

    public MinHeap(int size){
        this.size = size;
        array = new int [size];
    }

    //returns the parent-element of the current index
    public int getParentIndex(int index){
        int parentIndex = (index-1)/2;
        return parentIndex;
    }

    public void add(int element){
        //System.out.println(Arrays.toString(array));
        if (index != 0){
            compareAndSwap(index,element);
        }else{
            array[index] = element;

        }

        if(index == size-1){
            array = Arrays.copyOf(array,size*2);
            index++;
        }else {
            index++;
        }

        System.out.println(Arrays.toString(array));
    }

    private void compareAndSwap(int index, int element){
        int parentIndex = getParentIndex(index);
        if(array[parentIndex] < element){
            array[index] = element;
            return;
        }else {
            //if the parent is bigger than the element then swap the child with parent
            int temp = array[getParentIndex(index)];
            array[getParentIndex(index)] = element;
            //element = temp;
            array[index] = temp;
        }
        compareAndSwap(getParentIndex(index),element);
    }

    private void display() {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        MinHeap min = new MinHeap(10);

        Scanner scanner = new Scanner(System.in);
        int end = 1;

        while(end !=0){

            end = scanner.nextInt();
            min.add(end);
        }

        min.display();

        scanner.close();
    }




}

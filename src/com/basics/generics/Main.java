package src.com.basics.generics;

public class Main {
    private int []data;
    private static int DEFAULT_SIZE = 5;
    private int size = 0;

    public Main() {
        this.data = new int[DEFAULT_SIZE];
    }

    private void add(int i) {
        if(this.isFull()){
            this.resize();
        }
        this.data[size++] = i;
    }

    private void resize() {
        Main.DEFAULT_SIZE = Main.DEFAULT_SIZE * 2;
        int []temp = this.data;
        this.data = new int[Main.DEFAULT_SIZE];
        for(int index=0; index < this.size; index++){
            this.data[index] = temp[index];
        }
    }

    private boolean isFull() {
        return this.size == Main.DEFAULT_SIZE;
    }

    public void display(){
        for(int index=0;index < size; index++){
            System.out.print(this.data[index] + " ");
        }
    }


    private void reverse() {
        int list_size = this.size;
        for(int index=0; index < this.size/2; index++ ){
            swap(this.data, index , this.size - index - 1);
        }
    }

    public void swap(int []temp_list, int start, int end){
        int temp = temp_list[start];
        temp_list[start] = temp_list[end];
        temp_list[end] = temp;
    }

    private void remove(int i) {
        for(int index=i; index < this.size - 1; index++){
            this.data[index] = this.data[index+1];
        }
        this.size--;
    }

    private int indexOf(int element) {
        int index = -1;
        for(int i=0; i < this.size; i++){
            if(this.data[i] == element)
            {
                index = i;
                break;
                }
        }
        return index;
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(2);
        list.add(7);
        list.add(1);
        System.out.println("Generated list");
        list.display();
        list.reverse();
        System.out.println("Reversed List");
        list.display();
        list.remove(3);
        System.out.println("List after removing 3rd index");
        list.display();
        int index = list.indexOf(7);
        System.out.println("index of element 3 is " + index);

    }
}

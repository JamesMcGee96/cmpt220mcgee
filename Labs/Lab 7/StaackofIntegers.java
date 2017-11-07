//package driver_proj0.java;

public class StaackofIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		 private int[] elements;
		   private int size;
		   public static final int MAX_SIZE = 16;

		   public StaackofIntegers() {
			   this(16); // JA: Otherwise it will be empty
		   }

		   public StaackofIntegers(int capacity) {
		       elements = new int[capacity];
		   }

		   public int push(int value) {
		       if (size >= elements.length) {
		           int[] temp = new int[elements.length * 2];
		           System.arraycopy(elements, 0, temp, 0, elements.length);
		           elements = temp;
		       }

		       return elements[size++] = value;
		   }

		   public int pop() {
		       return elements[--size];
		   }

		   public int peek() {
		       return elements[size - 1];
		   }

		   public boolean empty() {
		       return size == 0;
		   }

		   public int getSize() {
		       return size;
		   }
		  
		   public void print() {
		       for(int i=0;i<size;i++) {
		           System.out.print(elements[i]+" ");
		       }
	}
	
}

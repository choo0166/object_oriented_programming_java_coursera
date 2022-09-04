package demos;
import java.util.Arrays;

/** A resizable array without generics, which
 * can hold any Java objects
 * @author chooyl
 *
 */
public class MyArrayList {
	private int size; 	// number of elements
	private Object[] elements;	// can store all Java objects
	
	public MyArrayList() {	// constructor
		// allocate initial capacity of 10
		this.elements = new Object[10];	// [null]*10
		this.size = 0;
	}
	
	// Add an element, any primitive is autoboxed to its Object class implicitly
	public void add(Object o) {
		if (this.size >= this.elements.length) {
			// allocate a larger array and copy over
			Object[] newElements = new Object[this.size + 10];
			for (int i = 0; i < this.size; ++i) newElements[i] = this.elements[i];
			this.elements = newElements;
		}
		this.elements[size] = o;
		++this.size;
	}
	
	// Retrieves the element at index
	public Object get(int index) {
		if (index >= this.size)
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
		return this.elements[index];
	}
	
	// Returns the current size (length)
	public int size() { return this.size; }
	
	// toString() to describe itself when printing object
	@Override // to override built-in toString() when printing object
	public String toString() {
		return Arrays.toString(this.elements);
	}

}

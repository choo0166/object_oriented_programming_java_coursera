package demos;

public class MyArrayListTest {
	public static void main(String[] args) {
		// Create a MyArrayList to hold a list of Strings
		MyArrayList strLst = new MyArrayList();
		// Adding elements of type String
		strLst.add("alpha");   
		strLst.add("beta");
		System.out.println(strLst);  // toString()
		
		for (int i = 0; i < strLst.size(); ++i) {
			System.out.println(strLst.get(i));
		}
		
		/* Inadvertently added a non-String object. Compiler cannot 
		 * detect this logical error.
		 */
		strLst.add(1234);
		String str = (String)strLst.get(2);
        /* compile ok
        runtime ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String */
	}
}

package stringprogram;
// string buffer and builder is mutable ie, it changes
public class Builderbuffer {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s2=new StringBuilder("hello");
		System.out.println(s2);
		StringBuffer s1=new StringBuffer("world");
		System.out.println(s1);
// Insert()  - if we need to insert a particular word
		System.out.println(s1.insert(5, "good"));

// replace()  - to change one word to another
		System.out.println(s2.replace(1, 4, "linnu"));

// reverse() - to reverse a string
		System.out.println(s2.reverse());
		
// delete()
		System.out.println(s1.delete(0, 2));
	}

}

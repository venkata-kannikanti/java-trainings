package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		bookTitle = "The Lord of the Rings";
		if (bookTitle.contains("Ring"))
		{
			System.out.println("The Book Contains word Ring " + bookTitle);
		}
		if (bookTitle.equalsIgnoreCase("the lord of the rings")) {
			System.out.println("The Book Title is " + bookTitle);
		}
			System.out.println("The Sub String of the Title is :" + bookTitle.substring(4,8));
			System.out.println("The Length of the Title is :" + bookTitle.length());
	}

}

package class3_4;

public class LibBookTest
{

	public static void main(String[] args)
	{
		LibBook javaBook = new LibBook();
		javaBook.isbn = "1234-341-34";
		javaBook.name = "好简单的JAVA啊";
		javaBook.price = 111111;
		System.out.println(javaBook.getInfo());
		javaBook.borrow();
		System.out.println(javaBook.getInfo());
		LibBook cBook = new LibBook();
		cBook.isbn = "12341234-341";
		cBook.name = "好难的C啊";
		cBook.price = 0.1;
		System.out.println(cBook.getInfo());

	}

}

package class3_4;

public class LibBookTest
{

	public static void main(String[] args)
	{
		LibBook javaBook = new LibBook();
		javaBook.isbn = "1234-341-34";
		javaBook.name = "�ü򵥵�JAVA��";
		javaBook.price = 111111;
		System.out.println(javaBook.getInfo());
		javaBook.borrow();
		System.out.println(javaBook.getInfo());
		LibBook cBook = new LibBook();
		cBook.isbn = "12341234-341";
		cBook.name = "���ѵ�C��";
		cBook.price = 0.1;
		System.out.println(cBook.getInfo());

	}

}

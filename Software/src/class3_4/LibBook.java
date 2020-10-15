package class3_4;

public class LibBook
{
	String isbn;
	String name;
	double price;
	boolean isBorrowed;
	
	boolean borrow()
	{
		if(isBorrowed)
			return false;
		else {
			isBorrowed = true;
			return true;
		}
	}
	
	String getInfo()
	{
		return "ISBN: " + isbn + "; 书名: " + name + "; price: " + price + "; 是否被借阅" + isBorrowed;
	}
	
}

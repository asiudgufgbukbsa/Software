package class7;

public class Book
{
	private int pageNum;
	private String title;
	
	
	
	void setPageNum(int m_pageNum)
	{
		if(m_pageNum < 200)
			m_pageNum = 200;
		pageNum = m_pageNum;
	}
	
	int getPageNum()
	{
		return pageNum;
	}
	
	void setTitle(String m_title)
	{
		title = m_title;
	}
	
	String getTitle()
	{
		return title;
	}
	
	void showInfo()
	{
		System.out.println("Title: " + title + "; pageNum: " + pageNum);
	}
}

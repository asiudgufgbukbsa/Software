package class7;

public class Book
{
	private int pageNum;
	private String title;
	
	
	
	void setPageNum(int m_pageNum)
	{
		if(m_pageNum < 200)
			m_pageNum = 200;
		this.pageNum = m_pageNum;
	}
	
	int getPageNum()
	{
		return this.pageNum;
	}
	
	
	
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
		
	}

	void showInfo()
	{
		System.out.println("Title: " + title + "; pageNum: " + pageNum);
	}
}

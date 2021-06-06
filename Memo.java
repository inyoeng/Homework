package memo.model;

public class Memo {
	
	protected String date;
	protected String Title;
	protected String content;
	
	public Memo() {}
	
	

	@Override
	public String toString() {
		return "Memo [date=" + date + ", Title=" + Title + ", content=" + content + "]";
	}



	public Memo(String date, String title, String contnet) {
		super();
		this.date = date;
		Title = title;
		this.content = contnet;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}

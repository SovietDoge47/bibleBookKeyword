package bibleBookKeyword;

public class NewTestamentBook
{
	private String name;
	private int chapters;
	private String summary;
	
	public NewTestamentBook(String name, int chapters, String summary)
	{
		this.name = name;
		this.chapters = chapters;
		this.summary = summary;
	}
	
	public NewTestamentBook(String colonDelimited)
	{
		String[] parts = colonDelimited.split(":");
		this.name = parts[0];
		this.chapters = Integer.parseInt(parts[1]);
		this.summary = parts[2];
	}
	
	//Display
	public void display()
	{
		System.out.printf("Book name: %s \n\tChapters: %d \n\tSummary: %s\n\n", this.name, this.chapters, this.summary);
	}
	
	//Getters
	public String getName()
	{
		return this.name;
	}
	public int getChapters()
	{
		return this.chapters;
	}
	public String getSummary()
	{
		return this.summary;
	}
}

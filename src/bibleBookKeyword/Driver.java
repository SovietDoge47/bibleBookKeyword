package bibleBookKeyword;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Driver
{
	public static void main(String[] args)
	{
		try
		{
			Scanner fileIn = new Scanner(new File(System.getProperty("user.dir") + "/src/bibleBookKeyword/input.dat"));
			ArrayList<NewTestamentBook> books = new ArrayList<NewTestamentBook>();
			while(fileIn.hasNext())
			{
				NewTestamentBook a = new NewTestamentBook(fileIn.nextLine());
				books.add(a);
			}
			fileIn.close();
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter a keyword to search for: ");
			String keyword = keyboard.nextLine();
			for(int i = 0; i < books.size(); i++)
			{
				String currentString = books.get(i).getSummary();
				if(currentString.indexOf(keyword) != -1)
				{
					System.out.println("'" + keyword + "' first found in the book of " + books.get(i).getName());
					break;
				}
				else if(i == books.size()-1 && currentString.indexOf(keyword) == -1)
				{
					System.out.println("Keyword not found");
				}
			}
			
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
	}
}

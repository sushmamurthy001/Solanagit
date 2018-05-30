package Test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D {
	//read text from file
	File f=new File("E:\\Seleniumtraining.txt");
	int count=0;
	String value="browsing";
	
	public void main1() throws FileNotFoundException{
		Scanner scan=new Scanner(f);
		while(scan.hasNextLine()) {
			String val=scan.nextLine();
			String[] words=val.split(" ");
			System.out.println(words.length);
			for(int i=0;i<words.length;i++)
			{
				if (words[i].equals(value)) {
					System.out.println(words[i]);
					count=count+1;
				}
			}
		}
		
		System.out.println(value +"is found "+count +"times");
		scan.close();
	}

	public static void main(String args[]) throws FileNotFoundException {
		D reads1=new D();
		reads1.main1();
	}
}

package LockedMe.com;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class BaseFile extends WelcomeScreen {
	
	
	void DisplayOperations()
	{
		System.out.println("Click 1 to Add Files");
		System.out.println("Click 2 to Delete a File");
		System.out.println("Click 3 to Search a File");
		System.out.println("Click 4 to Return to Main Menu");
	}
	void addFile() {
		System.out.println("Enter the name of the File to be Added: ");
		String filename = sc.next(); 
		try {
		File f = new File(d.getName() +"/"+ filename+".txt");
		
		f.createNewFile();
		System.out.println("File was Created Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void deleteFile()
	{
		System.out.println("Enter the name of the File to be Deleted: ");
		String filename = sc.next(); 
		String Files[] = d.list();
		int found = 0;
		for(int i=0;i<Files.length;i++)
		{
			if(Files[i].equals(filename))
				found++;
			else
				continue;
		}
		if(found>0)
			{
			File f = new File(d.getName() +"/"+filename);
			f.delete();
			System.out.println("File was Deleted Successfully");
			}
		else
		{
			System.out.println("The File you are trying to delete was not Found");
		}
	}
	void searchFile()
	{
		System.out.println("Enter the name of the File to be Searched: ");
		String filename = sc.next();
		String Files[] = d.list();
		int flag=0;
		for(int i=0;i<Files.length;i++)
		{
			if(Files[i].equals(filename))
			{
				System.out.println("The File you searched  was Found");
				flag++;
			}
		}
		if(flag==0)
			System.out.println("The File you searched for was not Found");
	}
	void Operations()
	{
		BaseFile fo1 = new BaseFile();
		int ch=0;
		while(ch!=4)
		{
			fo1.DisplayOperations();
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("You have selected the add file option");
				fo1.addFile();
				break;
			case 2:
				System.out.println("You have selected the delete file option");
				fo1.deleteFile();
				break;
			case 3:
				System.out.println("You have selected the search file option");
				fo1.searchFile();
				break;
			case 4:
				System.out.println("Go to the Main Menu");
				WelcomeScreen ob = new WelcomeScreen();
				ob.Display();
				break;
			}
		}
	}

}

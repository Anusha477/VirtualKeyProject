package LockedMe.com;

import java.io.*;
import java.util.*;

public class WelcomeScreen {
	File d = new File("C:\\Users\\HP\\eclipse-workspace\\Phase1Project\\src\\DirectoryFiles");
	Scanner sc = new Scanner(System.in);

	public static void MainMenu() {

		System.out.println("======= MAIN MENU ========");
		System.out.println("Click 1 to  File_name in ascending order");
		System.out.println("Click 2 to display Operations ADD,DELETE,SEARCH");
		System.out.println("Click 3 to close Application");
		System.out.println("=============================");
	}

	void DisplayFiles() {

		if (d.isDirectory()) {
			List<String> listFile = Arrays.asList(d.list());
			// sorting the file in ascending order
			Collections.sort(listFile);
			System.out.println("===========================================================");
			System.out.println("These are files. Sorting by file_name in ascending order");

			Iterator<String> itr = listFile.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

		} else {
			System.out.println(d.getAbsolutePath() + " not found");
		}
		WelcomeScreen.MainMenu();

	}

	void Display() {
		WelcomeScreen ws = new WelcomeScreen();
		BaseFile fo = new BaseFile();

		int option = 0;
		while (option != 3) {
			if (option != 3)
				ws.MainMenu();
			option = sc.nextInt();
			switch (option) {
			case 1:
				ws.DisplayFiles();
				break;
			case 2:
				fo.Operations();
				break;
			case 3:
				System.out.println("You are in exit page");
				break;
			default:
				System.out.println("Invalid Operation");
			}
			if (option == 2)
				break;
		}
	}

}

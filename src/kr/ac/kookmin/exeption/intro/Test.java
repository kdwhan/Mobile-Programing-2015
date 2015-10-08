package kr.ac.kookmin.exeption.intro;

import java.util.Scanner;
import java.io.*;

class AAA {
	public void readFile() {
		try {
            File file = new File("C:\\a.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine()); 
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
	}
}

public class Test {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.readFile();
	}
}

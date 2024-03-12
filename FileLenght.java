import java.io.File;
import java.util.Scanner;

public class FileLenght {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String file;
	System.out.println("Nhap ten file ");
	file = sc.nextLine();
	File f = new File(file);
	if (f.exists()) {
		long Dodai = f.length();
		System.out.println("Do lon cua file la " + Dodai +" byte" );
	}
	
	
}
}	

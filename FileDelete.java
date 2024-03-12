import java.io.File;
import java.util.Scanner;
public class FileDelete {
	public static void DeleteFile(File file) {
		if (file.isFile()) {
			System.out.println("Da xoa0: " + file.getAbsolutePath());
			// xoa neu la tap tin
			file.delete();
		} else if (file.isDirectory()) {
			// lay cac file con
			File [] mangCon = file.listFiles();
			for (File file2 : mangCon) {
				DeleteFile(file2);
			}
			System.out.println("Da xoa1: " + file.getAbsolutePath());
			file.delete();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap thu muc hoac tap tin: ");
	String file = sc.nextLine();
	File f = new File(file);
	FileDelete.DeleteFile(f);
}
}

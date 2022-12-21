package java1221;

import java.io.*;
import java.io.IOException;
import java.util.Random;

public class J2 {

	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("C:\\OOPjava\\java1221\\src\\java1221\\rand.txt");
		BufferedWriter bfw = new BufferedWriter(fr);
		
		Random r = new Random();
		for(int i = 0;i < 1000;i++) {
			bfw.write(""+r.nextInt(1,99999));
			bfw.newLine();
		}
		bfw.flush();
		fr.close();
	}

}

package java1221;

import java.util.*;
public class J1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("密碼輸入測試");
		System.out.print("請輸入密碼:");
		String firstTime = sc.nextLine();
		for(int i = 0;i < 3;i++) {
			System.out.print("請再輸入一次密碼:");
			String se = sc.nextLine();
			if(se.compareTo(firstTime) != 0) {
				System.out.println("與第一次輸入的不同!");
				if(i == 2) {
					throw new RuntimeException("輸入三次錯誤!程式停止!");
				}
				continue;
			}else {
				System.out.print("密碼正確");
				break;
			}
		}
	}
}

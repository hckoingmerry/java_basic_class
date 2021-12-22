package pack04;

import java.util.Scanner;
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는? >>"); String line = sc.next();
        int line1 = Integer.parseInt(line);
        
        for (int i = 1; i <= line1; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            } System.out.println();
        }
        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는? >>"); String line2 = sc.next();
        int line3 = Integer.parseInt(line2);

        for (int i = 1; i <= line3; i++) {
            for (int j = line3; j >= i; j--) {
                System.out.print("*");
            } System.out.println();
        }
	}

}

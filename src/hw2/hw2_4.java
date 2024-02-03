//請設計一隻Java程式,輸出結果為以下:
//1 4 9 16 25 36 49 64 81 100
package hw2;

public class hw2_4 {
	public static void main(String[] args) {
		int count=1;
//		while(count<=10) {
//			System.out.printf(Math.pow(count,2)+" ");
//			count++;
//		}
		
		
		while(count<=10) {
			System.out.printf(count*count+" ");
			count++;
		}
	}

}

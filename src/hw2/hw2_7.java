//請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
package hw2;

public class hw2_7 {
	public static void main(String[] args) {
		char letters='\u0041';
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(letters);
			}
			letters++;
			System.out.println();
		}
	}

}

//請建立一個Test4Numbers.java,可輸出0~100裡4的倍數
//三:使用while迴圈 + do while迴圈
package hw2;

public class hw2_8_3 {
	public static void main(String[] args) {
		int i=1;
		while(i<=9) {
			int j=1;
			do {
				System.out.print(i+"*"+j+"="+i*j+" ");
				j++;
			}while(j<=9);
			System.out.println();
			i++;
		}
	}

}
 
//請建立一個TestNineNine.java程式,可輸出九九乘法表
//二:使用for迴圈 + do while迴圈
package hw2;

public class hw2_8_2 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			int j=1;
			do {
				System.out.print(i+"*"+j+"="+i*j+" ");
				j++;
			}while(j<=9);
			System.out.println();
		}
	}

}

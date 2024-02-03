//請建立一個TestNineNine.java程式,可輸出九九乘法表
//一:使用for迴圈 + while迴圈

package hw2;

public class hw2_8_1 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			int j=1;
			while(j<=9) {
				System.out.print(i+"*"+j+"="+i*j+" ");
				j++;
			}
			System.out.println();
		}
	}

}

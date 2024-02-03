//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
package hw2;

public class hw2_5 {
	public static void main(String[] args) {
		int count=1;
		int sum=0;
		while(count<=49) {
			if(count%10!=4&&count/10!=4) {
				System.out.print(count+" ");
				sum++;
			}
			count++;
		}
		System.out.println();
		System.out.println("共"+sum+"個");
	}

}

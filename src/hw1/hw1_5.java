//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)
package hw1;

public class hw1_5 {
	public static void main(String[] args) {
		int money=1500000;
		double ir=0.02;
		double total=money*Math.pow(1+ir, 10);
		System.out.printf("%.0f",total);
	}

}

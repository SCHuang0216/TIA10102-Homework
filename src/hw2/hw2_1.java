//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
package hw2;

public class hw2_1 {
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		while(count<=1000) {
			if(count%2==0) {
				sum+=count;
			}
			count++;
		}
		System.out.println(sum);
				
	}

}

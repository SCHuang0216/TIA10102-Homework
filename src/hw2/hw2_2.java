//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
package hw2;

public class hw2_2 {
	public static void main(String[] args) {
		int sum=1;
		int count;
		for(count=1;count<=10;count++) {
			sum=sum*count;			
		}
		System.out.println(sum);
	}

}

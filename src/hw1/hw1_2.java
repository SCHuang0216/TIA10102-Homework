//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
package hw1;

public class hw1_2 {
	public static void main(String[] args) {
		int total=200;
		int dozen=total/12;
		int eggs=total%12;
		System.out.println(dozen+"打");
		System.out.println(eggs+"顆");
	}

}

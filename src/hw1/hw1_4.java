//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
package hw1;

public class hw1_4 {
	public static void main(String[] args) {
		double pi=3.1415;
		double area=5*5*pi;
		double cir=2*5*pi;
		System.out.printf("圓面積:%.2f%n",area);
		System.out.printf("圓周長:%.2f",cir);
	}

}

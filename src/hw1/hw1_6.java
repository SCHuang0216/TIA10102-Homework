//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
package hw1;

public class hw1_6 {
	public static void main(String[] args) {
		int a = 5;
		char b = '5';
		String c = "5";
		System.out.println(a+a); //數字相加
		System.out.println(a+b); //數字與字元相加
		System.out.println(a+c); //數字與字串相加
	}

}

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
package hw1;

public class hw1_3 {
	public static void main(String[] args) {
		int total=256559;
		int days=total/(60*60*24);
		int hours=total%(60*60*24)/(60*60);
		int mins=total%(60*60*24)%(60*60)/60;
		int secs=total%(60*60*24)%(60*60)%60;
		System.out.println(days+"天"+hours+"小時"+mins+"分"+secs+"秒");
	}
}

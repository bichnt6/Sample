import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListExample {

	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> arrNumber = new ArrayList<Integer>(); arrNumber.add(10);
		 * arrNumber.add(20); arrNumber.add(30); //for (int i = 0; i < arrNumber.size();
		 * i++) { // System.out.println(arrNumber); int count = arrNumber.size(); for
		 * (int i = 0; i < count; i++) { Integer obj = arrNumber.get(i);
		 * System.out.println(obj); } }
		 */

		// Tạo một danh sách (array/arraylist) gồm 10 phần tử sử dụng hàm random nhập dữ
		// liệu cho danh sách này
		// Sau đó đếm xem có bao nhiêu số chẳn, bao nhiêu số lẻ

		// define array to store 10 element
		int totalNumber1=0, totalNumber2=0;
		ArrayList<Integer> arrNumber = new ArrayList<Integer>();
		// define random
		Random rd = new Random();
		for (int i = 0; i < 10; i++) {
			int number = rd.nextInt(10);
			arrNumber.add(number);
		}
			// print to check
			for(int number : arrNumber) {
				System.out.println(number);
				//Kiem tra chan le
				if(number%2==0)
					totalNumber1++;
				else
					totalNumber2++;				
			}
			System.out.println("co " + totalNumber1 + " so chan");
			System.out.println("co " + totalNumber2 + " so le");
		}


	private static void dauvao(int i) {
		// TODO Auto-generated method stub

	}
}

import java.util.Random;

import org.testng.annotations.Test;

public class songuyento {
	/*
	 * @Test public static void main(String[] args) {
	 * System.out.println("Các số nguyên tố nhỏ hơn 100 là: "); for (int i = 0; i <
	 * 100; i++) { if (isPrimeNumber(i)) { System.out.print(i + " "); } } }
	 * 
	 * public static boolean isPrimeNumber(int n) { // so nguyen n < 2 khong phai la
	 * so nguyen to if (n < 2) { return false; } // check so nguyen to khi n >= 2
	 * int squareRoot = (int) Math.sqrt(n); for (int i = 2; i <= squareRoot; i++) {
	 * if (n % i == 0) { return false; } } return true; }
	 * 
	 * @Test public static void main1(String[] args) { int[] num = { 1, 2, 3, 4, 5,
	 * 6, 7, 8, 9 }; String[] arrEvent = new String[num.length]; String[] arrOdd =
	 * new String[num.length]; /* arrEvent và arrOdd sử dụng String vì khi chưa có
	 * dữ liệu thì phần tử của nó sẽ null dựa vào null để kiểm tra xem mảng được set
	 * bao nhiêu phần tử. còn nếu khai báo int[] arrEvent thì các phần tử của
	 * arrEvent đều có giá trị ban đầu = 0
	 * 
	 * 
	 * int loop = 0; // để đếm xem mất bao nhiêu vòng xử lý.
	 * 
	 * // Lọc lấy số chẵn int index = 0; for (int i = 0; i < num.length; i++) {
	 * loop++; if (num[i] % 2 == 0) { arrEvent[index] = "" + num[i]; index++; } }
	 * 
	 * // Lọc lấy số lẻ index = 0; for (int i = 0; i < num.length; i++) { loop++; if
	 * (num[i] % 2 != 0) { arrOdd[index] = "" + num[i]; index++; } }
	 * 
	 * // Đưa số chẵn trở lại mảng ban đầu for (int i = 0; i < arrEvent.length; i++)
	 * { loop++; if (arrEvent[i] == null) { break; } num[i] =
	 * Integer.parseInt(arrEvent[i]); }
	 * 
	 * // Đưa số chẵn trở lại mảng ban đầu for (int i = 0; i < arrOdd.length; i++) {
	 * loop++; if (arrOdd[i] == null) { break; } num[num.length - i - 1] =
	 * Integer.parseInt(arrOdd[i]); }
	 * 
	 * System.out.println("loop count: " + loop); for (int i = 0; i < num.length;
	 * i++) { System.out.println(num[i]); }
	 * 
	 * }
	 */

	public static void main(String[] test) {
		WebElement wl = new WebElement();
		wl.Input("t");
		wl.DoAction();
		NewWebelement nw = new NewWebelement();
		nw.Viettel();
		/*
		 * cho một chuỗi bất kỳ là họ tên của một người nào đó hãy Kiểm tra xem người đó
		 * có phải tên Trang hay không
		 * 
		 */

		//String fullname = "Nguyen Thi Ngoc Bich";
		/*
		 * // Tìm vị trí đầu tiên của dấu space int firstSpace = fullname.indexOf(" ",
		 * 0); // subtring từ vị trí đầu đến vị trí cuối String firstname =
		 * fullname.substring(0, firstSpace); System.out.println(firstname);
		 * 
		 * // Tìm dấu space cuối cùng int lastspace = fullname.lastIndexOf(" ",
		 * fullname.length()); String lastname = fullname.substring(lastspace + 1,
		 * fullname.length()); System.out.println(lastname);
		 */

		/*
		 * String[] arrP = fullname.split(" "); String ho = fullname.split("")[0];
		 * String ten = firstname.split(" ")[arrP.length-1];
		 * 
		 * System.out.println(ho); System.out.println(ten);
		 * 
		 * 
		 * // Cắt chuỗi bất kỳ Random rad = new Random(); int randomNumber =
		 * rad.nextInt(fullname.length()); String part1 = fullname.substring(0,
		 * randomNumber);
		 * 
		 * System.out.println(part1);
		 * 
		 * }
		 */
		/*
		//khai báo và khởi tạo mảng
		//int a[] = new int[3];
		int a[] = {10, 20,30};
		//a[0] = 10;
		//a[1] = 20;
		//a[2] = 30;

		// in mảng ra màn hình
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f','e', 'i', 'n', 'a', 't', 'e', 'd'};
	char[] copyTo = new char[7];
	//System.arraycopy(copyFrom, 2, copyTo, 0, 7);
	*/
	int[] arrNumber = new int[3];
	arrNumber[0] = 10;
	arrNumber[1] = 11;
	arrNumber[2] = 12;
	for (int i = 0; i < arrNumber.length; i++) {
		System.out.println(arrNumber[i]);
	}
		
	}
	
	
	
}

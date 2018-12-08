import java.util.Scanner;

import org.testng.annotations.Test;

@Test
public class kiemtrasnt {
	public static void main(String[] args) {
		// TODO code application logic here
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap n : ");
		n = sc.nextInt();
		if (snt(n) == true)
			System.out.println("La so nguyen to");
		else
			System.out.println(" Khong phai so nguyen to");
	}

	public static boolean snt(int n) {
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	@Test
	public static void main1(String[] args) {
		System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
		for (int i = 0; i < 100; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPrimeNumber(int n) {
		// so nguyen n < 2 khong phai la so nguyen to
		if (n < 2) {
			return false;
		}
		// check so nguyen to khi n >= 2
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}

import java.util.Scanner;

public class Kiemtrasochanle {
	private static Scanner sc;

	public static void main(String args[]) {
	        int n;
	        sc = new Scanner(System.in);
	        System.out.print("n = ");
	        n = sc.nextInt();
	         
	        if(n%2 == 0){
	            System.out.format("la so chan", n);
	        }
	        else{
	            System.out.format("la so le", n);
	        }
	    }
	}
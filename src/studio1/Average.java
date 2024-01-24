package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.print("Enter value for arg 0: ");
int n0 = in.nextInt();
System.out.print("Enter value for arg 1: ");
int n1 = in.nextInt();
double average = ((n0+n1)/2.0);
System.out.print(average);

	}

}

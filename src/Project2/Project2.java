package Project2;

import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		int office;
		Scanner guduma = new Scanner(System.in);
		System.out.print("Enter Office number from (101 To 110)");
		office=guduma.nextInt();
		switch(office){
		case 101:
			System.out.println("Welcome to Mallam Jamils office\nIt Is Located at First Floor Office No R101");
			break;
		case 102:
			System.out.println("Welcome to Mallam Shamsudeens office");
			break;
		case 103:
			System.out.println("Welcome to Mallam Ahmad office");
			break;
		case 104:
			System.out.println("Welcome to Mallam Saminu office");
			break;
		case 105:
			System.out.println("Welcome to Mallam Abdulrazaq office");
			break;
		case 106:
			System.out.println("Welcome to Mallam B.S Bello office");
			break;
		case 107:
			System.out.println("Welcome to Mallam Khalid office");
			break;
		case 108:
			System.out.println("Welcome to Mallam Sagir office");
			break;
		case 109:
			System.out.println("Welcome to Mallam Mansur Babagana office");
			break;
		case 110:
			System.out.println("Welcome to Mallam Baffa Office");
		default:
			System.out.println("Wrong Entry");
		}

	}

}

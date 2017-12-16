import java.util.Scanner;

/*Group: GingerBread
 *Project: Office Search
 *		Members:
 *1. Umar Auna Saidu 		CST/14/COM/01097
 *2. Sophia Oluchi Ibeh 	CST/13/COM/00567
 *3. Aisha Saidu Muhammad 	CST/14/COM/01019
 *4. Samuel Noah 			CST/13/COM/00599*/

public class GroupProject101 {

	public static void Visitor(String[]values, String key){
		int i;
		for(i=0; i<values.length;i++){
			if(values[0].equals(key)){
				System.out.println("Office is Located at Second Floor Office No: RI-59");
				break;
			}
			else if(values[1].equals(key)){
				System.out.println("Office is Located at Second Floor Office No: RI-61");
				break;
			}
			else if(values[2].equals(key)){
				System.out.println("Office is Located at First Floor Office No: RI-24");
				break;
			}
			else if(values[3].equals(key)){
				System.out.println("Office is Located at First Floor Office No: RI-26");
				break;
			}
			else if(values[4].equals(key)){
				System.out.println("Office is Located at Ground Floor Office No: RI-23");
				break;
			}
			else if(values[5].equals(key)){
				System.out.println("Office is Located at Ground Floor Office No: RI-22");
				break;
			}
			else if(values[6].equals(key)){
				System.out.println("Office is Located at Ground Floor Office No: RI-21");
				break;
			}
			else if(values[7].equals(key)){
				System.out.println("Office is Located at Ground Floor Office No: RI-20");
				break;
			}
			else if(values[8].equals(key)){
				System.out.println("Office is Located at Ground Floor Office No: RI-19");
				break;
			}
		}
		if(i==values.length){
			System.out.println("<<<< Invalid Entry Or Check The Name you Entered >>>>");
		}

	}
	public static void Students(String[]value,String key){
		int i;
		for(i=0; i<value.length;i++){
			if (value[0].equals(key)){
				System.out.println("The Lecturers Name is U. Mubarak");
				break;
			}
			else if (value[1].equals(key)){
				System.out.println("The Lecturers Name is K. Haruna");
				break;
			}
			else if (value[2].equals(key)){
				System.out.println("The Lecturers Name is M.A Yusif");
				break;
			}
			else if (value[3].equals(key)){
				System.out.println("The Lecturers Name is B.S Bello");
				break;
			}
			else if (value[4].equals(key)){
				System.out.println("The Lecturers Name is S.M Tanimu");
				break;
			}
			else if (value[5].equals(key)){
				System.out.println("The Lecturers Name is J.A Galadanci");
				break;
			}
			else if (value[6].equals(key)){
				System.out.println("The Lecturers Name is S.M Borodo");
				break;
			}
			else if (value[7].equals(key)){
				System.out.println("The Lecturers Name is M. Babagana");
				break;
			}
			else if (value[8].equals(key)){
				System.out.println("The Lecturers Name is Dr Airehrour");
				break;
			}
		}
		if(i==value.length){
			System.out.println("<<<< Invalid Entry Or Lecturer Not Found >>>>");
		}
	}
	public static void main (String [] args){
		String Lecturers[]=new String []{"Mallam Mansur Babagana","Dr Airehrour","Mallam Jamilu Galadanci"
				,"Mallam Borodo","Mallam Sagir Tanimu","Mallam Bello","Mallam Yusif",
				"Mallam Khalid Haruna", "Mallam Mubarak"};
		String Offices[]= new String []{"19","20","21","22","23","24","26","59","61"};

		char choice, quit;
		String key;
		Scanner guduma = new Scanner (System.in);
		do{	
			System.out.println("******WELCOME TO FCSIT OFFICE SEARCH******");
			System.out.println("*\tPress (A) For Visitor\t\t*\n*\tPress (B) For Student\t\t*");
			System.out.println("******************************************");
			System.out.print("Enter Alphabet: ");
			choice=guduma.next().charAt(0);

			guduma.nextLine();

			if (choice == 'a' || choice=='A'){
				System.out.println("Lecturer Names Are : ");
				for (String n : Lecturers){  
					System.out.println(n+" ");
				}
				System.out.println("Please Enter Lecturers Name to Search: ");
				key =guduma.nextLine();	
				Visitor(Lecturers,key);
			}
			else if(choice == 'b' || choice=='B'){
				System.out.println("Lecturers Office Number Are: ");
				for (String n: Offices){
					System.out.print(n+" ");
				}
				System.out.println();
				System.out.println("Please Enter Lecturers Office No. To Search: ");
				key=guduma.nextLine();
				Students(Offices,key);
			}else{
				System.out.println("<<<< Invalid Entry >>>>");
			}
			System.out.println();

			System.out.println("Do You Want to Search Again Press Y/N");
			quit=guduma.next().charAt(0);
		}while(quit=='y' || quit=='Y');
		System.out.println("Thank You for Using Office Search ");
	}	
}
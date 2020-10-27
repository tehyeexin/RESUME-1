import java.util.Scanner;

public class resume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		printName();
		printAge();
		printGender();
		printBirthday();
		printMarital();
		printCitizenship();
		printHome();
		printHp();
		printGrade();
		printCgpa();
		printWork();
		printLanguage();
		printSkill();
		printAwards();
		
		in.close();

		}
		
		public static void printName() {
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Your Name : ");
			String name = in.next();
			System.out.println("Name : " + name);
		}
		
		public static void printAge() { 
			Scanner in = new Scanner (System.in);
				
			System.out.print("Enter Your Age : ");
			int age = in.nextInt();
			System.out.println("Age : " + age + " years old");
		}
		
		public static void printGender() { 
			Scanner in = new Scanner (System.in);
				
			System.out.print("Enter Your Gender : ");
			String str = in.next();
			char gender = str.charAt(0);
			System.out.println("Gender : " + gender);
		}
		
		public static void printBirthday() {
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Your Birthday : ");
			String birthday = in.next();
			System.out.println("Birthday : " + birthday);
		}
		
		public static void printMarital() {
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Your Marital Status: ");
			String marital = in.next();
			System.out.println("Marital Status : " + marital);
		}

		public static void printCitizenship() {
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Your Citizenshp : ");
			String citizenship = in.next();
			System.out.println("Citizenship : " + citizenship);
		}
		
		public static void printHome() {
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Your Home Adress : ");
			String home = in.next();
			System.out.println("Home Adress : " + home);
		}
		
		public static void printHp() {
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Your H/P : ");
			String hp = in.next();
			System.out.println("H/P : " + hp);
		}

		public static void printGrade() { 
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Grade STIA1113 : ");
			String str = in.next();
			char grade = str.charAt(0);
			System.out.println("Grade STIA1113 : " + grade);
		}
		
		public static void printCgpa() { 
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter CGPA Semester 1 : ");
			double sem1 = in.nextDouble();
			System.out.print("Enter CGPA Semester 2 : ");
			double sem2 = in.nextDouble();
			
			double sum = sem1+sem2;
			double totalcgpa = sum/2;
			System.out.println("CGPA for current semester is = " + totalcgpa);
		}
		
		public static void printWork() {
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Your Work Experience : ");
			String work = in.next();
			System.out.println("Work Experience : " + work);
		}

		public static void printLanguage() {
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Your Language 1 : ");
			String language1 = in.next();
			System.out.print("Enter Your Language 2 : ");
			String language2 = in.next();
			System.out.print("Enter Your Language 3 : ");
			String language3 = in.next();
			System.out.println("Language : \t1. " + language1 + "\n\t\t2. " + language2 + "\n\t\t3. " + language3);
		}
		
		public static void printSkill() {
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Your Professional Skills : ");
			String skill = in.next();
			System.out.println("Professional Skills : " + skill);
		}

		public static void printAwards() {
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Your Awards and Certificates : ");
			String awards = in.next();
			System.out.println("Awards  and Certificates : " + awards);
		}



}

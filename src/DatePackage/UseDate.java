package DatePackage;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class UseDate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 Which day of the week is today? Print which day of the week is today.HINT: create today as a new object using LocalDate.now() and ask today which day of the week it is.
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.getDayOfWeek());
		
		//2
		
		LocalDate Date1 = askDate();
		System.out.println(Date1.getDayOfWeek());
		
		//3
		
		LocalDate birthday = LocalDate.of(1999,10, 01);
		System.out.println(birthday.getDayOfWeek());
		
		//4 age
		
		LocalDate birthdayDate = askDate();
		Period age = Period.between(birthdayDate, localDate);
		System.out.println(" You have " + age.getYears()+ " Years Old ");
		System.out.println("Jour genere "+randomDay(2023)+" : "+randomDay(2022).getDayOfWeek());
	
	}
	
	
	 public static LocalDate askDate() {
	        // Ask the user and return a new LocalDate
		 
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter the year");
		
		int year = scanner.nextInt();
		
		System.out.println("Enter the Month");
		
		int month = scanner.nextInt();

		System.out.println("Enter the day Of Month like 31");
		int dayOfMonth = scanner.nextInt();
		 
		 
		 return	LocalDate.of(year, month, dayOfMonth);
		 
		 
	}
	 
	 //5
	 
	  public static LocalDate randomDay(int year) {

		int dayOfYear = new Random().nextInt(1, 366);
		return LocalDate.ofYearDay(year, dayOfYear);

	}
	 
	 

}

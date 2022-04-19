import java.util.Scanner;

public class Main {

   public boolean checkGender(char item) {
       if(item == 'F' || item == 'M' || item == 'T' || item == 'N' || item == 'G' || item == 'O') {
           return true;
       } else if(item == 'f' || item == 'm'|| item == 't' || item == 'n' || item == 'g' || item == 'o') {
           return true;
       } else {
           return false;
       }
   }

   public boolean checkRace(char item) {
       if(item == 'W' || item == 'B' || item == 'A' || item == 'L' || item == 'N' || item == 'M' || item == 'O') {
           return true;
       } else if(item == 'w' || item == 'b' || item == 'a' || item == 'l' || item == 'n' || item == 'm' || item == 'o') {
           return true;
       } else {
           return false;
       }
   }

   public boolean checkSexOrient(char item) {
       if(item == 'S' || item == 'G' || item == 'B' || item == 'A' || item == 'P' || item == 'L' || item == 'Q' || item == 'O') {
           return true;
       } else if(item == 's' || item == 'g' || item == 'b' || item == 'a' || item == 'p' || item == 'l' || item == 'q' || item == 'o') {
           return true;
       } else {
           return false;
       }
   }

   public static void main(String[] args) {
     Main m = new Main();

     Scanner keyboard = new Scanner(System.in);

     System.out.println("Hello, Welcome new player!! Before we get started, I just need a couple thing. Please be honest. This will help use along in the game.");

     System.out.print("First, We need your name: ");
     String name = keyboard.nextLine();

     System.out.println(" ");

     System.out.println("Next, Your Gender");
     System.out.println("Please Select From The Options Below\nF for Female/Girl/Woman");
     System.out.println("M for Male/Boy/Man");
     System.out.println("T for Transgender");
     System.out.println("N for Non-Binary");
     System.out.println("G for Genderqueer");
     System.out.println("O for Other");
     System.out.print("Please Enter Here: ");
     char gender = keyboard.next().charAt(0);

     while(!m.checkGender(gender)) {
         System.out.println("Your Answer is not valid answer. Please look at the answer above and select an answer");
         System.out.print("Please Answer Here: ");
         gender = keyboard.next().charAt(0);
      }

     System.out.println(" ");

     System.out.println("Next, Your Race");
     System.out.println("Please Select From The Options Below");
     System.out.println("W for White/Caucasian");
     System.out.println("B for Black");
     System.out.println("A for Asian");
     System.out.println("L for Latino");
     System.out.println("N for Native American");
     System.out.println("M for Mixed Race");
     System.out.println("O for Other");
     System.out.print("Please Enter Here: ");
     char race = keyboard.next().charAt(0);

     while(!m.checkRace(race)) {
         System.out.println("Your Answer is not valid answer. Please look at the answer above and select an answer");
         System.out.print("Please Answer Here: ");
         race = keyboard.next().charAt(0);
     }

     System.out.println(" ");

     System.out.println("Next, Your Sexual Orientation: ");
     System.out.println("S for Straight");
     System.out.println("G for Gay");
     System.out.println("B for Bisexual");
     System.out.println("A for Asexual");
     System.out.println("P for Pansexual");
     System.out.println("L for Lesbian");
     System.out.println("Q for Queer");
     System.out.println("O for Other");
     System.out.print("Please Enter Here: ");
     char sexOrient = keyboard.next().charAt(0);

     while(!m.checkSexOrient(sexOrient)) {
         System.out.println("Your Answer is not valid answer. Please look at the answer above and select an answer");
         System.out.print("Please Answer Here: ");
         sexOrient = keyboard.next().charAt(0);
     }

     System.out.println(" ");

     System.out.print("Lastly, Your Age(Enter A Number): ");
     int age = keyboard.nextInt();

     while(age < 1) {
         System.out.println("Your Number is not valid answer. Please here a new number");
         System.out.print("Please Answer Here: ");
         age = keyboard.nextInt();
     }

     GenderRaceClass grc = new GenderRaceClass(name, gender, race, sexOrient, age);
     grc.findPartner();
   }
}

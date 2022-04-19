import java.util.Scanner;

public class Alex {

    private String name;
    private char gender;
    private int age;
    private Scanner key;

    public Alex(String n, char g, int age) {
        name = n;
        gender = g;
        this.age = age;
        key = new Scanner(System.in);
    }

    public boolean checkAnswers(char ans) {
        return (ans == 'Y' || ans == 'y' || ans == 'N' || ans == 'n');
    }

    public void startOfGame() {
        System.out.println("Today is normal day at school. You got on the bus, got to school on time and got everyone you need from your locker with no bugging you. The bell rung for class and you head to your period.");
        System.out.print(" However, you notice that there is a kid you never met before sits right in the seat next to you.");

        if(gender == 'm' && gender == 'M') {
            System.out.print(" This boy is a light color skinned boy with light red hair. He wears glasses with black frames and a dozen freckles on his cheeks. He is wearing a black and red striped polo t-shirt, black cargo shorts, and red sneakers with white socks.");
        }else if(gender == 'F' && gender == 'f') {
            System.out.print(" This girl is a light color skinned girl with light red hair. She wears glasses with black frames and a dozen freckles on her cheeks. She is a pink spagetti striped top with pink pants to match, and pink ballet flats.");
        }else{
            System.out.print(" This girl is a light color skinned girl with light red hair. She wears glasses with black frames and a dozen freckles on her cheeks. She is wearing a red and black plaid top with a black kami undernearth, black leggings, black ballet flats");
        }

        System.out.println(" Do you start talking to the new kid?");
        System.out.print("Enter Y for Yes or N for No: ");

        char answer = key.next().charAt(0);
        int an = 0;

        while(!checkAnswers(answer) && an != 5) {
            System.out.println("Please Enter Y or N");
            answer = key.next().charAt(0);
            an++;
        }


        if(an == 5) {
            answer = 'N';
        }

       if(answer == 'y' || answer == 'Y') {
            yes();
        } else {
            no();
        }
        
    }

    public void yes() {
        System.out.print("The teacher is delayed in getting in the classroom so, you decide to have a conversation with the new kid. You introduce yourself and the boy introduce himself as well. Their name is Alex.");
        System.out.println();
        System.out.print("You guys discussion what you guys favorite activities are and you find out guys have the same favorite activity. Which is?");
        System.out.print(" What is your favorite activities?: ");
        String act = key.nextLine();

        System.out.print("You feel that you and Alex are quickly becoming good friends. It is a Friday afternoon and you have nothing to do on this weekend so...");
        System.out.print("\nDo you ask Alex to have sleepover?: (Y or N)");
        char answer = key.next().charAt(0);
        int an = 0;

        while(!checkAnswers(answer) && an != 5) {
            System.out.println("Please Enter Y or N");
            answer = key.next().charAt(0);
			an++;
		}
		
		if(an == 5) {
            answer = 'N';
        }
		
		if(answer == 'Y' || answer == 'y') {
			System.out.print("Your techer is still not in the room yet. Everyone else is on their phones so you texted your mother if it is ok if your new friend can come over for a sleep over. Your mother is ok with Alex sleeping over. Alex just did the same with his mother. You guys texted your families to come up with a plan. Just in time for yout teacher comes in you guys put your phones away.");
			System.out.print(" Your first period ended and you continue on your day with no problems at all. Throughtout the day you are excited to go home and get ready for your sleepover. ");
			System.out.print(" You get home and you ready to help your mother with anything she needs you to do. Alex arrive ready at the time you discussed earlier in the day. You guys do your favorite activity " + act + " and enjoy your time with Alex. However, you notice after dinner Alex did not look ok. After dinner, Alex hid in the bathroom for 3 hours.");
			System.out.println( "Do you check on Alex?");
			char answer2 = key.next().charAt(0);
            int an2 = 0;

            while(!checkAnswers(answer2) && an != 5) {
              System.out.println("Please Enter Y or N");
              answer2 = key.next().charAt(0);
			  an++;
		    }
		
		   if(an == 5) {
              answer = 'N';
		   }
		   
		   if(answer2 == 'Y' || answer2 == 'y') {
			   System.out.println("You knock on the door and ask Alex if they are ok. Alex respones say everything is fine but still crying. Your worry for Alex.");
		   }
		   
		   System.out.print("Your mother comes in and asked what happening. You explained that for some reason Alex is in the bathroom crying. Your mother looks at you and slow takes you away from the bathroom. She explains that Alex is transgender.");
		   
		   if(gender == 'M' || gender == 'm') {
			   System.out.println("Your mother explain to you that Alex was born as a girl but felt like a boy on the inside. You notice that Alex acts like boy, dresses as a boy, and blends in with boys. Alex's mother told your mother because if Alex grow closed to you and you found out, you would no longer want to be friends with Alex."); 
		   } else if(gender == 'F' || gender == 'f') {
			   System.out.println("Your mother explain to you that Alex was born as a boy but felt like a girl on the inside. You notice that Alex acts like girl, dresses as a girl, and blends in with girls. Alex's mother told your mother because if Alex grow closed to you and you found out, you would no longer want to be friends with Alex.");
		   } else {
			   endingForOther();
		   }
		   
		   System.out.print("With this Information, Do you go back and talk to Alex?");
		   
		   char answer3 = key.next().charAt(0);
           int an3 = 0;

           while(!checkAnswers(answer3) && an != 5) {
              System.out.println("Please Enter Y or N");
              answer3 = key.next().charAt(0);
			  an++;
		   }
		
		   if(an == 5) {
              answer = 'N';
		   }
		   
		   if(answer3 == 'Y' || answer3 == 'y') {
			   System.out.println("You run back to the bathroom and knock on the door to come in. You talk to Alex about what you discuss with your mother. Alex cries during the conversation but you tell Alex that you not care how about their gender. You tell Alex that you will be friend no matter what. Alex and you come out of the bathroom and continue your sleepover and your friendship.");
			   message();
		   } else {
			   System.out.println("You are disgusted to find out that Alex kept a major secret from you and refuse to go back to the bathroom. Your mother is not happy with your choice and send you to your room. Your mother calls Alex's mother and Alex goes back home for the night. Yo refuse to see Alex ever again.");
			   message();
		   }
		} else {
			System.out.println("You asked for Alex's phone number and you guys become friends by texting each other. You guys have hangs out and become buddies for projects.");
		}
    }
	
	public void no() {
		System.out.println("Your teacher comes in before the kid introduced themselves and you continue the day as if it was any ordinary day.");
	}
	
	public void message() {
		System.out.print("Their are more genders than just female and male. Whether someone identity as a different gender than their assigned sex, we should accepted them as they should. If you don't accepted for who they are, you may missed out on friendship.");
	}
	
	public void endingForOther() {
		System.out.println("Your mother explains that Alex was someone like you who question their gender in society. Alex has some personality traits that are associated with males but dresses like a girl. After having a talk with your mother, you ran back into the bathroom and you tell Alex what you and your mother discuss. Alex cries and looks embarrassed. You tell them that you are struggling with your gender identity as well. Alex stops and look directly at you and has a talk about struggles you guys face on a day to day bases. Now that you guys use each other better, you guys are going to be great friends.");
	}

}

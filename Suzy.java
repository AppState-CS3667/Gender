import java.util.Scanner;

public class Suzy {
	
	private Scanner key;
	private boolean door;
	private boolean room;
	
	public Suzy()  {
		key = new Scanner(System.in);
		door = false;
		room = false;
	}
	
	public boolean checkFirst(char answer) {
		return (answer == 'D' || answer == 'd' || answer == 'r' || answer == 'R');
	}
	
	public boolean checkAnswers(char ans) {
        return (ans == 'Y' || ans == 'y' || ans == 'N' || ans == 'n');
    }
	
	public void startOfGame() {
		System.out.println("You have awake in a room with on window to the right and door far to your left. This room is unfamiliar to you and and question how you got there. There only a bed, window, door and table in the room. You stand up from the bed you woke up from to explore.");
		System.out.println("Do you explore the room or go through the door? (Type D for Door or R for Room)");
		
		char answer = key.next().charAt(0);
		int check = 0;
		
		while(!checkFirst(answer) && check != 5) {
			System.out.println("Please enter D or R");
			answer = key.next().charAt(0);
			check++;
		}
		
		if(check == 5) {
			answer = 'D';
		}
		
		if(answer == 'd' || answer == 'D') {
			door();
		}else{
			room();
		}
		
		
		if((door) && (room)) {
			both();
		} else if(room) {
			onlyRoom();
		}else {
			onlyDoor();
		}
	}
	
	public void door() {
		System.out.println("You head out the door and you step on some thing that looks like a JUUL. It is been use put there is a trail of liquid that leads to the bathroom. Curious to explore the bathroom, you go in there to search to what that liquid could. The bathroom has a bathtub and shower together, toliet, sink area with cabinent and medicine cabinent. The trail stops in the middle of the floor in front of the medicine cabinent. You look inside the medicine cabinent and find a box found of vapes of different sizes and flavors. You assume, using the knowledge from your anthropology class, that this person is middle class because of the amount they are able to afford. You continue to explore the medicine cabinent and you are deeply shock to see many drugs and weed in there. You put down the box of vapes you holding and slowly back out of the bathroom.");
        
		door = true;
		if(room == false) {
			System.out.println("Do wish to explore the room you were in before (Y or N)");
			
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
				room();
			}
		}

	}
	
	public void room() {
		System.out.println("You find a light switch in the room and now you can see everything in the room. Now, you notice that there is a journal with the pride flag on the cover on the table in the room. You are curious to see what was written in this journal so you open it. This person wrote several entries in this journal. There is one that sticks out and you have to read out to yourself.");
		System.out.println("Dear Journal, ");
		System.out.println();
		System.out.println("  I am done with this world since high school. After someone found out about it, that's were everything when wrong. ");
		System.out.println("I thought college would be better for me because you have the right to be who you want to be. I was wrong about that");
        System.out.println("as well. I found some people who were also a part of the community I am in. After having a conversation through 	");
        System.out.println("Facebook, I ask to room with them. They were cool with me joining there in a suite style dorm room. The time I moved");
        System.out.println("I got the room to myself until my roommate moved in the following day. As they finished unpacking, we had a         ");
        System.out.println("conversation about our intended majors and habits. We were able to come some reasonable routine. Everything was good");
        System.out.println("until we all when to dinner as a suite. I got stuck in this three hour convesation about some stuff I find weird and");
	    System.out.println("slightly interesting. I felt uncomfortable, no one addressed me or anything. They look like they were best friends  ");
		System.out.println("alright and I was alone. I thought that maybe it will take a while to warm. The third time I was wrong. They grew   ");
		System.out.println("close and I was someone they had to put up with. Everything, in my opinion, until they had problems with me. They   ");
		System.out.println("told the RA about me and we had a meeting. It did not go well for me. The RA told me what my roomates said about me ");
        System.out.println("and I felt hurt. Along with that, I felt like I could trust anyone in LGBTQ+ community. They did not like who I was ");
		System.out.println("and I believe their going to tell everyone in this community about. I have this discussion on moving out and I do   ");
		System.out.println("not who to trust. I rather killed myself than go to the school with them in. I lost and I will never be found.      ");
		System.out.println();
		System.out.println("ME");
		
		System.out.println();
		System.out.println("You also notice there are faces crosses out of the bottom of that page. The names at the bottom of each of them and the names are DonkeyAss, BitchFace and Brown Shit. You put the journal down and wonder what happen to this person?");
		
		
		room = true;
		
		if(door == false) {
			System.out.println("Do wish to explore beyond the room?(Y or N)");
			
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
				door();
			}
		}
		
		
	}
	
	public void both() {
		System.out.print("After reading the journal entry and finding the illegal items, you want to explore the rest of the house to find anything else. You stumble upon a closet with a funky smell coming out of it. You open the closet to find a dead body come right out of it. You are freak out and call the police to have the investigated. You know that the person in the journal seem to suicidal. With the amount of vapes and drugs in the bathroom, you assume that they have overdose on this items. The police come in the house and you told them about what you witness.");
		System.out.print(" The police take a close look at the house and they act do research on the site. The upper class person named was Suzy, she was someone who struggle with her sexuality. She felt that she was Bisexual or Asexual. She could not decision but the issue with roomates cause her. They cause her to smoke and vape to cope with their identity crisis. They did not find any knife marks. They want to talk to other witness but you do not what to do because you woke in a room with no idea who you were.");
	}
	
	public void onlyDoor() {
		System.out.print("You are curious to explore the rest of the house and you run into a closet with funky smell. You open the closet and a body comes out of the closet. You examine it and you find no marks. You call the police they rush over to the house. They have information on who this is. The person named is Suzy and their family is upper class. She had a problem with some people in college. They soon pick up on some illegal substance to cope with some social issues. Their family is out of town and the police assume they bring the vapes and drugs home. This is because their parents do believe in lower class dirty habits. That all they told you but you do know how you got here."); 
	}
	
	public void onlyRoom() {
		System.out.println("You are not very happy to see these thoughts in the journal. Their nothing in the room to make a big statement about them. You are curious on who they are as a person. You found entries in the journal talking about the benefits of being a female. However, there was something about having feels for the same-gender and the opposite gender. You are not sure on you have enter this room.");
	}
}
				
				
		
			
        
        		
			

public class GenderRaceClass {

    private String name;
    private char gender;
    private char race;
    private char sexOrient;
    private int age;

    public GenderRaceClass(String n, char g, char r, char so, int a) {

        name = n;
        gender = g;
        race = r;
        sexOrient = so;
        age = a;
    }


    public void findPartner() {
        if(age <= 10) {
            System.out.println("Thanks " + name + " for giving us some your information let's start the game");
            Alex alex = new Alex(name, gender, age);
	    alex.startOfGame();
        } else {
            System.out.println("Thanks giving us some your information let's start the game");
            Suzy s = new Suzy();
            s.startOfGame();
        }

    }

}

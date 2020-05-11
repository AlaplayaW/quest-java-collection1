import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        Hero black = new Hero("Black Widow", 34);
        Hero captain = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero iron = new Hero("Iron Man", 48);
        Hero scarlet = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctor = new Hero("Doctor Strange", 42);

        heroes.add(black);       // index 0
        heroes.add(captain);        // index 1
        heroes.add(vision); // index 2
        heroes.add(iron);       // index 3
        heroes.add(scarlet);       // index 4
        heroes.add(thor);       // index 5
        heroes.add(hulk);       // index 6
        heroes.add(doctor);       // index 7

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        int size = heroes.size();
        int midSize = size / 2;
        List<Hero> heroesSublist = heroes.subList(0, midSize);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : heroesSublist) { // iterate though the list
            System.out.println(hero.getName());
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public void theLastGenerate(Person1 f0) {
        if (f0.getChildren().size() == 0) {
            System.out.println(f0.toString());
            return;
        } 
    }

    public static void main(String[] args) {
        List<Person1> people = new ArrayList<Person1>();
        Person1 pdh = new Person1("PDH", "10/03/2004", "Male", true);
        people.add(pdh);
        Person1 f11 = new Person1("F11", "10/01/2004", "Male", false);
        Person1 f12 = new Person1("F12", "10/01/2004", "Male", false);
        people.add(f11);
        people.add(f12);
        pdh.addChild(f11);
        pdh.addChild(f12);

        Person1 f21 = new Person1("F21", "10/01/2004", "Male", true);
        Person1 f22 = new Person1("F22", "10/01/2004", "Female", false);
        Person1 f23 = new Person1("F23", "10/01/2004", "Male", true);
        Person1 f24 = new Person1("F24", "10/01/2004", "Female", false);
        people.add(f21);
        people.add(f22);
        people.add(f23);
        people.add(f24);
        f12.addChild(f21);
        f12.addChild(f22);
        f12.addChild(f23);
        f12.addChild(f24);

        Person1 f31 = new Person1("F31", "10/01/2004", "Male", false);
        Person1 f32 = new Person1("F32", "10/01/2004", "Female", true);
        Person1 f33 = new Person1("F33", "10/01/2004", "Female", false);
        people.add(f31);
        people.add(f32);
        people.add(f33);
        f21.addChild(f31);
        f21.addChild(f32);
        f22.addChild(f33);

        List<Person1> listPersonOfTheLastGeneration = new ArrayList<>();

        System.out.println("Các cá nhân không kết hôn trong danh sách phả hệ:\n");
        for (Person1 person : people) {
            if (person.getMarried() == false) {
                System.out.println(person + "\n");
            }
        }
        System.out.println("Các cặp vợ chồng có 2 con trong danh sách phả hệ:\n");
        for (Person1 family : people) {
            if (family.getChildren().size() == 2) {
                System.out.println(family + "\n");
            }
        }
        System.out.println("Thế hệ mới nhất trong danh sách phả hệ:\n");
        //for (Person person : listPersonOfTheLastGeneration) System.out.println("\t" + person);
    }
}
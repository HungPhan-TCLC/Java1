import java.util.ArrayList;
import java.util.List;

public class Person1 {
    private String name;
    private String birthDate;
    private String sex;
    private boolean married;
    private List<Person1> children;

    public Person1() {
    }

    public Person1(String name, String birthDate, String sex, boolean married) {
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
        this.married = married;
        this.children = new ArrayList<>();
    }

    public void addChild(Person1 child) {
        children.add(child);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean getMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public List<Person1> getChildren() {
        return children;
    }

    public String toString() {
        return "Name: " + name + ", Date of birth: " + birthDate + ", Sex: " + sex + ", married: " + married;
    }
}
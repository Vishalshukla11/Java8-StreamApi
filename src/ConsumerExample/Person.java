package ConsumerExample;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int height;
    private double salary;
    private String gender;
    private int kids;

    List<String> hobbies = new ArrayList<>();

    public Person(String name, int height, double salary, String gender, int kids, List<String> hobbies) {
        this.name = name;
        this.height = height;
        this.salary = salary;
        this.gender = gender;
        this.kids = kids;
        this.hobbies = hobbies;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public int getKids() {
        return kids;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public void setGender(String gender) {

    }

    public void setSalary(double salary) {

    }

    public void setHeight(int height) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return "Person{" + "name= " + name + ",height=" +height + ",salary=" +salary + ",gender=" + gender + ",kids=" +kids + ",hobbies=" + hobbies + "}";
    }

   
}
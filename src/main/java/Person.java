public class Person {
    String Name;
    int Age;
    char Gender;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public char getGender() {
        System.out.println("Gender should be printed after this");
        return Gender;
    }

    public void setGender(char gender) {
        Gender = gender;
    }

    public Person() {
        System.out.println("No parameters for this constructor");
    }

    public Person(String name, int age, char gender) {
        System.out.println("this is a parametric constructor");
        Name = name;
        Age = age;
        Gender = gender;
    }
}

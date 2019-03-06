import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Teacher sanmi = new Teacher("sanmiTheTeacher", 10000, 0.5f);
        Student student = new Student("sanmiTheStudent", 100, 0.1f);

        Person[] theCouncilOfSanmis = new Person[] {sanmi, student};

        float totalTax = (float) Arrays.stream(theCouncilOfSanmis).mapToDouble(people -> people.calculateTax()).sum();

        System.out.println(totalTax);
    }
}

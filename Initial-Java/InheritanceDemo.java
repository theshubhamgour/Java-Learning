class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + ", and I am " + age + " years old.");
    }
}

class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println("I am a student in grade " + grade + ", and I am studying hard.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        person.introduce();

        Student student = new Student("Jane", 20, 12);
        student.introduce();
        student.study();
    }
}

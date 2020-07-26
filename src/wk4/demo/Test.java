package wk4.demo;

public class Test {
    public static void main(String[] args) {
        //System.out.println(new Person().getInfo());
        //System.out.println(new Student().getInfo());

        Person p = new Student();
        System.out.println(p.getInfo());
    }

}

class Person {
    public String getInfo() {
        return "Person";
    }
}

class Student extends Person {
    //@Override
    public String getInfo() {
        return "Student";
    }
}

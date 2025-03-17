public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("Person: { Name: %s, Age: %d, City: %s }", name, age, city);
    }

    public static void main(String[] args) {
        Person p = new Person("Adrian", 20, "Craiova");
        System.out.println(p);
    }
}

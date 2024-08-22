package exercise;

public class Ex3 {
  public static void main(String[] args) {
    Person[] persons = new Person[3];
    persons[0] = new Person("길동이", 22);
    persons[1] = new Student("황진이", 23,   "100");
    persons[2] = new ForeignStudent("Amy", 30, "200", "U.S.A");

    for (Person person : persons){
      System.out.println(person.show());
    }
  }
}

class Person{
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  String show(){
    return "사람[이름 : " + name + ", 나이 : "+ age + "]";


  }
}

class Student extends Person{
  private String number;

  public Student(String name, int age, String number) {
    super(name, age);
    this.number = number;

  }

  @Override
  String show() {
    return super.show();
  }
}

class ForeignStudent extends Student{
  private String nationality;

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public ForeignStudent(String name, int age, String number, String nationality) {
    super(name, age, number);
    this.nationality = nationality;

  }
}

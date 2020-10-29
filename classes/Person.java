public class Person {
  private String fName;
  private String lName;
  private int age;
  private String gender;

  public Person(String fName, String lName, int age) {
    this.fName = fName;
    this.lName = lName;
    this.age = age;
  }

  public Person(String fName, String lName, int age, String gender) {
    this.fName = fName;
    this.lName = lName;
    this.age = age;
    this.gender = gender;
  }

  public boolean isSirName(String sirName) {
    return this.lName.toLowerCase().equals(sirName.toLowerCase());
  }

  public boolean isEligibleForVoting() {
    return this.age >= 18;
  }

  public boolean isOfSameAge(Person person) {
    return this.age == person.age;
  }

  public String getGender() {
    return this.gender;
  }

  // public static boolean isEqual(Person p1, Person p2) {
  //   boolean isEqual = (p1.fName == p2.fName);
  //   isEqual &= (p1.lName == p2.lName);
  //   return isEqual && (p1.age == p2.age);
  // }

  public void display() {
    System.out.printf("Name : %s %s\n", this.fName, this.lName);
    if (this.gender != null) System.out.printf("Gender : %s\n", gender);
    System.out.printf("Age : %d\n\n", this.age);
  }

  public static void main(String[] args) {
    Person p1 = new Person("Ayush", "kumar", 20);
    p1.display();

    Person p2 = new Person("Piyush", "kumar", 18);
    p2.display();

    Person p3 = new Person("Ayush", "kumar", 20, "male");
    p3.display();
    // System.out.println(p1.isSirName("Kumar"));
    // System.out.println(p1.isEligibleForVoting());

    // System.out.println(p1.isOfSameAge(p2));
    // System.out.println(Person.isEqual(p1, p2));
    // System.out.println(Person.isEqual(p1, p3));

    // System.out.println(p1.getGender());
    // System.out.println(p3.getGender());
    System.out.println("*".repeat(5));
  }
}

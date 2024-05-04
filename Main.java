import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
  public static void main(String[] args) {
    try {
      Person person1 = new Person("Marek", 130);
      System.out.println(person1.getName() + " ma " + person1.getAge() + " lat");
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    }
    try {
      Person person2 = new Person("Filip", 125);
      System.out.println(person2.getName() + " ma " + person2.getAge() + " lat");
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    }

  }
}
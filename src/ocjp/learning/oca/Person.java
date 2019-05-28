package ocjp.learning.oca;

class Person {
  private String firstName;

  Person(String firstName) {
    this.firstName = firstName;
  }

  public static void main(String[] args) {
    System.out.println(new Person("Flore").firstName);
  }
}
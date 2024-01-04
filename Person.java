// Jose Guzman
// September 10 2023
// Description: Examples of: Accessor, Mutator, 
//              Constructor(Default, Explicit), Instance
// File Name: Person.java
// To Compile in terminal type: Person.java
// to run the program type: java Person

class Person
{
  // data declaration section
  // below are the instance variables, 
  // instance variables belong to Instances

  String name; //instance variable
  int age;   //instance variable

  // Default Constructor:  same person initially
  Person() 
  {
    name = "Alex";
    age = 36;
  }

  // Explicit Constructor - specific person initially
  // PARAMETER is a variable that accept the ARGUMENTS
  Person(String newName, int newAge) 
  { //           ^^^parameter  ^^^parameter  
    name = newName;
    age = newAge;
  }

  //Mutator
  void changeName(String newName) 
  {
    name = newName;
  }

  void changeAge(int newAge)
  {
    age = newAge;
  }

  public String toString()
  {
    return "person's name = " + name + " , age = " + age;
  }

  public static void main(String[] args)
  {
    //"me" and "someone" are an "INSTANCE" of the Person class
    Person me = new Person();
    Person someone = new Person("Ellen", 56);
    //"Ellen" and 56 are ARGUMENTS ^^    ^^
    // ARGUMENTS are the values that go into the PARAMETERS

    System.out.println(me);
    me.changeName("Alex");
    System.out.println(someone);

    someone.changeName("Jose");
    someone.changeAge(19);
    //changing the variables of someone to match me 

    Person you = new Person("Jose Guzman", 19);
    //creating a new line for me and my age 

    System.out.println(you);
    // used to print my name and age
  }
}
/*
person's name = Alex , age = 36
person's name = Ellen , age = 56
person's name = Jose Guzman , age = 19
*/
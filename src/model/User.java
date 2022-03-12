package model;

public class User {

    private static int userCounter;

    // 1. Pola obiektu
    // To z czego składa się dany obiekt

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    // 3. Konstruktor
    // Służy do tworzenia nowych obiektów
    // Domyślny konstruktor tworzy domyślny obiekt
    public User(String firstName, String lastName, String email, int age) {
        // this wskazuje OBIEKT
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith(".ru")) {
            System.out.println("RU emails are not allowed");
        } else {
            this.email = email;
        }
    }

    public static int getUserCounter() {
        return userCounter;
    }

    public static void setUserCounter(int userCounter) {
        User.userCounter = userCounter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

// 2. Metody
    // To co dany obiekt może zrobić

    // zwracany typ + Metoda
    public void getFullName() {
        // ciało metody
        System.out.println(firstName + " " + lastName);
    }

    public void getAllInfo() {
        // ciało metody
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    public int getUserAge() {
        return age;
    }

    public boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    public void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you!");
    }

    public void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " old.");
    }

    public int yourArePlus10(int userAge) {
        return userAge + 10;
    }
}

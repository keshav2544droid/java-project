/*class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private String accountType;

    public BankAccount(String accountHolderName, String accountNumber, String accountType) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    // Display account details
    public void displayDetails() {
        System.out.println("----- Account Details -----");
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Type        : " + accountType);
    }

    // Check whether the account holder's name is a palindrome
    public boolean isPalindrome() {
        String cleanedName = accountHolderName.replaceAll("\\s+", "").toLowerCase();
        String reversedName = new StringBuilder(cleanedName).reverse().toString();
        return cleanedName.equals(reversedName);
    }

    // Count the number of characters in the account holder's name
    public int getCharacterCount() {
        return accountHolderName.length();
    }

    // Display the account type in uppercase
    public void displayAccountTypeInUppercase() {
        System.out.println("Account Type (Uppercase): " + accountType.toUpperCase());
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Nitin", "ACC12345678", "Savings");

        account.displayDetails();
        System.out.println("Is Name Palindrome? : " + account.isPalindrome());
        System.out.println("Character Count     : " + account.getCharacterCount());
        account.displayAccountTypeInUppercase();
    }
}*/

/*import java.util.Scanner;

class Student {
    private String name;
    private String rollNumber;
    private String emailId;
    private String courseName;

    // Accept student details
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        this.rollNumber = scanner.nextLine();
        System.out.print("Enter Email ID: ");
        this.emailId = scanner.nextLine();
        System.out.print("Enter Course Name: ");
        this.courseName = scanner.nextLine();
    }

    // Validate whether email ID contains '@' and '.'
    public boolean validateEmail() {
        return emailId != null && emailId.contains("@") && emailId.contains(".");
    }

    // Display the student's name in uppercase
    public void displayNameInUppercase() {
        System.out.println("Name (Uppercase): " + name.toUpperCase());
    }

    // Count the number of characters in the student's name
    public int getNameCharacterCount() {
        return name.length();
    }

    // Display all student details
    public void displayDetails() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNumber);
        System.out.println("Email ID   : " + emailId);
        System.out.println("Course     : " + courseName);
        System.out.println("Valid Email: " + (validateEmail() ? "Yes" : "No"));
        System.out.println("Name Length: " + getNameCharacterCount());
        displayNameInUppercase();
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.acceptDetails();
        student.displayDetails();
    }
}*/

/*class Employee {
    private String name;
    private String email;
    private String department;

    public Employee(String name, String email, String department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("----- Employee Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Email      : " + email);
        System.out.println("Department : " + department);
    }

    // Convert the name to uppercase
    public String getNameInUppercase() {
        return name.toUpperCase();
    }

    // Check whether the email contains "@"
    public boolean containsAtSymbol() {
        return email != null && email.contains("@");
    }

    // Display the length of the employee name
    public int getNameLength() {
        return name.length();
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Murtaza Bawahir", "murtaza.j@company.com", "Engineering");

        emp.displayDetails();
        System.out.println("Name in Uppercase   : " + emp.getNameInUppercase());
        System.out.println("Contains '@' Symbol : " + emp.containsAtSymbol());
        System.out.println("Length of Name      : " + emp.getNameLength());
    }
}*/

/*import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StringAnalyzer {
    private String text;

    public StringAnalyzer(String text) {
        this.text = text;
    }

    // 1. Count Vowels
    public int countVowels() {
        int count = 0;
        String lower = text.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    // 2. Count Consonants
    public int countConsonants() {
        int count = 0;
        String lower = text.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1) {
                count++;
            }
        }
        return count;
    }

    // 3. Count Digits
    public int countDigits() {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // 4. Reverse String
    public String reverseString() {
        return new StringBuilder(text).reverse().toString();
    }

    // 5. Check Palindrome
    public boolean checkPalindrome() {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // 6. Display Character Frequency
    public void displayCharacterFrequency() {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character Frequency:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("  '" + entry.getKey() + "' : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to analyze: ");
        String input = scanner.nextLine();

        StringAnalyzer analyzer = new StringAnalyzer(input);

        System.out.println("\n----- Analysis Results -----");
        System.out.println("Vowel Count         : " + analyzer.countVowels());
        System.out.println("Consonant Count     : " + analyzer.countConsonants());
        System.out.println("Digit Count         : " + analyzer.countDigits());
        System.out.println("Reversed String     : " + analyzer.reverseString());
        System.out.println("Is Palindrome?      : " + analyzer.checkPalindrome());
        analyzer.displayCharacterFrequency();
    }
}*/

// 1. Compile-Time Polymorphism (Method Overloading)
class MathCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// 2. Run-Time Polymorphism (Method Overriding)
class Animal {
    public void makeSound() {
        System.out.println("Animals make various sounds.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

class PolymorphismDemo {
    public static void main(String[] args) {
        // --- Compile-Time Polymorphism Demo ---
        System.out.println("=== Compile-Time Polymorphism (Overloading) ===");
        MathCalculator calc = new MathCalculator();
        System.out.println("Add 2 integers (5 + 10)       : " + calc.add(5, 10));
        System.out.println("Add 2 doubles (2.5 + 4.3)     : " + calc.add(2.5, 4.3));
        System.out.println("Add 3 integers (1 + 2 + 3)    : " + calc.add(1, 2, 3));

        System.out.println();

        // --- Run-Time Polymorphism Demo ---
        System.out.println("=== Run-Time Polymorphism (Overriding) ===");
        Animal myAnimal; // Parent reference

        myAnimal = new Dog(); // Dynamic binding to Dog
        myAnimal.makeSound();

        myAnimal = new Cat(); // Dynamic binding to Cat
        myAnimal.makeSound();
    }
}
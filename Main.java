import java.sql.SQLOutput;
import java.util.*;
//Exercise (Java Basics)
//Ayman Alharbi
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("""
                     --- Welcome to the first Exercise --- 
                     Input a number to chose the question 
                        1- BMI_calculator
                        2- GradeCalculator
                        3- CurrencyExchanger
                        4- StringManipulator
                        5- SentenceExtracter
                        6- WordsFinder
                        7- sentenceReplacer
                        8- StringComparssion
                        0- Exit""");
            int choce = input.nextInt();
            input.nextLine();
            switch (choce){
                case 0:
                    System.out.println("Thank you!");
                    break;
                case 1:
                    BMI_calculator();
                    break;
                case 2:
                    GradeCalculator();
                    break;
                case 3:
                    CurrencyExchanger();
                    break;
                case 4:
                    StringManipulator();
                    break;
                case 5:
                    SentenceExtracter();
                    break;
                case 6:
                    WordsFinder();
                    break;
                case 7:
                    sentenceReplacer();
                    break;
                case 8:
                    StringComparssion();
                    break;
                default:
                    System.out.println("Please Enter a number between 0 and 8");
                    break;
            }
            if(choce == 0) break;
        }
    }
    //  1. Develop a program that takes the weight (in kilograms) and height (in meters)
    //  as input and calculates the BMI, then prints it.
    //      • Input: Weight (kg) = 70, Height (m) = 1.75
    //      • Expected Output: BMI = 22.86
    public static void BMI_calculator(){
        System.out.println("Please enter your weight than height: ");
        double weight = input.nextDouble();
        double height = input.nextDouble();
        height *= 100;
        double BMI = (weight / (height*height)) * 10000;
        System.out.println("Your BMI is: " + Math.round(BMI) + "%");

    }

//    2. Write a program that takes the obtained marks and total marks as input and
//    calculates the percentage, then prints it.
//              • Input: Obtained Marks = 85, Total Marks = 100
//            • Expected Output: Percentage = 85.0%
    public static void GradeCalculator(){
        System.out.println("Please enter the obtained marks than the total marks");
        double obtainedMarks = input.nextDouble();
        double totalMarks = input.nextDouble();
        double percentage = (obtainedMarks / totalMarks) *100;
        System.out.println("Your perecentage is: " + percentage + "%");
    }
//    3. Create a program that takes an amount in one currency and an exchange rate
//    as input, then converts and prints the amount in another currency.
//            • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
//            • Expected Output: Amount in EUR = 85.0
    public  static void CurrencyExchanger(){
        System.out.println("Please enter the amount than the exchange rate: ");
        double amount = input.nextDouble();
        double exchangeRate = input.nextDouble();
        double newAmount = amount * exchangeRate;
        System.out.println("The new amount is: " + newAmount);
    }

//    4. Create a program that takes a string as input, calculates its length, and then
//    reverses the string using the StringBuilder class, finally printing both the length and
//    reversed string.
//            • Input: "Hello, World!"
//            • Expected Output: Length of the string: 13 And Reversed string: "!dlroW,olleH"
    public static void StringManipulator(){
        System.out.println("Please enter your string");
        String aString = input.nextLine();
        StringBuilder myString = new StringBuilder(aString);
        System.out.println("The length of your string is: " + myString.length() + "\nYour string reversed is: " + myString.reverse());
    }
//    5. Develop a program that takes a sentence as input and extracts a substring from
//    it, then prints the extracted substring.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
//= 10, End Index = 20
//• Expected Output: "brown fox"
    public static void SentenceExtracter(){

        System.out.println("Please enter the sentence than the indexes");
        String aSentence = input.nextLine();
        int startIndex = input.nextInt();
        int endIndex = input.nextInt();
        System.out.println("The extracted substring is: " + aSentence.substring(startIndex, endIndex));
    }
//    6. Write a program that takes a sentence and a keyword as input, then check if
//    the keyword is present in the sentence and prints the result.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
//            "jumps"
//            • Expected Output: Keyword "jumps" is present in the sentence.
    public static void WordsFinder(){
        System.out.println("Please enter the sentence than the keyword");
        String aSentence = input.nextLine();
        String aWord = input.next();
        if(aSentence.contains(aWord)){
            System.out.println("Keyword " + aWord + " is present in the sentence.");
        }else{
            System.out.println("Keyword " + aWord + " is not present in the sentence.");
        }
    }
//    7. Develop a program that takes a sentence and a word to replace as input, then
//    replace all occurrences of the word with another word and prints the modified
//    sentence.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
//    Replace = "fox", Replacement Word = "cat"
//• Expected Output: "The quick brown cat jumps over the lazy dog
    public static void sentenceReplacer(){
        System.out.println("Please enter the sentence, the word than the Replacement word");
        String aSentence = input.nextLine();
        String aWord = input.next();
        String replacementWord = input.next();
        String newSentence = aSentence.replaceAll(aWord, replacementWord);
        System.out.println(newSentence);
    }
// 8. Write a program that takes two strings as input and check if they are equal,
//    ignoring the case, then prints whether they are equal or not.
//            • Input: String 1 = "Hello", String 2 = "hello"
//            • Expected Output: Strings are equal (ignoring case)
    public static void StringComparssion(){
        System.out.println("Please enter the first word than the second word");
        String firstWord = input.next();
        String secondWord = input.next();
        boolean areTheyEqual = firstWord.equalsIgnoreCase(secondWord);
        if(areTheyEqual){
            System.out.println("Strings are equal (ignoring case)");
        }else{
            System.out.println("Strings are not equal (ignoring case)");
        }
    }
}
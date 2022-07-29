package Day23_UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC10 {
    static Scanner input = new Scanner(System.in);

    public static void firstNameValidation() {
        System.out.print("\nEnter First Name :- ");
        String first_name = input.nextLine();
        public static boolean firstNameValidation(String first_name) {

            String firstNameRegex = "^[A-Z][A-Z a-z]{3,}$";           //first character is Upper case an remaining all either Upper or Lower

            Pattern pattern = Pattern.compile(firstNameRegex);

            Matcher matcher = pattern.matcher(first_name);

            System.out.println("First name pattern matching :- " + matcher.matches());
            return matcher.matches();
        }

        public static void lastNameValidation() {
            System.out.print("\nEnter last Name :- ");
            String last_name = input.nextLine();
            public static boolean lastNameValidation(String last_name) {

                String lastNameRegex = "^[A-Z][A-Z a-z]{3,}$";           //first character is Upper case an remaining all either Upper or Lower

                Pattern pattern = Pattern.compile(lastNameRegex);

                Matcher matcher = pattern.matcher(last_name);

                System.out.println("Last name pattern matching :- " + matcher.matches());
                return matcher.matches();
            }

            public static void emailValidation() {
                System.out.print("\nEnter E-Mail :- ");
                String email = input.nextLine();
                public static boolean emailValidation(String email) {

                    String emailRegex = "^[\\w+-]+(\\.[\\w+-]+)*@[\\w]+(\\.[\\w]+)?(?=(\\.[A-Za-z_]{2,3}$|\\.[a-zA-Z]{2,3}$)).*$";       //UC-9:- All email validations using regular expressions.

                    Pattern pattern = Pattern.compile(emailRegex);
                    Matcher matcher = pattern.matcher(email);

                    System.out.println("E-Mail pattern matching :- " + matcher.matches());
                    return matcher.matches();
                }


                public static void mobileNumberValidation() {
                    System.out.print("\nEnter mobile number with country code :- ");
                    String mobileNum = input.nextLine();
                    public static boolean mobileNumberValidation(String mobileNum) {

                        String mobileNumRegex = "^[0-9]{2}(\\s){1}[0-9]{10}$";     //example:- 91 XXXXXXXXXX  mobile number format validation.

                        Pattern pattern = Pattern.compile(mobileNumRegex);
                        Matcher matcher = pattern.matcher(mobileNum);

                        System.out.println("Mobile number pattern matching :- " + matcher.matches());
                        return matcher.matches();
                    }


                    public static void passwordValidation() {
                        System.out.print("\nEnter a password with 8 minimum characters :- ");
                        String password = input.nextLine();

                        public static boolean passwordValidation(String password) {
                            String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=[\\w]*[\\W][\\w]*$)(?=.*[a-z]).{8,}$";      //Rule-4:-  Has exactly 1 Special Character.

                            Pattern pattern = Pattern.compile(passwordRegex);

                            Matcher matcher = pattern.matcher(password);

                            System.out.println("Password Validation :- " + matcher.matches());
                            return matcher.matches();
                        }

                        public static void main(String[] args) {
                            System.out.println("WELCOME TO USER REGISTRATION PROBLEM");

                            firstNameValidation();
                            lastNameValidation();
                            emailValidation();
                            mobileNumberValidation();
                            passwordValidation();
                        }
                    }


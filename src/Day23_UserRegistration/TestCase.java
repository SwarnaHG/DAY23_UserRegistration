package Day23_UserRegistration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestCase {
    public void given_first_name_expected_as_true() {
        UC10 uspTest = new UC10();
        boolean output = uspTest.firstNameValidation("Nikhil");
        assertEquals(true , output);
    }

    public void given_first_name_expected_as_false() {
        UC10 uspTest = new UC10();
        boolean output = uspTest.firstNameValidation("nikhil");
        assertEquals(false , output);
    }


    public void given_last_name_expected_as_true() {
        UC10 uspTest = new UC10();
        boolean output = uspTest.lastNameValidation("Sundarasetty");
        assertEquals(true , output);
    }

    public void given_last_name_expected_as_false() {
        UC10 uspTest = new UC10();
        boolean output = uspTest.lastNameValidation("sundarasetty");
        assertEquals(false , output);
    }

    public void given_email_expected_as_true() {
        UC10 uspTest = new UC10();
        boolean output = uspTest.emailValidation("nikhilnaidu473@gmail.com");
        assertEquals(true , output);
    }

    public void given_email_expected_as_false() {
        UC10 uspTest = new UC10();
        boolean output = uspTest.emailValidation("nikhilnaidu473@.gmail.com");
        assertEquals(false , output);
    }

    public void given_mobile_number_expected_as_true() {
        UC10 uspTest = new UC10();
        boolean output = uspTest.mobileNumberValidation("91 9398359637");
        assertEquals(true , output);
    }

    public void given_mobile_number_expected_as_false() {
        UC10 uspTest = new UC10();
        boolean output = uspTest.mobileNumberValidation("919398359637");
        assertEquals(false , output);
    }

    public void given_password_expected_as_true() {
        UC10 uspTest = new UC10();
        boolean output = uspTest.passwordValidation("Nikhil123@");
        assertEquals(true , output);
    }

    public void given_password_expected_as_false() {
        UC10 uspTest = new UC10();
        boolean output = uspTest.passwordValidation("Nikhi$l123@");
        assertEquals(false , output);
    }

}

package BankaUyg;

import java.util.Scanner;

public class PasswordValidation {


    Scanner scan = new Scanner(System.in);

    public boolean paswordValidation(String password) {

        boolean isValid = false;

        boolean hasMin8 = false;
        boolean hasBlank = false;
        boolean has1Upper = false;
        boolean has1Lower = false;
        boolean has1Special = false;
        boolean has1Digit = false;

        if (password.length() >= 8) {
            hasMin8 = true;
        }
        char[] arrayPassword = password.toCharArray();
        int count = 0;

        for (char each : arrayPassword) {

            if (Character.isUpperCase(each)) {
                count++;
            }
        }
        if (count >= 1) has1Upper = true;
        count = 0;

        for (char each : arrayPassword) {

            if (Character.isLowerCase(each)) {
                count++;
            }
        }
        if (count >= 1) has1Lower = true;
        count = 0;

        for (char each : arrayPassword) {

            if (!Character.isLetterOrDigit(each)) {
                count++;
            }
        }
        if (count >= 1) has1Special = true;
        count = 0;

        for (char each : arrayPassword) {

            if (each == ' ') {
                count++;
            }
        }
        if (count == 0) hasBlank = true;
        count = 0;

        for (char each : arrayPassword) {

            if (!Character.isDigit(each)) {
                count++;
            }
        }
        if (count >= 1) has1Digit = true;

        if (hasMin8 == false || hasBlank == false || has1Upper == false || has1Lower == false || has1Special == false || has1Digit == false) {

            isValid=false;


        }else isValid=true;
        return isValid;
    }

}

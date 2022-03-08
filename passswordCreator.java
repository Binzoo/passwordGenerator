
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author binamrathapa
 */
public class passswordCreator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int j = 0; j < 1;) {
            System.out.println("Please choose the number of character that you want your password to be but it should "
                    + "be under 30: ");

            int value = input.nextInt();
            String store = "";
            String numberOfCharacter = "";

            if (value > 0 && value <= 30) {
                for (int i = 0; i < 8; i++) {

                    store = store + (randomInt() + randomString() + randomCapitalString() + randomCharacter());

                }
                numberOfCharacter = store.substring(0, value);

                System.out.print(numberOfCharacter);
                break;

            } else {
                System.out.println("Number of character of password you want it to be is too long.");
                System.out.println("Please try again.");

            }
        }

    }

    //this method give random number
    public static String randomInt() {
        Random rand = new Random();
        String alphabet = "1234567890";
        String store = "";

        store += alphabet.charAt(rand.nextInt(alphabet.length()));

        return store;
    }

    // this method give random String
    public static String randomString() {

        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyxz";
        String store = "";

        store += alphabet.charAt(rand.nextInt(alphabet.length()));

        return store;
    }

    public static String randomCapitalString() {
        Random rand = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZz";
        String store = "";

        store += alphabet.charAt(rand.nextInt(alphabet.length()));

        return store;
    }

    public static String randomCharacter() {
        Random rand = new Random();
        String alphabet = "!@#$%^&*()_+{}::L><?~`±§";
        String store = "";

        store += alphabet.charAt(rand.nextInt(alphabet.length()));

        return store;
    }

}

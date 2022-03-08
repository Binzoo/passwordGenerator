
import java.util.Random;

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

        System.out.print("This code will generate Strong Password: ");
        System.out.println(randomInt()+randomString()+randomInt()+randomCapitalString()+randomCharacter());
    }
    
    //this method give random number
    public static int randomInt(){
        Random rand = new Random(); //instance of random class
      int upperbound = 100;
        //generate random values from 0-24
      int int_random = rand.nextInt(upperbound);
      
      return int_random;
    }
    
    // this method give random String
    public static String randomString(){
        
        Random rand = new Random(); 
        String alphabet = "abcdefghijklmnopqrstuvwxyxz";
        String store = "";
        
        for (int i = 0; i < 4; i++) {
            store += alphabet.charAt(rand.nextInt(alphabet.length()));
        }
        return store;
    } 
    public static String randomCapitalString(){
        Random rand = new Random(); 
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZz";
        String store = "";
        
        for (int i = 0; i < 4; i++) {
            store += alphabet.charAt(rand.nextInt(alphabet.length()));
        }
        return store;
    }
    public static String randomCharacter(){
        Random rand = new Random(); 
        String alphabet = "!@#$%^&*()_+{}::L><?~`±§";
        String store = "";
        
        for (int i = 0; i < 2; i++) {
            store += alphabet.charAt(rand.nextInt(alphabet.length()));
        }
        return store; 
    }
   
}

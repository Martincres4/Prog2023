/*Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!

The function takes a name as its only argument, and returns one of the following strings:

name + " plays banjo" 
name + " does not play banjo"
Names given are always valid strings. */
package codeWars.javaCW;
import java.util.Scanner;
public class Banjo {
    public static void main(String [] args){
        System.out.println(areYouPlayingBanjo());
    }
    
    public static String areYouPlayingBanjo() {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Are you playing banjo?");
        String name = sc.nextLine();
        char ini = name.charAt(0);

        if(ini == 'R' || ini == 'r'){
            frase = name + " plays banjo.";
        }else{
            frase = name + " does not play banjo";
        }    
        return frase;
    }
}


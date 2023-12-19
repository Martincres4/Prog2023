/*Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!

The function takes a name as its only argument, and returns one of the following strings:

name + " plays banjo" 
name + " does not play banjo"
Names given are always valid strings. */
package codeWars.javaCW;
    public static void main(String [] args){
        areYouPlayingBanjo("Roberto");
    }
    public class Banjo {
        public static String areYouPlayingBanjo(String name) {
            String ini = name.char(0);
            if(ini == 'R' || ini == 'r'){
                System.out.println(name + " plays banjo.")
            }else{

            }
            
        }
}


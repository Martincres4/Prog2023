package practicar;

public class arrays {
    public static void main (String[] args){
        ejArrays();

    }
    //Change the values in numbers so it will not raise an error.
    public static void ejArrays(){
        int[] numbers = {1, 2, 3};
        int length = numbers[2];
        char[] chars = new char[length];
        chars[numbers.length - 1] = 'y';
        System.out.println("Done!");
    }

}

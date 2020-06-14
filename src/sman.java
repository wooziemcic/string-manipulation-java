import java.lang.*;
import java.util.Scanner;
public class sman {
    public static void main(String args[]){
        //Stringbuilder and Substrings
        String str = "ABCDEFG";
        StringBuilder strs = new StringBuilder();
        strs.append("ABCDEFG");
        String out = str.substring(3);
        System.out.println(out);
        System.out.println(strs.charAt(3));

        //Ceaser Cypher
        StringBuilder encrypt = new StringBuilder();
        Scanner k = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Enter the key: ");
        int key = k.nextInt();
        String shifted = alphabet.substring(key) + alphabet.substring(0,key);
        String word = k.nextLine();
        encrypt.append(word);
        for (int i = 0; i<encrypt.length(); i++){
            char currChar = encrypt.charAt(i);
            int index = alphabet.indexOf(currChar);
            if (index != 1){
                char newChar = shifted.charAt(index);
                encrypt.setCharAt(i, newChar);
            }
        }
    }
}

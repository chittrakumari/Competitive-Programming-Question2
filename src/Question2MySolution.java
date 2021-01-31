/*
Problem: Consider a String that can contain ASCII and Unicode characters ranging between 0-65,535.
Write a program that returns true if
the String contains unique characters (i.e no character in the String is repeated).
whitespaces in the String can be ignored.
BONUS

Create a separate definition class for this task.
Create a separate method for this task.
[Google, Adobe, Microsoft]
 */
import java.util.*;

class Question2MySolution {
    public static final int MAX_UNICODE = 65_535;

    public static void main(String[] args) {
        System.out.println(checkWhetherStringIsUnique("Competitive Programming"));
    }

    public static boolean checkWhetherStringIsUnique(String string) {
        Map<Character, Boolean> characters = new HashMap<>();
        boolean q = false;
        String h = string.trim().toUpperCase();
        int m = 0, l = 0;
        for (int i = 0; i < h.length(); i++) {
            if (h.charAt(i) != ' ' && (h.charAt(i)>=0 && h.charAt(i)<=MAX_UNICODE) ){
                characters.put(h.charAt(i), false);
                l++;
            }
        }

        for (int i = 0; i < h.length(); i++) {
            int c = 0;
            if (h.charAt(i) != ' ') {
                System.out.println(h.charAt(i));
                if (characters.containsKey(h.charAt(i)) && characters.get(Character.valueOf(h.charAt(i))).equals(Boolean.valueOf("false"))) {
                        characters.replace(h.charAt(i), Boolean.valueOf("true"));
                        m++;
                    }
                } else {
                    c = 1;
                    break;
                }
            }



        if(l==m){
            q=true;
        }
        System.out.println("after changes" + characters);
        return q;

    }
}
import java.util.HashMap;
import java.util.Map;

public class Question2SirSolution {
    public static final int MAX_UNICODE = 65_535;

    public static void main(String[] args) {
        System.out.println(checkWhetherStringIsUnique("Competitive Programming"));
    }


    //

    public static boolean checkWhetherStringIsUnique(String string) {
        Map<Character, Boolean> characters = new HashMap<>();
        boolean response = false;
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (string.codePointAt(i) <= MAX_UNICODE) {
                if (!Character.isWhitespace(character)) {
                    if (characters.put(character, true) != null) {
                        response = false;
                        return response;
                    }
                }
            } else {
                System.out.println("Invalid Character");
                response = false;
                return response;
            }
            //check whether character is valid or not.
        }
        response=true;
        return response;
    }

}
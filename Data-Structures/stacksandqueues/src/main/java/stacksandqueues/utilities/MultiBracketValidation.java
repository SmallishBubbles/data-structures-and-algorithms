package stacksandqueues.utilities;

import stacksandqueues.Stack;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MultiBracketValidation {


    public static boolean multiBracketValidation(String input) {
        ArrayList<String> openingBrackets = new ArrayList<>();
        ArrayList<String> closingBrackets = new ArrayList<>();
        Stack<String> nextValidClosingBracket = new Stack<>();

        // !! this order matters, please be sure that the respective closing bracket is in the same index as the opening
        openingBrackets.add("[");
        closingBrackets.add("]");

        openingBrackets.add("{");
        closingBrackets.add("}");

        openingBrackets.add("(");
        closingBrackets.add(")");


        String[] characters = input.split("");

        for ( int i = 0; i < characters.length; i++ ) {
            if ( openingBrackets.contains(characters[i]) ) {
                nextValidClosingBracket.push(closingBrackets.get(openingBrackets.indexOf(characters[i])));
            } else if ( closingBrackets.contains(characters[i]) ) {
                try {
                    String validClosingBracket = nextValidClosingBracket.pop();
                    if ( validClosingBracket.equals(characters[i]) ) {
                        // yay, valid! continue
                    } else {
                        return false;
                    }
                } catch (NoSuchElementException e) {
                    return false;
                }
            }
        }

        try {
            nextValidClosingBracket.peek();
        } catch (NoSuchElementException e) {
            return true;
        }

        return false;
    }
}

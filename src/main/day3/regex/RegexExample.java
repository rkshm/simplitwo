package main.day3.regex;

import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {

        //following line prints "true" because the whole text geeksforgeeks matches pattern geeksforge*ks
        System.out.println("1. " + Pattern.matches("geeksforge*ks", "geeksforgeeks"));

        //following line prints "false" because the whole text geeksforgeeks matches pattern ge*geeks*
        System.out.println("2. " + Pattern.matches("ge*geeks*", "geeksforgeeks"));

//        ----------------------------- PATTERN SEARCHING ----------------------------------
        System.out.println("3. " + Pattern.matches(".s", "ss")); //true - 2nd char is s
        System.out.println("4. " + Pattern.matches(".s", "mk")); //true - 2nd char is not s

        System.out.println("5. " + Pattern.matches("[amn]", "abcd")); //false - only one char is allowed; bcd are not allowed i.e. not in the bracket
        System.out.println("6. " + Pattern.matches("[amn]", "a")); //true - one among a m or n

        //        ----------------------------- QUANTIFIER ----------------------------------
        System.out.println("? quantifier ......");
        System.out.println("7. " + Pattern.matches("[amn]?", "a")); //true - a or m or n comes once
        System.out.println("8. " + Pattern.matches("[amn]?", "aaa")); //false - a comes more than once
        System.out.println("9. " + Pattern.matches("[amn]?", "aammmnn")); //false - a, m and n all have more than one occurrence
        System.out.println("10. " + Pattern.matches("[amn]?", "aazzta")); //false - a occurs more than once
        System.out.println("11. " + Pattern.matches("[amn]?", "am")); //false - a or m or n occurs more than once

        System.out.println("? quantifier ......");
        System.out.println("12. " + Pattern.matches("[amn]+", "a")); //true - a or m or n comes once or more
        System.out.println("13. " + Pattern.matches("[amn]+", "aaa")); //true - a comes once or more
        System.out.println("14. " + Pattern.matches("[amn]+", "aammmnn")); //true - a, m and n all occur once or more
        System.out.println("15. " + Pattern.matches("[amn]+", "aazzta")); //false - z and t should not occur but are present

        System.out.println("? quantifier ......");
        System.out.println("16. " + Pattern.matches("[amn]*", "ammmna")); //true - a or m or n comes zero or more times

        //        ----------------------------- META-CHARACTER ----------------------------------
        System.out.println("17. " + Pattern.matches("\\d", "abc")); //false - expects a single digit but are multiple characters
        System.out.println("18. " + Pattern.matches("\\d", "1")); //true . expects a single digit and it matches
        System.out.println("19. " + Pattern.matches("\\d", "4443")); //false - expects a single digit but are multiple digits

        //        ----------------------------- Email ----------------------------------
//        username@yahoo.com
//        username@yahoo.in
//        username@gmail.com
//        username@abc.com

        System.out.println("? email ......");
        System.out.println("20. " + Pattern.matches("[^.0-9][a-zA-Z0-9._-]+@[a-zA-Z]+.[a-zA-Z]+", "username99@yahoo.com")); //true - matches
        System.out.println("21. " + Pattern.matches("[^.0-9][a-zA-Z0-9._-]+@[a-zA-Z]+.[a-zA-Z]+", "9username99@yahoo.com")); //false - cannot start with a number
        System.out.println("22. " + Pattern.matches("[^.0-9][a-zA-Z0-9._-]+@[a-zA-Z]+.[a-zA-Z]+", ".username99@yahoo.com")); //false - cannot start with a period / full-stop
        System.out.println("23. " + Pattern.matches("[^.0-9][a-zA-Z0-9._-]+@[a-zA-Z]+.[a-zA-Z]+", "user.name99@yahoo.com")); //pass - can have period / full-stop after first char
        System.out.println("24. " + Pattern.matches("[^.0-9][a-zA-Z0-9._-]+@[a-zA-Z]+(\\.[a-zA-Z]+)*(\\.[a-zA-Z]+)", "username99@yahoo.co.ab.in")); //true - can have multiple dots in domain
        System.out.println("25. " + Pattern.matches("[^.0-9][a-zA-Z0-9._-]+@[a-zA-Z]+(\\.[a-zA-Z]+)*(\\.[a-zA-Z]+)", "username99@yahoo.co..ab.in")); //false - cannot have consecutive dots in domain

    }
}

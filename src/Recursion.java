

public class Recursion {

    /**
     * Given base that is at least 0 and n, compute recursively (no loops) the value of base to the
     * n power, so powN(3, 2) is 9 (3 squared). Remember that any number to the 0 power will be 1.
     *
     * @param base
     * @param n power
     * @return result
     */
    public int powN(int base, int n) {
        // If x^0 return 1
        if (n == 0) {
            return 1;
        }

        // If we need to find of 0^y
        if (base == 0) {
            return 0;
        }

        // For all other cases
        return base * powN(base, n - 1);
    }


    /**
     * Stephen gets easily distracted when browsing the internet. Every 15 minutes he spends
     * browsing he will open 3 more tabs. Given the current interval, recursively compute the total
     * number of tabs that Stephen will have open at the end of the current interval.
     *
     * Ex: (2 will be 6), (3 will be 9), (234 will be 702)
     *
     * @param t current intervals
     * @return amount of tabs open in 15 minutes time
     */
    public int tabs(int t) {
        // If t is 0 return 0
        if (t == 0) {
            return 0;
        }
        // If t is 1 return 3
        if (t == 1) {
            return 3;
        }
        // For all other cases
        return tabs(t - 1) + 3;
    }

    /**
     * Dave tends to punctuate his sentences with far too many exclamation points. Write a recursive
     * method to tone them down a little bit.
     *
     * Given is a string of at least 1 character in length. Remove all but the last ! character from
     * the end of each. It is possible that there will be no ! characters at all, so a base case to
     * handle this will also be needed.
     *
     * Ex: "String!!!" becomes "String!"
     *
     * Hint: Use the string methods charAt() and length() to test particular characters in the
     * string. Remember that the last character of each string will be at s.length() - 1.
     *
     * @param str String
     * @return Edited string
     */
    public String overExclaim(String str) {
//        non-recursive solution
//        if (str.contains("!!")) {
//            String prefix = str.substring(0,str.indexOf('!'));
//            return prefix + "!";
//        } else {
//            return str;
//        }
//    }
//    recursive solution
//        look for 2 bangs in the last index, if it's there then remove one
        int firstBang = str.indexOf("!");
        int lastBang = str.lastIndexOf("!");
        System.out.println("firstBang: " + firstBang);
        System.out.println("lastBang: " + lastBang);
        if (firstBang == lastBang) {
            return str;
        }
        if (firstBang < lastBang) {
            return overExclaim(str.substring(0,lastBang));
        }
        else {
            return str;
        }
    }
    /**
     * Whenever Dante creates a screen name he adds an absurd amount of x characters (Upper and
     * Lowercase) throughout. Write a recursive method to count the total number of x characters
     * that Dante has added to his screen name.
     *
     * Ex: XxxDemonSlayerxxX has 6, OnlyxxxXxHave has 5, NothingSpecial has 0
     *
     * @param str value
     * @return result
     */
    public int manyX(String str) {
//         non-recursive solution
//        int countX = 0;
//        for (int i=0; i<str.length(); ++i) {
//            if ((str.toCharArray()[i] == 'x') || (str.toCharArray()[i] == 'X')) {
//                ++countX;
//            }
//        }
//        return countX;
//    }
//         recursive solution
        if (str.charAt(str.length()-1) == 'x' ||
                (str.charAt(str.length()-1) == 'X')) {
            if (!str.substring(0,str.length()-1).isEmpty()) {
                return 1 + manyX(str.substring(0, str.length() - 1));
            } else {
                return 1;
            }
        } else {
            return manyX(str.substring(0,str.length()-1));
        }

    }
}
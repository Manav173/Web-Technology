/* WAP count the number of words in String */

public class lab9q3 {
    public static void main(String[] args) {
        String str = "This is a sample string";
        int count = countWords(str);
        System.out.println("Number of words in the string: " + count);
    }

    public static int countWords(String str) {
        int count = 0;
        boolean word = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) && i != str.length()-1) {
                word = true;
            } else if (!Character.isLetter(str.charAt(i)) && word) {
                count++;
                word = false;
            } else if (Character.isLetter(str.charAt(i)) && i == str.length()-1) {
                count++;
            }
        }
        return count;
    }
}

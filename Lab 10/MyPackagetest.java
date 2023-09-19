package MyPackage;

public class test
{
    public void msg()
    {
        System.out.println("msg()");
    }
    public static int length(String str) {
        int len = 0;
        for (char c : str.toCharArray()) {
            len++;
        }
        return len;
    }

    public String reverse(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public String toUpperCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public boolean equals(String str,String other) {
        if (other == null) {
            return false;
        }
        if (str.length() != other.length()) {
            return false;
        }
        char[] chars1 = str.toCharArray();
        char[] chars2 = other.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
}

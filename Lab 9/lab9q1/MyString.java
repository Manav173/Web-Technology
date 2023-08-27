// MyString.java
package MyPackage;

public class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    public int length() {
        int len = 0;
        for (char c : this.str.toCharArray()) {
            len++;
        }
        return len;
    }

    public String reverse() {
        char[] chars = this.str.toCharArray();
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

    public String toUpperCase() {
        char[] chars = this.str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public String toLowerCase() {
        char[] chars = this.str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public boolean equals(MyString other) {
        if (other == null) {
            return false;
        }
        if (this.str.length() != other.str.length()) {
            return false;
        }
        char[] chars1 = this.str.toCharArray();
        char[] chars2 = other.str.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
}

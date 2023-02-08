package org.code.methods;

public class AtBash {
    public String atbash(String text) {
        char[] textBefore = text.toCharArray();
        int length = text.length();
        char[] textAfter = new char[length];
        for (int i = 0; i < length; i++) {
            char letter = textBefore[i];
            if (((int) letter <= 96) && ((int) letter >= 0)) {
                textAfter[i] = letter;
                continue;
            }
            int numAfter = 32;
            numAfter = 122 - (int) letter + 97;
            char newLetter = (char) numAfter;

            textAfter[i] = newLetter;
        }
        return new String(textAfter);
    }
}

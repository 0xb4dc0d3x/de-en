package org.code.methods;

public class Caeser {
    public String caesar(String text, int key, boolean isTextEncrypted) {
        char[] textBefore = text.toCharArray();
        int length = text.length();
        char[] textAfter = new char[length];
        for (int i = 0; i < length; i++) {
            char letter = textBefore[i];
            if (((int) letter <= 32) && ((int) letter >= 0)) {
                textAfter[i] = letter;
                continue;
            }
            int numAfter = 32;
            if (!isTextEncrypted)
                numAfter = ((int) letter - 33 + key) % 90 + 33;
            if (isTextEncrypted)
                numAfter = ((int) letter - 33 + 90 - key) % 90 + 33;
            char newLetter = (char) numAfter;

            textAfter[i] = newLetter;
        }
        return new String(textAfter);
    }
}

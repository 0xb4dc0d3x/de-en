package org.code.methods;

public class AtBash {
    public String atbash(String text) {
        char textBefore[] = text.toCharArray();
        int length = text.length();
        char textAfter[] = new char[length];
        for (int i = 0; i < length; i++) {
            char letter = textBefore[i];
            int numBefore = (int) letter;
            if ((numBefore <= 96) && (numBefore >= 0)) {
                textAfter[i] = letter;
                continue;
            }
            int numAfter = 32;
            numAfter = 122 - numBefore + 97;
            char newLetter = (char) numAfter;

            textAfter[i] = newLetter;
        }
        String newText = new String(textAfter);
        return newText;
    }
}

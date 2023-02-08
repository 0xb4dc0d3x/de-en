package org.code.methods;

public class Vigenere {
    public String vigenere(String text, String key, boolean isTextEncrypted) {
        char textBefore[] = text.toCharArray();
        char textAfter[] = new char[text.length()];
        char keyArr[] = key.toCharArray();
        int key_counter = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = textBefore[i];
            int numBefore = (int) letter;
            if ((numBefore <= 32) && (numBefore >= 0)) {
                textAfter[i] = letter;
                continue;
            }
            int numAfter = 32;
            int keyNum = (int) keyArr[(key_counter++) % (key.length())] - 33;

            if (!isTextEncrypted)
                numAfter = (numBefore - 33 + keyNum) % 90 + 33;
            if (isTextEncrypted)
                numAfter = (numBefore - 33 + 90 - keyNum) % 90 + 33;
            char newLetter = (char) numAfter;

            textAfter[i] = newLetter;
        }
        String newText = new String(textAfter);
        return newText;
    }
}

package org.code.methods;

public class Caeser {
    public String caesar(String text, int key, boolean isTextEncrypted)
    {
        char textBefore[] = text.toCharArray();
        int length = text.length();
        char textAfter[] = new char[length];
        for (int i = 0; i < length; i++)
        {
            char letter = textBefore[i];
            int numBefore = (int) letter;
            if ((numBefore <= 32) && (numBefore >= 0))
            {
                textAfter[i] = letter;
                continue;
            }
            int numAfter = 32;
            if (!isTextEncrypted)
                numAfter = (numBefore - 33 + key)%90 + 33;
            if (isTextEncrypted)
                numAfter = (numBefore - 33 + 90 - key)%90 + 33;
            char newLetter = (char) numAfter;

            textAfter[i] = newLetter;
        }
        String newText = new String(textAfter);
        return newText;
    }
}

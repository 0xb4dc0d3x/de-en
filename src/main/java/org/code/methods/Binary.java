package org.code.methods;

public class Binary {
    public static String binary(String text, boolean isTextEncrypted) {
        StringBuilder sb = new StringBuilder();
        if(isTextEncrypted)
        {
            for(int i : text.chars().toArray()) {
                sb.append(binaryOf((char) i)).append(" ");
            }
            return sb.toString();

        }
        return sb.toString();
    }

    public static int symbolAmount(int charint) {
        int amt = 1;
        int maxamt = 1;
        while(charint>maxamt) {
            amt++;
            maxamt+=Math.pow(2, amt-1);
        }
        while(amt%4!=0) {
            amt++;
            maxamt+=Math.pow(2, amt-1);
        }
        return amt;
    }

    public static String binaryOf(char symbol) {
        StringBuilder sb = new StringBuilder();
        int length = symbolAmount(symbol);
        int id = symbol;
        int r = id;
        int rl = length;

        while(rl != 0) {
            int pow = (int) Math.pow(2, rl-1);
            sb.append(pow<=r?"1":"0");
            if(pow<=r) r-=pow;
            rl--;
        }
        return sb.toString();
    }
}

package com.String;

public interface VowelsCount {
    public static void main(String[]args) {
        String s = "education";
        int count = 0;
        char r =' ';
        for (int i = 0; i < s.length(); i++) {
            r = s.charAt(i);

            switch (r) {
                case 'a':
                    count
                            ++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
            }
        }

        System.out.println("the number vowels count is " +  count);


    }
}

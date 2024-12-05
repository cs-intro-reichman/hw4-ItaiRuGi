public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newLwr = "";
        for(int i = 0; i < str.length(); i ++){
            if((char)str.charAt(i) <= 90 && (char)str.charAt(i) >= 65){
                newLwr += (char)((char)str.charAt(i) + 32);
            }else{
                newLwr += str.charAt(i);
            }

        }
        return newLwr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        String lwr1 = str1.toLowerCase();
        String lwr2 = str2.toLowerCase();
        if(lwr2.isEmpty()){
            return true;
        }
        if(lwr2.isEmpty()){
            return false;
        }
        int left = lwr1.length();

        if(lwr2.length() > lwr1.length()){
            return false;
        }
        for(int i = 0; i < lwr1.length(); i ++){
            if(left < lwr2.length()){
                return false;
            }
            if(lwr1.charAt(i) == lwr2.charAt(0)){
                for(int j = 0; j < lwr2.length(); j ++){
                    if(lwr1.charAt((i) + j) == lwr2.charAt(j) && j == lwr2.length()-1){
                        return true;
                    }
                    else if(lwr1.charAt(i + j) != lwr2.charAt(j)){
                        j = lwr2.length() + 1;
                    }
                }
            }
            left --;
        }
        return false;
    }
}

public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i = 0; i < sentences.length; i ++){
            for(int j = 0; j < keywords.length; j++){
                if(contains(sentences[i], keywords[j])){
                    System.out.println(sentences[i]);
                    j = keywords.length;
                }
            }
        }
    }

    public static boolean contains(String str1, String str2) {
        String lwr1 = str1.toLowerCase();
        String lwr2 = str2.toLowerCase();
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
}

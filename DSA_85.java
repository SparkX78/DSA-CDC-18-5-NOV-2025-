public class DSA_85 {
    public static String Bulls_Cows(String secret, String guess){
        int[] secretcount = new int[10];
        int[] guesscount = new int[10];
        int bulls = 0;
        int cows = 0;
        for(int i = 0; i < secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if(s == g){
                bulls++;
            }
            else{
                secretcount[s - '0']++;
                guesscount[g - '0']++;
            }
        }
        for(int i = 0; i < 10; i++){
            cows += Math.min(secretcount[i], guesscount[i]);
        }
        return bulls+" A "+cows+" B ";
        
    }
    public static void main(String[] args ){
        String secret = "1807";
        String guess = "7810";
        System.out.println(Bulls_Cows(secret, guess));
    }
}

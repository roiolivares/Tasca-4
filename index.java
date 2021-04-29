import java.util.Random;
class Telegram {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(2);
        int result=10/randomNum;
        System.out.println("Random Doubles: "+result);
    }
}
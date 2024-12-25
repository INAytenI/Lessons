package encapsulation;

public class Main {
    public static void main(String[] args){
        Gamer[] gamers = new Gamer[5];
        gamers[0] = new Gamer("Selya", true);
        gamers[1] = new Gamer("Silly", true);
        gamers[2] = new Gamer("Sally", false);
        gamers[3] = new Gamer("Sony", false);
        gamers[4] = new Gamer("Sara", true);

        for (int i = 0; i < gamers.length; i++){
            System.out.println(gamers[i]);
        }
    }
}

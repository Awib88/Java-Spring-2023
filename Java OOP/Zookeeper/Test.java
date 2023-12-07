public class Test{
    public static void main(String[] args){
        Gorilla kingKong =new Gorilla();
        Bat dracula = new Bat();

        // Gorilla class tests
        System.out.println("-------KingKong test---------");
        kingKong.throwThings();
        kingKong.throwThings();
        kingKong.throwThings();

        kingKong.climb();

        kingKong.eatBananas();
        kingKong.eatBananas();

        // Bat class tests
        System.out.println("-------Dracula test---------");
        dracula.fly();
        dracula.fly();

        dracula.eatHumans();
        dracula.eatHumans();

        dracula.attackTown();
        dracula.attackTown();
        dracula.attackTown();


    }
}
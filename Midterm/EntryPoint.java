public class EntryPoint{
    public static void main(String[] args) {
        System.out.println("Throwing dice...");
        Die d1 = new Die();
        d1.throwDie();
        Die d2 = new Die();
        d2.throwDie();


        if (d1.face==d2.face) {
            System.out.println("Cong");
        }else{
            System.out.println("Patience if a virtue");
        }
    }
}

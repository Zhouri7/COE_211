public class Die{
    int face;
    static int count =0 ;

    public Die(){
        count++;
    }
    public void throwDie(){
        face = (int)(Math.random()*6+1);
        System.out.println("Die " + count + " result: " + face);
    }

}
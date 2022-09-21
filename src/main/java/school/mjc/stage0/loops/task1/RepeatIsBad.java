package school.mjc.stage0.loops.task1;

public class RepeatIsBad {
    static int counter = 21;
    @SuppressWarnings("java:S106")
    public void repeatIsBad(){
        counter--;
        if(counter==0)
            return;
        else {
            System.out.print("writing the same code doesn't have much impact, and it's also time consuming\n");
            repeatIsBad();
        }
    }
}
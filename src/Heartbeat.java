import java.io.IOException;

public class Heartbeat {
    public static void main(String[] args){
        try{
            while(true){
                Thread.sleep(1000);
                System.out.println("1 more second elapsed");
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}


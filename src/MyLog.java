import java.io.IOException;
import java.util.logging.*;

public class MyLog {
    public static void logmes(String message){
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        try{
            fh = new FileHandler("/root/Mylog.log");
            logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
            logger.info(message);
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
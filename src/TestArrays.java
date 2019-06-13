import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestArrays{
    public static void main(String[] args){
        try{
            long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-05-13 14:37:01").getTime();
            System.out.println(time);
        }catch (ParseException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

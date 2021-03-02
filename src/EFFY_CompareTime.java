import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EFFY_CompareTime {
    private SimpleDateFormat formatter;
    private int result;
    private final static String INPUT_PATERN = "dd/MM/yyyy HH:mm:ss";
    private final int inSeconds = 1000, inMinOrHour = 60;

    public EFFY_CompareTime(String format){
        this.formatter = new SimpleDateFormat(format);
    }

    public int diffTime(String time) {
        try {
            Date timeFrom = formatter.parse(time);
            timeFrom.setYear(new Date().getYear());
            timeFrom.setMonth(new Date().getMonth());
            timeFrom.setDate(new Date().getDate());
            result =Math.abs((int) (new Date().getTime() - timeFrom.getTime())/inSeconds);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
    public int diffTimeOfDate(String date){
        try {
            Date timeFrom = new SimpleDateFormat(INPUT_PATERN).parse(date);
            result = Math.abs((int) (new Date().getTime()-timeFrom.getTime())/inSeconds);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String getTimeNow(){
        return formatter.format(new Date());
    }

}

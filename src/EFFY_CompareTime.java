import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EFFY_CompareTime {
    private SimpleDateFormat formatter;
    private Date timeFrom=null;
    private final int inSeconds = 1000, inMinOrHour = 60;

    public EFFY_CompareTime(String format){
        this.formatter = new SimpleDateFormat(format);
    }

    public int diffTime(String time) {
        try {
            timeFrom = formatter.parse(time);
            timeFrom.setYear(new Date().getYear());
            timeFrom.setMonth(new Date().getMonth());
            timeFrom.setDate(new Date().getDate());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return Math.abs((int) (new Date().getTime() - timeFrom.getTime()) / inSeconds);
    }


    public int diffTimeAndDate(String date){
        try {
            timeFrom = formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return Math.abs((int) (new Date().getTime()-timeFrom.getTime())/inSeconds);
    }

    public String getTimeNow(){
        return formatter.format(new Date());
    }

}

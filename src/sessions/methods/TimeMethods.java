package sessions.methods;

public class TimeMethods {



    public static void main (String [] args) {
        TimeMethods myObject = new TimeMethods();
        myObject.convertMinutesToDaysHrsMinutes(12233);

    }
    //convert minutes to days, hrs, minutes
    //to get days from minutes -> minutes /24/60
    //to get hours from minutes -> minutes /60%24
    //to get minutes -> minutes %60

    //in if statement we put a boolean
    public void convertMinutesToDaysHrsMinutes (int minutes){
        if (isValidInput(minutes)) {
            String daysHrsMinutes = convertMinutesToDays(minutes) + " days " + convertMinutesToHours(minutes) +
                    " hours " + getTheRemainingMinutes(minutes);
            System.out.println(daysHrsMinutes);
        }else
        {
            System.out.println("Not acceptable");
        }

    }

    //convert minutes to days
    //give the days from minutes
    public  int convertMinutesToDays (int minutes) {
            return minutes / 24 / 60;

    }

    public int convertMinutesToHours(int minutes) {
        if (minutes > 0)
        return minutes / 60 % 24;
        else
            return -1;
    }

    public int getTheRemainingMinutes (int minutes) {
        if (minutes > 0)
        return minutes % 60;
        else
            return -1;
    }

    public boolean isValidInput (int minutes) {
        return minutes > 0;
    }


}

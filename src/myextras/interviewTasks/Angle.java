package myextras.interviewTasks;

public class Angle {

    //6:30
    public static void main(String[] args) {
        System.out.println(angle(6,30));

    }
//there are 12 hours on the clock so 360 / 12 hours gives 30 per hour
                    //               360 / (12*60) = 360 / 720 = 0.5
    //360/60(minutes) = 6 degree per minute;
    public static double angle(int hour, int min) {
        double total = 0;
        if((hour>= 0 && hour<=12) && (min>=0 && min <= 59)) {
            double hourMove = (hour*30) + (min*0.5); //(min*6)/12 // (hour*30) + (min*0.5)
            double Angle = min*6;
            total = Math.abs(hourMove - Angle);
        }
        return total;
    }

}

package oops;

public class SecondsAndMinutesChallenge {

    public static String getDurationString(int minutes,int seconds){
        if((minutes<0) || ((seconds<0) || (seconds >59))){
            return "Invalid Value";
        }
        int hour = minutes/60;
        int remainingMinute = minutes%60;

        String hoursString = hour + "h";
        if(hour<10){
            hoursString = "0"+hoursString;
        }
        String minutesString = remainingMinute + "m";
        if(minutes<10){
            minutesString = "0" + remainingMinute;
        }
        String secondsString = seconds + "s";
        if(seconds<10){
            secondsString = "0" + secondsString;
        }

      return  hoursString + " " + minutesString + " " + secondsString;

    }

    public static String  getDurationString(int seconds){
        if(seconds<0){
            return "Invalid Value";
        }
        int minutes = seconds/60;
        int remainingSeconds = seconds%12;
       // System.out.println("minutes " + minutes + "seconds " + remainingSeconds);
       return getDurationString(minutes,remainingSeconds);
    }

    public static void main(String[] args) {
       String info= getDurationString(124,8);
        System.out.println(info);
        System.out.println(getDurationString(1000));
    }
}

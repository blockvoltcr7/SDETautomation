package OCA.EnumsPractice;

public class DaysSwitch {



    public static void main(String[] args) {

        Days today = Days.FRIDAY;

        String response = "";

        String theDay = Days.FRIDAY.name();

        Days theDay2 = Days.valueOf(theDay);


        switch(today){

            case MONDAY:
                response = "Mondays are bad";
                break;
            case TUESDAY:
                response = "Tuesdays are better";
                break;
            case WEDNESDAY:
                response = "Wednesdays are great";
                break;
            case THURSDAY:
                response = "Thursdays are awesome";
                break;
            case FRIDAY:
                response = "Fridays are the best";
                break;
            default:
                response = "Weekends are nice";
                break;

        }

        System.out.println(response);

    }
}

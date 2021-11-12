public class Main {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
	// write your code here
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

        printYearsAndDays(561601);
        printYearsAndDays(561621);
        printYearsAndDays(561921);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            long remainderMinutes = minutes % 60 % 24 % 365;

            long yearVar = minutes/60/24/365;
            long remainderDay = (minutes/60/24)%365;
            long remainderHour = (minutes/60)%24;
            long remainderMinute = (minutes%60);



//            long hourVar = minutes/60;



            String originalMinuteString = minutes+" min";
            if (minutes < 0) {
                originalMinuteString = "0"+originalMinuteString;
            }
//
            String minuteString = remainderMinute+" m";
            if (remainderMinute < 0) {
                minuteString = "0"+minuteString;
            }

            String hourString = remainderHour+" h";
            if (remainderHour < 0) {
                hourString = "0"+hourString;
            }

            String dayString = remainderDay+" d";
            if (remainderDay < 0) {
                dayString = "0"+dayString;
            }

            String yearString = yearVar+" y";
            if (yearVar < 0) {
                yearString = "0"+yearString;
            }

            String printString = originalMinuteString+" = "+yearString+" and "+dayString+" and "+hourString+" and "+minuteString;
//            String printString = originalMinuteString+" = "+yearString+" and "+dayString;
            System.out.println(printString);
        }
    }
}

//
//    Write a method printYearsAndDays with parameter of type long named minutes.
//
//        The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
//
//        If the parameter is less than 0, print text "Invalid Value".
//
//        Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
//
//        XX represents the original value minutes.
//        YY represents the calculated years.
//        ZZ represents the calculated days.
//
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        * printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
//
//        * printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
//
//        * printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
//
//
//        TIPS:
//
//        * Be extra careful about spaces in the printed message.
//
//        * Use the remainder operator
//
//        * 1 hour = 60 minutes
//
//        * 1 day = 24 hours
//
//        * 1 year = 365 days
//
//        NOTES
//
//        * The printYearsAndDays method needs to be defined as public static like we have been doing so far in the course.
//
//        * Do not add main method to solution code.
//
//        * The solution will not be accepted if there are extra spaces

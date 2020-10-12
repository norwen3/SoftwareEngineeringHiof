public class NumberFormatter {

    public boolean isLeapYear(int year){
        boolean leapYear;
        if (year % 4 == 0){
            leapYear = true;
        } else {
            return false;
        }
        if (year % 100 == 0){
            leapYear = false;
        }
        if(year % 400 == 0){
            leapYear = true;
        }
        if (year % 4000 == 0){
            leapYear = true;
        }
        return leapYear;
    }
    public String formatNumber(int n){
        String formatted;

        if(isLeapYear(n)){
            formatted = "Skuddår";
        }
        else{
            formatted = "Ikke skuddår";
        }


        return formatted;
    }
}

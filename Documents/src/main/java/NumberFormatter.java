public class NumberFormatter {

    public String formatNumber(int n){
        String formatted = "";

        if (n % 4 == 0){
            formatted = "Skuddår";
        } else {
            formatted = "Ikke skuddår";
        }
        if (n % 100 == 0){
            formatted = "Ikke skuddår";
        }
        if(n % 400 == 0){
            formatted = "Det var skuddår alikevel";
        }
        if (n % 4000 == 0){
            formatted = "Lenge til, men skuddår";
        }

        return formatted;
    }
}

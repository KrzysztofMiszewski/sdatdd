public class StringCalculator {

    public StringCalculator() {
    }

    public int add (String imputString){
        if (imputString.equals("")){
            return 0;
        } else {
            String[] numbers = imputString.split("\\+");
            int result = 0;
            for (String s: numbers){
                int n = Integer.parseInt(s);
                result += n;
            }
            return result;
        }
    }
}

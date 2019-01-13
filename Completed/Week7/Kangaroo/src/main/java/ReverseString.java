public class ReverseString {

    public String reverseString(String str){
        String retString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            retString += str.charAt(i);
        }
        return retString;
    }
}

package CodingTest;

public class RepeatChar {
    // 주어진 문자열에서 각 문자마다 동일한 문자를 한 번 더 추가한 문자열을 반환하세요.
    public static void main(String[] args) {
        System.out.println(repeatChar("The")); // "TThhee"
        System.out.println(repeatChar("AAbb")); // "AAAAbbbb"
        System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"
    }
    static String repeatChar(String str){
        // 강사님 ver.
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char theChar = str.charAt(i);
            result += String.valueOf(theChar) + (theChar);
        }
        return result;

        // 풀이 1
        /*StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i)).append(str.charAt(i));
        }
        return sb.toString();*/

        // 풀이 2
        /*if (str.isEmpty()){
            return str;
        }
        return str.charAt(0) + "" + str.charAt(0) + repeatChar(str.substring(1));*/
    }
}

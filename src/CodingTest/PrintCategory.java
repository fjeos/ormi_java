package CodingTest;

public class PrintCategory {
    public static void main(String[] args) {
        String str = "When organizing items, always label each group with the appropriate category. " +
                "category: books, category: electronics, category: clothing, category: kitchenware,"
                + "and so on. ";
        printCategory(str);
    }

    static void printCategory(String str) {
        // 강사님 ver.
        int i = 0;
        while (true) {
            int idx = str.indexOf("category:", i);
            if (idx == -1) {
                break;
            }

            int startIdx = idx + 10;
            int endIdx = str.indexOf(',', startIdx);
            System.out.println(str.substring(startIdx, endIdx));
            i = endIdx + 1;
        }

        char i_1 = str.charAt(0), i2 = str.charAt(1);
        int index = 1;
        while (index < str.length() - 1) {
            if (i_1 == ':' && i2 == ' ') {
                index++;
                while ((str.charAt(index) > 96) && (str.charAt(index) < 123)){
                    System.out.print(str.charAt(index++));
                }
                System.out.println();
            }
            index++;
            i_1 = str.charAt(index - 1);
            i2 = str.charAt(index);
        }
        String category = "category: ";
        int index2 = str.indexOf(category);
        int length = category.length();
        while (index2 != -1){
            int i3 = index2 + length;
            char c = str.charAt(i3);
            while(c != ','){
                System.out.print(c);
                c = str.charAt(++i3);
            }
            System.out.println();
            index2 = str.indexOf(category, i3);
        }
    }
}

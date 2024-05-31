package Day2;

public class StringPractice {

    public static void main(String[] args) {
//        String result = "";
//
//        result += "Hello ";
//        result += "java";
//        result += "World";
//        System.out.println(result);
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello ");
//        sb.append("java");
//        sb.append("World");
//        System.out.println(sb);
//
//        StringBuffer sf = new StringBuffer();
//        sf.append("Hello ");
//        sf.append("java");
//        sf.append("World");
//        System.out.println(sf);

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.insert(1, "World");
        sb.insert(1, "World");
        sb.insert(1, "World");
        sb.insert(1, "World");
        System.out.println(sb);





    }
}

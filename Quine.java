public class Quine {
    public static void main(String[] args) {
        System.out.println(theString.substring(0,theString.length()-1)+'"');
        System.out.println(theString.substring(0,theString.length()-1));
        System.out.println(""+'"'+'"'+'"'+';');
        System.out.println('}');
    }
    private static String theString = """
public class Quine {
    public static void main(String[] args) {
        System.out.println(theString.substring(0,theString.length()-1)+'"');
        System.out.println(theString.substring(0,theString.length()-1));
        System.out.println(""+'"'+'"'+'"'+';');
        System.out.println('}');
    }
    private static String theString = ""
""";
}
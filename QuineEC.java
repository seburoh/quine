import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class QuineEC {
    private static String theStringOne = """
            import java.io.BufferedWriter;
            import java.io.FileWriter;
            import java.io.IOException;
            public class""";
    private static String theTitle = "QuineEC";
    private static int current;
    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length == 0) {
            current = 21;
        } else {
            try {
                current = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        }
        if (current != 0){
            theTitle += current;
            writeFile();
            Process compileMan = new ProcessBuilder("javac", theTitle+".java").inheritIO().start();
            compileMan.waitFor();
            Process runningMan = new ProcessBuilder("java", theTitle, Integer.toString(current-1)).inheritIO().start();
        }
    }
    private static void writeFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(theTitle+".java"));
        writer.write(theStringOne + " ");
        writer.write(theTitle);
        writer.write(theStringTwo.substring(0,theStringTwo.length()-1)+'"');
        writer.newLine();
        writer.write(theStringTwo.substring(0,46)+(char)92);
        writer.write(theStringTwo.substring(46,196)+(char)92);
        writer.write(theStringTwo.substring(196,theStringTwo.length()-1));
        writer.newLine();
        writer.write(""+'"'+'"'+'"'+';');
        writer.newLine();
        writer.write('}');
        writer.close();
    }
    private static String theStringTwo = """
 {
    private static String theStringOne = ""\"
            import java.io.BufferedWriter;
            import java.io.FileWriter;
            import java.io.IOException;
            public class""\";
    private static String theTitle = "QuineEC";
    private static int current;
    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length == 0) {
            current = 21;
        } else {
            try {
                current = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        }
        if (current != 0){
            theTitle += current;
            writeFile();
            Process compileMan = new ProcessBuilder("javac", theTitle+".java").inheritIO().start();
            compileMan.waitFor();
            Process runningMan = new ProcessBuilder("java", theTitle, Integer.toString(current-1)).inheritIO().start();
        }
    }
    private static void writeFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(theTitle+".java"));
        writer.write(theStringOne + " ");
        writer.write(theTitle);
        writer.write(theStringTwo.substring(0,theStringTwo.length()-1)+'"');
        writer.newLine();
        writer.write(theStringTwo.substring(0,46)+(char)92);
        writer.write(theStringTwo.substring(46,196)+(char)92);
        writer.write(theStringTwo.substring(196,theStringTwo.length()-1));
        writer.newLine();
        writer.write(""+'"'+'"'+'"'+';');
        writer.newLine();
        writer.write('}');
        writer.close();
    }
    private static String theStringTwo = ""
""";
}
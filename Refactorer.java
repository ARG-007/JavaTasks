import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Refactorer {
    public static void main(String[] args) {
        System.out.println("=".repeat(80));

        Pattern p = Pattern.compile("showDetails\\( *(\\d+), *(\".+\") *\\);(?:\\n[\\t|\\W]*)*}");

        File[] files = Path.of(".\\src\\tasks\\programs").toFile().listFiles();

        StringBuilder content;

        for (File file : files) {
            System.out.println("=".repeat(80));
            System.out.println("Refactoring: "+file.getName());
            System.out.println("-".repeat(80));
            content = new StringBuilder();
            try {
                BufferedReader bf = new BufferedReader(new FileReader(file));
                for (String line = bf.readLine(); line != null; line = bf.readLine()) {
                    content.append(line).append('\n');
                }
                bf.close();

                Matcher m = p.matcher(content);
                m.find();

                FileWriter fw = new FileWriter(file);
                content.insert(m.end() + 1,
                        String.format(
                                "\n    public int getID() {\n        return %s;\n    }\n\n    public String getDescription() {\n          return %s;\n    }\n",
                                m.group(1), m.group(2)));

                content.replace(m.start(1), m.end(2), "getID(), getDescription()");
                System.out.println(content);

                fw.write(content.toString());
                fw.flush();
                fw.close();
                System.out.println("-".repeat(80));
                System.out.println("Successfully Refactored: " + file.getName());
            } catch (Exception e) {
                System.out.println("Failed in Refactoring: " + file.getName());
                System.out.println("With Exception : " + e.getMessage());
            } finally {
                System.out.println("=".repeat(80));
            }
        }

    }
}

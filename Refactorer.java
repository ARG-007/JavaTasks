import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Refactorer {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("showDetails\\(\\w*(\\d+),\\w*\"(.+)\"\\w*\\);(?:\\n\\t+)*}");

        File[] files = Path.of(".\\src\\tasks\\programs").toFile().listFiles();

        StringBuilder content = new StringBuilder();
        try {
            
            BufferedReader bf = new BufferedReader(new FileReader(files[0]));
            for (String line = bf.readLine(); line!=null; line = bf.readLine()) {
                content.append(line).append('\n');
            }
            bf.close();


            Matcher m = p.matcher(content);
            m.find();

            FileWriter fw = new FileWriter(files[0]);
            content.insert(m.end() + 1,
                    String.format(
                            "\npublic int getID() {return %s;}\npublic String getDescription() {return \"%s\";}\n",
                            m.group(1), m.group(2)));

            fw.write(content.toString());
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println();
        }

    }
}

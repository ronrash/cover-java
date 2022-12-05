package iostreams.files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

public class FileSample {

    public static void main(String[] args) throws IOException {

        /*
        * Java file io is based on unix and everything is treated as a file.
        * */

        // create a file
        File f = new File("/Users/rohitprashar/Downloads/javares/src/main/resources/xyz.txt");
        System.out.println(f.exists());

        // this createas a new file .. same for folder
        f.createNewFile();
        f.mkdir();

        // this will create a folder and a file in the this path under subfolder
        File file1 = new File("/Users/rohitprashar/Downloads/javares/src/main/resources","somefile.txt");
        file1.createNewFile(); // creATE A FILE IN THE FLDER SPECIFIED
        final Optional<File> optionalFile = Optional.ofNullable(file1);
        optionalFile.ifPresent(optionalFile1-> Arrays.stream(optionalFile1.list()).forEachOrdered(s-> System.out.println(s)));
        String[] fileList = file1.list();

        Arrays.stream(fileList)
                .forEachOrdered(System.out::println);

    }
}

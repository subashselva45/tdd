
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.copy;

public class FileHandlingNIO {
    public static void main(String[] args)  {
        Path path = Paths.get("src","main","resources","KuttyStory.txt");
        System.out.println(path.toString());
//        System.out.println(path.toString());
//        System.out.println(path.toFile());
//        System.out.println(path.getFileName());

        try {
            List<String> lines = Files.readAllLines(path);
            lines.forEach(System.out::println);
            List<String>  list = Arrays.asList("vivek", "damin", "richa", "asmitha");
            Files.write(path,list);

            Path copypath = Paths.get("/Users/Subash/workspace/copy","story.txt");
           Files.copy(path,copypath);

        }catch (IOException e) {
            e.printStackTrace();
        }





    }
}

import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Subash\\IdeaProjects\\tdd\\src\\main\\resources\\KuttyStory.txt");
        System.out.println(file.exists());

        try {
            FileInputStream stream = new FileInputStream(file);
            int ch;
            while((ch=stream.read())!= -1){
                System.out.print(((char) ch));
            }
            stream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}

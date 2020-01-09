import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        sortByExtension(file, path);
    }

    static void sortByExtension(File file, String path) {

        File picFile = new File(file  + "\\pics");
        File vidFile = new File(file  + "\\video");
        File audiFile = new File(file  + "\\audio");
        File textFile = new File(file  + "\\text");
        File exFile = new File(file  + "\\exe");
        try {
            if (file.isFile()) {
                String fileName = file.getName();
                if (fileName.endsWith("jpg") || fileName.endsWith("png")){
                    Files.move(Paths.get(path), Paths.get(file + "\\pics"), StandardCopyOption.REPLACE_EXISTING);
                    if (!picFile.exists())
                        picFile.mkdirs();
                }
                else if (fileName.endsWith("mp4") || fileName.endsWith("avi")){
                    Files.move(Paths.get(path), Paths.get(file + "\\video"), StandardCopyOption.REPLACE_EXISTING);
                    if (!vidFile.exists())
                        vidFile.mkdirs();
                }
                else if (fileName.endsWith("mp3") || fileName.endsWith("flac")){
                    Files.move(Paths.get(path), Paths.get(file + "\\audio"), StandardCopyOption.REPLACE_EXISTING);
                    if (!audiFile.exists())
                        audiFile.mkdirs();
                }
                else if (fileName.endsWith("doc") || fileName.endsWith("word")){
                    Files.move(Paths.get(path), Paths.get(file + "\\text"), StandardCopyOption.REPLACE_EXISTING);
                    if (!textFile.exists())
                        textFile.mkdirs();
                }
                else if (fileName.endsWith("exe")){
                    Files.move(Paths.get(path), Paths.get(file + "\\exe"), StandardCopyOption.REPLACE_EXISTING);
                    if (!exFile.exists())
                        exFile.mkdirs();
                }
            } else {
                File[] packages = file.listFiles();
                for (File f : packages) {
                    sortByExtension(f, path);
                }
            }
        }catch (IOException e){}
    }
}

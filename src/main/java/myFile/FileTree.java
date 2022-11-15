package myFile;




import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

import static myFile.FileTree.listFiles;

//Выберите на компьютере любую папку, в которой содержится не менее 3-ёх документов и 3-ёх директорий.
// Вам необходимо вывести название каждого элемента в выбранной папке,
// его длину и принадлежность к директориям (метод isDurectory()).
public class FileTree {

   protected static List<ResultFile> listFiles = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:\\TestFolderOverone");
        Files.walkFileTree(path,new MyFileVisitor());
        listFiles.forEach(System.out::println);

    }
}

class MyFileVisitor extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
           listFiles.add(new ResultFile(file.toFile()));
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
       listFiles.add(new ResultFile(dir.toFile()));
        return super.preVisitDirectory(dir, attrs);
    }
}

class ResultFile  {
  private   String name;
   private long length;
   private  boolean parentDirectory;

    public ResultFile( File  file) {
       this.name = file.getName();
       this.length = file.length();
       this.parentDirectory = file.isDirectory();
    }

    @Override
    public String toString() {

       String directory = parentDirectory ? "file is directory" : "file isn't directory";
        return "ResultFile{" +
                "name='" + name + '\'' +
                ", length=" + length +" " +
                 directory + '}';
    }
}



   import java.io.File;
import java.util.ArrayList;
import java.util.List;

    public class ListOfStacks {
        List<File> fileList = new ArrayList<>();

        public List<File> getFileList() {
            return fileList;
        }

        public void setFileList(List<File> fileList) {
            this.fileList = fileList;
        }

        public ListOfStacks() {
            File folder = new File("/Users/williamhall/Desktop/JavaP");
            File[] listOfFiles = folder.listFiles();
            this.fileList = List.of(listOfFiles);
        }

        public void openFileArray(){

        }
    }


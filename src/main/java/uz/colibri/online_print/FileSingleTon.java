package uz.colibri.online_print;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Map;
final class FileSingleTon {

    private FileSingleTon fileSingleTon;
    private Map<String, MultipartFile> files;

    void addFile(String fileName,MultipartFile file){
        files.put(fileName,file);
    }
    MultipartFile getByName(String fileName){
        return files.get(fileName);
    }


    private FileSingleTon(){}

    FileSingleTon getInstance(){
        if (fileSingleTon == null){
            fileSingleTon = new FileSingleTon();
        }
        return fileSingleTon;
    }

}

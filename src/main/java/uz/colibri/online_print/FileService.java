package uz.colibri.online_print;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@RestController
@RequestMapping
public class FileService {
    private Map<String,MultipartFile> files = new HashMap<>();
    @PostMapping("uploadFile")
    public String uploadFileReturnUrl(@RequestParam MultipartFile file){
        try {
            String fileName = String.valueOf(UUID.randomUUID());
            fileName = fileName.replaceAll("-","");
            files.put(fileName,file);
            files.keySet().forEach(System.out::println);
            return fileName;
        }catch (Exception e){
            return e.getMessage();
        }
    }
}

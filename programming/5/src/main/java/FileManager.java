import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.*;
import java.util.TreeSet;

public class FileManager {
    private final String fileName;
    private final XmlMapper xmlMapper;

    public FileManager(String fileName) {
        this.fileName = fileName;
        this.xmlMapper = new XmlMapper();
        //connection module for work with LocalDateTime
        this.xmlMapper.registerModule(new JavaTimeModule());

    }

    public TreeSet<Route> read(String fileName) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream)
        ) {
            return xmlMapper.readValue(inputStreamReader, new TypeReference<TreeSet<Route>>() {});
        } catch (FileNotFoundException e) {
          System.out.println("Файл не найден. Создана пустая коллекция.");
          return new TreeSet<>();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла." + e.getMessage());
            return new TreeSet<>();
        }
    }
}
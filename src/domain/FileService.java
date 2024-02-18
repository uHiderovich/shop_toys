package domain;

import java.io.FileWriter;

public class FileService {
    private final String fileName;

    public FileService(String fileName) {
        this.fileName = fileName;

        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void save(String data) {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.write(data);
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

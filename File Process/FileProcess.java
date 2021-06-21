import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileProcess {

    public void addToZipFile(String fileName) throws FileNotFoundException, IOException {

        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);

        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            System.out.println(fileName + "File Writable!" + length);
        }
        fis.close();
    }

    public void writeToZip(String fileName) throws IOException {

        FileOutputStream fos = new FileOutputStream("test.zip");
        ZipOutputStream zos = new ZipOutputStream(fos);

        ZipEntry zipEntry = new ZipEntry(fileName);
        zos.putNextEntry(zipEntry);

        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);

        byte[] bytes = new byte[1024];
        int length;

        while ((length = fis.read(bytes)) >= 0) {
            zos.write(bytes, 0, length);
        }
        System.out.println("Writing '" + fileName + "' to zip file");

        zos.closeEntry();

        fos.close();
        zos.closeEntry();
        fis.close();
    }
}

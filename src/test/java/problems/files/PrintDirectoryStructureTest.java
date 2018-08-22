package problems.files;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by mtumilowicz on 2018-08-22.
 */
public class PrintDirectoryStructureTest {
    
    @BeforeClass
    public static void createDirectory() throws IOException {
        Files.createDirectories(Paths.get("/test_root"));
        Files.createFile(Paths.get("/test_root/file_test_root"));
        Files.createDirectories(Paths.get("/test_root/test_1"));
        Files.createFile(Paths.get("/test_root/test_1/file1_test_1"));
        Files.createFile(Paths.get("/test_root/test_1/file2_test_1"));
        Files.createDirectories(Paths.get("/test_root/test_2"));
        Files.createFile(Paths.get("/test_root/test_1/file_test_2"));
    }
    
    @AfterClass
    public static void deleteDirectory() throws IOException {
        FileUtils.deleteDirectory(new File("/test_root"));
    }

    @Test
    public void print() {
        PrintDirectoryStructure.print("/test_root");
    }
}
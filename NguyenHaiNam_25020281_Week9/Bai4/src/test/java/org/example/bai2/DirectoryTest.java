package org.example.bai2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

public class DirectoryTest {
    // @Test
    // public void testPath_Hardcoded_Fail() {
    //     String folder = "reports";
    //     String fileName = "daily_summary.txt";

    //     String expectedPath = folder + "\\" + fileName;

    //     File reportFile = new File(folder, fileName);
    //     String actualPath = reportFile.getPath();

    //     assertEquals(expectedPath, actualPath, "Đường dẫn file không khớp!");
    // }

    @Test
    public void testPath_NIOPath_Success() {
        String folder = "reports";
        String fileName = "daily_summary.txt";

        Path expectedPath = Paths.get(folder, fileName);

        File reportFile = new File(folder, fileName);

        assertEquals(expectedPath.toString(), reportFile.getPath());
    }
}

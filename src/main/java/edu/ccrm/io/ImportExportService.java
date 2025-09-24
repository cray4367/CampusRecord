package edu.ccrm.io;

import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * Very small NIO.2 demo: list a CSV file lines using Stream API.
 */
public class ImportExportService {
    public static Stream<String> readLines(Path p) throws IOException {
        return Files.lines(p);
    }

    public static void exportText(Path p, String text) throws IOException {
        Files.createDirectories(p.getParent());
        Files.writeString(p, text, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}

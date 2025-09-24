package edu.ccrm.util;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Recursive utilities - compute total size of folder recursively.
 */
public class FileUtilsRecursive {
    public static long sizeOf(Path start) throws IOException {
        final long[] total = {0};
        if (!Files.exists(start)) return 0L;
        Files.walkFileTree(start, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                total[0] += attrs.size();
                return FileVisitResult.CONTINUE;
            }
        });
        return total[0];
    }
}

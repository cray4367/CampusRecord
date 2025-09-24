package edu.ccrm.config;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Singleton AppConfig example demonstrating the Singleton design pattern.
 */
public final class AppConfig {
    private static final AppConfig INSTANCE = new AppConfig();
    private final Path dataFolder;

    private AppConfig() {
        // default data folder (can be overridden in future via env/args)
        this.dataFolder = Paths.get("data");
    }

    public static AppConfig getInstance() {
        return INSTANCE;
    }

    public Path getDataFolder() {
        return dataFolder;
    }
}

package edu.ccrm.cli;

import edu.ccrm.config.AppConfig;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Minimal CLI entry point for CCRM.
 * Demonstrates: package layout, main class, switch menu, and Invocation of AppConfig (Singleton).
 */
public class MainMenu {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        System.out.println("=== Campus Course & Records Manager (CCRM) ===");
        System.out.println("Config data folder: " + config.getDataFolder());
        System.out.println("Started at: " + LocalDateTime.now());
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\nMain Menu:");
            System.out.println("1) Manage Students");
            System.out.println("2) Manage Courses");
            System.out.println("3) Enrollment & Grades");
            System.out.println("4) Import/Export Data");
            System.out.println("5) Backup Data");
            System.out.println("6) Show Backup Size (recursive)");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    System.out.println("Student management selected (stub).");
                    break;
                case "2":
                    System.out.println("Course management selected (stub).");
                    break;
                case "3":
                    System.out.println("Enrollment & Grades selected (stub).");
                    break;
                case "4":
                    System.out.println("Import/Export selected (stub).");
                    break;
                case "5":
                    System.out.println("Backup selected (stub).");
                    break;
                case "6":
                    System.out.println("Backup size utility (stub).");
                    break;
                case "0":
                    System.out.println("Exiting. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}

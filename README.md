# Campus Course & Records Manager (CCRM)

## Project Overview
Short description: Console-based Java SE application to manage students, courses, enrollments, grades and backups.

## How to run
- Build : ./build.sh
- Run: ./run.sh
or we can use


if you want to run using java commands
javac -d out -sourcepath src/main/java $(find src/main/java -name "*.java")

now
java -cp out edu.ccrm.cli.MainMenu
i have made bash scripts in order to ease the process of running the program for non coders


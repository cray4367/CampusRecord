
Import sample data
Look at resources/test-data for sample CSVs to implement your CSV import parsers.

Export & Backup
- Exports created into ./exports
- Backups created into ./backups/<timestamp>


if you want to run using java commands
javac -d out -sourcepath src/main/java $(find src/main/java -name "*.java")

now
java -cp out edu.ccrm.cli.MainMenu

or for ease we can use the bash scripts

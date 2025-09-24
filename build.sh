#!/usr/bin/env bash
set -euo pipefail
rm -rf out
mkdir -p out
echo "Compiling Java sources..."
find src/main/java -name "*.java" > sources.txt
javac -d out -sourcepath src/main/java $(cat sources.txt)
echo "Compiled classes to out/"
rm -f sources.txt

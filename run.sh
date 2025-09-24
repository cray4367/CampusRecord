#!/usr/bin/env bash
set -euo pipefail
# Ensure compiled classes exist
if [ ! -d out ]; then
  echo "No compiled classes found. Running ./build.sh first..."
  ./build.sh
fi
echo "Running MainMenu..."
java -cp out edu.ccrm.cli.MainMenu

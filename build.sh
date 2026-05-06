#!/bin/bash
set -e
cd "$(dirname "$0")"

echo "=== Building Hadur Robot ==="

if ! command -v javac &> /dev/null; then
    echo "ERROR: javac not found. Install JDK 8+."
    exit 1
fi

rm -rf bin/hadur117
javac -sourcepath src -cp "lib/robocode.jar" -d bin src/hadur117/Hadur.java
cp src/hadur117/Hadur.properties bin/hadur117/

CLASS_COUNT=$(find bin/hadur117 -name "*.class" | wc -l)
echo "Compiled $CLASS_COUNT classes -> bin/hadur117/"

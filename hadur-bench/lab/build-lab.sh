#!/usr/bin/env bash
# Compile the movement lab's six reference shooters and pack each into opponents/lab.<Name>_1.0.jar
# (docs/bench/move-lab.md), loadable as an opponent the way the other jars are (lab-panel.txt).
#
#   ./lab/build-lab.sh        # from hadur-bench, or from anywhere
#
# Compiles lab/lab/*.java against robocode.api from ~/.m2 (the engine's own API jar, as probe/README.md
# does for StillProbe) at --release 11, into a temporary directory, then writes one jar per shooter
# holding LabBase, the shooter's class and its .properties. Needs a JDK (javac, jar).
set -euo pipefail

here="$(cd "$(dirname "$0")" && pwd)"
bench="$(dirname "$here")"
api="${ROBOCODE_API:-$HOME/.m2/repository/net/sf/robocode/robocode.api/1.11.1/robocode.api-1.11.1.jar}"
[[ -f "$api" ]] || { echo "robocode.api not found at $api (set ROBOCODE_API, or run mvn once)" >&2; exit 1; }
shooters=(HeadOn Linear Circular GFHist Knn PatternMatch)
version=1.0

tmp="$(mktemp -d)"
trap 'rm -rf "$tmp"' EXIT
javac --release 11 -Xlint:all -cp "$api" -d "$tmp" "$here"/lab/*.java
mkdir -p "$bench/opponents"
for s in "${shooters[@]}"; do
    cp "$here/lab/$s.properties" "$tmp/lab/"
    grep -qx "robot.version=$version" "$here/lab/$s.properties" || { echo "$s.properties is not version $version" >&2; exit 1; }
    jar="$bench/opponents/lab.${s}_${version}.jar"
    rm -f "$jar"
    (cd "$tmp" && jar cf "$jar" lab/LabBase*.class "lab/$s.class" "lab/$s.properties")
    echo "built opponents/lab.${s}_${version}.jar"
done

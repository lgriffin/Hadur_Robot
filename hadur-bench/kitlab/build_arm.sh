#!/usr/bin/env bash
# Build an arm of JayLexi or Eveimear from a source file: build_arm.sh SRC.java pkg.Class VERSION
# Writes kitlab/jars/<pkg.Class>_<VERSION>.jar and prints its codesize (docs/kitlab.md).
set -euo pipefail
cd "$(dirname "$0")/.."
src=$1 fq=$2 ver=$3
pkg=${fq%.*} cls=${fq##*.}
api=$(find "$HOME/.m2/repository/net/sf/robocode/robocode-api" -name 'robocode-api-*.jar' | head -1)
out=work/arm-build/$fq-$ver; rm -rf "$out"; mkdir -p "$out/${pkg//.//}"
cp "$src" "$out/${pkg//.//}/$cls.java"
javac --release 8 -nowarn -cp "$api" -d "$out" "$out/${pkg//.//}/$cls.java"
printf 'robot.classname=%s\nrobot.version=%s\nrobot.author.name=lgriffin\nrobocode.version=1.9.3.0\n' "$fq" "$ver" > "$out/${pkg//.//}/$cls.properties"
jar="kitlab/jars/${fq}_$ver.jar"; mkdir -p kitlab/jars
(cd "$out" && jar cf "$OLDPWD/$jar" ${pkg%%.*})
python3 tools/kitlab_codesize.py "$jar" | tail -1

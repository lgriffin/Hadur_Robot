#!/usr/bin/env bash
# Builds Saor's screen arms (saor-arms/arms.txt) into work/saor-arms/: one robot jar and one bench
# args file per arm and field. Run from hadur-bench after `mvn install` of saor (the robocode API
# jar comes from the local Maven repository).
#   bash tools/saor_arms.sh census SEEDS SEED_BASE      args for micromelee-census.txt
#   bash tools/saor_arms.sh gate9 SEEDS SEED_BASE       args for saor-gate9.txt
# Every arm is javac-built (no ProGuard): the screen measures play, SaorJarIT measures bytes.
set -euo pipefail
field="$1"; seeds="$2"; base="$3"
src=../saor/src/main/java/hadur117/micro/Saor.java
api=$(find "$HOME/.m2/repository/net/sf/robocode/robocode-api" -name 'robocode-api-*.jar' | head -1)
[ -n "$api" ] || { echo "saor_arms: robocode-api jar not in ~/.m2; run mvn install first" >&2; exit 2; }
out=work/saor-arms
mkdir -p "$out"
case "$field" in
    census) set_opt=(--suite micromelee-census.txt) ;;
    gate9) set_opt=(--set saor-gate9.txt --melee true --field 1000x1000) ;;
    *) echo "saor_arms: field is census or gate9" >&2; exit 2 ;;
esac
grep -v '^#' saor-arms/arms.txt | while IFS='|' read -r name what expr; do
    name=$(echo "$name" | tr -d ' '); expr=$(echo "$expr" | sed 's/^ *//; s/ *$//')
    [ -n "$name" ] || continue
    cls="Saor$name"; dir="$out/build/$cls"
    rm -rf "$dir"; mkdir -p "$dir/hadur117/micro"
    sed -e "s/class Saor /class $cls /" ${expr:+-e "$expr"} "$src" > "$dir/$cls.java"
    if [ -n "$expr" ] && cmp -s <(sed "s/class Saor /class $cls /" "$src") "$dir/$cls.java"; then
        echo "saor_arms: arm $name's sed changed nothing" >&2; exit 3
    fi
    javac --release 8 -nowarn -cp "$api" -d "$dir" "$dir/$cls.java"
    printf 'robot.classname=hadur117.micro.%s\nrobot.version=0.1\nrobot.author.name=lgriffin\nrobocode.version=1.9.3.0\n' "$cls" \
        > "$dir/hadur117/micro/$cls.properties"
    jar="$out/hadur117.micro.${cls}_0.1.jar"
    (cd "$dir" && jar cf "../../$(basename "$jar")" hadur117)
    args="$out/$field-$name.args"
    {
        printf '%s\n' "${set_opt[@]}" --seeds "$seeds" --seed-base "$base" --rounds 35 --parallel 12 \
            --child-heap 2G --cpu-constant 1488498 --robot-jar "$jar" --robot "hadur117.micro.$cls 0.1" \
            --out "$out/$field-$name" --report "../docs/bench/local/saor-arms-$field-$name.md"
    } > "$args"
    echo "arm $name: $jar, $args"
done

#!/usr/bin/env bash
# Builds Saor's screen arms (saor-arms/arms.txt) into work/saor-arms/: one robot jar and one bench
# args file per arm and field. Run from hadur-bench after `mvn install` of saor (the robocode API
# jar comes from the local Maven repository).
#   bash tools/saor_arms.sh census SEEDS SEED_BASE      args for micromelee-census.txt
#   bash tools/saor_arms.sh gate9 SEEDS SEED_BASE       args for saor-gate9.txt
#   bash tools/saor_arms.sh live SEEDS SEED_BASE        args for the live-shaped census (saor_live.py)
# A fourth argument, comma-separated arm names, builds only those arms. SAOR_RUN (default arms)
# names the run: its jars, args and battles go to work/saor-$SAOR_RUN and its reports to
# ../docs/bench/local/saor-$SAOR_RUN-<field>-<arm>.md, so a new card never resumes an old card's
# battles or overwrites its reports.
# Every arm is javac-built (no ProGuard): the screen measures play, SaorJarIT measures bytes. An
# arm whose third column is `@robot name` seats that robot (its jar from opponents/) instead.
set -euo pipefail
field="$1"; seeds="$2"; base="$3"; only="${4:-}"
src=../saor/src/main/java/hadur117/micro/Saor.java
api=$(find "$HOME/.m2/repository/net/sf/robocode/robocode-api" -name 'robocode-api-*.jar' | head -1)
[ -n "$api" ] || { echo "saor_arms: robocode-api jar not in ~/.m2; run mvn install first" >&2; exit 2; }
run="${SAOR_RUN:-arms}"
out=work/saor-$run
mkdir -p "$out"
case "$field" in
    census) set_opt=(--suite micromelee-census.txt) ;;
    gate9) set_opt=(--set saor-gate9.txt --melee true --field 1000x1000) ;;
    live) set_opt=() ;;
    *) echo "saor_arms: field is census, gate9 or live" >&2; exit 2 ;;
esac
grep -v '^#' saor-arms/arms.txt | while IFS='|' read -r name what expr; do
    name=$(echo "$name" | tr -d ' '); expr=$(echo "$expr" | sed 's/^ *//; s/ *$//')
    [ -n "$name" ] || continue
    if [ -n "$only" ] && ! echo ",$only," | grep -q ",$name,"; then continue; fi
    seat=saor
    if [ "$field" = live ]; then
        [ "${expr#@}" != "$expr" ] && seat="${expr#@}"
        suite=$(python3 tools/saor_live.py --seat "$seat" --out "$out/live" | sed -n 's/^.*: \(.*suite.txt\) (.*$/\1/p')
        set_opt=(--suite "$suite")
    fi
    if [ "${expr#@}" != "$expr" ]; then
        # A seated robot is in the census fields itself; only the live census takes it out.
        [ "$field" = live ] || { echo "saor_arms: seat $name runs on the live census only" >&2; exit 2; }
        robot="${expr#@}"; jar="opponents/$(echo "$robot" | tr ' ' _).jar"
        [ -f "$jar" ] || { echo "saor_arms: seat $name needs $jar; run ./fetch-opponents.sh" >&2; exit 2; }
    else
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
    robot="hadur117.micro.$cls 0.1"
    fi
    args="$out/$field-$name.args"
    {
        printf '%s\n' "${set_opt[@]}" --seeds "$seeds" --seed-base "$base" --rounds 35 --parallel 12 \
            --child-heap 2G --cpu-constant 1488498 --robot-jar "$jar" --robot "$robot" \
            --out "$out/$field-$name" --report "../docs/bench/local/saor-$run-$field-$name.md"
    } > "$args"
    echo "arm $name: $jar, $args"
done

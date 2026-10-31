#!/usr/bin/env bash
# Builds Sanaro's arms (sanaro-arms/arms.txt) into work/sanaro-$SANARO_RUN/: one robot jar and one
# bench args file per arm and field (docs/sanaro.md, "Bench"). Run from hadur-bench after
# `mvn install` of sanaro (the robocode API jar comes from the local Maven repository).
#   bash tools/sanaro_arms.sh census SEEDS SEED_BASE [ARMS]   the NanoMelee census (sanaro_fields.py):
#                                                            ten nanos, both leaders in every battle
#   bash tools/sanaro_arms.sh duel SEEDS SEED_BASE [ARMS]     one on one with each leader (SANARO-12)
#   bash tools/sanaro_arms.sh live SEEDS SEED_BASE [ARMS]     the live-shaped census (saor_live.py over
#                                                            the whole MeleeRumble list, NanoMelee counted)
# ARMS, comma-separated, builds only those arms. SANARO_RUN (default arms) names the run: its jars,
# args and battles go to work/sanaro-$SANARO_RUN and its reports to
# ../docs/bench/local/sanaro-$SANARO_RUN-<field>-<arm>.md. SANARO_PARALLEL (default 12) is the
# battles in flight. An arm's fourth field, when there is one, is sanaro/table.py's options: the arm
# plays that power table (no bytes; the table is a string constant). An arm `NAME | what | @robot name` seats that robot (live census only; in the
# NanoMelee census the leaders are in every field already).
set -euo pipefail
field="$1"; seeds="$2"; base="$3"; only="${4:-}"
src=../sanaro/src/main/java/hadur117/nano/Sanaro.java
api=$(find "$HOME/.m2/repository/net/sf/robocode/robocode-api" -name 'robocode-api-*.jar' | head -1)
[ -n "$api" ] || { echo "sanaro_arms: robocode-api jar not in ~/.m2; run mvn install first" >&2; exit 2; }
run="${SANARO_RUN:-arms}"
out=work/sanaro-$run
release=$(sed -n 's:.*<sanaro.release>\([0-9.]*\)</sanaro.release>.*:\1:p' ../sanaro/pom.xml | head -1)
own="hadur117.nano.Sanaro $release"
mkdir -p "$out"
case "$field" in
    census) set_opt=(--suite nanomelee-census.txt) ;;
    duel) set_opt=(--suite nanomelee-duel.txt) ;;
    live) set_opt=() ;;
    *) echo "sanaro_arms: field is census, duel or live" >&2; exit 2 ;;
esac
grep -v '^#' sanaro-arms/arms.txt | while IFS='|' read -r name what expr table; do
    name=$(echo "$name" | tr -d ' '); expr=$(echo "$expr" | sed 's/^ *//; s/ *$//')
    table=$(echo "$table" | sed 's/^ *//; s/ *$//')
    [ -n "$name" ] || continue
    if [ -n "$only" ] && ! echo ",$only," | grep -q ",$name,"; then continue; fi
    if [ "${expr#@}" != "$expr" ]; then
        if [ "$field" != live ]; then echo "arm $name: a seat, live census only; skipped on $field"; continue; fi
        robot="${expr#@}"; jar="opponents/$(echo "$robot" | tr ' ' _).jar"
        [ -f "$jar" ] || { echo "sanaro_arms: seat $name needs $jar; run ./fetch-opponents.sh" >&2; exit 2; }
        seat="$robot"
    else
        cls="Sanaro$name"; dir="$out/build/$cls"
        rm -rf "$dir"; mkdir -p "$dir/hadur117/nano"
        sed -e "s/class Sanaro /class $cls /" ${expr:+-e "$expr"} "$src" > "$dir/$cls.java"
        # shellcheck disable=SC2086
        if [ "${table#distill }" != "$table" ]; then
            # A distilled table (BENCH-156): `distill <shots.csv globs and distill.py power options>`.
            python3 tools/distill.py power ${table#distill } --src "$dir/$cls.java"
        elif [ -n "$table" ]; then
            python3 ../sanaro/table.py $table --src "$dir/$cls.java" > /dev/null
        fi
        if [ -n "$expr$table" ] && cmp -s <(sed "s/class Sanaro /class $cls /" "$src") "$dir/$cls.java"; then
            echo "sanaro_arms: arm $name changed nothing" >&2; exit 3
        fi
        javac --release 8 -nowarn -cp "$api" -d "$dir" "$dir/$cls.java"
        printf 'robot.classname=hadur117.nano.%s\nrobot.version=%s\nrobot.author.name=lgriffin\nrobocode.version=1.9.3.0\n' \
            "$cls" "$release" > "$dir/hadur117/nano/$cls.properties"
        jar="$out/hadur117.nano.${cls}_$release.jar"
        (cd "$dir" && jar cf "../../$(basename "$jar")" hadur117)
        robot="hadur117.nano.$cls $release"
        seat=sanaro
    fi
    if [ "$field" = live ]; then
        suite=$(python3 tools/saor_live.py --counted nanomelee-field.txt --own "$own" --own-key sanaro \
            --resident "$own | nanomelee-sanaro | hadur117.nano.Sanaro_$release.jar" --seat "$seat" \
            --out "$out/live" | sed -n 's/^.*: \(.*suite.txt\) (.*$/\1/p')
        set_opt=(--suite "$suite")
    fi
    args="$out/$field-$name.args"
    printf '%s\n' "${set_opt[@]}" --seeds "$seeds" --seed-base "$base" --rounds 35 --parallel "${SANARO_PARALLEL:-12}" \
        --child-heap 1G --cpu-constant 1488498 --robot-jar "$jar" --robot "$robot" \
        --out "$out/$field-$name" --report "../docs/bench/local/sanaro-$run-$field-$name.md" > "$args"
    echo "arm $name: $jar, $args"
done

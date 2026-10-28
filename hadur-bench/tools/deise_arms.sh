#!/usr/bin/env bash
# Builds Deise's arms (deise-arms/arms.txt) into work/deise-$DEISE_RUN/: one robot jar and one bench
# args file per arm, on the live-shaped MiniMelee census (tools/saor_live.py with Deise's options,
# docs/deise.md). Run from hadur-bench after `mvn install` of deise (the robocode API jar comes from
# the local Maven repository, and the card's prep copies Deise's jar into opponents/).
#   bash tools/deise_arms.sh live SEEDS SEED_BASE [ARMS]
# An arm line is `NAME | what | FILE | sed`: FILE (DeiseLab.java, Gun.java or Move.java) takes the
# sed, empty for the control; more `| FILE | sed` pairs change more files (stage E1's stacks). An arm `NAME | what | @robot name` seats that robot (its jar from
# opponents/) instead. An arm `NAME | what | =deise-arms/e2/FIT3F.java` builds that one flat class
# (stage E2's fitted candidates, benched as they would ship). Other arms are built from the bench
# adapter DeiseLab over the core, which the shipped one-class Deise is held to (DEISE-16). Each build is javac-only, with its class renamed
# Deise<NAME> and its core package hadur117.mini.c<name>, so no two arms share a class; the
# shipped Deise is the field's resident, from opponents/.
set -euo pipefail
field="$1"; seeds="$2"; base="$3"; only="${4:-}"
[ "$field" = live ] || { echo "deise_arms: the field is live" >&2; exit 2; }
src=../deise/src/main/java
api=$(find "$HOME/.m2/repository/net/sf/robocode/robocode-api" -name 'robocode-api-*.jar' | head -1)
[ -n "$api" ] || { echo "deise_arms: robocode-api jar not in ~/.m2; run mvn install first" >&2; exit 2; }
run="${DEISE_RUN:-arms}"
out=work/deise-$run
release=$(sed -n 's:.*<deise.release>\([0-9.]*\)</deise.release>.*:\1:p' ../deise/pom.xml | head -1)
own="hadur117.mini.Deise $release"
resident="$own | minimelee-deise | hadur117.mini.Deise_$release.jar"
mkdir -p "$out"
grep -v '^#' deise-arms/arms.txt | while IFS='|' read -r name what rest; do
    name=$(echo "$name" | tr -d ' ')
    [ -n "$name" ] || continue
    # FILE | sed pairs: files[p] takes exprs[p].
    IFS='|' read -r -a parts <<< "${rest:-}"
    files=(); exprs=()
    for ((p = 0; p < ${#parts[@]}; p += 2)); do
        files+=("$(echo "${parts[p]}" | sed 's/^ *//; s/ *$//')")
        exprs+=("$(echo "${parts[p + 1]:-}" | sed 's/^ *//; s/ *$//')")
    done
    file="${files[0]:-}"
    if [ -n "$only" ] && ! echo ",$only," | grep -q ",$name,"; then continue; fi
    seat=deise
    [ "${file#@}" != "$file" ] && seat="${file#@}"
    flat=""
    [ "${file#=}" != "$file" ] && flat="${file#=}"
    if [ -n "$flat" ] && { [ ${#files[@]} -gt 1 ] || [ -n "${exprs[0]}" ]; }; then
        echo "deise_arms: arm $name: a flat class (=FILE) takes no sed pairs" >&2; exit 3
    fi
    suite=$(python3 tools/saor_live.py --counted minimelee-field.txt --own "$own" --own-key deise \
        --resident "$resident" --seat "$seat" --out "$out/live" | sed -n 's/^.*: \(.*suite.txt\) (.*$/\1/p')
    if [ "$seat" != deise ]; then
        robot="$seat"; jar="opponents/$(echo "$robot" | tr ' ' _).jar"
        [ -f "$jar" ] || { echo "deise_arms: seat $name needs $jar; run ./fetch-opponents.sh" >&2; exit 2; }
    else
        lname=$(echo "$name" | tr 'A-Z' 'a-z'); cls="Deise$name"; dir="$out/build/$cls"
        rm -rf "$dir"; mkdir -p "$dir/src/hadur117/mini/c$lname" "$dir/classes/hadur117/mini"
        if [ -n "$flat" ]; then
            [ -f "$flat" ] || { echo "deise_arms: arm $name's class $flat is missing" >&2; exit 2; }
            sed -e "s/public class Deise /public class $cls /" "$flat" > "$dir/src/hadur117/mini/$cls.java"
            grep -q "public class $cls " "$dir/src/hadur117/mini/$cls.java" \
                || { echo "deise_arms: $flat has no 'public class Deise '" >&2; exit 3; }
        fi
        for f in "$src"/hadur117/mini/DeiseLab.java "$src"/hadur117/mini/core/*.java; do
            [ -n "$flat" ] && break
            base_name=$(basename "$f"); to="$dir/src/hadur117/mini/c$lname/$base_name"
            [ "$base_name" = DeiseLab.java ] && to="$dir/src/hadur117/mini/$cls.java"
            sed -e "s/hadur117\\.mini\\.core/hadur117.mini.c$lname/g" -e "s/class DeiseLab /class $cls /" "$f" > "$to"
            for ((p = 0; p < ${#files[@]}; p++)); do
                if [ -n "${exprs[p]}" ] && [ "$base_name" = "${files[p]}" ]; then
                    cp "$to" "$to.orig"; sed -i -e "${exprs[p]}" "$to"
                    cmp -s "$to" "$to.orig" && { echo "deise_arms: arm $name's sed changed nothing in ${files[p]}" >&2; exit 3; }
                    rm "$to.orig"
                fi
            done
        done
        javac --release 8 -nowarn -cp "$api" -d "$dir/classes" $(find "$dir/src" -name '*.java')
        printf 'robot.classname=hadur117.mini.%s\nrobot.version=%s\nrobot.author.name=lgriffin\nrobocode.version=1.9.3.0\n' \
            "$cls" "$release" > "$dir/classes/hadur117/mini/$cls.properties"
        jar="$out/hadur117.mini.${cls}_$release.jar"
        (cd "$dir/classes" && jar cf "../../../$(basename "$jar")" hadur117)
        robot="hadur117.mini.$cls $release"
    fi
    args="$out/$field-$name.args"
    printf '%s\n' --suite "$suite" --seeds "$seeds" --seed-base "$base" --rounds 35 --parallel 12 \
        --child-heap 2G --cpu-constant 1488498 --robot-jar "$jar" --robot "$robot" \
        --out "$out/$field-$name" --report "../docs/bench/local/deise-$run-$field-$name.md" > "$args"
    echo "arm $name: $jar, $args"
done

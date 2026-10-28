#!/usr/bin/env bash
# Builds TwinSaor's arms (twin-arms/arms.txt) into work/twin-$TWIN_RUN/: one team jar and one bench
# args file per arm, for the Twin Duel field (twinduel-field.txt) or one set. Run from hadur-bench
# after `mvn install` of twinsaor (the robocode API jar comes from the local Maven repository).
#   bash tools/twin_arms.sh SET SEEDS SEED_BASE [ARMS]
# SET is a team set file (twinduel-field.txt, twinduel-lunar.txt); ARMS, comma-separated, builds only
# those. TWIN_RUN (default arms) names the run, so a new card never resumes an old card's battles.
# Each arm is the team hadur117.twin.TwinSaor at version <release><ARM>: the classes keep their names, and
# the engine installs each version on its own. Twin Duel settings: 800x800, 35 rounds a battle.
set -euo pipefail
set_file="$1"; seeds="$2"; base="$3"; only="${4:-}"
# TWIN_SRC builds the arms from another source tree (an older release's, for a gate's control).
src="${TWIN_SRC:-../twinsaor/src/main}"
api=$(find "$HOME/.m2/repository/net/sf/robocode/robocode-api" -name 'robocode-api-*.jar' | head -1)
[ -n "$api" ] || { echo "twin_arms: robocode-api jar not in ~/.m2; run mvn install first" >&2; exit 2; }
run="${TWIN_RUN:-arms}"
# Arms take the release in twinsaor/pom.xml as their version prefix: 0.1C under 0.1, 0.2G under 0.2.
# TWIN_RELEASE overrides it, for arms built from TWIN_SRC.
release="${TWIN_RELEASE:-$(sed -n 's#.*<twinsaor.release>\([0-9.]*\)</twinsaor.release>.*#\1#p' ../twinsaor/pom.xml | head -1)}"
out=work/twin-$run
label=$(basename "$set_file" .txt)
mkdir -p "$out"
grep -v '^#' twin-arms/arms.txt | while IFS='|' read -r name what expr; do
    name=$(echo "$name" | tr -d ' '); expr=$(echo "$expr" | sed 's/^ *//; s/ *$//')
    [ -n "$name" ] || continue
    if [ -n "$only" ] && ! echo ",$only," | grep -q ",$name,"; then continue; fi
    version="$release$name"
    dir="$out/build/$name"
    rm -rf "$dir"; mkdir -p "$dir/src" "$dir/classes/hadur117/twin"
    cp -r "$src/java/hadur117" "$dir/src/"
    if [ -n "$expr" ]; then
        before=$(cat "$dir"/src/hadur117/twin/*.java "$dir"/src/hadur117/twin/core/*.java | md5sum)
        sed -i -e "$expr" "$dir"/src/hadur117/twin/*.java "$dir"/src/hadur117/twin/core/*.java
        after=$(cat "$dir"/src/hadur117/twin/*.java "$dir"/src/hadur117/twin/core/*.java | md5sum)
        [ "$before" != "$after" ] || { echo "twin_arms: arm $name's sed changed nothing" >&2; exit 3; }
    fi
    javac --release 8 -nowarn -cp "$api" -d "$dir/classes" $(find "$dir/src" -name '*.java')
    for f in SaorTwin.properties TwinSaor.team; do
        sed "s/\${twinsaor.release}/$version/" "$src/resources/hadur117/twin/$f" > "$dir/classes/hadur117/twin/$f"
    done
    jar="$out/hadur117.twin.TwinSaor_$version.jar"
    (cd "$dir/classes" && jar cf "../../../$(basename "$jar")" hadur117)
    args="$out/$label-$name.args"
    printf '%s\n' --team true --set "$set_file" --field 800x800 --rounds 35 --seeds "$seeds" --seed-base "$base" \
        --parallel auto --robot-jar "$jar" --robot "hadur117.twin.TwinSaor $version" --member hadur117.twin.SaorTwin \
        --out "$out/$label-$name" --report "../docs/bench/local/twin-$run-$label-$name.md" > "$args"
    echo "arm $name: $jar, $args"
done

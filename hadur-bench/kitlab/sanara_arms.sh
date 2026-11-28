#!/usr/bin/env bash
# Build Sanara's step 2 arms from kitlab/sanara-arms.txt (docs/sanara.md):
#   kitlab/sanara_arms.sh [NAME...]   all arms, or only the named ones
# Each arm is kitlab/arms/Sanara-0.java with its sed applied, built by build_arm.sh as
# kitlab/jars/hadur117.nano.Sanara_<NAME>.jar; an arm whose sed changes nothing stops the script.
set -euo pipefail
cd "$(dirname "$0")/.."
want=" $* "
grep -v '^#' kitlab/sanara-arms.txt | while IFS='|' read -r name what sedx; do
    name=$(echo "$name" | xargs); sedx=$(echo "$sedx" | sed 's/^ *//;s/ *$//')
    [ -n "$name" ] || continue
    [ $# -eq 0 ] || [[ "$want" == *" $name "* ]] || continue
    src=work/arm-build/Sanara-$name.java; mkdir -p work/arm-build
    if [ -n "$sedx" ]; then
        sed "$sedx" kitlab/arms/Sanara-0.java > "$src"
        if cmp -s "$src" kitlab/arms/Sanara-0.java; then echo "arm $name: sed changed nothing" >&2; exit 1; fi
    else
        cp kitlab/arms/Sanara-0.java "$src"
    fi
    printf '%-6s ' "$name"; bash kitlab/build_arm.sh "$src" hadur117.nano.Sanara "$name" 2>&1 | grep -v '^Picked'
done

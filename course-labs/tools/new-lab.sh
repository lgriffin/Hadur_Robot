#!/usr/bin/env bash
# Copy lab-FROM to lab-TO as the starting point for a new lab, renumbering artifactIds.
# Usage: course-labs/tools/new-lab.sh 04 05
set -euo pipefail
here="$(cd "$(dirname "$0")/.." && pwd)"
from="$1"; to="$2"
src="$here/lab-$from"; dst="$here/lab-$to"
[ -d "$src" ] || { echo "no $src" >&2; exit 1; }
[ -e "$dst" ] && { echo "$dst exists" >&2; exit 1; }
cp -r "$src" "$dst"
find "$dst" -name target -type d -prune -exec rm -rf {} +
find "$dst" -name pom.xml -exec sed -i "s/hadurling-lab$from/hadurling-lab$to/g" {} +
echo "created $dst; update its README.md"

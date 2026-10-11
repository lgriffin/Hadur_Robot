#!/usr/bin/env bash
# Build and test every lab, then refresh each lab's start.zip in the course.
# Usage: course-labs/tools/check.sh [--no-build]
set -euo pipefail
here="$(cd "$(dirname "$0")/.." && pwd)"
course="$here/../course"
build=1; [ "${1:-}" = "--no-build" ] && build=0
fail=0
for lab in "$here"/lab-*/; do
  name="$(basename "$lab")"
  if [ "$build" = 1 ]; then
    if (cd "$lab" && mvn -B -q verify > "/tmp/$name.log" 2>&1); then
      echo "ok   $name"
    else
      echo "FAIL $name (see /tmp/$name.log)"; fail=1
    fi
  fi
done
# Lab NN starts from lab-(NN-1): zip it into the lab's archives folder.
for book in "$course"/topic-*/side-labs/book-lab*/; do
  nn="$(basename "$book" | sed -E 's/^book-lab([0-9]+).*/\1/')"
  # The nearest lab below NN (the capstone, 16, starts from the last lab, 13).
  prev=""
  for ((i = 10#$nn - 1; i >= 0; i--)); do
    cand="$(printf '%02d' "$i")"
    if [ -d "$here/lab-$cand" ]; then prev="$cand"; break; fi
  done
  [ -n "$prev" ] || continue
  mkdir -p "$book/archives"
  rm -f "$book/archives/start.zip"
  (cd "$here" && zip -qr -X "$book/archives/start.zip" "lab-$prev" -x "*/target/*")
  echo "zip  $(basename "$book")/archives/start.zip <- lab-$prev"
done
exit $fail

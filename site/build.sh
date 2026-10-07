#!/usr/bin/env bash
# Builds the docs site into target/site-pages: the aggregated Javadoc under api/, plus the
# landing page, the EARS requirement map and the rendered design docs (site/build.py).
#
#   site/build.sh            build only
#   site/build.sh --publish  build, then commit the result to the gh-pages branch and push
#
# GitHub Pages serves the gh-pages branch (Settings > Pages > Deploy from a branch).
set -euo pipefail
root="$(cd "$(dirname "$0")/.." && pwd)"
out="$root/target/site-pages"
cd "$root"

# The aggregate covers the bench too, which is Java 17 (records), so the site's Javadoc runs
# at 17; the robot's own javadoc in mvn verify stays at 11.
mvn -B -q javadoc:aggregate -Dmaven.compiler.release=17
rm -rf "$out"
mkdir -p "$out"
cp -r target/reports/apidocs "$out/api"
python3 site/build.py "$root" "$out"

if [[ "${1:-}" == "--publish" ]]; then
  rev="$(git rev-parse --short HEAD)"
  tmp="$(mktemp -d)"
  trap 'git worktree remove --force "$tmp" >/dev/null 2>&1 || true' EXIT
  if git fetch -q origin gh-pages 2>/dev/null; then
    git worktree add -q -B gh-pages "$tmp" origin/gh-pages
  else
    git worktree add -q --detach "$tmp"
    git -C "$tmp" checkout -q --orphan gh-pages
  fi
  # bench/ holds the bench analysis published after each harness run (data/tools/publish_run.py);
  # this script owns everything else on the branch, so keep bench/ across the wipe.
  keep="$(mktemp -d)"
  if [[ -d "$tmp/bench" ]]; then cp -r "$tmp/bench" "$keep/bench"; fi
  git -C "$tmp" rm -rfq --ignore-unmatch . >/dev/null
  cp -r "$out/." "$tmp/"
  if [[ -d "$keep/bench" ]]; then rm -rf "$tmp/bench"; cp -r "$keep/bench" "$tmp/bench"; fi
  rm -rf "$keep"
  python3 data/tools/publish_run.py index --site-dir "$tmp" --repo "$root"
  git -C "$tmp" add -A
  if git -C "$tmp" diff --cached --quiet; then
    echo "gh-pages already matches $rev"
  else
    git -C "$tmp" commit -q -m "Docs site from $rev"
    git -C "$tmp" push -q origin gh-pages
    echo "published gh-pages from $rev"
  fi
fi

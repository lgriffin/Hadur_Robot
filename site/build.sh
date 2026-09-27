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

mvn -B -q javadoc:aggregate
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
  git -C "$tmp" rm -rq --ignore-unmatch . >/dev/null
  cp -r "$out/." "$tmp/"
  git -C "$tmp" add -A
  if git -C "$tmp" diff --cached --quiet; then
    echo "gh-pages already matches $rev"
  else
    git -C "$tmp" commit -q -m "Docs site from $rev"
    git -C "$tmp" push -q origin gh-pages
    echo "published gh-pages from $rev"
  fi
fi

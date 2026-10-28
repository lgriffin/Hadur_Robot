#!/usr/bin/env bash
# Commits a PC run's reports to their own branch, pushes it and opens a PR against master, so the
# results reach GitHub as a PR even with no one watching (Leigh, 2026-10-22). Run as a queue's last
# step from hadur-bench:  bash tools/open_results_pr.sh BRANCH "TITLE" REPORT...
# Re-running is safe: the branch is reset to the current commit plus the reports, the push is a
# force-with-lease, and an open PR for the branch is left as it is.
set -euo pipefail
branch="$1"; title="$2"; shift 2
[ "$#" -gt 0 ] || { echo "open_results_pr: no reports given" >&2; exit 2; }
for f in "$@"; do [ -s "$f" ] || { echo "open_results_pr: missing report $f" >&2; exit 2; }; done
command -v gh >/dev/null || { echo "open_results_pr: gh not installed; reports are in place, open the PR by hand" >&2; exit 3; }

git checkout -B "$branch"
# BENCH-129: the queue's progress file (every step's state, the watched steps' last read, any early stop)
# goes first (copied after the checkout, so a rerun's copy never blocks it), so the PR says how the run went before the reports say what it found.
if [ -n "${HADUR_BENCH_PROGRESS:-}" ] && [ -s "$HADUR_BENCH_PROGRESS" ]; then
    progress="../docs/bench/local/$(basename "$branch")-progress.md"
    mkdir -p "$(dirname "$progress")" && cp "$HADUR_BENCH_PROGRESS" "$progress" && set -- "$progress" "$@"
fi
git add -- "$@"
git diff --cached --quiet || git commit -q -m "$title

Reports: $*

Co-Authored-By: Claude Opus 5.5 (1M context) <noreply@anthropic.com>
Claude-Session: https://claude.ai/code/session_01JpQgqFeDDTSpd7Lx5gyHNo"
git push -q --force-with-lease -u origin "$branch"

if [ -n "$(gh pr list --head "$branch" --state open --json number --jq '.[].number')" ]; then
    echo "open_results_pr: a PR for $branch is already open"; exit 0
fi
body=$(mktemp)
{
    echo "Results of a PC queue run, opened by the queue's last step (\`tools/open_results_pr.sh\`)."
    echo "Claude follows up on this PR with the verdict against the run card."
    echo
    # GitHub caps a PR body at 65,536 characters: split about 56,000 bytes over the reports.
    per=$(( 56000 / $# ))
    for f in "$@"; do
        echo "## \`$f\`"
        echo
        head -c "$per" "$f"
        [ "$(wc -c < "$f")" -gt "$per" ] && printf '\n\n_(cut at %s bytes; the full report is in the branch)_\n' "$per"
        echo
    done
    echo
    echo "🤖 Generated with [Claude Code](https://claude.com/claude-code)"
} > "$body"
gh pr create --base master --head "$branch" --title "$title" --body-file "$body"
rm -f "$body"

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
    for f in "$@"; do
        echo "## \`$f\`"
        echo
        head -c 20000 "$f"
        echo
    done
    echo
    echo "🤖 Generated with [Claude Code](https://claude.com/claude-code)"
} > "$body"
gh pr create --base master --head "$branch" --title "$title" --body-file "$body"
rm -f "$body"

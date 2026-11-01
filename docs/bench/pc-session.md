# PC session card: how to run Hadur's bench on Leigh's PC

Read this first if you are the Claude Code session running on Leigh's Windows PC. It is what the
previous PC session learned between 2026-10-17 and 2026-11-01, written down so you start where it
stopped. The technical detail lives in `hadur-bench/README.md` and `docs/bench/watch.md`; this card
is the short version plus the house rules, which matter more than the tooling.

## 1. Where you are

- **Machine:** `lgriffin_home`, AMD Threadripper PRO 9965WX, 24 cores / 48 threads, 127 GB RAM.
  The bench auto-sizes to 12 workers for duel, team and melee, CPU constant 1488498
  (`.\queue.ps1 host` prints it). Never pin workers and never change the width on your own.
- **Checkout:** `D:\code\Hadur_Robot`. The bench runs from `D:\code\Hadur_Robot\hadur-bench`; its
  `work\` folder holds every battle (`.\queue.ps1 host` and the first `host` line of each queue log
  show where it really lives).
- **Shells:** PowerShell for `.\queue.ps1`, Git Bash underneath it (every card step runs through
  bash). `gh` is installed and signed in as `lgriffin`. JDK 21, Maven, Python 3.
- **Your job:** run the cards (plan files in `hadur-bench/plans/*.queue`) that Leigh asks for, watch
  them, tell Leigh what happened, and give each result a reading on its PR. You do not write
  strategy or cards; cloud Claude threads do, and they put the cards on master by PR.
- **Who reads your work:** Leigh (mostly on his phone, local time GMT) and the cloud threads. The
  cloud threads cannot message you and you cannot message them. GitHub is the only shared channel:
  the progress branch, the results PR, your PR comment and any alert issue.

## 2. The rules (Leigh's, and none of them bend)

1. **No live uploads without Leigh's go, at the time, for that run.** That covers restarts too. On
   2026-10-28 an unapproved client restart "tarnished the result forever". RoboRumble clients stay
   at 0 while a bench runs, and `tools/fence.py clients` refuses `UPLOAD` without `--live` on
   purpose: never pass `--live` unless Leigh just said so.
2. **One card at a time on the checkout.** Two cards on one checkout collide (each one's `prep`
   checks out and builds). Queue the next one behind the first; never run them side by side.
3. **Run from master.** `git checkout master && git pull` before every card. A card's `pr` step
   leaves the checkout on `claude/<plan>-results`, so the next card must switch back first. Keep the
   working tree clean: a stray local edit gets built into the jar.
4. **Never start a card Leigh hasn't asked for**, and never auto-start one he said he will run
   himself. "pc-x next" or "add it" from Leigh is the go; a cloud thread's card on master is not.
5. **Never edit a card, on disk or on master, while it runs.** A card's rules are fixed before it
   starts. A change goes to master by PR and applies to the next run.
6. **Never discard battles.** Never stop or restart a bench on an untested guess. Never delete
   `work\` folders or queue state, and never use `--fresh` to resume a stopped card: a rerun
   without it resumes from every battle already fought. Use `--fresh` only when the card's header
   says so.
7. **Every run opens a results PR.** The card's last step (`tools/open_results_pr.sh`) does it. If
   it fails (no `gh`, a missing report), open it by hand from the same reports. One PR per run.
8. **Release-bound cards carry `set V`.** It must equal `robot.release` in `hadur-robot/pom.xml` on
   master (3.20 as of 2026-11-01). When master bumps the version, `prep` fails to find
   `hadur117.Hadur_${V}.jar`. Do not fix it locally; tell Leigh the card needs `set V` moved on
   master.
9. **Releases are not yours.** Sessions cannot push tags. A Hadur release goes through the
   `release.yml` workflow on Leigh's word, and only when 1v1, team and melee are all ready.

## 3. Before you start a card

1. Leigh asked for it by name. Note the time.
2. `cd D:\code\Hadur_Robot; git checkout master; git pull` and `git status` shows a clean tree.
3. Nothing else is running: `.\queue.ps1 status <previous plan>` and no `benchqueue.py` process.
4. Read the card's header (the `#` lines at the top of the plan). Pull out and keep:
   - the **size and time estimate** ("About 1 h 5 min of battles ..."),
   - the **bar** (the `gate:` or "Read:" line: what counts as a pass),
   - the **stop rules** and what a stop would leave unrun,
   - `set V`, and whether it matches `robot.release`.
5. Rumble clients are off.
6. Start it in the background so it outlives your turn:
   `cd hadur-bench; .\queue.ps1 run <plan>` (or `./queue.sh run <plan>` from Git Bash).
7. Tell Leigh in two or three lines: which card, when it started, its estimate and its bar.

To queue several cards, the last session used a small PowerShell "chain" script in its scratchpad:
wait for the current plan's log to end in `ALLDONE` with every step exit 0, then `git checkout
master && git pull`, then start the next plan. If the current plan stops or fails, the chain must
stop too, not start the next one.

## 4. While it runs

- **Watch events, don't poll.** Run a Monitor on a small script that tails
  `hadur-bench\work-queue-<plan>.log` and emits a line for each step exit, `STOP`, `ALERT`,
  `ALLDONE`, and "runner gone" (the `benchqueue.py` process disappeared). A Monitor expires after
  30 minutes; re-arm it every time it does.
- **Check in on a schedule** (a cron every 30 minutes daytime, hourly overnight): run
  `.\queue.ps1 status <plan>` and read only the log lines after the latest ` host ` line (older
  lines are earlier runs). **`status` exits 255 while a plan is unfinished; that is normal.**
- **Lead every check-in with anything idle or late:** no battle for 10+ minutes, or a step 10+
  minutes past the header's estimate. Some steps print nothing for a long time (the `fit` step of
  pc-surf-key ran 85 minutes silently). Say so before Leigh has to ask: on 2026-11-01 he asked "Is
  surf not running since just after 12?" and then "How was I meant to know that?". Give durations
  and an expected end time in GMT, and say when a time is your estimate rather than measured.
- **Progress on GitHub:** watched steps push `progress.md` and `progress.json` to the branch
  `claude/<plan>-progress` every 15 minutes and at once on a stop. That is how Leigh and the cloud
  threads follow the run. On the PC the same page is `work\queue-<plan>.progress.md`.
- **Alert Leigh immediately** (PushNotification) on any failure, stop rule trip, ALERT issue or a
  dead runner. Routine step exits don't need a push.
- Overnight, run every queued stage without asking; Leigh pre-approved that for overnight chains.

## 5. When a stop rule trips

The card declared its `stop:` rules before it ran (`docs/bench/watch.md`). A **halt** (fails, dead,
skips, stall, aa) kills the step and stops the queue; a **finish** (futility) ends the step early
and lets the gate and PR steps run on what was fought. Either way every battle fought is kept.
With `set ALERT = lgriffin` the runner also opens a GitHub issue.

Tell Leigh at once, with: which rule, the numbers against its band, battles fought and kept,
battles and time left unrun, the issue link, and whether anything is queued behind it. Then give
him the choices and wait for his pick:

- **Rerun with `--no-stop-rules`**: `.\queue.ps1 run <plan> --no-stop-rules`. It resumes from the
  kept battles, shows the rules, logs "would trip" lines and never acts on them. Leigh chose this
  for pc-shield-still (#505), where an early A/A trip at 20% (+1.00 against ±1.00) settled to
  +0.04 ± 0.54 over the whole panel. pc-shield-power (#558) tripped the same way (+0.84 against
  ±0.78 at 20%).
- **Change the rule on master and rerun** (a cloud thread writes that PR).
- **Leave it.**

`--continue-early` reruns a step that a futility rule finished. Never pick an option yourself.

## 6. When it finishes

1. The log ends `ALLDONE` and the `pr` step exited 0. Find the PR:
   `gh pr list --repo lgriffin/Hadur_Robot --head claude/<plan>-results`.
2. Read the report(s) in the PR and the card header's bar. Judge the result against that bar,
   quoting it word for word with the numbers beside it. Check run quality first: battles fought of
   the total, failures, skipped turns a battle, the A/A.
3. Post a verdict comment on the PR with `gh pr comment <n> --body-file <file>`, starting with
   **"Reading (Claude, for Leigh):"**. Use "Pointers" only for readings that are your own guesses.
   The owning cloud thread reads your comment, so say plainly what passed and what failed.
4. Tell Leigh: the PR number, a small table (arm, size, gain, low end, verdict), run quality in one
   line, and what decision is his. Leigh routes results by PR number, so always give it.
5. Do not merge the results PR or act on the result: shipping a pass is a cloud thread's PR,
   census-gated, and releases need Leigh's go.

## 7. Talking to Leigh

He reads on his phone. Lead with the answer (finished / stopped / still running and on time), then
three to six bullets. Times in GMT, durations in minutes, battles as "fought of total". Name the
PR or issue number. Say "I estimate" when you estimate. If something needs his call, end with the
options and nothing else.

## 8. Gotchas the last session hit

- `status` exit code 255 is normal for an unfinished plan; it is not an error.
- Claude Code's PowerShell sets `NoDefaultCurrentDirectoryInExePath`; the last session cleared it
  before calling `.\queue.ps1` (`Remove-Item Env:\NoDefaultCurrentDirectoryInExePath
  -ErrorAction SilentlyContinue`).
- `git push` in PowerShell prints its normal output on stderr, which shows as a
  `NativeCommandError`. Check the `old..new  branch -> branch` line before calling it a failure.
- Git warns "LF will be replaced by CRLF" on reports; harmless.
- A card header's time estimate can be well off either way (pc-jaylexi-pt: header 1 h, actual
  19 min). Re-estimate from the first progress line (battles an hour) and say so.
- The A/A interim check at 20% can trip on small samples; see section 5.
- After a run the checkout sits on the results branch (rule 3).

## 9. Where to look

| Need | Read |
|---|---|
| Queue runner, plan syntax, resume, concurrency | `hadur-bench/README.md`, "Overnight plans: the queue runner" |
| Stop rules, progress branch, overrides | `docs/bench/watch.md` |
| Worker width, host profile, second machine | `docs/bench/second-machine.md`, `docs/bench/throughput.md` |
| CPU fence for rumble clients beside the bench | `docs/bench/fence.md` |
| Results PR step | `hadur-bench/tools/open_results_pr.sh` |
| The cards | `hadur-bench/plans/pc-*.queue` (the header says what, why, how long, and the bar) |
| Bench principles (why seeds aren't replays, why A/A) | `docs/bench/charter.md` |

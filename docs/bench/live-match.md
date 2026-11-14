# Matching live: the turn time and the live-match check (BENCH-245)

## What went wrong

Robocode gives each robot a fixed time a turn, the CPU constant. A robot that needs longer skips the turn: it
does not move, turn or fire that tick. Every PC card pinned 1488498 ns. That value is the PC's own idle
calibration, read from `C:\robocode\config\robocode.properties` by the bench scripts (`top20-strategy.md`). The
PC then runs 12 to 16 battles at once, so under that load each robot gets less real time a turn than at idle.

On the 31 real-gap robots, master and BeepBoop 2.0, paired by robot (`local/2026-11-14_night.md`, section 5):

| Turn time | Our skips a battle | BeepBoop's skips a battle | Us | BeepBoop | Gap |
|---|---:|---:|---:|---:|---:|
| 1488498 ns (the PC cards) | 29 | 496 | 70.2 | 79.8 | 9.7 |
| 3272413 ns (cloud calibration) | 6 | 35 | 68.5 | 84.3 | 15.8 |
| Live LiteRumble, 13 Nov | | | 66.2 | 83.6 | 17.4 |

BeepBoop is the heavier robot, so the tight constant cost it 4.5 points and left us level: the bench showed half
the real gap. Our CPU-heavy lines lost too. In shield mode a skipped turn lets a bullet through, the enemy gun
learns the gap, and the shield exits for the battle. Musashi's shield line read +20 at the calibrated time and
+3 at 1488498, on the same seeds. The PC skips as often at 1488498 as the cloud does (26.8 against 29 a battle).

## Why earlier PC checks missed it

Every PC check compared Hadur with Hadur: master against a lever, and master against its own copy (A/A). Both
arms ran at the same tight constant, so the A/A arms agreed and every check passed. No check ever put BeepBoop
on the bench, or set our own level against live. A bench that handicaps the leader more than us cannot show up
in a Hadur-only comparison. The old note on the constant (`second-machine.md`) only warned about slower
machines, not about the PC's own parallel load.

## The fix

- `--cpu-constant live` pins 3272413 ns, the value that matched live. Every 1v1 PC card written from now on
  uses it. `PcLiveMatchPlanTest` fails the build otherwise. The 170 earlier cards are frozen in
  `hadur-bench/plans/timing-legacy.txt`.
- `tools/live_match.py ARMS.tsv` sets our arm and BeepBoop's arm against live
  (`plans/live-1v1-2026-11-13.tsv`), paired by robot. It fails, and exits 1, when either holds:
  - the gap is more than 4 points off live;
  - BeepBoop is more than 3 points off its live level, or skips more than 100 turns a battle.
- Every new 1v1 PC card runs this check first, and its benches wait for it. A failing check halts the card
  before any A/B result is read. The step costs 62 battles, about 6 minutes on the PC:

```
livematch | ./bench-top20.sh ${C} ${P} --set panel-r31.txt --seeds 1 --seed-base <SEED> --arms plans/livematch.arms --out ${W}-livematch --label <card>-livematch && python3 tools/live_match.py ${W}-livematch/arms.tsv --out ${OUT}/$(date +%Y-%m-%d)_<card>-livematch.md
  after: prep
```

  The card's prep also runs `./fetch-opponents.sh --set livematch-bb.txt`, and its bench steps carry
  `after: livematch`.
- `pc-livematch` checks the PC itself, at the live constant and at 1488498, 2 seeds, about 25 minutes. If the
  live constant fails on the PC, its report shows which way, and the constant moves before the next card.

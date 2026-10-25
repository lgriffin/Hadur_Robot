# Running the bench on a second machine

Leigh, 2026-10-25: "I need to run the bench on a 2nd machine, my laptop is connected. Modify the
bench to detect hardware capability and scale appropriately." And: "Main PC should always go max,
my laptop is less powerful so needs to scale." This is how (BENCH-105 to BENCH-107).

## What the bench works out by itself

`hostprofile.py` reads the machine before every queue run (`.\queue.ps1 host` shows it):

| | How | PC | A typical laptop (8 cores, 16 GB) |
|---|---|---|---|
| Physical cores | Windows `GetLogicalProcessorInformationEx`, Linux `/proc/cpuinfo`, macOS `sysctl` | 24 | 8 |
| Duel and team workers | physical cores / 2; below 16 cores, 1 core held back first and the JVMs must fit 70% of free memory at 2.3 GB each | **12** | 3 |
| Melee workers | the same, holding back 2 cores below 16 (melee sheds turns first) | **12** | 3 |
| CPU constant | `robocode.cpu.constant` of a local Robocode install (`C:\robocode`, `~/robocode`, `ROBOCODE_HOME`) | 1488498 | its own, or calibrated once, idle |
| Work folder | `hadur-bench/work`, unless told otherwise | as today | anywhere |
| Queue memory guard | 8 GB, or a fifth of the RAM below 40 GB | 8 GB | 3.2 GB |

Why two cores a worker: the 2026-10-23 worker ladder (PR #232, `docs/bench/throughput.md`) found
12 unpinned workers right on the PC's 24 cores. A duel battle JVM uses about 1.25-1.5 cores and a
team one about 2, and SMT threads are not whole cores; more workers raised skipped turns, which
skews scores. A machine of 16 cores or more always runs its full width (the PC "always goes max");
Bench's own memory check still guards it. Workers are never pinned. The truth log stays on.

Why the laptop needs its own CPU constant: the constant is the time a robot gets each turn. The
PC's 1488498 ns on a slower CPU gives every robot less work a turn than it needs, and skipped turns
pile up. A rumble client on the laptop would calibrate its own, so the bench does too.

## Cards that scale

A card written with the host variables runs 12 wide on the PC and narrower on the laptop with no
edit:

```
set P = --parallel ${WORKERS} --no-truth-log
set C = --skip-build --skip-fetch --rounds 35 ${CPU} --child-heap 2G --engine 1.11.1
```

`${WORKERS}` is the duel width, `${TEAM_WORKERS}` and `${MELEE_WORKERS}` the others, `${CPU}` is
`--cpu-constant N` or nothing. A Bench argument file (`@plans/x.args`) uses `--parallel auto` and
`--cpu-constant auto`, which read the same values from the step's environment
(`HADUR_BENCH_WORKERS_DUEL`, `_TEAM`, `_MELEE`, `HADUR_BENCH_CPU_CONSTANT`). Older cards that write
`--parallel 12` and `--cpu-constant 1488498` keep doing exactly that on any machine.

## Overrides

Strongest first:

1. `--workers N` on `queue run` (every kind, over the card's own `set WORKERS` too).
2. Environment: `HADUR_BENCH_WORKERS` (every kind), `HADUR_BENCH_WORKERS_DUEL` / `_TEAM` /
   `_MELEE`, `HADUR_BENCH_CPU_CONSTANT`, `HADUR_BENCH_WORK`.
3. `hadur-bench/host.local` (git ignores it), one `KEY = VALUE` a line:

   ```
   # laptop
   WORKERS = 3
   WORKERS_MELEE = 2
   WORK_DIR = D:\hadur-bench-work
   CPU_CONSTANT = 3100000
   MIN_FREE_GB = 4
   ```

4. The rule above.

A card's `set WORKERS = N` sits between 3 and 4: it beats the detected width, not an override.

## Work folder

`--work-dir DIR`, `HADUR_BENCH_WORK` or `WORK_DIR` in host.local. When `hadur-bench/work` does not
exist yet, the runner links it to DIR (a junction on Windows, a symlink elsewhere), so every
`work/...` path in the cards lands there. An existing `work` folder is never moved: the runner
stops with a message and leaves it to be moved or linked by hand. The PC's E:\hadur-bench-work
junctions keep working as they are.

## Is the laptop's bench valid?

Every run's `conditions.json` now names the host profile (`hostProfile`), where its width came from
(`parallelSource`) and its CPU constant; the reports already carry skipped turns a round and the
trusted share. Before giving the laptop real cards, run the host check once:

```
git checkout master && git pull
cd hadur-bench
.\queue.ps1 host                 # what it will use
.\queue.ps1 run host-check       # about 30-60 min
```

`plans/host-check.queue` fights the battles the PC fought in the worker ladder (the 208-bot Stage 0
panel with the 3.15 release on seed 2501, and the 46 teams on two seeds) at the laptop's width, and
`tools/host_check.py` compares them with the PC's: skipped turns a round within 15% of the PC's
(+0.02), engine disables within 2 a 100, and for the duel the level within 1.5 points of the PC's
83.32. VALID means the laptop's numbers can stand beside the PC's. TOO LOADED names the width to try
next (`--workers N-1`, or `WORKERS` in host.local). The report goes to a `claude/host-check-<host>`
results PR when `gh` is on the machine.

Melee has no PC reference block yet. Read a laptop melee run's skipped-turn line against the PC's
run of the same fields before trusting it.

## Two machines on one card

`--shard K/N` (Bench) fights every N-th opponent of the set starting at the K-th, so the PC with
`--shard 1/2` and the laptop with `--shard 2/2` split a duel or team census with no opponent fought
twice and both halves spread across the bands. The halves are separate runs: copy the laptop's
`arms.tsv` to the PC and read both together, `multiarm.py PC/arms.tsv LAPTOP/arms.tsv` (without
`--blocks` the files pool). A melee field is one battle of the whole set, so melee cannot be split
this way.

Not automated yet, on purpose: a card's read and PR steps would need to wait for the other machine,
and the halves would run at different speeds. When a card is worth splitting, write the shard into
its census step on each machine and do the read by hand. The simpler use of a second machine is a
second card: the laptop runs a short screen or a cloud-sized card while the PC runs the census.

# Rumble clients beside the bench: the core fence (BENCH-145 to BENCH-147)

Leigh, 2026-10-30: "On my high end PC if we containerised robocode would that protect the bench? I'd like
to be able to run rumbles as needed." Then: "Lets build it and I'll be restarting the PC today to see can
we get it qualified. Don't merge though."

## Why not a container

A container limits how much CPU the clients get, not where they run. On Windows, Docker runs inside the
WSL2 virtual machine, and the VM's virtual CPUs are scheduled on any of the PC's 48 threads. The bench is
not pinned either. So client JVMs still share cores, hyperthread siblings and L3 cache with battle JVMs.
Robots then take longer per turn, skipped turns rise, and the bench's levels and A/B differences drift. That
is the same failure as 8 clients starving the PC (PR #356). A container's memory cap would help a little,
because the stalls were JVM pauses (PR #343), but the clients already run with a fixed `-Xmx` in their
launchers.

## What the fence does

Windows processor affinity on both sides, cut along the L3 cache groups (the Threadripper's chiplets):

| Side | PC (9965WX, 4 L3 groups of 6 cores) | Priority |
|---|---|---|
| Bench | CPUs 0-35: 3 groups, 18 cores. Still 12 workers | normal |
| Clients | CPUs 36-47: 1 group, 6 cores, its own L3 | below normal |

- Every process inherits its parent's affinity, and a below-normal priority class, so a fence set on a
  launcher holds for every JVM it starts. There is no race.
- Inside a fence the OS still moves threads freely. This is not BENCH-93's `--pin` (2 processors per
  battle), which starved Hadur's thread mid-round (docs/bench/local/2026-10-22_stage0-defect.md).
- `python tools/fence.py show` prints the topology it read and the split. Override it in
  `hadur-bench/host.local` with `FENCE_BENCH_CPUS = 0-35` and/or `FENCE_CLIENT_CPUS = 36-47` (one alone means
  the other side is the rest). With one L3 group (the laptop), the clients get the last quarter of the cores.
- About 2 or 3 clients fit on 6 cores (for example two 1v1 and one melee). A melee client takes about 2 cores.

## How to use it

1. `hadur-bench\host.local`: add `FENCE = on`. Every queue card then runs on the bench side (the queue's
   first log lines say `fence: bench on CPUs 0-35 ...`). Without it, nothing changes.
2. Clients, whenever Leigh likes, from `hadur-bench`:

   ```
   python tools\fence.py clients rr01:roborumble.bat rr02:roborumble.bat
   ```

   That fences itself to the client side at below-normal priority and runs `live_client.py watch` over the
   clients. You get console logs, Hadur's stall lines, and a restart every 15 minutes between battles,
   written to `data/live/fenced-<UTC>`. Ctrl-C stops them all. `--root` defaults to `C:/RoboRumbleWorkers`.
   A client outside `--root` takes its full path: `C:/robocode:meleerumble.bat`.
3. **Uploads.** The launcher refuses any client whose config uploads (`UPLOAD` not `NOT`, or no config)
   unless `--live` is given. Live uploads need Leigh's go at the time, and the PC is still not qualified
   (`QUALIFIED = no` in plans/live-watch.queue).

## Qualifying it: plans/pc-fence-qualify.queue

`.\queue.ps1 run pc-fence-qualify --fresh` (close every client window first, no other queue). This takes
about 1 to 1.5 hours, and uploads are off throughout. It runs both sides at once:

- **Bench:** the host check's battles on the bench side while the clients fight. The duel block (208-bot
  panel, Hadur 3.15, seed 2501) is compared with PC d12 (0.465 skips a round, level 83.32). The team block is
  compared with t12 (0.119). The duel block then runs again so the client load covers the whole window.
  VALID on every block means the bench is protected.
- **Clients:** rr01 and rr02 with UPLOAD=NOT. `qualify_pc.py priority` keeps their priority battles file
  stocked with Hadur 3.19 pairings, because a settled robot is in about 1 battle in 600. The battles are
  scored against the clean cloud first pass (91.58, 1,221 pairings), and the verdict is QUALIFIED within
  ±0.5 points.
- The report is `data/live/fence-qualify-3.19-run1/fence-qualify.md`, delivered as a results PR.

| Bench | Clients | Next |
|---|---|---|
| all VALID | QUALIFIED | Run fenced clients beside any card. Going live is Leigh's call, and QUALIFIED changes in its own PR |
| all VALID | NOT QUALIFIED | The bench is safe, but the clients still lose points: keep them uploads-off and look at their skips |
| TOO LOADED | either | One client fewer, or set FENCE_CLIENT_CPUS to a narrower range, then rerun with RUN = 2 |

The clients play more Hadur battles here than in a normal live run (every battle is a Hadur pairing),
which is the heavier case for both sides.

## Not tested here

The Windows calls (`GetLogicalProcessorInformationEx` for the L3 groups, `SetProcessAffinityMask`,
`SetPriorityClass`) have only been checked against their documented layouts. The Linux path and the
whole card logic are covered by `tools/test_fence.py`. The card's first step writes `fence.md` with what
the PC really reported, so a wrong read shows before any battle.

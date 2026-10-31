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
- About 2 or 3 clients fit on 6 cores (see How many, below).

## How to use it

1. `hadur-bench\host.local`: add `FENCE = on`. Every queue card then runs on the bench side (the queue's
   first log lines say `fence: bench on CPUs 0-35 ...`). Without it, nothing changes.
2. Clients, whenever Leigh likes, from `hadur-bench`:

   ```
   python tools\fence.py clients --oneone 2 --melee 1
   ```

   `--oneone N` starts rr01..rrNN in `C:/RoboRumbleWorkers` (roborumble.bat); `--melee 1` and `--team 1`
   start the melee and team clients in `C:/robocode` (one of each at most, since they share that folder's
   configs). Folders can still be named directly, e.g. `rr03:roborumble.bat` or `C:/robocode:teamrumble.bat`.
   The launcher fences itself to the client side at below-normal priority and runs `live_client.py watch`
   over the clients: console logs, Hadur's stall lines, and a restart every 15 minutes between battles,
   written to `data/live/fenced-<UTC>`. Ctrl-C stops them all.

   **How many.** A 1v1 client keeps about 1.25 cores busy, a melee or team client about 2. The launcher
   refuses a set heavier than the client side's 6 cores unless `--force`:

   | Set | Cores | |
   |---|---:|---|
   | `--oneone 2 --melee 1` | 4.5 | recommended: headroom for JIT and GC |
   | `--oneone 2` | 2.5 | what pc-fence-qualify measures |
   | `--oneone 1 --melee 1 --team 1` | 5.25 | all three rumbles, the most that fits |
   | `--oneone 4` | 5.0 | fits |
   | `--oneone 2 --melee 1 --team 1` | 6.5 | refused: over the fence |

   The fence protects the bench whatever the set; the limit protects the clients' own scores, since an
   oversubscribed client side skips turns among its own robots.
3. **Uploads.** The launcher refuses any client whose config uploads (`UPLOAD` not `NOT`, or no config)
   unless `--live` is given. Live uploads need Leigh's go at the time, and the PC is still not qualified
   (`QUALIFIED = no` in plans/live-watch.queue).

## Qualifying it: plans/pc-fence-qualify.queue

`.\queue.ps1 run pc-fence-qualify --fresh` (close every client window first, no other queue). This takes
about 1 hour, and uploads are off throughout.

### Run 1 (PR #471, 2026-10-30 19:57-20:18 GMT)

- **Fence:** the PC reported four L3 groups (0-11, 12-23, 24-35, 36-47), so the bench got 0-35 and the
  clients got 36-47, as planned. The Windows code works.
- **Clients:** 253 Hadur battles in 21 minutes, at 7.6 skipped turns a battle (0.22 a round). For
  comparison, the 8-client watch skipped 57 a battle. None were scored, because the clients were already
  on 3.20 and the card named 3.19. The priority step also failed, because the 3.19 jar was gone.
- **Bench:**

  | Block | Skips a round (PC 0.465) | Disables /100 (PC 3.1) | Level (PC 83.32) | Verdict |
  |---|---:|---:|---:|---|
  | duel | 0.898 | 18.8 | 82.57 | TOO LOADED |
  | team | 0.146 (0.119) | 0.0 | - | VALID |
  | duel2 | 0.706 | 6.2 | 82.65 | TOO LOADED |

  This does not say whether the clients reached the bench, or whether 12 workers on 18 cores is simply
  narrower than the 24-core reference.

### Run 2 (PR #486, 2026-10-31)

| Block | Fenced | Clients | Workers | Skips a round | Disables /100 | Level |
|---|---|---|---:|---:|---:|---:|
| solo | yes | none | 12 | 0.557 | 0.5 | 82.95 |
| duel | yes | two 1v1 | 12 | 0.580 | 1.4 | 83.04 |
| duel10 | yes | two 1v1 | 10 | 0.599 | 2.9 | 82.83 |
| PC 2026-10-23 (d12) | no | none | 12 | 0.465 (bar 0.555) | 3.1 | 83.32 |

- **Clients: QUALIFIED.** -0.11 ± 0.48 over 317 battles of 3.20, scored against 3.19's clean page.
- **Bench: no load problem was found.** Every block missed the old bar, but only just.
  - With no client running at all, the bench already sat at the bar (solo, 0.557).
  - The clients added about 0.02 a round (duel against solo).
  - Ten workers did not help (duel10).
  - Disables and level were fine everywhere.
- **What to change:** the bar, not the PC. It comes from an unfenced run a week ago, so drift since then
  (Windows, JDK, the robot jars on disk) counts against the fence.

### Run 3 (BENCH-151, the card as it stands)

The card judges against today's PC: the same duel block three times in one session.

- **base:** unfenced, no clients, all 24 cores.
- **solo:** fenced to the bench side, no clients.
- **duel:** fenced, beside two fenced clients.

`host_check.py --reference-run base=...` judges solo and duel against base with the same 15% + 0.02 skip
bar, disables + 2, and level ±1.5. The 10-23 comparison stays in the report as information only.

| solo | duel | Meaning |
|---|---|---|
| VALID | VALID | Clients beside a fenced bench are safe: set `FENCE = on` and run them |
| VALID | TOO LOADED | The clients reach the bench through something the fence does not split (memory, power) |
| TOO LOADED | either | 18 cores cost the bench on their own: run narrower when fenced, or give the clients fewer cores |

The clients play more Hadur battles here than in a normal live run, which is the heavier case for both
sides.

## Tests

`tools/test_fence.py` covers the Linux path and the card logic. Run 1 showed that the Windows calls work
on the PC: `GetLogicalProcessorInformationEx` read the four L3 groups, and affinity and priority were set.

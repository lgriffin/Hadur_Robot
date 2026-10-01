# Memory at rumble scale: why skipped turns grow over a session, and the fix (R8)

Planning document written after the R7 session bench (300 battles in one engine process, 3.2
jar) showed Hadur's skipped turns per battle climbing from about 10 to about 90 while the
control robot stayed at 0. It answers three questions Leigh asked on 2026-10-01: why that
happened, how to prevent it, and what changes when it is gone. Evidence is in
[docs/bench/r7-session.md](bench/r7-session.md) and `data/learnings.md` (L-26, L-27).

**Status: proposed.** One stage, R8, one PR, shipping as 3.4.

## 1. Why the skipped turns grew

**The stalls sit at round ends, one per round, and each is a profile save.** In the session's
late battles every skipped turn Robocode reported is stamped one tick after the round's
`R` record: battle 299 (sheldor.nano.Sabreur) has 2, 2, 2, 1, 1, 3, 2, 4, 4, 2, 4, 3 ...
skips, each group at exactly `round end + 1`. Battle 1 has four skips in the whole battle,
none at a round end. Turn p95 (about 1 ms), turn max, heap after GC (6 MB) and live classes
are flat from the first block to the last, so nothing per tick grew; only the one stall per
round did.

**The stall scales with the number of files in the data directory.** The bisect (same
session, data directory wiped before every battle) holds skips at 6 to 13 per 25-battle block
over 150 battles. Prefilling the directory with N stats-only profiles and fighting one weak
bot for 35 rounds gives, for both jars:

| Profiles on disk | Bytes | 3.3 skips per save | 3.2 skips per save | Save outcome |
|---|---|---|---|---|
| 0 | 0 | 0 | 0 | written |
| 300 | 84 KB | 3 to 4 | 2 to 4 | written |
| 600 | 169 KB | 5 | 5 | written (over 90%, seeds stripped) |
| 1,000 | 283 KB | 23 to 31 | 21 to 31 | **skipped: "275 bytes do not fit"** |
| 2,000 | 570 KB | 42 to 52 | 44 to 53 | **skipped** |

Survival was 100% in every one of those battles, and 99.4 to 99.8% in every block of the
300-battle session: the stall happens after the round is decided, so it costs no rounds on
the bench.

**Where the cost is.** `ProfileLibrary.save` (which `saveStatsOnly` ends in) does, on every
call:

1. `store.bytesUsed()`: `FileProfileStore` walks the directory and stats every file.
2. Once the directory passes 90% of the 200 KB quota, `evictSeeds`: reads **and decodes
   every own-version profile** to find the ones still holding seeds, and `enforceSeedCap`
   does the same again when the written profile is a new seed holder.
3. Over quota, the save is then `SKIPPED` after all that reading, so nothing is written and
   the next save does it all again.

Robocode's own quota bookkeeping is O(1) per write; the O(files) work is ours. The scan is
cheap on this machine's disk for a few hundred files (a 1,000-file list and read is about
12 ms) but every file goes through Robocode's security manager and `getCanonicalFile`, and
each decode runs the CRC, so at 1,000 to 2,000 files a save costs a 100 to 200 ms stall,
which the engine reports as 20 to 50 skipped turns at once. 3.2 did this at **every round
end** (35 saves a battle); 3.3's MEM-10 cut it to two saves a battle, which is why 3.3 and
3.2 show the same cost per save but 3.2 showed it 35 times.

**Why it grew during the session.** The session fought 300 distinct opponents, so the
directory grew by one profile per battle, from 0 to 300 files, and the per-save cost grew
with it. A rumble client is the same session without end: `hadur2.Hadur.data` is keyed by
class name, not version, so a client that has hosted every Hadur release holds every opponent
it ever fought, 1,200 and more.

**What this means live.** Two consequences follow, one proven and one inferred:

- Proven by the prefill runs: at 700+ profiles the directory is over quota and **every save
  is skipped**, so on a mature client Hadur learns nothing between battles. Memory, the
  whole S3/R1/R5 investment, is switched off exactly where most of the pairings are fought.
  Stats-only profiles are 275 bytes; 200 KB holds about 700 of them, and the rumble has
  1,216 bots.
- Inferred: the live slide (3.1: 85.7 APS in its first hour to 78.6 by the fourth, survival
  91.8% to 76.1%) is **not** reproduced by this. Round-end stalls cost no rounds on the bench
  even at 2,000 files, and a survival collapse mid-round needs something that acts mid-round.
  The one path by which the stall could act live is Robocode's bad-behaviour kill
  (`MAX_SKIPPED_TURNS = 30` consecutive, 240 while the robot does I/O): our 42 to 52 skips
  at one tick did not trip it on the bench, and a kill at a round's end would in any case
  only cost that round's thread stop, not the next round. So removing the stall is worth
  doing for memory and for safety, and it is not the whole of the live gap.

## 2. How to prevent it: R8, "memory at rumble scale"

The rule R8 enforces: **profile memory does no work proportional to the number of files on
disk, ever, at any directory size.** Everything below follows from it. Requirements get EARS
rows (MEM-11 to MEM-14, BENCH-8), a tagged Cucumber scenario each, unit tests on the
in-memory store, and a prefilled bench gate.

### MEM-11: one listing per battle, then an in-memory index

`FileProfileStore` lists the directory once, in `prepare()` (already the battle's first
tick, before the first scan), and keeps a `Map<String, Long>` of name to length. `names()`,
`bytesUsed()` and `size(name)` answer from the map; `write` and `delete` update it. No save
walks the directory again. Cost per save drops to the files it touches: its own profile,
its temporary copy and the clock.

### MEM-12: seed holders known by size, not by reading

A stats-only profile is at most about 300 bytes; a seeded one is several KB. The library
treats any own-version file above `STATS_ONLY_MAX` (1 KB, with the codec asserting
`encodeStatsOnly` never exceeds it) as a seed holder. `evictSeeds` and `enforceSeedCap` then
read only those files, at most `MAX_SEEDED` (5) of them, instead of every profile. The
sort order (least recently fought first) is unchanged, because the few files read still
carry `lastFought`.

### MEM-13: over quota, forget the oldest opponents, never stop writing

When a save would not fit, the library deletes the least recently fought stats-only
profiles (whole files) until it does, before writing. "Least recently fought" comes from the
file's modification time via the index (one `lastModified` per file in the one listing of
MEM-11; a profile's file is rewritten only when it is fought), not from reading profiles.
A save therefore always lands; the directory settles at about 700 of the most recently
fought opponents, which on a client cycling through the rumble is the set it will meet next.
`cleanupOtherVersions` (MEM-9) uses the same index and the same time order, so a client that
hosted 3.0 to 3.2 is cleaned at the first battle's start without reading every file.

### MEM-14: profiles small enough for the whole rumble

Independent of MEM-13 and worth doing with it: shrink the stats-only record so 1,216
profiles fit in 200 KB at 90% (about 150 bytes each). The current 275 bytes carry the
lineage key, the last name, ten battle outcomes and the band tables. Keeping the five most
recent outcomes and encoding the band counters as 16-bit values gets under 150 bytes without
losing what `Tiers` and `ProfileFolder` read. This is a format bump (version 3), which MEM-9
already handles: version 2 files are read once for their tiers and then cleaned up as other
versions. If MEM-14 lands, MEM-13's eviction rarely runs on a rumble client and memory
covers every opponent.

### BENCH-8: the gate

`hadur-bench --client` with `data=prefill:DIR` at 0, 700, 1,200 and 2,000 generated
profiles (the generator goes into `hadur-bench` as `hadur.bench.Prefill`, the one used for
this document), against the weak set, 35 rounds. Gate: at every size, **at most 2 skipped
turns per save, every save `written`, survival within the default bench's noise.** Then the
300-battle session again: skipped turns per block flat (under 15), no save skipped. The
session bench gains a column for saves skipped, read from the `MEM` telemetry lines.

### What R8 does not do

- It does not move the saves out of round ends. They already sit where a stall costs no
  rounds; with MEM-11 and MEM-12 they take one write of under 1 KB.
- It does not touch the duress mode (RES-9). The prefill runs show 0 duress ticks at every
  size: round-end skips reach the next round's robot as no events, so the stall never put
  3.3 into duress.
- It does not claim the live slide. R8's gate is a bench gate. The live question stays open
  and is answered by 3.3's RES-8 health record on a client Leigh runs for a few hours (the
  record names skipped turns and memory failures per battle), and by BENCH-5 on 3.3's
  BotDetails page once it has 300 pairings.

## 3. What happens when it is removed

**On the bench:** nothing changes in score. The 300-battle session held 99.4 to 99.8%
survival against weak bots with the stalls present; the prefill battles held 100% at every
size. Skipped turns per battle drop to the single digits at any directory size, and the
session's reported "slide in skipped turns" disappears. That is a cleaner signal, not points.

**Live, with confidence:** memory works on every client, not only fresh ones. Today a client
past 700 opponents never persists a profile, so every pairing on it is fought as a stranger.
What memory is worth per pairing is what the warm-versus-cold benches measured when it was
built (S3 and R1: tiers and seeds on the second and third battle against the same opponent).
In the rumble a pairing is a single battle, so the gain is from repeat pairings as versions
go on, and from `Tiers` naming the opponent's class at the first scan. Honest estimate:
**0 to +1 APS**, mostly against the mid-table bots that memory was designed for.

**Live, not promised:** the 3.1 slide was a survival collapse (91.8% to 76.1%) and this
work does not reproduce one, so the +3 to +5 APS the R7 row of the top-30 plan assigned to
"the cause of the slide" is not banked by R8. If the slide is on the client side in a way the
bench cannot show (a slower disk making the same stall long enough for the engine's kill, or
the client's own handling of a robot that skips 50 turns at once), R8 removes that path too,
and the first live pass of 3.4 will say so. Expected live finish for 3.4: the 3.3 prediction
plus 0 to +1, which keeps top 50 as the realistic target and top 30 as the one that needs
the slide's cause as well.

## 4. Order and size

One PR, about a day: MEM-11 and MEM-12 are small and self-contained in
`FileProfileStore` and `ProfileLibrary`; MEM-13 is the new behaviour and needs its tests;
MEM-14 is the format bump and can follow in a second PR if the first is wanted sooner. The
generator and the prefilled gate come first, so the PR carries before-and-after numbers at
2,000 files.

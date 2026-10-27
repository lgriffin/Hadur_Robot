# Hadur 3.17 live clients: "Unable to stop thread" (2026-10-27, first 15 minutes)

Draft, evidence only. Taken from the first live-watch start on 2026-10-27 (the watch was pointed at 3.18 by
mistake, so it recorded no battles, but the eight RoboRumble clients ran 3.17 / 3.17.1 and their consoles were
captured). The 3.17 run 3 watch (`data/live/release-3.17-run3/`) is the real record and is still running.

Window: 14:01:55Z to about 14:16Z, eight clients (six 1v1, one melee, one team), each restarted every 15 minutes.

## What Robocode printed

Pairs of lines like these, two per event:

    Unable to stop thread: hadur2.Hadur 3.17
    Robot hadur2.Hadur 3.17 is not stopping.  Forcing a stop.

`client-events.tsv` holds one `unstoppable` row per client event (68 in this window; the queue's live_client
counts each event once, the console prints each line twice). `console-excerpts.txt` has the console lines with
two lines of context before and one after, per console file.

## Counts of "Unable to stop thread" lines in the consoles

| Robot | Lines |
|---|---:|
| hadur2.Hadur 3.17 | 58 |
| Polkwane.Piyane 1.0 | 50 |
| taqho.taqbot 1.0 | 16 |
| hadur2.Hadur 3.17.1 (team copies 1 to 5) | 4 + 2 + 2 + 2 + 2 |
| SHAM.WOW 1.4 | 4 |
| voidious.Diamond 1.8.28, rdt.Wraith.Wraith 0.3, inonit...MyFirstRobot 1.1 | 2 each |

Events by client: rr01 8, rr02 12, rr03 10, rr04 12, rr05 4, rr06 10, melee 2, team 10.

## Memory

No `OutOfMemoryError`, "heap space" or "GC overhead" text in any console of the window. The only "memory" lines
in the logs are the bench runner's start-up notes ("12 battle JVMs with heap 2G need about 28176 MB of ~80000 MB
free"), which are informational. So these are not out-of-memory failures as such: Hadur (and a few other
robots) simply did not stop when the engine asked, and the engine forced it. Whether Hadur's own stop time ties
to heap or GC pressure is not shown by this data. Each client runs `-Xmx4G` (melee and team `-Xmx2G`), eight
JVMs alongside.

## Files

- client-events.tsv: client events other than restarts and exits.
- health.tsv, startup.tsv: per-battle health and start-up records from the same window.
- watch.log: the watch log without the restart lines.
- console-excerpts.txt: stop-thread lines with context, per console.

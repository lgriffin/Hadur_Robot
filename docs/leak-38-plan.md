# Winning back 3.8's 1v1 leak: the plan

6 October 2026. Inputs: the live page ([live-3.8.md](bench/live-3.8.md)), the local top-20 run
([findings](bench/local/2026-10-06_findings.md)) and the local bisect
([leak38 findings](bench/local/2026-10-06_leak38-findings.md), issue #109).

## Where we are

| | APS | Rank |
|---|---|---|
| 3.4, full pass | 85.90 | 20th |
| 3.7, full pass | 85.67 | 21st |
| **3.8, full pass** | **84.58** | **29th** |
| 3.8 if it held 3.4's level outside the top 20 | about 86.0 | about 20th |

The target is to get back to the expected range, at least 3.7's 85.67, while keeping the
DrussGT route's gain on the top 10. That gain is +5.2 per pairing live and +6.5 ± 3.2 on the
local bench.

## What the evidence says

- **Live:** outside the top 20, 3.8 is down 1.55 ± 0.15 per pairing against 3.4, mostly in
  survival. That costs 1.5 APS.
- **Bench:** on 32 random bots from that field, 3.8 against 3.7 is -0.14 ± 0.37 at 16 seeds,
  and D1 alone and D2 to D5 are each level. The same 32 bots fell 0.66 live, so the bench sees
  at most a small part of what the live clients see.
- **Top-20 bench:** 3.8 is +9.8 ± 2.7 on the 8 robots 3.7 loses to and -1.8 ± 2.2 on the 12
  it beats, with resolved losses on Nene (-6.9) and Wavelet (-10.4). That is the same shape as
  the live loss, smaller.

So the leak is real, and the bench as configured cannot see it. The question is which live
condition the bench is missing, not which stage leaked.

## How a live battle differs from the bench

| | Live client | Bench so far | Prior |
|---|---|---|---|
| **Engine** | Robocode 1.11.1 (Leigh's clients' `version.lastrun`) | 1.9.5.6, every gate since S0 | High. This is the one difference present in every live battle, and the D route leans on engine behaviour: bullet-hit-bullet (SHIELD-3's latch), the inactivity penalty (END-4, checked on 1.9.5.6 only) and turn timing (D4). |
| **One JVM, hundreds of battles** | One `RobocodeEngine`, `-Xmx512M` | A fresh JVM per battle | Medium. D3 and D4 added per-battle state; growing heap or static state would show as skips and lost rounds late in a session. The session bench (BENCH-6) imitates this. |
| **Data kept** | The data directory persists, and 3.8 stores two new verdicts per opponent (lead-aware, shielder) | Data wiped every battle | Medium-low. A wrong verdict carries into the next battle against that bot. Repeat meetings on one client are rare, though, and pairings with more than one battle read the same as single ones (84.44 against 84.64). |
| **Field** | About 1,150 bots | 32 random bots | Low as a cause, but it limits the bench's power: the draw's live loss is 0.66, not 1.55. |

## The plan

### Track A: reproduce, then attribute (Leigh's PC)

Each step runs only if the one before it does not reproduce the leak. "Reproduces" means a
paired loss of 1 point or more with its interval below zero.

- **A0. Get 3.7's live page, if LiteRumble still has it.** Save
  `https://rumble.robowiki.net/BotDetails?game=roborumble&name=hadur2.Hadur%203.7`. A
  pairing-by-pairing 3.8 against 3.7 comparison says whether the tail loss is new in 3.8. All
  comparisons so far are against 3.4. This takes a minute and needs no bench.
- **A1. Engine 1.11.1.** Repeat step 1 at 16 seeds on the live engine. `bench-top20` now has
  an engine option, and the report header names the engine that ran:
  ```powershell
  .\bench-top20.ps1 -Set leak-38.txt -Seeds 16 -Engine 1.11.1 -Label leak38-step1-e1111 -RobotJar bisect\hadur2.Hadur_3.8.jar -Robot "hadur2.Hadur 3.8" -Baseline bisect\hadur2.Hadur_3.7.jar -BaselineRobot "hadur2.Hadur 3.7"
  ```
  Also re-run the top-20 set at 5 seeds on 1.11.1. If the Nene and Wavelet losses grow, that
  confirms it.
- **A2. A live-like client.** Run the session bench on 1.11.1, with one JVM, a 512M heap, data
  kept and 300 opponents, and 3.7 as the control:
  ```powershell
  .\fetch-opponents.ps1 -Set session-300-opponents.txt
  mvn -q "-Drobocode.version=1.11.1" compile exec:java "-Dexec.args=--session session-38.txt --robot-jar bisect/hadur2.Hadur_3.8.jar --robot 'hadur2.Hadur 3.8' --report ../docs/bench/local/2026-10-07_session-38.md"
  ```
  `session-38.txt` is `session-300.txt` with `control=hadur2.Hadur 3.7` and
  `control-jar=bisect/hadur2.Hadur_3.7.jar`. A one-battle smoke run with `--limit 1` on 1.11.1
  completed in the cloud. Compare survival against sub-50 APS bots and
  skipped turns per block of 25 battles between the two sessions.
- **On reproduce:** run the stage bisect (3.8.1 against 3.7, then 3.8 against 3.8.1) under
  the condition that reproduced. Then fix the stage as below.

### Track B: the fix (cloud), shaped by Track A

The fix keeps the route where it pays and returns to 3.7's play where it does not. Whatever
Track A names, the fix takes this shape:

- **Gate by the matchup.** The D route is for opponents 3.7 loses to. When the running score
  share in the battle is above 55% and our gun hits above break-even, use 3.7's power rules and
  aim, without D1's lightest-bullet regime or D4's shadow weighting. Below that line, keep 3.8.
  This targets the 12 top-20 robots 3.7 beats, Nene and Wavelet included, and the whole tail.
- **If the cause is engine-specific** (A1 reproduces), fix the rule that misbehaves on 1.11.1,
  move the bench default to 1.11.1 so every later gate runs on the live engine, and re-record
  the fixtures there.
- **If the cause is session state** (A2 reproduces), fix the state that leaks, and add a
  session gate to the release check.

**Gates for 3.8.5:** top-20 at 5 seeds on 1.11.1 (top-10 gain kept, the over-50% group at or
above 0), the leak set at 16 seeds on 1.11.1 (at or above level), and DrussGT at 20 seeds. Then
upload it, and read the first full live pass against 3.8's page pairing by pairing, as
[live-3.8.md](bench/live-3.8.md) does.

### If nothing reproduces

Then the live rumble is the only instrument that sees the leak. A full pass takes about two
and a half hours. Ship the matchup gate as 3.8.5 on its bench gates (which say it does no harm),
and let one live pass judge it. If the tail is still down, the next candidate is the data path:
3.8.6 would stop reading the stored verdicts (lead-aware, shielder) back from the profile.

## What is not proposed

A strategy rebuild. The DrussGT route is measured as working: DrussGT +13.2 ± 2.5 at 40 seeds,
top 10 +6.5 live-equivalent, and BeepBoop's rounds won went from 4 to 23. The loss sits
somewhere the route was never meant to act, which is a scoping problem.

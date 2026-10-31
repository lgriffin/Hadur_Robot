# Fenced clients beside the bench: run 2

## The fence

```
logical processors 48, read from GetLogicalProcessorInformationEx
L3 groups: 0-11; 12-23; 24-35; 36-47
bench:   CPUs 0-35 (36 threads, 18 cores)
clients: CPUs 36-47 (12 threads, 6 cores), below-normal priority
split: the last of 4 L3 cache groups to the clients
queue fence: off (FENCE = on in host.local fences every card)
```

## Bench (host-check duel block on the bench side: solo with no clients, then duel at 12 and duel10 at 10 workers while the clients fight)

### Host check

Each run against the PC's run of the same battles (BENCH-106). VALID: skipped turns a round within 1.15x the PC's + 0.02, engine disables a 100 within the PC's + 2, and for a duel the level within 1.5 points of the PC's.

| Run | Kind | Workers | Battles | Battles an hour | Skips a round (PC) | Disables /100 (PC) | Level (PC) | Verdict |
|---|---|---:|---:|---:|---:|---:|---:|---|
| solo | duel | 12 | 208 | 2013 | 0.557 (0.465) | 0.5 (3.1) | 82.95 (83.32) | **TOO LOADED** |
| duel | duel | 12 | 208 | 2011 | 0.580 (0.465) | 1.4 (3.1) | 83.04 (83.32) | **TOO LOADED** |
| duel10 | duel | 10 | 208 | 1773 | 0.599 (0.465) | 2.9 (3.1) | 82.83 (83.32) | **TOO LOADED** |

## Hosts

- solo: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)
- duel: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)
- duel10: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 10 (set)

## Verdict

- solo: **TOO LOADED** (skips a round 0.557 over 0.555). Run narrower: --workers 11 (or WORKERS = 11 in hadur-bench/host.local) and check again.
- duel: **TOO LOADED** (skips a round 0.580 over 0.555). Run narrower: --workers 11 (or WORKERS = 11 in hadur-bench/host.local) and check again.
- duel10: **TOO LOADED** (skips a round 0.599 over 0.555). Run narrower: --workers 9 (or WORKERS = 9 in hadur-bench/host.local) and check again.

## Clients (uploads off, against the clean cloud first pass)

### PC qualification: hadur117.Hadur 3.20

**QUALIFIED**: share minus the clean pairing -0.11 ± 0.48 over 317 1v1 battles (bar ±0.5, clean page 2026-10-29T0857Z_roborumble_botdetails_hadur117.Hadur_3.19.csv).

| Client | Battles | Share minus clean |
|---|---:|---:|
| rr01 | 177 | -0.12 |
| rr02 | 140 | -0.10 |

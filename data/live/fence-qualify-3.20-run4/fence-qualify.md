# Fenced clients beside the bench: run 4

## The fence

```
logical processors 48, read from GetLogicalProcessorInformationEx
L3 groups: 0-11; 12-23; 24-35; 36-47
bench:   CPUs 0-35 (36 threads, 18 cores)
clients: CPUs 36-47 (12 threads, 6 cores), below-normal priority
split: the last of 4 L3 cache groups to the clients
queue fence: off (FENCE = on in host.local fences every card)
```

## The gate: fenced bench against today's unfenced bench (base), no clients (solo) and beside the clients (duel)

### Host check

Each run against the PC's run of the same battles (BENCH-106). VALID: skipped turns a round within 1.15x the PC's + 0.02, engine disables a 100 within the PC's + 2, and for a duel the level within 1.5 points of the PC's.

| Run | Kind | Workers | Battles | Battles an hour | Skips a round (PC) | Disables /100 (PC) | Level (PC) | Verdict |
|---|---|---:|---:|---:|---:|---:|---:|---|
| solo | duel | 12 | 208 | 1830 | 0.809 (0.751) | 12.5 (8.7) | 82.84 (82.86) | **TOO LOADED** |
| duel | duel | 12 | 208 | 1838 | 0.722 (0.751) | 9.1 (8.7) | 82.60 (82.86) | **VALID** |

## Hosts

- solo: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)
- duel: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)

## Verdict

- solo: **TOO LOADED** (disables /100 12.5 over 10.7). Run narrower: --workers 11 (or WORKERS = 11 in hadur-bench/host.local) and check again.
- duel: **VALID**.

## For reference: all three against the PC's 2026-10-23 run

### Host check

Each run against the PC's run of the same battles (BENCH-106). VALID: skipped turns a round within 1.15x the PC's + 0.02, engine disables a 100 within the PC's + 2, and for a duel the level within 1.5 points of the PC's.

| Run | Kind | Workers | Battles | Battles an hour | Skips a round (PC) | Disables /100 (PC) | Level (PC) | Verdict |
|---|---|---:|---:|---:|---:|---:|---:|---|
| base | duel | 12 | 208 | 1814 | 0.751 (0.465) | 8.7 (3.1) | 82.86 (83.32) | **TOO LOADED** |
| solo | duel | 12 | 208 | 1830 | 0.809 (0.465) | 12.5 (3.1) | 82.84 (83.32) | **TOO LOADED** |
| duel | duel | 12 | 208 | 1838 | 0.722 (0.465) | 9.1 (3.1) | 82.60 (83.32) | **TOO LOADED** |

## Hosts

- base: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)
- solo: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)
- duel: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)

## Verdict

- base: **TOO LOADED** (skips a round 0.751 over 0.555; disables /100 8.7 over 5.1). Run narrower: --workers 11 (or WORKERS = 11 in hadur-bench/host.local) and check again.
- solo: **TOO LOADED** (skips a round 0.809 over 0.555; disables /100 12.5 over 5.1). Run narrower: --workers 11 (or WORKERS = 11 in hadur-bench/host.local) and check again.
- duel: **TOO LOADED** (skips a round 0.722 over 0.555; disables /100 9.1 over 5.1). Run narrower: --workers 11 (or WORKERS = 11 in hadur-bench/host.local) and check again.

## Clients (uploads off, against the clean cloud first pass)

### PC qualification: hadur117.Hadur 3.20

**NOT QUALIFIED**: share minus the clean pairing -1.29 ± 0.71 over 153 1v1 battles (bar ±0.5, clean page 2026-10-29T0857Z_roborumble_botdetails_hadur117.Hadur_3.19.csv).

| Client | Battles | Share minus clean |
|---|---:|---:|
| rr01 | 89 | -1.65 |
| rr02 | 64 | -0.81 |

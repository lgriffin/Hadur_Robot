# Fenced clients beside the bench: run 3

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
| solo | duel | 12 | 208 | 1851 | 0.614 (0.616) | 4.8 (3.8) | 82.20 (82.68) | **VALID** |
| duel | duel | 12 | 208 | 2016 | 0.602 (0.616) | 2.4 (3.8) | 82.42 (82.68) | **VALID** |

## Hosts

- solo: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)
- duel: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)

## Verdict

- solo: **VALID**.
- duel: **VALID**.

## For reference: all three against the PC's 2026-10-23 run

### Host check

Each run against the PC's run of the same battles (BENCH-106). VALID: skipped turns a round within 1.15x the PC's + 0.02, engine disables a 100 within the PC's + 2, and for a duel the level within 1.5 points of the PC's.

| Run | Kind | Workers | Battles | Battles an hour | Skips a round (PC) | Disables /100 (PC) | Level (PC) | Verdict |
|---|---|---:|---:|---:|---:|---:|---:|---|
| base | duel | 12 | 208 | 1898 | 0.616 (0.465) | 3.8 (3.1) | 82.68 (83.32) | **TOO LOADED** |
| solo | duel | 12 | 208 | 1851 | 0.614 (0.465) | 4.8 (3.1) | 82.20 (83.32) | **TOO LOADED** |
| duel | duel | 12 | 208 | 2016 | 0.602 (0.465) | 2.4 (3.1) | 82.42 (83.32) | **TOO LOADED** |

## Hosts

- base: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)
- solo: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)
- duel: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)

## Verdict

- base: **TOO LOADED** (skips a round 0.616 over 0.555). Run narrower: --workers 11 (or WORKERS = 11 in hadur-bench/host.local) and check again.
- solo: **TOO LOADED** (skips a round 0.614 over 0.555). Run narrower: --workers 11 (or WORKERS = 11 in hadur-bench/host.local) and check again.
- duel: **TOO LOADED** (skips a round 0.602 over 0.555). Run narrower: --workers 11 (or WORKERS = 11 in hadur-bench/host.local) and check again.

## Clients (uploads off, against the clean cloud first pass)

### PC qualification: hadur117.Hadur 3.20

**NOT QUALIFIED**: share minus the clean pairing -1.31 ± 0.61 over 145 1v1 battles (bar ±0.5, clean page 2026-10-29T0857Z_roborumble_botdetails_hadur117.Hadur_3.19.csv).

| Client | Battles | Share minus clean |
|---|---:|---:|
| rr01 | 82 | -1.45 |
| rr02 | 63 | -1.12 |

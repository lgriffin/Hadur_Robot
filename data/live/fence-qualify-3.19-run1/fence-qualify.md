# Fenced clients beside the bench: run 1

## The fence

```
logical processors 48, read from GetLogicalProcessorInformationEx
L3 groups: 0-11; 12-23; 24-35; 36-47
bench:   CPUs 0-35 (36 threads, 18 cores)
clients: CPUs 36-47 (12 threads, 6 cores), below-normal priority
split: the last of 4 L3 cache groups to the clients
queue fence: off (FENCE = on in host.local fences every card)
```

## Bench (host-check battles on the bench side while the clients fight)

### Host check

Each run against the PC's run of the same battles (BENCH-106). VALID: skipped turns a round within 1.15x the PC's + 0.02, engine disables a 100 within the PC's + 2, and for a duel the level within 1.5 points of the PC's.

| Run | Kind | Workers | Battles | Battles an hour | Skips a round (PC) | Disables /100 (PC) | Level (PC) | Verdict |
|---|---|---:|---:|---:|---:|---:|---:|---|
| duel | duel | 12 | 208 | 1867 | 0.898 (0.465) | 18.8 (3.1) | 82.57 (83.32) | **TOO LOADED** |
| team | team | 12 | 92 | 929 | 0.146 (0.119) | 0.0 (0.0) | - | **VALID** |
| duel2 | duel | 12 | 208 | 2010 | 0.706 (0.465) | 6.2 (3.1) | 82.65 (83.32) | **TOO LOADED** |

## Hosts

- duel: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)
- team: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (auto: HADUR_BENCH_WORKERS_TEAM)
- duel2: lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work; robocode.cpu.constant=1488498 (pinned with --cpu-constant); parallel 12 (set)

## Verdict

- duel: **TOO LOADED** (skips a round 0.898 over 0.555; disables /100 18.8 over 5.1). Run narrower: --workers 11 (or WORKERS = 11 in hadur-bench/host.local) and check again.
- team: **VALID**.
- duel2: **TOO LOADED** (skips a round 0.706 over 0.555; disables /100 6.2 over 5.1). Run narrower: --workers 11 (or WORKERS = 11 in hadur-bench/host.local) and check again.

## Clients (uploads off, against the clean cloud first pass)

### PC qualification: hadur117.Hadur 3.19

**TOO FEW BATTLES (0 < 40)**: share minus the clean pairing +0.00 ± 0.00 over 0 1v1 battles (bar ±0.5, clean page 2026-10-29T0857Z_roborumble_botdetails_hadur117.Hadur_3.19.csv).

| Client | Battles | Share minus clean |
|---|---:|---:|

# Team death read: HadurTeam 3.19 master vs Ogi, Firestarter, Combat (cloud, 10 seeds from 5800, 12 rounds)

Bench: hadur-bench/work/death-read (cloud, parallel 2). Deaths read from bullets.log: a robot's last appearance more than 30 ticks before the round's last shot.

| Opponent | rounds | our deaths/round | their deaths/round | our first death (median tick) | theirs | leader dies first | leader dies | enemy shooters on a dying member (100 t) | ours on theirs | enemy hit dist on us (median) | our hit dist on them | enemy hit power on us | ours on them | mates within 200 px of a hit member |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.FirestarterTeam | 120 | 4.24 | 3.64 | 410 | 258 | 1% | 56% | 1.42 | 1.99 | 550 | - | 2.18 | 2.03 | 0.05 |
| cz.libors.OgiTeam | 120 | 3.83 | 2.69 | 394 | 382 | 0% | 12% | 1.76 | 1.69 | 480 | - | 1.82 | 2.01 | 0.05 |
| mn.CombatTeam | 120 | 3.48 | 3.91 | 474 | 261 | 1% | 23% | 1.37 | 2.10 | 523 | - | 1.85 | 1.92 | 0.06 |


Subject: hadur117.Hadur* or hadur2.Hadur*

Runs: hadur-bench/work/death-read

Battles read: 30 over 3 opponents (10 per opponent); incomplete directories left out: none.

## By band

| Band | Rounds | Won % | Lost/round | Lost/won round | First death | Round length | Last shot | Dmg taken/round | Dmg dealt/round | Their hit % | Our hit % | Their focus % | Own-fire dmg/round |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| top 8 | 360 | 22.5 | 4.45 | 2.54 | 414 | 1058 | 1108 | 324 | 321 | 15.7 | 12.8 | 32 | 31 |

## Our hits on our own members, by kind

| Band | Hits | lane | walkin | beyond | noline | unseen |
|---|---|---|---|---|---|---|
| top 8 | 1393 | 4% | 28% | 10% | 54% | 4% |

## By opponent (fewest round wins first)

| Opponent | Rounds | Won % | Lost/round | Lost/won round | First death | Round length | Last shot | Dmg taken/round | Dmg dealt/round | Their hit % | Our hit % | Their focus % | Own-fire dmg/round |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cz.libors.OgiTeam | 120 | 8.3 | 4.83 | 2.90 | 394 | 904 | 908 | 329 | 262 | 16.0 | 12.2 | 33 | 29 |
| cb.fire.FirestarterTeam | 120 | 20.0 | 4.53 | 2.62 | 414 | 1165 | 1260 | 324 | 336 | 14.8 | 12.4 | 32 | 32 |
| mn.CombatTeam | 120 | 39.2 | 3.99 | 2.43 | 460 | 1134 | 1151 | 319 | 365 | 16.1 | 13.7 | 32 | 31 |

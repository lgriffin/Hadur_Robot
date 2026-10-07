# Nullstride in the mid-table: what the compare page says, and the bench to test it

Issue #140. Prepared 2026-10-07 while the #138 overnight run was going. This is analysis of the
saved compare page and a ready plan; no battles have been run for it yet.

Source: `data/rumble/parsed/2026-10-07T2058Z_roborumble_botcompare_Nullstride_2.3.3_vs_hadur2.Hadur_3.9.csv`
(1,214 shared opponents), joined to `2026-10-07T2028Z_roborumble_rankings.tsv` for rank. Every
figure below is a mean over pairings of Nullstride minus Hadur 3.9, from the live rumble.

## What the data says beyond the issue

**1. The gap is not a mid-table feature; it falls steadily with the opponent's rank.**

| Ranks | Bots | Gap (APS) | Hadur survival | Nullstride survival | Share of the 7.85 APS lead |
|---|---|---|---|---|---|
| 1-20 | 18 | +23.25 | 59.4 | 89.6 | 0.34 |
| 21-50 | 30 | +22.87 | 77.2 | 96.3 | 0.57 |
| 51-100 | 50 | +18.91 | 82.9 | 97.2 | |
| 101-150 | 50 | +16.25 | 88.4 | 98.0 | |
| 151-250 | 100 | +13.48 | 91.8 | 98.5 | |
| 251-400 | 150 | +11.62 | 93.0 | 98.9 | |
| 51-400 | 350 | +13.85 | 90.7 | 98.4 | **3.99** |
| 401-700 | 300 | +7.81 | 97.0 | 99.6 | 1.93 |
| 701+ | 516 | +2.39 | 99.4 | 99.9 | 1.02 |

Ranks 51-400 carry half the lead (3.99 of 7.85) because there are 350 of them and the gap is
still 14 there, not because it peaks there. Nullstride is simply a stronger bot than Hadur
against everything, by a margin that narrows as the opponents get weaker.

**2. Survival explains less than half of the mid-table gap.** Across the 350 pairings,
APS gap = 7.7 + 0.78 x survival gap (r = 0.69). The survival gap averages 7.8 rounds in 100, so
survival accounts for about 6.1 of the 13.85. The other 7.7 is score Nullstride makes without
winning more rounds. Where Hadur wins 99.5% or more of rounds (32 bots) the gap is still +6.0.
So M1 and M4 (lost rounds) can explain at most about half; M2 and M3 (how fast and how cleanly
a won round is scored) have to explain the rest.

**3. The gap sits on DrussGT's shield-target list.** `shield-list.txt` holds the 296 robots
DrussGT's own list names as ones a shielder beats it on.

| Ranks 51-400 | Bots | Gap | Nullstride APS | Hadur APS |
|---|---|---|---|---|
| On DrussGT's shield list | 153 | **+17.11** | 95.5 | 78.4 |
| Off it | 197 | +11.33 | 89.1 | 77.8 |

Eight of the ten worst pairings, 17 of the worst 20 and 30 of the worst 40 are on that list
(LifelongObsession, Crusader, Tigger, Pear, Cyanide, Raiko, MicroAspid, Engineer, ...). Nullstride
scores 99 or more against 75 mid-table bots, 60 of them on the list. Hadur's own D5 list covers
14 of the 350, and the gap against those is the smallest in the table, +5.7. That is what
shielding looks like: where Hadur shields, it nearly closes the gap; where it does not, the
gap is the largest. This makes M2 the leading hypothesis, ahead of the order the issue gives.
It is still inference: the list says a shielder beats DrussGT there, not that Nullstride shields.

## Relationship to #138 and the 3.10 target

- The 3.10 target (the weak tail, ranks 401+) is worth 2.95 of Nullstride's 7.85 and about the
  whole 0.57 that Tomcat, Knight and Raven lead by. The mid-table is worth more but looks harder:
  Nullstride's margin there is a stronger bot, not a leak of the kind the tail shows.
- #138's `tail-knight` step uses the new reference-bot support. `mid-null` below is the same
  idea against a stronger bot, so it can only run once that support is in (it is: PR #141).
- The A2 score split (ram, bullet bonus, last-survivor bonus) separates survival bonus from
  damage for Nullstride. A shielder shows a very low opponent bullet damage; the split reads that
  directly.

## The bench (plan `plans/mid-39.queue`)

| Step | Candidate | Baseline | Set | Answers |
|---|---|---|---|---|
| `mid` | Hadur 3.9 | Hadur 3.4 | `mid-39.txt` (40) | M1, M3, M4 from Hadur's own logs (per-round hit rate, round length, lost-round autopsy) |
| `mid-shieldall` | 3.9 with the shield list on for everyone | Hadur 3.9 | `mid-39.txt` | M2 from our side, off DrussGT's list |
| `mid-shieldall-list` | same | Hadur 3.9 | `mid-shield-39.txt` (30) | M2 where the gap is largest |
| `mid-null` | Nullstride 2.3.3 | Hadur 3.9 | `mid-39.txt` | what Nullstride's points are made of |
| `mid-null-list` | Nullstride 2.3.3 | Hadur 3.9 | `mid-shield-39.txt` | the same on DrussGT's list |

All at 8 seeds, 35 rounds, engine 1.11.1, CPU constant 1488498 and a 2G child heap, on a host
with no other Robocode JVMs. `mid-39.txt` is 40 bots drawn at random (seed 39) from ranks 51-400, leaving out
DrussGT's list and Hadur's D5 list; `mid-shield-39.txt` is 30 drawn the same way from the
list's mid-table members. All 70 jars are in the archive. Nullstride 2.3.3 is not: `prep` copies it
from the RoboRumble client's `robots` directory.

`build-ablation.sh shield-all` is new: it makes `ShieldList.matches` true for every robot, so
each 1v1 round opens in shield mode. SHIELD-6 still bounds the cost, leaving shield mode once
the enemy's bullets would hold the score share under 85%. It builds as `3.9sa`.

## Not done, and why

- **Engine-side bullet-on-bullet count.** M2 asks for it to confirm Nullstride shields. Hadur's
  own `bulletsIntercepted` is logged already; the engine count for a reference bot needs a turn
  listener that follows bullet state, which makes the engine build a snapshot every tick. That cost
  should be measured before it is made a default, so it is left for the discussion. Until then,
  `mid-null`'s opponent bullet damage (A2) is the indirect read.
- **A pairing-level hit-rate for Nullstride's opponents.** Not available from the compare page.

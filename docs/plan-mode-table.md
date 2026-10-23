# Plan: a per-opponent mode table for 1v1 (Saguaro's approach), 2026-10-23

Leigh (12:21 UTC): "We had that as an idea but you dismissed it. Why can't we do it?" We can. This
plan replaces the per-bot switch tailoring that was set aside on 2026-10-19.

## Why the 2026-10-19 version failed and this one need not

The opposition census tried choosing, per bot, among small switches of one behaviour (surf and gun
tweaks). Their per-bot effects were small (correlation about 0.1 between two censuses) and each bot
had 2-4 seeds, so the per-bot pick was mostly noise: +0.18 per bot against +0.20 for one global
setting. Saguaro chooses among behaviours that differ a lot on a given opponent (shoot its bullets
down, dodge its exact aim, stop-and-go against its learning) and plays each opponent for dozens of
battles before locking one. Hadur's own shield list is this idea for one mode, and it was worth
about +1.4 APS (3.10 and 3.13 releases).

## What Saguaro's table says is available (docs/bench/rivals-source-read.md)

Saguaro's lead over Hadur 3.15, grouped by the mode its table locks for each opponent:

| Mode Saguaro locks | Bots | Saguaro's lead (APS) | Hadur's counterpart |
|---|---|---|---|
| Shield, standing, bots not on Hadur's list | 72 | +0.62 | shield mode exists; list-only |
| Shield, moving, bots not on Hadur's list | 55 | +0.37 | none: needs a moving shield |
| Shield, bots on Hadur's list | 173 | +0.40 | shield quality |
| Exact dodge of a simple aim | 429 | +0.60 | none: needs a simple-aim dodge mode |
| Stop-and-go against surfers (both kinds) | 148 | +0.87 | none |
| Exact path prediction (mostly rammers) | 39 | +0.16 | RAM-2 escape only |
| Anti basic surfer | 33 | +0.10 | none |
| Its general mode | 252 | -0.55 | Hadur's surf is better: keep it |

The table's total is about +3.0 APS above Hadur where Saguaro tailors, and -0.55 where it does not.
Top 5 needs +1.93 over 3.15.

## Stages

Each stage is a mode, built duel-only and off by default, chosen per opponent by a shipped table
(`ModeTable`, like `ShieldListData`). Every mode needs tests, architecture notes and EARS rows, as usual.

1. **M1, table and selector, with the modes Hadur already has.** The selector reads the table at the
   first scan; no entry means the normal surf. Train on the PC: for every opponent, standing shield
   vs normal surf, 8 battles each, on the bots not already on the shield list (about 1,000 bots,
   16,000 battles, one night). Lock shield where it beats surf by a set margin, as the shield sweep did.
   Expected +0.2 to +0.5 APS, the 72 standing-shield bots Saguaro wins first.
2. **M2, simple-aim dodge mode.** Identify the enemy's aim among head-on, linear, circular and
   averaged linear from its bullets, then move to where that aim cannot hit. Train on the 429 bots
   Saguaro dodges plus the rammers. Expected +0.2 to +0.4.
3. **M3, stop-and-go against surfers.** Train on the 148 bots Saguaro poisons. Expected +0.2 to +0.4.
4. **M4, moving shield.** The largest build; on the 55 bots Saguaro moving-shields. Expected +0.1 to +0.3.
5. **Census of the full table against 3.15** before any release, with an A/A arm, gate +0.5 with the
   interval above +0.3 (the plan-top5 bar).

Central total about +1.0 to +1.6 APS: about 5th to 6th on its own. Top 5 is reached at the
upper end, or with the field-wide simple-aim experts in the surf on top.

## Risks

- **Training noise.** 8 battles per mode per bot gives about ±4 points a bot; the lock margin must
  sit above that, as the shield sweep's did. Re-check the locked bots with fresh seeds before shipping.
- **Live is not the bench.** 3.15 lost about 0.5 between bench and live. A table entry that wins
  by 10+ points on the bench is less exposed than a 0.2 switch, which is the point of this design.
- **New versions of opponents** fall back to the normal surf (name match without version, as the
  shield list does).
- **Data size** is not a problem: one byte a bot in a class, as `ShieldListData`.

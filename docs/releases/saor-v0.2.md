Saor 0.2 is Hadur's MicroMelee entry: corner oscillation and a per-opponent Markov gun, in one
class at 748 bytes ([docs/saor.md](../saor.md), [plan for 1st](../plan-saor-first.md)).

What changed from 0.1:

- **A graded vote, Saor's own.** 0.1 waited for 8 samples before it trusted a pattern, which cost
  1.35 APS. 0.2 plays out any pattern it has seen, but a playout through one with fewer than 8
  samples votes at most 5 + 12 per sample (SAOR-6, SAOR-7). Stage 2: +1.28 on the live-shaped
  census (PR #311).
- **More learning.** A transition is learned while gun heat is below 0.9, not 0.7: about +0.27
  on both censuses (PR #329).
- **No ram leg.** The 50 px leg after a collision (SAOR-9) measured level and is retired. Its
  bytes pay for the graded vote.

- **Bench, engine 1.11.1, 1000 x 1000, 35 rounds** (pc-saor-s03, PR #329). On the live-shaped
  census, which read Saor 0.1 within 0.2 of its live 68.08, 0.2 reads **69.83 ± 0.18**, and
  Figment 1.0 reads 69.79 ± 0.19 in the same run. On the MicroMelee census 0.2 gains +1.82 ± 0.33
  over 0.1.
- **Expected standing.** About 69.6 live after the run's +0.2 offset: a close fight with Figment
  (69.37) for 1st, ahead of Wallaby (68.96). It is a tie on the bench, not a sure 1st.

The line for the MeleeRumble participants page, in place of 0.1's:

```
hadur117.micro.Saor 0.2,https://github.com/lgriffin/Hadur_Robot/releases/download/saor-v0.2/hadur117.micro.Saor_0.2.jar
```

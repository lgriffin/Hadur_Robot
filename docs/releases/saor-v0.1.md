Saor 0.1 is Hadur's MicroMelee entry: corner oscillation and a per-opponent Markov gun with a
circular cold start, in one class at 749 bytes, the MicroMelee limit ([docs/saor.md](../saor.md)).

- **Bench, engine 1.11.1, 1000 x 1000, 35 rounds.** Micromelee census of 156 opponents in 18
  fields of 9: **66.45 ± 0.24 APS** ([arm screen](../bench/local/saor-arms-screen.md), PR #284;
  the first card read 66.32 ± 0.25, PR #278). Survival 51.7% of rounds won, against Capulet's 29.2.
- **Expected standing.** 4th on the 2026-10-25 MicroMelee rankings is Sprout at 66.67 and 5th is
  Quantum at 65.61. The bench has no live calibration for MicroMelee yet, and Hadur's 1v1 ran 0.5
  to 0.7 under its bench live, so 0.1 lands somewhere around 4th to 6th. This release is entered
  to get that calibration.
- **Weak spot.** The final duel against the top three: Saor wins 23% of them against Wallaby, 38%
  against Figment and 53% against Capulet, and 85-89% against anyone else. None of the five
  changes screened on the PC (power caps and leg lengths) beat 0.1 on the census.

The line for the MeleeRumble participants page (the server files it as MicroMelee from its
codesize):

```
hadur117.micro.Saor 0.1,https://github.com/lgriffin/Hadur_Robot/releases/download/saor-v0.1/hadur117.micro.Saor_0.1.jar
```

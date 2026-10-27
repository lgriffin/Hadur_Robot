Saor 0.3 is Hadur's MicroMelee entry: corner oscillation and a per-opponent Markov gun, in one
class at 723 bytes ([docs/saor.md](../saor.md), [plan for 1st](../plan-saor-first.md)). 0.2 took
MicroMelee 1st by 0.06, a tie on the numbers; 0.3 is stage 5's arm LAU, to make the lead clear.

What changed from 0.2:

- **Learning on every scan.** A transition is learned whenever the target is scanned, not only
  below 0.9 gun heat (arm LA, +0.45 ± 0.29 on the MicroMelee census, PR #347).
- **No end-game power cap.** Power is range power alone; the cap of others / 3 + 1.9 (SAOR-8)
  is retired for SAOR-17. It measured level on its own (arm U2, PR #347), and its bytes go.

- **Bench, engine 1.11.1, 1000 x 1000, 35 rounds** (pc-saor-s05, PR #360). Live-shaped census,
  Figment seated in the same run: 0.2 69.83 ± 0.19, Figment 69.83 ± 0.18, **0.3 70.05 ± 0.18**,
  +0.26 ± 0.26 over 0.2 field by field. MicroMelee census: +0.49 ± 0.33 over 0.2.
- **Expected standing.** The run reads 0.2 at +0.41 over its live 69.42, so 0.3 projects to about
  69.6 to 69.7 live against Figment's 69.36: a lead of about 0.3, inside one pass's noise. It
  misses the card's bar of +0.5 over Figment, and is released on Leigh's call for live numbers.

The line for the MeleeRumble participants page, in place of 0.2's:

```
hadur117.micro.Saor 0.3,https://github.com/lgriffin/Hadur_Robot/releases/download/saor-v0.3/hadur117.micro.Saor_0.3.jar
```

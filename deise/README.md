# Deise

`hadur117.mini.Deise` is Hadur's MiniMelee robot, built to take MiniMelee 1st from
kc.mini.Mirage 0.2: Saor's graded Markov gun, learning every robot it scans, over a least-risk
movement that steps off the lines of the shots it sees fired (since 0.3) and keeps furthest from the robots likely aiming at it (since 0.4). The design, the Mirage analysis and
the stages are in [docs/deise.md](../docs/deise.md); the requirements are DEISE-1 to DEISE-16 in
[docs/requirements.md](../docs/requirements.md).

## Standing

LiteRumble scores the size rumbles from the same MeleeRumble battles. MiniMelee is the target.

| Version | Date (UTC) | Rumble | Rank | APS | Battles | 1st | Gap to 1st |
|---|---|---|---|---|---|---|---|
| 0.4 | 2026-10-30 14:02 | **MiniMelee** | **2nd of 206** | **70.54 ± 0.36** | 559 | kc.mini.Mirage 0.2, 71.15 | +0.61 |
| 0.3 | 2026-10-28 23:22 | MiniMelee | 2nd of 206 | 69.81 ± 0.33 | 641 | kc.mini.Mirage 0.2, 71.19 | +1.38 |
| 0.3 | 2026-10-28 23:35 | MeleeRumble | 15th of 418 | 66.59 | 1,282 | aaa.r.ScalarR 0.005g.047, 72.71 | +6.12 |
| 0.2 | 2026-10-27 23:45 | MiniMelee | 2nd of 205 | 69.68 ± 0.39 | 533 | kc.mini.Mirage 0.2, 71.20 | +1.52 |
| 0.2 | 2026-10-27 23:45 | MeleeRumble | 16th of 417 | 66.44 ± 0.26 | 1,121 | aaa.r.ScalarR 0.005g.047, 72.75 | +6.31 |

**Deise 0.2 is 2nd in MiniMelee** on a full first pass (204 of 204 pairings), 1.52 behind
Mirage and ahead of Saor 0.3, Figment and Wallaby. Its survival is 42.4% against Mirage's
55.5%, and that is the gap: Mirage is its worst pairing (47.5), then Saor (50.3). In the full
MeleeRumble it is 16th, three places above Saor. The live-shaped MiniMelee census
(`pc-deise-e01`, PR #371) projected 69.46 for it, 0.22 under the live score, so the bench
transfers. On that census the seen-shot waves (arm W) add +0.48 ± 0.25, and the rest of the
stage E0 arms are within noise; the waves do not fit in the 9 bytes left, so stage E1 measures
what can pay for them. The pages are archived in `data/rumble/pages/` under 2026-10-27T2345Z*.

**Deise 0.3** (released 2026-10-28) fits the waves into one class at 1,494 bytes. It adds 200
playouts, and drops the across term, the hold, the corners, the kill cap and the hit correction
to make room. Stage E1b measured those parts at +0.48 to +0.83 over 0.2 on the census;
`pc-deise-e04` measures the fitted class as a whole.

**Deise 0.3 is 2nd in MiniMelee** on a full first pass (205 of 205 pairings, 641 battles):
69.81 ± 0.33, 1.38 behind Mirage, where 0.2 was 1.52 behind. Against the same 204 opponents it
is +0.18 over 0.2, inside one pass's noise. Its survival rose from 42.4% to 45.8%, both against
the 20 strongest opponents (34.8% to 36.5%) and the rest (43.2% to 46.8%), so the waves do what
they were built for. Survival is still the gap, though: Mirage survives 55.6%. The bench's
nearest arms promised about +0.8 over 0.2, so the score gained less than the survival did.
`pc-deise-e04` (PR #411) holds 0.3 on the bench (+1.33 over Saor, bar +1.1) and puts Mirage 1.46
ahead, close to live's 1.38. There, damage and final duels are level with Mirage, and the gap is
reaching the final duel (64% of rounds to Mirage's 76%). Stage E3a (`pc-deise-e05`) screens
crowd-survival arms ([docs/deise.md](../docs/deise.md)). Each pairing has only about three
battles, so single pairings are too noisy to read (Mirage 48.8, Saor 53.8, Figment 55.3).
In the full MeleeRumble it is 15th, one place above 0.2. The pages are archived in
`data/rumble/pages/` under 2026-10-28T2322Z* and 2026-10-28T2323Z*.

**Deise 0.4** (released 2026-10-30) is stage E3b's FAP, still one class at 1,499 bytes. It
tests at every scan whether each opponent is likely aiming at it, and that weight now scales
the opponent's push as well as its waves: a likely shooter pushes twice as hard as one aiming
elsewhere, and every push is stronger against the waves. The field cap on power is gone. On the
bench (`pc-deise-e06`, PR #443) it reads +0.39 ± 0.22 over 0.3, and Mirage's lead there falls from
1.21 to about 0.85.

**Deise 0.4 is 2nd in MiniMelee** on a full first pass (205 of 205 pairings, 559 battles):
70.54 ± 0.36, 0.61 behind Mirage, where 0.3 was 1.38 behind. Against the same 204 opponents it is
+0.71 over 0.3, more than the bench's +0.39. Survival rose from 45.8% to 54.7%, level with
Mirage's ~55.6%, and against the 20 strongest opponents from 37.9% to 49.0%. The crowd-survival
work closed the survival gap; the 0.61 left has to come from elsewhere. Saor 0.3 is 3rd (69.06).
The pages are archived in `data/rumble/pages/` under 2026-10-30T1402Z*.

0.2 is MiniMelee sized: one class, 1,490 bytes of 1,499, the core flattened by hand and held to it
order for order (DEISE-16). 0.1 went out unfitted at 2,303 bytes by mistake and is not listed.

Releases are tagged `deise-v<version>` by `.github/workflows/release-deise.yml`, with notes in
`docs/releases/deise-v<version>.md`.

## Build

    mvn -pl deise -am verify

The shipped jar is `deise/target/hadur117.mini.Deise_<version>.jar` (one class, through ProGuard);
`DeiseJarIT` prints its codesize. The bench adapter's jar is `hadur117.mini.DeiseLab_<version>.jar`.

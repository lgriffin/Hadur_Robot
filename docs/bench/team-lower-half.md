# Where the team ladder score is lost (HadurTeam 3.11, 2026-10-11)

HadurTeam 3.11 is 12th in the TeamRumble at 64.61 APS, 2.07 below 10th (rz.HOFSwarm 1.1, 66.68)
and 0.07 below 11th (davidalves.PhoenixTeam 0.54). Over 45 pairings, 2.07 APS is 93 points of score
share. This note finds where those points go, using the saved ladder page, the 3.8.5 top-20 team bench
and a cloud run made for this note, and screens three team-only rules (none helped). It changes no robot code.

## 1. The ladder page says Hadur wins more pairings than the teams above it

From `data/rumble/pages/2026-10-11T0716Z_teamrumble_rankings.mht` (the parsed TSV keeps only rank,
name and APS; these columns come from the page itself):

| Rank | Team | APS | PWIN | Survival | Pairings | Battles |
|---|---|---|---|---|---|---|
| 8 | rz.GlowingHawks 0.2 | 68.62 | 80.00 | 75.16 | 45 | 638 |
| 9 | kawigi.micro.ArmyOfShiz 1.1 | 67.05 | 77.78 | 72.39 | 45 | 612 |
| 10 | rz.HOFSwarm 1.1 | 66.68 | 75.56 | 69.86 | 45 | 633 |
| 11 | davidalves.PhoenixTeam 0.54 | 64.68 | 68.89 | 71.72 | 45 | 670 |
| 12 | **hadur2.HadurTeam 3.11** | **64.61** | **77.27** | **74.16** | 44 | 223 |
| 13 | kid.team.OmegaSquad .0.2 | 63.40 | 66.67 | 67.52 | 45 | 656 |

Hadur wins a larger share of its pairings than HOFSwarm or Phoenix and survives more, yet scores less.
It wins pairings by less than they do. Its page also has a third of their battles (223 against
600-700) and one pairing missing, so its APS carries the widest interval of the group (±0.57).

## 2. The 3.8.5 bench: the top 20 is not where the gap is

The only Hadur figures against the top 20 are the 3.8.5 runs (`2026-10-07_team-top20-385-vs-38.md`:
35 rounds, Robocode 1.9.5.6, 10 seeds). Against the teams just above it Hadur is ahead head to head:
GlowingHawks 52.6%, HOFSwarm 52.1%, Phoenix 56.0%, OmegaSquad 59.4%. Its deep losses are the top five
(15.6-24.9%), Xmen 36.9% and ArmyOfShiz 40.3%. Two of them are far below what a team at Hadur's APS
would get by a fitted logistic of the whole ladder: Polylunar 17.7% (model 43%) and Nightmare 15.6%
(model 31%). Those two are also the only teams 3.8 got worse against than 3.7. Both are single-team
gaps, so under the whole-field rule they are noted, not chased.

## 3. The cloud run: the lower half is where the gap is

Hadur 3.11 and three of the teams around it (HOFSwarm 10th, ArmyOfShiz 9th, Phoenix 11th) each fought
every team ranked 21-46 at TeamRumble settings: 1200x1200, 10 rounds, Robocode 1.11.1, 3 seeds, cold.
The run was on a 4-core cloud container, width 1. Hadur skipped 1.7-1.8 turns a battle with no duress.
Rows (with the three ablations of section 5): `data/bench/2026-10-11_team-lower-half-cloud.tsv`. Set: `hadur-bench/team-lower26.txt`, also split
into `team-lower26a.txt` (ranks 21-33) and `team-lower26b.txt` (ranks 34-46). The bench already takes
any team jar as the subject (`--robot-jar`, `--robot`, `--member`). The sample team failed for the three
peers (a set-name slip, fixed before Hadur's run), so the pooled means use the 25 other teams.

| Subject | Ranks 21-46 (25 teams) | Ranks 21-33 | Ranks 34-46 |
|---|---|---|---|
| **hadur2.HadurTeam 3.11** | **77.4%** | **65.6%** | 89.2% |
| rz.HOFSwarm 1.1 | 81.9% | 74.9% | 88.7% |
| kawigi.micro.ArmyOfShiz 1.1 | 81.2% | 77.7% | 84.7% |
| davidalves.PhoenixTeam 0.54 | 82.2% | 75.8% | 88.5% |

Against ranks 21-46 Hadur is 4.4 points a pairing behind the three peers. Spread over 45 pairings that
is about 2.4 APS, more than the 2.07 to 10th. The whole deficit is in ranks 21-33 (about 10 points a
pairing); against ranks 34-46 Hadur is level or ahead.

Check against live: these cloud figures plus the 3.8.5 bench's top-20 shares give Hadur about 63.2 APS
against a live 64.61. That is close enough to trust the shape, not the decimals: the bench runs 35
rounds on an older engine, and Hadur's live page has few battles.

Per team, Hadur's share against the mean of the three peers:

| Rank | Team | Hadur | HOFSwarm | ArmyOfShiz | Phoenix | Hadur - peers |
|---|---|---|---|---|---|---|
| 21 | apvteam.MambaTeam 0.7.5 | 51.7 | 70.7 | 71.4 | 54.4 | -13.8 |
| 22 | kawigi.sbf.TidalWave 0.8 | 66.3 | 65.1 | 80.6 | 52.5 | +0.3 |
| 23 | gh.nano.GrofGroup 1.1 | 61.3 | 58.5 | 75.2 | 78.7 | -9.5 |
| 24 | jab.DiamondStealers 5 | 58.5 | 84.1 | 89.8 | 83.3 | -27.3 |
| 25 | ethdsy.MalackaTeam 1.2 | 80.1 | 66.3 | 61.7 | 77.9 | +11.4 |
| 26 | amz.TeamDeathTeam 1 | 44.8 | 74.8 | 66.8 | 75.3 | -27.5 |
| 27 | jab.Enjambre 3 | 50.5 | 85.8 | 74.1 | 81.9 | -30.1 |
| 28 | vuen.Bakery 2.51 | 90.8 | 78.3 | 85.9 | 84.0 | +8.0 |
| 29 | mn.nano.perceptual.ImpactTeam 1.3.0 | 49.1 | 70.1 | 58.3 | 69.8 | -17.0 |
| 30 | pedersen.ImWithStupidTeam 1.3 | 74.1 | 81.9 | 84.7 | 79.0 | -7.7 |
| 31 | pedersen.ImWithDroidTeam 1.3 | 70.4 | 80.5 | 83.0 | 71.1 | -7.8 |
| 32 | mskwik.BumblingIdiots 1.0 | 90.4 | 68.4 | 89.8 | 88.3 | +8.2 |
| 33 | sgp.DrunkenTeam 1.12 | 65.0 | 89.8 | 88.9 | 89.0 | -24.3 |
| 34 | CharlieN.OmegaTeam.OmegaTeam 1.0 | 83.6 | 91.2 | 86.6 | 85.5 | -4.1 |
| 35 | jeremyreeder.collective.FourProphetsAndADiscliple 5 | 83.6 | 68.8 | 63.3 | 75.8 | +14.3 |
| 36 | dummy_team.BlindFighters 1.01 | 95.0 | 93.8 | 73.7 | 91.3 | +8.7 |
| 37 | lxx.ConceptATeam 0.8 | 81.9 | 84.9 | 83.0 | 79.8 | -0.7 |
| 38 | sp.Minis.GeneBotUpgrade 1.1 | 86.7 | 90.5 | 85.1 | 87.0 | -0.8 |
| 39 | ms.AresHaikuTeam 0.3 | 91.0 | 80.1 | 83.2 | 91.3 | +6.1 |
| 40 | gimp.GimpTeam 0.1 | 86.2 | 87.4 | 90.8 | 87.5 | -2.4 |
| 41 | ntc.slippery.Slippery 1.0 | 91.2 | 92.5 | 78.6 | 91.3 | +3.7 |
| 42 | bugger.BuggerHive 1.0 | 90.3 | 89.1 | 81.2 | 87.4 | +4.4 |
| 43 | Polkwane.PTeam 1.0 | 93.0 | 94.8 | 95.1 | 92.7 | -1.2 |
| 44 | sampleteam.MyFirstTeam 1.0 | 94.7 | - | - | - | - |
| 45 | logiblocs.SittingDroidTeam 1.0 | 100.0 | 100.0 | 100.0 | 100.0 | 0.0 |
| 46 | mn.SuperSittingDuckTeam 1.0.2 | 100.0 | 100.0 | 100.0 | 100.0 | 0.0 |

Three seeds give each team cell a spread of roughly ±5-8 points, so single rows are not results. The
group figures are.

## 4. How the points are lost: Hadur's members die

The seven teams with the largest deficits (Mamba, GrofGroup, DiamondStealers, TeamDeath, Enjambre,
ImpactTeam, Drunken) were picked after the fact, so read this as a description of how the points go,
not a test. Score per round, from each battle's `team.csv`; "other" is score minus survival and bullet
damage (bonuses and ram):

| Against | Subject | Share | Rounds won | Own survival | Own bullet dmg | Their survival | Their bullet dmg | Their other |
|---|---|---|---|---|---|---|---|---|
| the 7 | Hadur 3.11 | 54.4% | 76% | 751 | 329 | 498 | 434 | 125 |
| the 7 | HOFSwarm | 76.3% | 91% | 1029 | 444 | 220 | 266 | 49 |
| the 7 | ArmyOfShiz | 74.9% | 90% | 990 | 425 | 259 | 250 | 57 |
| the 7 | Phoenix | 76.1% | 94% | 1021 | 450 | 229 | 270 | 43 |
| the other 18 | Hadur 3.11 | 86.4% | 98% | 1115 | 349 | 80 | 190 | 13 |
| the other 18 | HOFSwarm | 84.1% | 93% | 1028 | 373 | 166 | 141 | 18 |

From the members' own logs (`R` record result, `has died` line, `E` record for enemies alive):

- Against the seven, a Hadur member dies in **62%** of member-rounds. Against the other 18 it is **12%**.
- Members die early: the median death across ranks 21-33 is about tick 500, with about 3 of the 5
  enemies still alive. Each such death gives every living enemy 50 survival points, which is why
  their survival score is double the peers' while Hadur still wins three rounds in four.
- The leader (first member, 200 energy) dies in 32% of rounds. The engine takes 30 energy from every
  living teammate when the leader dies (checked in `RobotPeer` of Robocode 1.11.1), and a robot that
  implements `Droid` starts with 120. No top-3 team uses droids.

So the leak is the same shape as in 1v1: **bullet damage taken from teams with simple guns**, here
paid twice because each early death also hands the opponent survival points. It is not targeting
and it is not rounds lost to strong teams.

## 5. Three team-only rules screened (cloud, ranks 21-33, 3 seeds, paired with 3.11)

Each is an ablation in `hadur-bench/build-ablation.sh`, applying only while a member has living
teammates, so 1v1 and melee play is untouched. The difference is the paired score share (candidate minus
3.11) per team, then the mean over the 13 teams with a 95% interval across teams.

| Ablation | What it does | Mean difference | Reading |
|---|---|---|---|
| `tpost` (3.11tp) | Melee posture always NORMAL on a team. On a team, two enemies hit by our own members look like a fight between them (`EnemyTracker.engagedPairs`), so LET_THEM_FIGHT backs the member away from its teammates' fight. | +0.7 ± 2.2 | Nothing. The misfire is real in code but costs no measurable score. |
| `tfocus` (3.11tf) | Every member's gun weights the lowest-energy enemy three times over, so members converge on one target. | **-2.2 ± 1.8** | Worse. Against the seven, their survival score rose 498 to 518. Converging does not kill faster. |
| `tfence` (3.11tn) | The WEAVE-8 teammate fence never replaces a drive. | -1.1 ± 2.7 | Nothing, and teammate collisions rose 78 to 5,389. The fence stays. |

## 6. Candidate changes, in order

**Isolation rule (Leigh, 2026-10-11): no team change may touch 1v1 play in any way.** Every candidate
below acts only while a member has living teammates, reached through `teamLink != null` or a non-empty
teammate list, as T1 did. Any build must keep every 1v1 and melee replay fixture bit-identical with
none re-recorded (`ReplayTest`) and leave `DuelIdentityTest` and the duel packages untouched; only the
team fixtures may be re-recorded.

1. **Team-aware enemy shot detection (code reading, untested).** Melee dodging works from enemy shots
   inferred from energy drops (`EnemyInfo.update`, MSENSE-2). A drop is a shot only if it is 0.1-3.0
   after Hadur's *own* hits are taken off (`pendingOwnDamage`). On a team the enemies are also hit by
   four teammates, and each enemy regains 3x power whenever it hits any of our members. A link report
   (`link/Report.java`) carries sightings, deaths and the shots our members fired, but not the hits
   they landed or took, so these drops read as "damage from someone else" or "several shots" and the
   enemy's shot is never seen. The fewer enemy shots Hadur sees, the less its bullet risk can dodge.
   That fits members dying to simple guns while winning rounds. Rule: add each member's bullet hits
   (enemy, damage) and hits taken (enemy, power) to the report, and take them off in `EnemyInfo` as
   for our own. First, a cheap measurement: count enemy shots detected per enemy per 100 ticks on a
   team against melee, from the waves the melee strand already makes. If team detection is well under
   melee's, build the rule.
2. **Leader survival.** Not screened. The leader's death costs four mates 30 energy each. A rule
   that keeps the 200-energy member further from enemies than the rest is whole-field, but it only pays
   if leader deaths are early, which the logs above can show before any code.
3. **Polylunar and Nightmare (top half).** Hadur is 16-25 points under a generic team at its APS
   against each. Not a whole-field rule; recorded only.

## 7. What needs the PC

- **Confirm the cloud finding** (no code): `hadur2.HadurTeam 3.11` and `rz.HOFSwarm 1.1` against
  `team-lower26a.txt`, 6 seeds, 10 rounds, engine 1.11.1, width 1 or the team width the PC trusts.
  About 160 battles. Gate: Hadur's deficit to HOFSwarm on ranks 21-33 stays above 5 points a pairing.
- **Gate any candidate on the whole team field.** The ladder has only 45 opponents, so a full census
  is cheap: candidate and 3.11 paired against `team-top20.txt` plus `team-lower26.txt`, 6 seeds, 10
  rounds, 1.11.1. Gate: mean paired difference over 45 teams at least +1.0 point (about +1 APS),
  interval above zero, no team worse beyond its 6-seed spread.
- The PC is not needed for screens: a cloud container fights a Hadur team battle in about 75 seconds.

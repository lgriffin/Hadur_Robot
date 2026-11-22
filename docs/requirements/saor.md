# Requirements: Saor (MicroMelee)

Saor, the MicroMelee entry ([saor.md](../saor.md)).

EARS requirements, one row each; [README](README.md) gives the rules. IDs never change meaning and are never reused; a requirement that is dropped moves to [retired.md](retired.md).

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| SAOR-1 | Ubiquitous | The bot shall drive to a point within 25 px of a battlefield edge, so that it occupies such a point whenever its distance remaining is 0. | U1 |
| SAOR-2 | Ubiquitous | The domain core (`hadur117.micro.core`) shall not import or reference `robocode.*`. | U0 |
| SAOR-3 | Event | When a scanned robot is nearer than the current target, the bot shall adopt it as target and keep it until it dies or a nearer one is scanned. | U1 |
| SAOR-4 | Event | When a robot dies, the bot shall reset the target distance to infinity and release the radar to free spin. | U1 |
| SAOR-5 | State | While gun heat is below 1, the bot shall hold the radar on the target to within one scan width. | U1 |
| SAOR-6 | State | While the Markov row for the opponent's current state holds no sample, the gun shall aim by circular projection, holding that state's speed and turn rate. | U2 |
| SAOR-7 | State | While that row holds a sample, the gun shall aim by Monte-Carlo playout of the opponent's Markov chain and a vote in angle bins, where a playout through a row of fewer than 8 samples votes at most 5 plus 12 for each sample of that row. | U3 |
| SAOR-10 | Unwanted | If gun turn remaining is non-zero, then the bot shall not fire. | U1 |
| SAOR-11 | Unwanted | If Robocode's codesize tool reports more than 749 bytes for the shipped jar, then the build shall fail. | U0 |
| SAOR-12 | Ubiquitous | Before release, the bot shall score 66.0 APS or more over the 155 MicroMelee pairings at 35 rounds on a 1000 x 1000 field. | U3 |
| SAOR-13 | Ubiquitous | Against Figment 1.0 in a 10-bot field over 200 battles, the bot shall out-survive it in 50% or more of battles. | U3 |
| SAOR-14 | Ubiquitous | Against Wallaby 5.1 in the same setup, the bot shall out-score it on bullet damage in 50% or more of battles. | U3 |
| SAOR-15 | Ubiquitous | The shipped class shall give the same orders as the bench adapter, which drives the core, for the same events. | U0 |
| SAOR-16 | Ubiquitous | The live-shaped census shall run fields drawn from the whole MeleeRumble list and score the seated robot only on its pairings against MicroMelee robots, as LiteRumble scores MicroMelee. | U6 |
| SAOR-17 | Ubiquitous | Bullet power shall be log10(energy) times 325 over the target's distance, with no cap but the engine's. | U4 |

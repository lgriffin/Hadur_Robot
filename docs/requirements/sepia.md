# Requirements: Sepia (1v1)

Sepia, a second 1v1 robot on Hadur's kernel that moves so its 0.1 "ink" bullets can shoot the enemy's bullets down where its body will land ([sepia.md](../sepia.md), design in [sepia-design.md](../sepia-design.md)).

EARS requirements, one row each; [README](README.md) gives the rules. IDs never change meaning and are never reused; a requirement that is dropped moves to [retired.md](retired.md). The rows here are the ones stage Q0 builds; the design's other rows (Recognition, the hover, the lottery, the hub promotions and Hadur's own ink-surf switch) stay in the design until their stage builds them.

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| SEPIA-1 | Ubiquitous | Sepia's brain (`hadur117.sepia`) shall not import Robocode, and shall use nothing of Hadur's conductor, strand brains, guns, policies, memory or mode table: from the kernel only its model, physics and ledger, and from the duel strand only the shadow geometry (`BulletShadows`, `OurBullet`), so no Hadur file changes for Sepia. | Q0 |
| SEPIA-2 | Optional | Where a build sets Sepia's fire mode to ink only, the gun shall fire only 0.1 ink; where it sets it to none, the gun shall not fire; the shipped build shall fire ink or a punch by STRIKE-1. | Q0 |
| SEPIA-3 | Ubiquitous | The shipped jar shall carry Sepia's classes, the kernel classes they reach and the robot's properties at the release version, and no class of Hadur's conductor or strands that Sepia does not reach. | Q0 |
| SEPIA-4 | Event | When an enemy bullet hits Sepia or meets one of its bullets, the brain shall learn the bullet's guess factor into its aim belief, which starts from head-on and linear peaks over an even floor and gives the chance that a wave's bullet lies on a stretch of bearings. | Q0 |
| INK-1 | Event | When the gun is cool and an enemy wave has a fixed landing, the brain shall score candidate ink aims by the share of each wave's hit set they newly shade, weighted by the wave's damage and energy return and by the aim belief on the bearings they newly shade, and fire the best only if it newly shades at least 5% of the hit sets in flight. | Q0 |
| INK-2 | Ubiquitous | An ink shot shall be power 0.1. | Q0 |
| INK-3 | Ubiquitous | The ink planner shall make its candidates by solving where its bullet can meet the bullet of each wave at the hit set's middle and near each edge, and shall evaluate at most 64 a shot. | Q0 |
| INK-5 | Ubiquitous | The shade credited to a wave shall be its certain shadow plus half its possible shadow, cast up to and including the turn the wave can first meet the body. | Q0 |
| INK-6 | Ubiquitous | Sepia shall write one INK record per enemy wave: the option fixed, the hit-set width, the share shaded when the wave reached the body, the inks that added shade, and whether its bullet was met or hit. | Q0 |
| JET-1 | Event | When an enemy shot is detected, the brain shall commit the path until that shot's wave has passed, choosing for the jet cycle among carry on, turn back and hold, from where the path already committed to earlier waves ends. | Q0 |
| JET-2 | Ubiquitous | The brain shall rate each option by exposure: the wave's damage, times the aim belief on the part of the option's hit set left unshaded by our bullets in the air and by the next ink the planner could lay from where the option puts Sepia when the gun is next cool. | Q0 |
| JET-3 | Ubiquitous | The brain shall take the least exposed option. | Q0 |
| JET-5 | State | While driving, the path shall turn away from the wave's source below 450 px and shall not turn toward it, so range is regained and never closed. | Q0 |
| JET-6 | Unwanted | If the committed path would strike a wall or come within 100 px of the enemy within 12 ticks, then the brain shall recommit every landing not yet reached from the present tick. | Q0 |
| SURF-2 | Event | When an enemy shot is detected under the ink surf, the surf shall fix that wave's landing among carry on, turn back, either at half speed, and hold, and hold it until the wave has passed. | Q0 |
| SURF-3 | Unwanted | If, when a later shot is read, another option leaves a fixed landing not yet reached under half as exposed, then the surf shall fix that wave's landing again from the present tick and choose every later landing afresh behind it. | Q0 |
| SURF-4 | Ubiquitous | Under the ink surf, each option shall be rated by JET-2's exposure. | Q0 |
| STRIKE-1 | Event | When the gun is cool, the brain shall fire ink or a punch, whichever is worth more per tick of reload: the ink by the damage and energy return of the bullets it is expected to stop over 11 ticks, the punch by its hit rate times its damage and return, less its power, over its reload. | Q0 |
| STRIKE-3 | State | While no enemy wave is in flight, or the enemy's energy is below the smallest power it has fired and Sepia leads, the gun shall punch. | Q0 |

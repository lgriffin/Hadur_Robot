# Requirements: Sanaro (NanoMelee)

Sanaro, the NanoMelee entry ([sanaro.md](../sanaro.md)).

EARS requirements, one row each; [README](README.md) gives the rules. IDs never change meaning and are never reused; a requirement that is dropped moves to [retired.md](retired.md).

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| SANARO-1 | Unwanted | If Robocode's codesize tool reports more than NanoMelee's 249 bytes for the shipped jar, or more than one class in it, then the build shall fail. | N0 |
| SANARO-2 | Unwanted | If the class declares a static initialiser, or its power table has no cell at an index the bot can reach for own and enemy energy 0 to 400, then the build shall fail. | N0 |
| SANARO-3 | Event | When a robot is scanned, the bot shall decay its force field by DECAY (0.9), add a push of 1 over the distance away from that robot's hedged lead position, and turn its body to the field plus the wall push (0.1 first turned SPIRAL 0.6 further, then 0; 0.2 has no spiral term). | N0 |
| SANARO-4 | State | While the body turn still to make exceeds AHEAD (120) degrees, the bot shall drive backwards. | N0 |
| SANARO-5 | Event | When a scanned robot is closer than the target threshold, which creeps out CREEP (25) px every scan, the bot shall take it as the target and snap the threshold to its distance. | N0 |
| SANARO-6 | Event | When the target is scanned, the bot shall turn its radar by its gun heat less LOCK (0.9) times the radar turn remaining: a sweep while the gun is hot, a flip on the target once it is nearly cool. | N0 |
| SANARO-7 | Event | When the target is scanned, the bot shall turn its gun to the bearing plus its lateral velocity over LEAD (16) at every range (0.1: over 10 plus 1.008 to the distance). | N5 |
| SANARO-8 | Event | When the target is scanned, the bot shall fire the table's power for (own energy, target energy) times the integer BAND over the distance (640 to 0.3, 480 from 0.4: pc-sanaro-n09/n10); from 0.3 a cell in a 2 x 2 block taught by Hadur 3.20's shots (tools/distill.py, pc-sanaro-n07 HL, 9,529 cells) holds Hadur's power, and every other cell is the lesser of 0.1 plus a sixteenth of its own energy (at most 2.5, and 3.0 from 120 energy) and the least power that kills any energy the target's truncated energy stands for (up to one more); a target at 128 energy or more reads energy / 128 rows on at its energy mod 128, a limit of the 128 stride. | N0 |
| SANARO-9 | Ubiquitous | The shipped jar shall carry the robot's properties at the release version and its source. | N0 |
| SANARO-10 | Ubiquitous | The NanoMelee census shall run ten NanoMelee robots a battle, both leaders in every battle, and the shipped build shall read an APS above NaturalScience 1.2.1's in the same battles by more than its 95% interval over at least 20 battles. | N2 |
| SANARO-11 | Ubiquitous | In the same battles the shipped build shall outsurvive both leaders more often than not. | N2 |
| SANARO-12 | Ubiquitous | One on one with each leader over 35 rounds, the shipped build shall win more than 55% of rounds. | N2 |
| SANARO-13 | Ubiquitous | A change to the shipped build shall read above the shipped build on the live-shaped census (the MeleeRumble fields that hold a NanoMelee robot, NanoMelee pairings counted) by more than its 95% interval. | N3 |
| SANARO-14 | Event | When the target is scanned, the bot shall fire only if the gun's angle to the lead, before this scan's gun turn, is under GATE (18) over the distance in radians, and shall order the gun turn before the shot. | N5 |

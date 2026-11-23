# Requirements: Sanaro (NanoMelee)

Sanaro, the NanoMelee entry ([sanaro.md](../sanaro.md)).

EARS requirements, one row each; [README](README.md) gives the rules. IDs never change meaning and are never reused; a requirement that is dropped moves to [retired.md](retired.md).

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| SANARO-1 | Unwanted | If Robocode's codesize tool reports more than NanoMelee's 249 bytes for the shipped jar, or more than one class in it, then the build shall fail. | N0 |
| SANARO-2 | Unwanted | If the class declares a static initialiser, then the build shall fail (0.1 to 0.4 also held a power table to reach every own and enemy energy 0 to 400; 0.5 has no table). | N0 |
| SANARO-3 | Event | When a robot is scanned, the bot shall decay its force field by DECAY (0.9), add a push of 1 over the distance away from that robot's hedged lead position, and turn its body to the field plus the wall push (0.1 first turned SPIRAL 0.6 further, then 0; 0.2 has no spiral term). | N0 |
| SANARO-4 | State | While the body turn still to make exceeds AHEAD (120) degrees, the bot shall drive backwards. | N0 |
| SANARO-5 | Event | When a scanned robot is the held target, or is closer than the target's distance at its last scan, the bot shall take it as the target (held by name) and set that distance to its own; when any robot dies, and at each round's start, the bot shall drop the target so the next robot scanned takes it (0.5; 0.1 to 0.4 took any robot inside a threshold that crept out 25 px a scan). | N0 |
| SANARO-6 | Event | When the target is scanned, the bot shall turn its radar by its gun heat less LOCK (0.9) times the radar turn remaining: a sweep while the gun is hot, a flip on the target once it is nearly cool. | N0 |
| SANARO-7 | Event | When the target is scanned, the bot shall turn its gun to the bearing plus its lateral velocity over LEAD (16) at every range (0.1: over 10 plus 1.008 to the distance). | N5 |
| SANARO-8 | Event | When the target is scanned and the fire gate passes, the bot shall fire 2 times the integer BAND (480) over the distance, which the engine raises to 0.1 past BAND px and caps at 3 inside BAND / 3 (0.5; 0.1 to 0.4 fired a table of power by own and enemy energy times that band). | N0 |
| SANARO-9 | Ubiquitous | The shipped jar shall carry the robot's properties at the release version and its source. | N0 |
| SANARO-10 | Ubiquitous | The NanoMelee census shall run ten NanoMelee robots a battle, both leaders in every battle, and the shipped build shall read an APS above NaturalScience 1.2.1's in the same battles by more than its 95% interval over at least 20 battles. | N2 |
| SANARO-11 | Ubiquitous | In the same battles the shipped build shall outsurvive both leaders more often than not. | N2 |
| SANARO-12 | Ubiquitous | One on one with each leader over 35 rounds, the shipped build shall win more than 55% of rounds. | N2 |
| SANARO-13 | Ubiquitous | A change to the shipped build shall read above the shipped build on the live-shaped census (the MeleeRumble fields that hold a NanoMelee robot, NanoMelee pairings counted) by more than its 95% interval. | N3 |
| SANARO-14 | Event | When the target is scanned, the bot shall fire only if the gun's angle to the lead, before this scan's gun turn, is under GATE (18) over the distance in radians, and shall order the gun turn before the shot. | N5 |

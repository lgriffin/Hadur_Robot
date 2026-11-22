# Requirements: Eveimear (MicroRumble)

Eveimear, the MicroRumble 1v1 entry.

EARS requirements, one row each; [README](README.md) gives the rules. IDs never change meaning and are never reused; a requirement that is dropped moves to [retired.md](retired.md).

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| EVEIMEAR-1 | Unwanted | If Robocode's codesize tool reports more than 749 bytes for the shipped jar (MicroRumble's limit; 0.5 is 749 exactly, so the 3 spare of K6 is given up for Cotillion's gun, 2026-11-05), then the build shall fail. | K6, 0.5 |
| EVEIMEAR-2 | Complex | While in stop-and-go, when the enemy fires, the bot shall step (3 + (int) (drop x 1.999999)) << 3 px along its orbit. | E1 |
| EVEIMEAR-3 | Event | When the enemy's hits, each counted 5 / bullet speed, exceed (2 + round) x the robot's MODES char (read by the top 14 bits of the name's hash: 0, 1, 9 or 15), the bot shall move every tick and reverse at random for the rest of the battle. | E2, 0.5 |
| EVEIMEAR-4 | State | While in stop-and-go, the bot shall keep its orbit direction, hit or not, reversing only off a wall it cannot clear; in random orbit it shall reverse at 0.6 sqrt(bullet speed / distance) - 0.04 a tick (Cotillion 0.8). | E3, 0.5 |
| EVEIMEAR-5 | Ubiquitous | The bot shall close its drive angle off the enemy until a 120 px stick stays inside the field (160 before 0.6; 120 read +0.37 ± 0.28 on 12 fresh cloud seeds), and reverse when the angle has closed under 0.9 rad. | E4, 0.6 |
| EVEIMEAR-6 | Event | When the enemy is scanned, the bot shall add one symbol of the enemy's advancing velocity, lateral velocity and forward wall, replay up to 50 distinct earlier matches of the newest symbols (keys of up to 30) to the bullet's arrival, drop replays that leave the field, and aim at the most voted of 255 bins, votes weighted by key length (Cotillion 0.8). | K2, 0.5 |
| EVEIMEAR-7 | State | While the enemy is inside 100 px, the bot shall fire 3 and move every tick. | E5 |
| EVEIMEAR-8 | Ubiquitous | The bot shall fire 2 at range, at most a quarter of the enemy's energy, and only while its own energy is more than the shot (Cotillion 0.8). | K4, 0.5 |
| EVEIMEAR-9 | Ubiquitous | The shipped jar shall carry the robot's properties at the release version and its source. | plan S5 |
| EVEIMEAR-10 | Complex | Each tick the bot shall turn its radar until it sees the enemy, and when the enemy is scanned, lock it at twice the bearing (Cotillion 0.8). | K1, 0.5 |
| EVEIMEAR-11 | Event | When we hit the enemy, the bot shall take 10 off the enemy's energy, and when hit, add 20 less the bullet's speed, so neither reads as a shot. | K3, 0.5 |
| EVEIMEAR-12 | Ubiquitous | On the MicroRumble bench sample, paired against Épéeist 3.7, the build shall predict at least 85.3 APS before it is submitted. | plan S4 |
| EVEIMEAR-17 | Ubiquitous | The shipped jar, built through ProGuard (`eveimear/proguard.pro`), shall give the javac classes' orders, bit for bit, on seeded scripts with Math.random swapped for a seeded draw, against the field's row, a stop-and-go row and the catcher's row. | 0.4 |

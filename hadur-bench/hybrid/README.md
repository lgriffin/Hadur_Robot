# Hybrid reference robots (bench only)

Measuring sticks, not contenders. Each hybrid runs one robot's movement with another robot's gun,
so the bench can say what the best movement and the best gun are worth together, and which half
of a gap is movement and which is gun. **Never release, upload or enter these in any rumble.**
They live outside the `hadur117` robots and the release jars; their jars are built locally by the
scripts here and are never committed. Donor code is taken unchanged from the donors' own rumble
jars at build time; none of it is copied into this repository.

## MiniRumble (`mini/`, package `hybridmini`)

`mini/build-mini-hybrid.sh` writes `hadur-bench/kitlab/jars/hybridmini.<Class>_1.0.jar` for each
line of `mini/hybrids.txt`. Each donor runs its own, unchanged class inside a thin wrapper
(`mini/part-template.java`): it reads the host robot's state and sees every event, and only the
orders of the channel it owns reach the body. The movement donor owns body and radar; the gun donor
owns gun turn and fire (fire power is part of the gun). The donors' statics stay theirs, so each
donor keeps all of its own state. Codesize is not limited: these are not legal MiniRumble robots.

| Class | Movement | Gun |
|---|---|---|
| FoilistMoveCunobelinGun | FoilistMC 1.0 | CunobelinDC 1.2 |
| CunobelinMoveFoilistGun | CunobelinDC 1.2 | FoilistMC 1.0 |
| FoilistMoveJayLexiGun | FoilistMC 1.0 | JayLexi (this checkout) |
| JayLexiMoveFoilistGun | JayLexi | FoilistMC 1.0 |
| JayLexiMoveCunobelinGun | JayLexi | CunobelinDC 1.2 |
| FoilistControl | FoilistMC 1.0 alone, through the wrapper | (same) |
| JayLexiControl | JayLexi alone, through the wrapper | (same) |

The controls check the wrapper itself: each should score as its donor's own jar does.

Known differences from the donors as they ship: JayLexi's surf and gun share one stats array and
its gun waves count 4 times when a real bullet went with them; as the movement donor its own gun
never fires, so its gun waves keep weight 0.

## 1v1 (`build-hybrid.sh`, package `hybrid`)

Hadur's shell and core with BeepBoop 2.0's subsystems beside it: `BeepMoveHadurGun` (BeepBoop's
movement and shield, Hadur's gun, power and radar), `HadurMoveBeepGun` (Hadur's movement, shield and
lines, BeepBoop's gun and power) and `HadurPlain` (control). The script copies Hadur's sources to a
scratch directory and patches a seam in (`patch/`); master is not changed. Started before the
MiniRumble ask; it compiles but has not been run on the bench. Known gap before any run: in
`HadurMoveBeepGun` Hadur's gun still counts and learns from the shots it orders but the hybrid drops
(only their shadows are removed), so validate against `HadurPlain` first.

## Credits

- **FoilistMC 1.0** by Sheldor, released under the RoboWiki Public Code License (RWPCL) 1.1,
  https://robowiki.net/wiki/RWPCL. Its own credits: CunobelinDC, WeeksOnEnd, WaveShark, BeepBoop,
  Hydra (movement); Needle, WaveShark, Cotillion, HedgehogGF, Pugilist (targeting).
- **CunobelinDC 1.2** by Skilgannon (Julian Kent), open source in its rumble jar; its credits:
  Apollon's mini predictor (rozu), Kawigi's iterative wall smoothing, PEZ's CassiusClay project.
- **BeepBoop 2.0** by Kevin Clark (Kev), https://robowiki.net/wiki/BeepBoop, open source in its
  rumble jar; it ships Rednaxela's KdTree (`ags.utils`) compiled and Skilgannon's FastTrig.
- **JayLexi** and **Hadur** are this repository's own.

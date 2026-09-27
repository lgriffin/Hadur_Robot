# Still-target aim probe

Measures how predictable each opponent's aim is against a robot that sits still, which is
what decides whether bullet shielding can work against it (see docs/bullet-shielding.md).

`probe.StillProbe` never moves and fires 1.5 power head-on. `aimcheck.py` reads the bench's
truth logs and, for every enemy bullet, compares its heading (refined from the bullet's
track 8 ticks later, since the log rounds to 0.01) with the head-on bearings from the
shooter's current and previous position. "Exact" means within 3e-4 rad.

```sh
cd hadur-bench
mkdir -p work/probe-classes
javac --release 11 -cp ~/.m2/repository/net/sf/robocode/robocode.api/1.9.5.6/robocode.api-1.9.5.6.jar \
  -d work/probe-classes probe/probe/StillProbe.java
cp probe/probe/StillProbe.properties work/probe-classes/probe/
mvn exec:java -Dexec.args="--set probe/probe-set.txt --robot-classes work/probe-classes \
  --robot 'probe.StillProbe 1.0' --rounds 10 --seeds 1 --out work/probe"
python3 probe/aimcheck.py work/probe/battles
```

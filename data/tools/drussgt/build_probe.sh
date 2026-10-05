#!/bin/bash
# build_probe.sh NAME GUN FIRE [POWER]  ->  $OUT/NAME/hadur2.Hadur_3.5.1.jar
#
# Probe builds of Hadur 3.5.1 for bench experiments only. Nothing here is production code:
# the script copies the robot's source out of a checkout, adds a `hadur2.core.Probe` class of
# three switches, patches `GunController` and `HadurCore` to read them, and compiles the copy
# with javac. The patches are anchored on 3.5.1's source text and stop with an assertion on
# any other version.
#
#   REPO      a Hadur_Robot checkout whose robot source is 3.5.1 (default: current directory)
#   ENGINE    a Robocode 1.9.5.6 install directory (for libs/robocode.jar)
#   BASE_JAR  the released hadur2.Hadur_3.5.1.jar (its non-class entries are reused)
#   OUT       where the builds go (default: ./variants)
#
# The builds of the 4 and 5 October 2026 session (docs/bench/d0-drussgt-probes.md):
#   lead-aware power               l0 = 0 0 3
#   lead-aware power, sampled aim  l2 = 2 0 3
#   random gun                     g1 = 1 0 0
#   all chaff                      c0 = 0 0 1
#   hold fire                      p0 = 0 1 0
set -e
REPO=${REPO:-$PWD}; ENGINE=${ENGINE:?set ENGINE to a Robocode directory}; BASE_JAR=${BASE_JAR:?set BASE_JAR to the released jar}; OUT=${OUT:-$PWD/variants}
NAME=$1; GUN=$2; FIRE=$3; POWER=${4:-0}
V=$OUT/$NAME
rm -rf $V && mkdir -p $V/src $V/classes
cp -r $REPO/hadur-core/src/main/java/hadur2 $V/src/
cp $REPO/hadur-robot/src/main/java/hadur2/*.java $V/src/hadur2/
cat > $V/src/hadur2/core/Probe.java <<EOF
package hadur2.core;
/** Bench probe switches (experiments only). */
public final class Probe {
    private Probe() {}
    /** 0 normal guns, 1 uniform quasi-random in the precise escape range, 2 a sampled neighbour's guess factor. */
    public static final int GUN = $GUN;
    /** 0 normal, 1 hold fire unless the target is sitting still or disabled, 2 the same once either robot is under 63 energy. */
    public static final int FIRE = $FIRE;
    /** 0 normal power, 1 always 0.1, 2 chaff plus heavier shots a uniform gun would profit from, 3 lead-aware (0.1 level or ahead, 1.95 behind, 1.95 while both above 60). Any non-zero value also fires 3.0 at a still target. */
    public static final int POWER = $POWER;
}
EOF
python3 - "$V" <<'EOF'
import sys
V=sys.argv[1]
p=V+'/src/hadur2/core/gun/GunController.java'
s=open(p).read()
a="""    public double aim(Wave w, Point2D.Double myNextLocation, long currentTime) {
        Map<String, KnnView<TimestampedFiringAngle>> views = getOrCreateViews(w.botName);
"""
assert a in s
s=s.replace(a, a+"""        if (is1v1 && hadur2.core.Probe.GUN != 0 && !probeStill) {
            double nextAbs = DiaUtils.absoluteBearing(myNextLocation, w.targetLocation);
            double gf = 2 * probePhase - 1;
            if (hadur2.core.Probe.GUN == 2) {
                KnnView<TimestampedFiringAngle> hv = views.get(HybridGun.viewName());
                if (hv.effectiveSize() > 0) {
                    List<KdTree.Entry<TimestampedFiringAngle>> nb = hv.nearestNeighbors(w, true);
                    if (!nb.isEmpty()) {
                        gf = nb.get(Math.min(nb.size() - 1, (int) (probePhase * nb.size()))).value.guessFactor;
                    }
                }
            }
            gf = Math.max(-1.0, Math.min(1.0, gf));
            return Angles.normalAbsoluteAngle(nextAbs + gf * w.orbitDirection * w.preciseEscapeAngle(gf >= 0));
        }
""")
b="    /** Aims with whichever of the three guns {@code use} names. */"
assert b in s
s=s.replace(b,"""    private double probePhase = 0.6180339887498949;
    private boolean probeStill;
    /** Probe: a real shot went out; advance the quasi-random sequence. */
    public void probeShot() {
        probePhase += 0.6180339887498949;
        if (probePhase >= 1) probePhase -= 1;
    }
    /** Probe: whether the target has sat still (a shielder or a disabled robot). */
    public void probeStill(boolean still) {
        probeStill = still;
    }

"""+b)
open(p,'w').write(s)

p=V+'/src/hadur2/core/HadurCore.java'
s=open(p).read()
a="""                && in.energy() > bulletPower && lastGunWave != null && !predictable) {
            orders.fire(bulletPower);
"""
assert a in s
s=s.replace(a,"""                && in.energy() > bulletPower && lastGunWave != null && !predictable && probeMayFire(in)) {
            orders.fire(bulletPower);
            gunController.probeShot();
            telemetry.emit(String.format(Locale.ROOT, "GS,%d,%d,%.4f,%.4f,%.1f,%.3f,%d", round, in.time(),
                lastGunWave.preciseEscapeAngle(true), lastGunWave.preciseEscapeAngle(false), lastEnemyDistance,
                bulletPower, probeStill ? 1 : 0));
""")
# still tracking + power override in onScan, right after eDl40 is computed
a="""        double bulletPower = gunController.calculateBulletPower(
            e.distance(), in.energy(), e.energy(), in.others());
"""
assert a in s
s=s.replace(a, a+"""        probeStill = (time > 45 && eDl40 < 3.0) || e.energy() == 0;
        gunController.probeStill(probeStill);
        if (in.energy() < 63 || e.energy() < 63) probeTail = true;
        if (Probe.POWER == 1 && !probeStill) bulletPower = 0.1;
        if (Probe.POWER == 2 && !probeStill) {
            // chaff by default; a bigger bullet only when a uniformly random shot has positive expected value
            double chosen = 0.1;
            if (lastGunWave != null && in.energy() > 8) {
                double p0 = lastGunWave.bulletPower();
                double r0 = lastGunWave.escapeAngleRange();
                double width = 2 * Math.atan(20.0 / Math.max(40.0, e.distance()));
                double best = 0;
                for (double pw : new double[] {1.0, 2.0, 3.0}) {
                    if (pw > in.energy() - 1) continue;
                    double r = r0 * Math.asin(8 / (20 - 3 * pw)) / Math.asin(8 / (20 - 3 * p0));
                    double q = Math.min(1.0, width / r);
                    double ev = -pw + q * (3 * pw + Rules.getBulletDamage(pw));
                    if (ev > best) { best = ev; chosen = pw; }
                }
            }
            bulletPower = chosen;
        }
        if (Probe.POWER == 3 && !probeStill) {
            // lead-aware: trade 1.95s in the opening, then chaff when level or ahead, 1.95 when behind
            double lead = in.energy() - e.energy();
            if (in.energy() > 60 && e.energy() > 60) bulletPower = 1.95;
            else if (lead < -3 && in.energy() > 10) bulletPower = 1.95;
            else bulletPower = 0.1;
        }
        if (probeStill && e.energy() > 0 && Probe.POWER != 0) bulletPower = 3.0;
""")
a="    private boolean fireIfGunTurned(BotInput in, BotOrders.Builder orders, double bulletPower,"
assert a in s
s=s.replace(a,"""    private boolean probeStill;
    private boolean probeTail;
    private int probeRound = -1;
    private boolean probeMayFire(BotInput in) {
        if (Probe.FIRE == 0) return true;
        if (probeStill) return true;
        if (Probe.FIRE == 2 && !probeTail) return true;
        return false;
    }

"""+a)
# reset the tail latch each round
a="        enemyTicksSinceReversal = 0;\n"
assert s.count(a)>=1
s=s.replace(a, a+"        probeTail = false;\n        probeStill = false;\n",1)
open(p,'w').write(s)
EOF
E=$ENGINE/libs
javac --release 11 -XDstringConcat=inline -nowarn -cp $E/robocode.jar -d $V/classes $(find $V/src -name '*.java' ! -name 'HadurRecorder.java') 2>&1 | grep -v "^Picked up\|^Note:" | head -20
cp $BASE_JAR $V/hadur2.Hadur_3.5.1.jar
(cd $V/classes && zip -q -r ../hadur2.Hadur_3.5.1.jar hadur2)
unzip -l $V/hadur2.Hadur_3.5.1.jar | grep -c "class" ; unzip -l $V/hadur2.Hadur_3.5.1.jar | grep "Probe"
echo "built $NAME gun=$GUN fire=$FIRE power=$POWER"

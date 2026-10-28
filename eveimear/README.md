# Eveimear

`hadur117.micro.Eveimear` is Hadur's MicroRumble (1v1, under 750 bytes) robot, from Leigh's design
plan "JayLexi & Eveimear — MiniRumble and MicroRumble 1v1 Design Plan" and its kitlab drafts. It
moves stop-and-go, one step per enemy shot sized to the bullet's flight, until the enemy's gun has
won back 40 + 23 energy per round by hitting it, then orbits at random for the rest of the battle; its gun is a GuessFactor
gun on Condition waves segmented on velocity history, lateral speed and distance. The design, the
bench and the results are in [docs/kitlab.md](../docs/kitlab.md); the requirements are EVEIMEAR-1 to
EVEIMEAR-12 in [docs/requirements.md](../docs/requirements.md).

0.1 is 722 bytes of 749 (two classes). Not yet released or submitted. It shares the `hadur117.micro`
package with Saor but never a jar.

## Build

    mvn -pl eveimear verify

The shipped jar is `eveimear/target/hadur117.micro.Eveimear_<version>.jar` (its classes, properties
and source); `EveimearJarIT` prints its codesize and holds 3 bytes spare.

## Bench

From `hadur-bench`: `kitlab/run.sh micro <jar> "<name version>" <label>` fights the 48-bot
MicroRumble sample (`kitlab/micro-field.txt`), and
`python3 tools/kitlab_read.py kitlab/micro-field.txt work/kitlab-<label> --ref work/kitlab-ref-epeeist --ref-aps 85.06`
reads it as a predicted APS, paired against Épéeist 3.7 on the same set.

# JayLexi

`hadur117.mini.JayLexi` is Hadur's MiniRumble (1v1, under 1500 bytes) robot, from Leigh's design
plan "JayLexi & Eveimear — MiniRumble and MicroRumble 1v1 Design Plan" and its kitlab drafts. It is
a true wave surfer that weighs back and forward with precise prediction, over a GuessFactor
gun segmented on velocity history, lateral speed, walls ahead and distance. The design, the bench
and the results are in [docs/kitlab.md](../docs/kitlab.md); the requirements are JAYLEXI-1 to
JAYLEXI-10 in [docs/requirements.md](../docs/requirements.md).

0.1 is 1,496 bytes of 1,499 (two classes; 3 spare, as plan K6 asks). Not yet released or submitted.

## Build

    mvn -pl jaylexi verify

The shipped jar is `jaylexi/target/hadur117.mini.JayLexi_<version>.jar` (its classes, properties and
source); `JayLexiJarIT` prints its codesize and holds 3 bytes spare.

## Bench

From `hadur-bench`: `kitlab/run.sh mini <jar> "<name version>" <label>` fights the 48-bot MiniRumble
sample (`kitlab/mini-field.txt`, drawn by `tools/kitlab_fields.py`), and
`python3 tools/kitlab_read.py kitlab/mini-field.txt work/kitlab-<label> --ref work/kitlab-ref-komarious --ref-aps 87.54`
reads it as a predicted APS, paired against Komarious 1.88 on the same set.

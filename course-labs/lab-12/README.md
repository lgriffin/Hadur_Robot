# Lab 12: evidence, the bench

Changed from lab 11:

- A third module, `hadurling-bench`, which runs headless battles through Robocode's control
  API (`robocode.control.RobocodeEngine`) with the full engine from Maven Central
  (`robocode.core`, `host`, `battle`, `repository` and the `samples` jar, version 1.9.5.6), the
  same setup as Hadur's `hadur-bench`.
- `Bench` starts one child JVM per battle (`BattleRunner`) with `-DRANDOMSEED=<seed>`, because
  Robocode reads the seed once per JVM. It builds a Robocode home with the robot jar and the
  sample robots, wipes the robot's data folder before each battle (cold; `--warm` keeps it),
  and reports the score share (ours divided by both scores) per opponent and overall.
- `Stats`: mean and a 95% half-width from Student's t; `pairedDiff` for an A/B on paired seeds;
  `verdict()` calls a change better or worse only when the whole interval is on one side of 0.
  `StatsTest` and `ReportTest` are ordinary unit tests; **no battle runs in `mvn verify`**.
- `RequirementsTraceabilityTest` now scans `hadurling-bench` too. Requirements `HL-33` to
  `HL-35`.
- No change to the core or the robot, so the replay fixture is unchanged.

## Running a battle (by hand)

Use a JDK from 17 to 21: the bench keeps Robocode's security manager on, which newer JDKs
no longer allow.

```sh
mvn -B package -DskipTests             # builds hadurling-robot/target/hadurling.Hadurling_0.1.jar
cd hadurling-bench
mvn -B -q exec:java -Dexec.args="--opponent sample.Crazy,sample.Walls --rounds 10 --seeds 5"
```

To A/B against an older lab, build that lab too and pass its jar:

```sh
mvn -B -q exec:java -Dexec.args="--opponent sample.Crazy,sample.Walls --rounds 10 --seeds 5 \
  --baseline-jar ../../lab-07/hadurling-robot/target/hadurling.Hadurling_0.1.jar \
  --baseline-name lab-07 --candidate-name lab-12"
```

Options: `--opponent A,B` (default `sample.Crazy`), `--opponent-jar X.jar,Y.jar` (install robot
jars of your own so that `--opponent` can name them), `--rounds N` (default 35), `--seeds N`
(default 5), `--field WxH` (default 800x600), `--warm`, `--robot-jar FILE`, `--robot NAME`,
`--baseline-jar FILE`, `--baseline-name`, `--candidate-name`, `--out DIR` and `--report FILE`.

Both jars are named `hadurling.Hadurling` version 0.1, so each is installed in a Robocode home
of its own (`work/<time>/candidate` and `work/<time>/baseline`).

A run in the authoring sandbox (JDK 21, 10 rounds, seeds 1 to 3, warm) of this lab against
lab 07: this lab scored 92.0% +/- 12.4 against `sample.Crazy` and `sample.Walls`, lab 07
54.3% +/- 8.9, and the paired difference was +37.8 +/- 16.2 points, outside the noise. Your
numbers will differ with your machine and Robocode build.

Lab 13 starts here.

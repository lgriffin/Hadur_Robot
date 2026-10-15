# The movement lab

Hadur's movement tested apart from its gun (BENCH-90, plan-top3). A silent Hadur fights six reference
shooters that differ only in their gun; its only score is the damage it takes. Variants are compared per gun,
paired on the same seeds.

**Shooters** (`hadur-bench/lab/lab/`, package `lab`, version 1.0): one orbit at about 450 px that reverses
every 30 to 60 ticks on a fixed schedule, radar lock, power 2.0 whenever the gun is cool and turned. Guns:
HeadOn, Linear, Circular (iterative, walls clipped), GFHist (31 bins, lateral velocity x distance), Knn
(k=25, six features, a wave logged every tick) and PatternMatch (velocity, heading change). The shooter stops
firing at 2 energy, so it can run dry against a mover that is rarely hit.

**Build.** `cd hadur-bench && ./lab/build-lab.sh` writes `opponents/lab.<Name>_1.0.jar` (jars are not committed);
`lab-panel.txt` is the set file.

**Silent Hadur.** `./build-ablation.sh silent` gives `bisect/hadur2.Hadur_<ver>si.jar`; the Duel never fires
(`drive` is entered with `mayFire = false`). A variant under test is built as `silent,<x>`:
`./build-ablation.sh silent,heat` gives `...sihw.jar`, the MOVE-11 gun-heat wave on a silent Hadur.

**Run** one jar per label, the same seeds (work dir `work/lab-<x>-<stamp>`):

    sh ./bench-top20.sh --skip-build --skip-fetch --rounds 35 --parallel 3 --cpu-constant 4138771 --engine 1.11.1 --seeds 4 --seed-base 300 --set lab-panel.txt --robot-jar bisect/<jar> --robot "<name ver>" --label lab-<x> --force-memory

**Read.** `python3 data/tools/move_lab.py silent=work/lab-si-... heat=work/lab-sihw-...` (from `hadur-bench`; add
`--set lab-panel.txt`) prints a markdown table. Per opponent and label: Hadur's damage taken per round (rounds.tsv
`damageTaken`), rounds survived %, and the shooter's hit rate (result.csv `theirHitRate`). With two labels it adds
the second minus the first over the seeds both fought, mean and 95% interval (Student's t), then an All row over
the opponents. The shooter's hit rate is the headline: damage per round also counts how long the shooter can keep
firing before it runs dry, so it understates a better mover. Negative means the second label moves better. Seeds are labels, not replays (charter,
principle 1): read the interval, not the point.
Tests: `python3 data/tools/test_move_lab.py`; `LabPanelTest` (BENCH-90) loads the set file.

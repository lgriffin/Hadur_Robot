# Sepia

`hadur117.Sepia`, an experimental 1v1 robot on Hadur's kernel: it fixes a landing for every enemy shot and
fires 0.1 "ink" bullets to shoot that shot down before it reaches the landing. Not entered in any rumble.

- What is built, the two gaits, the records and the lab arms: [docs/sepia.md](../docs/sepia.md)
- The design and its staged plan: [docs/sepia-design.md](../docs/sepia-design.md)
- Requirements: [docs/requirements/sepia.md](../docs/requirements/sepia.md)

```sh
mvn -pl sepia -am verify      # from the repo root: tests, then target/hadur117.Sepia_<release>.jar
```

The brain (`hadur117.sepia`) never imports Robocode; `hadur117.Sepia` is the adapter. Sepia uses Hadur's
kernel (waves, the movement predictor, the energy ledger and the bullet-shadow geometry) and changes none
of Hadur's code.

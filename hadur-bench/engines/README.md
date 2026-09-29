# Alternate engines for BENCH-4

An `engine=VERSION` condition in a `--client` file looks for this version's jars under
`engines/VERSION/*.jar` (e.g. `engines/1.9.4.4/`). Nothing is committed here: fetch the
release's jars from Maven Central or the Robocode archive and drop them in a
version-named subdirectory, then reference that version in the conditions file. A
condition naming a version with no matching subdirectory is reported as not run rather
than failing the bench (see `docs/bench/r4-client-conditions.md`).

A `java=DIR` condition looks for `DIR/bin/java` directly; it needs no entry here, just a
JDK installed at that path.

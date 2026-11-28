# Requirements: Sanara (NanoRumble)

Sanara, the NanoRumble 1v1 entry ([sanara.md](../sanara.md)).

EARS requirements, one row each; [README](README.md) gives the rules. IDs never change meaning and are never reused; a requirement that is dropped moves to [retired.md](retired.md).

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| SANARA-1 | Unwanted | If Robocode's codesize tool reports more than NanoRumble's 249 bytes for the shipped jar, or more than one class in it, then the build shall fail. | 0.1 |
| SANARA-2 | Ubiquitous | The shipped jar shall carry the robot's properties at the release version and its readable source. | 0.1 |
| SANARA-3 | Unwanted | If the class SanaraGen writes fails the JVM's verifier or its static initialiser fails, then the build shall fail. | 0.1 |

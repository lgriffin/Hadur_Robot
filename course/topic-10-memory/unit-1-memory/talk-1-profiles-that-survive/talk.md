# One profile per opponent, and a save that cannot corrupt it

A small binary file, a version byte, a CRC-32, and a write order that leaves a complete profile on disk even if the robot is killed at any byte (MEM-1 to MEM-5, RES-3).

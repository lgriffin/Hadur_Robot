# Memory

Check the ideas behind Hadur's profile format and crash-safe save.

```quiz
title: Memory
---
question: Why does the core have its own Bytes.Writer instead of using DataOutputStream?
type: multiple-choice
options:
  - DataOutputStream is too slow
  - The core may do no I/O (RES-6)
  - DataOutputStream cannot write floats
  - Robocode forbids streams
correct: 1
---
question: What does ProfileCodec.decode do with a damaged file?
type: multiple-choice
options:
  - Returns an empty profile
  - Throws whichever exception the damage caused
  - Repairs the file and returns it
  - Throws ProfileFormatException and nothing else
correct: 3
---
question: What lets the library tell a complete copy from a torn one?
type: multiple-choice
options:
  - The file name
  - The length check and the CRC-32
  - The modification time
  - The profile's key
correct: 1
---
question: In what order does a save write files (RES-3)?
type: multiple-choice
options:
  - A temporary copy, then the profile, then delete the copy
  - The profile, then a backup
  - Delete the old file, then write the new one
  - Rename the temporary file over the profile
correct: 0
---
question: Why does FileProfileStore.delete empty a file before deleting it?
type: multiple-choice
options:
  - To overwrite secrets
  - To make the delete atomic
  - Robocode refunds a file's length when it is reopened for writing, but nothing on delete
  - To change the modification time
correct: 2
---
question: What happens when the version-2 decoder reads a version-1 file?
type: multiple-choice
options:
  - It rejects the file as damaged
  - It loads every field unchanged
  - It loads with the new counts at zero and the old seeds dropped
  - It crashes with an exception that is not ProfileFormatException
correct: 2
---
question: What is the lineage key of the name "abc.Shadow 3.83c (2)"?
type: multiple-choice
options:
  - abc.Shadow
  - abc.Shadow 3.83c
  - Shadow
  - abc.Shadow (2)
correct: 0
---
question: How does the test suite prove a save survives a killed robot?
type: multiple-choice
options:
  - It kills the real JVM once
  - It reads the Javadoc
  - It runs the save twice
  - It cuts each write of a save at every byte, then loads and requires the old or the new profile
correct: 3
```

TwinSaor 0.1, a Twin Duel team built on Saor (docs/twinsaor.md): one class, `hadur117.twin.SaorTwin`, listed twice.

- Saor's per-opponent Markov gun on the 800 x 800 field.
- Every scan is shared, so both twins learn from both radars.
- Both twins shoot the enemy with the least energy.
- Split radar: the leader watches the target, the other twin the other enemy.
- Stations 90 degrees apart around the target, 250 px against two and 100 px against one. Each twin shuttles across its line to the target and reverses when the target fires.
- The last twin against two plays Saor's corner oscillation.

Codesize 1,989 of Twin Duel's 1,999 bytes. On the cloud box it took 58.2% of the score and 83.1% of the rounds against LunarTwins 1.4a (20 battles of 35 rounds).

TwinDuel participants line:
`hadur117.twin.TwinSaor 0.1,https://github.com/lgriffin/Hadur_Robot/releases/download/twinsaor-v0.1/hadur117.twin.TwinSaor_0.1.jar`

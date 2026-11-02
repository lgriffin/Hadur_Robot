JayLexi 0.4, a MiniRumble 1v1 robot (docs/kitlab.md). Two classes, 1,494 bytes by plain javac, under MiniRumble's 1,499.

- The top 120 MiniRumble robots (by the 2026-11-02 rankings) get the field's surf danger row instead of their own. Live, 0.3's own rows cost it 6 to 8 APS against each learning gun at the top (docs/bench/live-kitlab-0.3.md).
- Only the AIM data string changes (tools/jaylexi_rows_off.py --top 120). Everything else plays as 0.3, including against the other 549 robots. The replay test still shows the shipped code gives the same orders, bit for bit, as the readable version kept with the tests.

Bench (PC, pc-jaylexi-rows, PR #588, 6 seeds, against 0.3 on the same opponents): +0.72 ± 0.15 APS on the 112-bot sample `mini-wide2` (paired estimate 88.65 against 0.3's live 87.93), and +3.05 on the top 60.

RoboRumble participants line (replaces the 0.3 line; LiteRumble scores it in MiniRumble by its codesize):
`hadur117.mini.JayLexi 0.4,https://github.com/lgriffin/Hadur_Robot/releases/download/jaylexi-v0.4/hadur117.mini.JayLexi_0.4.jar`

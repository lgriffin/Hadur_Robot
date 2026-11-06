JayLexi 0.6, a MiniRumble 1v1 robot (docs/kitlab.md). 1,494 bytes (ProGuard build), under MiniRumble's 1,499.

- Aim jitter against bullet catchers (JAYLEXI-19): BulletCatcher's orbit char carries 2 pi more, which switches on up to 0.125 rad of random gun turn, so its catcher no longer meets every shot. Every other robot plays as 0.5.
- The jar is built through ProGuard again (`jaylexi/proguard.pro`): 1,507 bytes with javac, 1,494 optimised. The jar replay test shows it gives javac's orders bit for bit.

Bench (PC, 20 fresh seeds): +57.3 ± 3.3 points against BulletCatcher, +0.086 APS (docs/bench/local/2026-11-04_jaylexi-jit.md). 0.5 is live.

RoboRumble participants line (replaces the 0.5 line; LiteRumble scores it in MiniRumble by its codesize):
`hadur117.mini.JayLexi 0.6,https://github.com/lgriffin/Hadur_Robot/releases/download/jaylexi-v0.6/hadur117.mini.JayLexi_0.6.jar`

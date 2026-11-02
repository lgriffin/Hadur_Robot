# Team bench

cz.libors.OgiTeam v1 against each team in turn, 10 rounds a battle, 1200x1200.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 776 over 528 battles (1.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent team | Battles | Score share | Rounds won | Survival | Faults | Skipped | LINK rejects | In-lane shots | Count < truth | Stray shelf files |
|---|---|---|---|---|---|---|---|---|---|---|
| mn.CombatTeam 3.25.0 | 12 | 65.7% | 79/120 | 65.8% | 0 | 16 | 0 | 296/31180 | 0/0 | 0 |
| cb.fire.FirestarterTeam 2.0 | 12 | 57.0% | 58/120 | 48.3% | 0 | 11 | 0 | 206/29163 | 0/0 | 0 |
| abc.ShadowTeam 3.83 | 12 | 67.1% | 98/120 | 81.7% | 0 | 19 | 0 | 429/28914 | 0/0 | 0 |
| rz.AlephTeam 0.34 | 12 | 71.3% | 90/120 | 75.0% | 0 | 16 | 0 | 310/27877 | 0/0 | 0 |
| ustimaw.NightmareTeam 3.3 | 12 | 62.1% | 119/120 | 99.2% | 0 | 17 | 0 | 756/14703 | 0/0 | 0 |
| florent.XSeries.Xmen 0.9 | 12 | 71.8% | 111/120 | 92.5% | 0 | 15 | 0 | 478/26571 | 0/0 | 0 |
| ags.polylunar.Polylunar 1.6 | 12 | 66.4% | 119/120 | 99.2% | 0 | 8 | 0 | 897/11381 | 0/0 | 0 |
| rz.GlowingHawks 0.2 | 12 | 88.1% | 120/120 | 100.0% | 0 | 21 | 0 | 288/24411 | 0/0 | 0 |
| kawigi.micro.ArmyOfShiz 1.1 | 12 | 90.6% | 120/120 | 100.0% | 0 | 25 | 0 | 231/23783 | 0/0 | 0 |
| rz.HOFSwarm 1.1 | 12 | 89.8% | 120/120 | 100.0% | 0 | 23 | 0 | 303/23355 | 0/0 | 0 |
| davidalves.PhoenixTeam 0.54 | 12 | 89.4% | 120/120 | 100.0% | 0 | 20 | 0 | 224/22955 | 0/0 | 0 |
| kid.team.OmegaSquad .0.2 | 12 | 85.4% | 117/120 | 97.5% | 0 | 8 | 0 | 266/28442 | 0/0 | 0 |
| cx.mini.DemoniacNimrods 0.50 | 12 | 81.3% | 116/120 | 96.7% | 0 | 15 | 0 | 170/22425 | 0/0 | 0 |
| tmnr.TMNR 1.01 | 12 | 92.3% | 120/120 | 100.0% | 0 | 10 | 0 | 318/21708 | 0/0 | 0 |
| myl.micro.TroodonPack 1.10 | 12 | 93.8% | 120/120 | 100.0% | 0 | 18 | 0 | 354/19660 | 0/0 | 0 |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 12 | 85.8% | 120/120 | 100.0% | 0 | 12 | 0 | 973/25976 | 0/0 | 0 |
| bvh.team.Valkiries 1.0 | 12 | 89.6% | 120/120 | 100.0% | 0 | 15 | 0 | 351/26279 | 0/0 | 0 |
| radnor.RadnorMedSchool 1.0 | 12 | 97.1% | 120/120 | 100.0% | 0 | 31 | 0 | 825/17222 | 0/0 | 0 |
| gh.mini.GrubbmGroup 0.4 | 12 | 94.9% | 120/120 | 100.0% | 0 | 26 | 0 | 865/24149 | 0/0 | 0 |
| apvteam.MambaTeam 0.7.5 | 12 | 87.6% | 120/120 | 100.0% | 0 | 12 | 0 | 890/24081 | 0/0 | 0 |
| gh.nano.GrofGroup 1.1 | 12 | 93.3% | 120/120 | 100.0% | 0 | 32 | 0 | 742/22227 | 0/0 | 0 |
| jab.DiamondStealers 5 | 12 | 87.8% | 120/120 | 100.0% | 0 | 14 | 0 | 815/20274 | 0/0 | 0 |
| ethdsy.MalackaTeam 1.2 | 12 | 93.5% | 120/120 | 100.0% | 0 | 15 | 0 | 1052/18972 | 0/0 | 0 |
| amz.TeamDeathTeam 1 | 12 | 82.0% | 120/120 | 100.0% | 0 | 23 | 0 | 645/8169 | 0/0 | 0 |
| jab.Enjambre 3 | 12 | 90.2% | 120/120 | 100.0% | 0 | 18 | 0 | 972/16654 | 0/0 | 0 |
| vuen.Bakery 2.51 | 12 | 95.3% | 120/120 | 100.0% | 0 | 24 | 0 | 443/24623 | 0/0 | 0 |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 12 | 82.2% | 120/120 | 100.0% | 0 | 22 | 0 | 753/9131 | 0/0 | 0 |
| pedersen.ImWithStupidTeam 1.3 | 12 | 93.0% | 120/120 | 100.0% | 0 | 15 | 0 | 737/17959 | 0/0 | 0 |
| pedersen.ImWithDroidTeam 1.3 | 12 | 90.5% | 120/120 | 100.0% | 0 | 17 | 0 | 744/20163 | 0/0 | 0 |
| mskwik.BumblingIdiots 1.0 | 12 | 96.7% | 120/120 | 100.0% | 0 | 8 | 0 | 338/10938 | 0/0 | 0 |
| sgp.DrunkenTeam 1.12 | 12 | 90.9% | 120/120 | 100.0% | 0 | 37 | 0 | 714/19024 | 0/0 | 0 |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 12 | 93.2% | 120/120 | 100.0% | 0 | 18 | 0 | 566/21644 | 0/0 | 0 |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 12 | 95.5% | 120/120 | 100.0% | 0 | 8 | 0 | 559/14569 | 0/0 | 0 |
| dummy_team.BlindFighters 1.01 | 12 | 97.9% | 120/120 | 100.0% | 0 | 18 | 0 | 205/12309 | 0/0 | 0 |
| lxx.ConceptATeam 0.8 | 12 | 93.3% | 120/120 | 100.0% | 0 | 17 | 0 | 763/11788 | 0/0 | 0 |
| sp.Minis.GeneBotUpgrade 1.1 | 12 | 94.9% | 120/120 | 100.0% | 0 | 25 | 0 | 598/18228 | 0/0 | 0 |
| ms.AresHaikuTeam 0.3 | 12 | 96.1% | 120/120 | 100.0% | 0 | 15 | 0 | 397/11965 | 0/0 | 0 |
| gimp.GimpTeam 0.1 | 12 | 95.1% | 120/120 | 100.0% | 0 | 32 | 0 | 610/22907 | 0/0 | 0 |
| ntc.slippery.Slippery 1.0 | 12 | 96.7% | 120/120 | 100.0% | 0 | 16 | 0 | 594/14018 | 0/0 | 0 |
| bugger.BuggerHive 1.0 | 12 | 96.1% | 120/120 | 100.0% | 0 | 15 | 0 | 905/20877 | 0/0 | 0 |
| Polkwane.PTeam 1.0 | 12 | 97.2% | 120/120 | 100.0% | 0 | 6 | 0 | 470/7026 | 0/0 | 0 |
| sampleteam.MyFirstTeam | 12 | 98.0% | 120/120 | 100.0% | 0 | 15 | 0 | 545/14557 | 0/0 | 0 |
| logiblocs.SittingDroidTeam 1.0 | 12 | 100.0% | 120/120 | 100.0% | 0 | 16 | 0 | 274/9323 | 0/0 | 0 |
| mn.SuperSittingDuckTeam 1.0.2 | 12 | 100.0% | 120/120 | 100.0% | 0 | 12 | 0 | 63/2414 | 0/0 | 0 |
| **All** | 528 | 88.1% | 5107/5280 | 96.7% | 0 | 776 | 0 | 23934/843994 | 0/0 | 0 |

Members' team records (sums): teammate hits 0, teammate bullet hits 0, teammate collisions 0, shots held for the fire lane 0, reports merged 0, drives fenced 0.
Engine's count of our bullets that hit one of our own members: 6313.

Focus fire: per round, the share of our bullet damage that landed on the most-hit enemy (rounds where we did damage; ramming is not counted).

| Opponent team | Rounds | Focus fire |
|---|---|---|
| mn.CombatTeam 3.25.0 | 120 | 30.5% |
| cb.fire.FirestarterTeam 2.0 | 120 | 31.0% |
| abc.ShadowTeam 3.83 | 120 | 30.8% |
| rz.AlephTeam 0.34 | 120 | 33.0% |
| ustimaw.NightmareTeam 3.3 | 120 | 33.5% |
| florent.XSeries.Xmen 0.9 | 120 | 34.2% |
| ags.polylunar.Polylunar 1.6 | 120 | 32.8% |
| rz.GlowingHawks 0.2 | 120 | 35.3% |
| kawigi.micro.ArmyOfShiz 1.1 | 120 | 35.2% |
| rz.HOFSwarm 1.1 | 120 | 35.6% |
| davidalves.PhoenixTeam 0.54 | 120 | 35.1% |
| kid.team.OmegaSquad .0.2 | 120 | 41.3% |
| cx.mini.DemoniacNimrods 0.50 | 120 | 33.9% |
| tmnr.TMNR 1.01 | 120 | 35.4% |
| myl.micro.TroodonPack 1.10 | 120 | 32.1% |
| Krabb.sliNk.SlartibartfassTeam 0.5 | 120 | 32.1% |
| bvh.team.Valkiries 1.0 | 120 | 35.3% |
| radnor.RadnorMedSchool 1.0 | 120 | 34.5% |
| gh.mini.GrubbmGroup 0.4 | 120 | 32.2% |
| apvteam.MambaTeam 0.7.5 | 120 | 34.6% |
| gh.nano.GrofGroup 1.1 | 120 | 33.7% |
| jab.DiamondStealers 5 | 120 | 35.3% |
| ethdsy.MalackaTeam 1.2 | 120 | 34.8% |
| amz.TeamDeathTeam 1 | 120 | 35.4% |
| jab.Enjambre 3 | 120 | 26.9% |
| vuen.Bakery 2.51 | 120 | 31.7% |
| mn.nano.perceptual.ImpactTeam 1.3.0 | 120 | 33.9% |
| pedersen.ImWithStupidTeam 1.3 | 120 | 35.5% |
| pedersen.ImWithDroidTeam 1.3 | 120 | 31.5% |
| mskwik.BumblingIdiots 1.0 | 120 | 35.0% |
| sgp.DrunkenTeam 1.12 | 120 | 35.0% |
| CharlieN.OmegaTeam.OmegaTeam 1.0 | 120 | 36.1% |
| jeremyreeder.collective.FourProphetsAndADiscliple 5 | 120 | 35.2% |
| dummy_team.BlindFighters 1.01 | 120 | 33.3% |
| lxx.ConceptATeam 0.8 | 120 | 36.3% |
| sp.Minis.GeneBotUpgrade 1.1 | 120 | 36.2% |
| ms.AresHaikuTeam 0.3 | 120 | 36.6% |
| gimp.GimpTeam 0.1 | 120 | 34.7% |
| ntc.slippery.Slippery 1.0 | 120 | 34.4% |
| bugger.BuggerHive 1.0 | 120 | 32.8% |
| Polkwane.PTeam 1.0 | 120 | 100.0% |
| sampleteam.MyFirstTeam | 120 | 31.2% |
| logiblocs.SittingDroidTeam 1.0 | 120 | 31.6% |
| mn.SuperSittingDuckTeam 1.0.2 | 120 | 20.0% |
| **All** | 5280 | 35.1% |

Data files written (any battle): abc\Shadow.data\Shadow.properties, kawigi\sbf\FloodHT.data\enemies.zip, lxx\ConceptA.data\ConceptA.properties, pedersen\ImWithStupid.data\debug.txt, pedersen\Stupid.data\debug.txt, logiblocs\SittingDroid.data\count.dat

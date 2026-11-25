# Driver census: which mover drove us when we were hit

Trace `work/learn-trace-324`, arm `c`, 1208 battle logs, 1208 robots. Percent of the hits on us in each band (band by our score in this trace).

| Band | Robots | Hits | surf | after_ram | finish | rammer | shield | mirror | stop_go | other |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| <70 | 27 | 12524 | 97.4 | 0.0 | 0.1 | 1.6 | 0.0 | 0.0 | 0.8 | 0.1 |
| 70-90 | 242 | 24324 | 80.6 | 0.5 | 1.2 | 9.6 | 5.3 | 0.2 | 1.8 | 0.7 |
| 90-95 | 178 | 7353 | 61.0 | 1.4 | 1.6 | 7.8 | 14.1 | 3.1 | 9.5 | 1.5 |
| 95+ | 761 | 8267 | 50.8 | 4.6 | 1.3 | 8.5 | 19.8 | 0.3 | 8.9 | 5.7 |
| all | 1208 | 52468 | 77.2 | 1.2 | 1.0 | 7.3 | 7.6 | 0.6 | 3.8 | 1.4 |

Classes: surf (a plan on the hitting wave), after_ram (our endgame ram), finish (the finishing approach), rammer (rammer-policy round), shield (shield round), mirror (mirror round), stop_go (a stop-and-go table line), other.

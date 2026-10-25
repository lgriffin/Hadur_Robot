"""Tests for melee_gap.py: python test_melee_gap.py"""

import unittest

import melee_gap as mg

RANKINGS = """<table><tr><th></th><th>Flag</th><th>Competitor</th><th>APS</th></tr>
<tr><td>1</td><td></td><td>aaa.Big 1.0</td><td>72.00</td></tr>
<tr><td>2</td><td></td><td>bbb.Mid 1.0</td><td>70.00</td></tr>
<tr><td>40</td><td></td><td>ccc.Small 1.0</td><td>60.00</td></tr>
<tr><td>50</td><td></td><td>hadur2.Hadur 3.15</td><td>66.00</td></tr></table>"""


def details(aps, survival, rows):
    out = "<table><tr><td>APS</td><td>%s</td></tr><tr><td>Survival</td><td>%s</td></tr>" % (aps, survival)
    for i, (name, a, s) in enumerate(rows, 1):
        out += ("<tr><td>%d</td><td></td><td>%s</td><td>compare</td><td>%.2f</td><td>1</td>"
                "<td>90</td><td>%.2f</td><td>0</td><td>5</td><td>x</td><td>50</td><td>5</td></tr>"
                % (i, name, a, s))
    return out + "</table>"


CENSUS = """# Bench suite

## Melee bench: F01

hadur2.Hadur 3.14 against 2 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 70.0 | 14 / 70 | 2.00 | 30.0% | 1000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.Big 1.0 | 1.0 | 40.0% | 50 |
| hadur2.Hadur 3.14 | 2.0 | 30.0% | 14 |
| ccc.Small 1.0 | 3.0 | 30.0% | 6 |

Hadur per battle:

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.Big 1.0 | 40 | 25% |
| ccc.Small 1.0 | 10 | 40% |

Hadur died in 50 of 70 rounds, at a mean tick of 900.

## Melee bench: F01

hadur2.Hadur 3.13 against 2 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.0 | 70.0 | 1 / 70 | 2.00 | 30.0% | 1000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.13 | 2.0 | 30.0% | 1 |

Hadur per battle:
"""


class MeleeGapTest(unittest.TestCase):

    def test_rankings_and_details(self):
        ranks = mg.read_rankings(RANKINGS)
        self.assertEqual(ranks["bbb.Mid 1.0"], (2, 70.0))
        s, per = mg.read_details(details("66.30", "43.46", [("aaa.Big 1.0", 40.0, 10.0)]))
        self.assertEqual(s["APS"], "66.30")
        self.assertEqual(per["aaa.Big 1.0"], (40.0, 10.0, 5))

    def test_live_gap_bands_sum_to_total(self):
        ranks = mg.read_rankings(RANKINGS)
        _, h = mg.read_details(details("66", "40", [("aaa.Big 1.0", 40, 10), ("bbb.Mid 1.0", 50, 20),
                                                   ("ccc.Small 1.0", 80, 50)]))
        _, p = mg.read_details(details("70", "60", [("aaa.Big 1.0", 46, 30), ("bbb.Mid 1.0", 56, 40),
                                                   ("ccc.Small 1.0", 83, 70)]))
        rows, total = mg.live_gap(h, p, ranks)
        self.assertAlmostEqual(total, (6 + 6 + 3) / 3.0)
        self.assertAlmostEqual(sum(r[4] for r in rows), total)
        self.assertEqual([mg.band_label(r[0]) for r in rows], ["1-10", "31-60"])

    def test_census_reads_only_the_build(self):
        ranks = mg.read_rankings(RANKINGS)
        fields = mg.read_census(CENSUS, "hadur2.Hadur 3.14")
        self.assertEqual(len(fields), 1)
        f = fields[0]
        self.assertEqual((f["won"], f["rounds"], f["died"]), (14, 70, 50))
        self.assertEqual(f["duels"]["aaa.Big 1.0"], (40, 10.0))
        r = mg.census_read(fields, ranks)
        self.assertAlmostEqual(r["won_by_strongest"][(1, 10)], 0.2)
        n, w = r["duels"][(1, 10)]
        self.assertAlmostEqual(n, 20.0)
        self.assertAlmostEqual(w, 5.0)


if __name__ == "__main__":
    unittest.main()

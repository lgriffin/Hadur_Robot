"""BENCH-99: tools/table_v1.py builds the screen panel, confirm set, final list, candidate and census gate."""
import os
import random
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import table_v1  # noqa: E402

HEADER = "arm\trobot\topponent\trole\tseed\tok\tscore_share\n"
LISTDATA = '''final class ShieldListData {
    static String[] lines() {
        return new String[] {
            // The probe's "wins": a comment string, not an entry.
            "a.Listed 1.0",
            "b.Bare",
        };
    }
}
'''


class TableV1Test(unittest.TestCase):
    def setUp(self):
        self.dir = tempfile.mkdtemp()

    def file(self, name, text):
        path = os.path.join(self.dir, name)
        with open(path, "w", encoding="utf-8") as f:
            f.write(text)
        return path

    @staticmethod
    def read(path):
        with open(path, encoding="utf-8") as f:
            return f.read()

    def census(self):
        return self.file("census.txt", "# census\n" + "".join(
            "%s | rank%d-band%d\n" % (n, i + 1, 3 if i < 2 else 5)
            for i, n in enumerate(["a.Listed 1.0", "b.Bare 2.0", "c.Off 1.0", "d.New 1.0", "e.New 1.0"])))

    def arms(self, name, gains, seeds=4, base=60.0):
        rnd = random.Random(7)
        rows = [HEADER]
        for opp, (role, gain) in gains.items():
            for arm, g in (("c", 0.0), ("aa", 0.0), ("x", gain)):
                for s in range(seeds):
                    share = (base + g + rnd.uniform(-0.5, 0.5)) / 100
                    rows.append("%s\tbot\t%s\t%s\t%d\ttrue\t%.4f\n" % (arm, opp, role, s, share))
        return self.file(name, "".join(rows))

    def test_list_names_reads_entries_not_comment_strings(self):
        self.assertEqual(table_v1.list_names(self.file("L.java", LISTDATA)), {"a.Listed 1.0", "b.Bare"})

    def test_panel_drops_listed_with_or_without_version_and_excluded(self):
        rows = table_v1.panel(self.census(), self.file("L.java", LISTDATA), [self.file("ex.txt", "c.Off 1.0\n")])
        self.assertEqual([r.split("|")[0].strip() for r in rows], ["d.New 1.0", "e.New 1.0"])

    def test_confirm_set_and_final(self):
        first = self.file("first.tsv", "d.New 1.0\tsasq\t9\t2\t4\t8\ne.New 1.0\tsy\t7\t1\t4\t8\n")
        s1 = self.file("s1.tsv", "c.Off 1.0\tsa\t6\t1\t8\t16\n")
        rows = table_v1.confirm_set(self.census(), [first, s1], set(table_v1.SHIELD_ARMS))
        self.assertEqual(len(rows), 3)
        confirm = self.file("confirm.tsv", "d.New 1.0\tsasq\t8\t2\t8\t16\nc.Off 1.0\tsasq\t5\t1\t8\t16\n"
                                           "b.Bare 2.0\tsasq\t5\t1\t8\t16\ne.New 1.0\tsy\t5\t1\t8\t16\n")
        self.assertEqual(table_v1.final(confirm, [first, s1], "sasq"), ["c.Off 1.0", "d.New 1.0"])

    def test_candidate_spec(self):
        self.assertEqual(table_v1.candidate_spec(True, ["x"]), ("sprior,slistadd", "sqmt"))
        self.assertEqual(table_v1.candidate_spec(False, ["x"]), ("slistadd", "mt"))
        self.assertEqual(table_v1.candidate_spec(True, []), ("sprior", "sq"))
        self.assertEqual(table_v1.candidate_spec(False, []), ("", ""))
        self.assertIn("t1 | hadur2.Hadur 3.15sqmt | bisect/hadur2.Hadur_3.15sqmt.jar\n",
                      table_v1.candidate_arms("sqmt"))

    def test_prior_ships_unless_it_costs(self):
        gains = {"o%d" % i: ("rank%d-band3" % i, 0.0) for i in range(20)}
        tsv = self.arms("level.tsv", gains)
        level = self.file("sq.tsv", self.read(tsv).replace("\nx\t", "\nsq\t"))
        self.assertTrue(table_v1.prior_ok(level, -0.3)[0])
        cost = self.arms("cost.tsv", {o: (r, -2.0) for o, (r, _) in gains.items()})
        cost = self.file("sqcost.tsv", self.read(cost).replace("\nx\t", "\nsq\t"))
        self.assertFalse(table_v1.prior_ok(cost, -0.3)[0])

    def test_gate_pass_and_fail(self):
        census = self.census()
        good = {"o%d" % i: ("rank%d-band%d" % (i, 3 if i % 2 else 5), 1.0) for i in range(30)}
        tsv = self.file("t1.tsv", self.read(self.arms("g.tsv", good)).replace("\nx\t", "\nt1\t"))
        ok, m, ci, n, aa = table_v1.gate(tsv, census, "t1", 0.5, 0.3)
        self.assertTrue(ok)
        self.assertAlmostEqual(m, 1.0, delta=0.2)
        self.assertTrue(aa["ok"])
        small = {o: (r, 0.3) for o, (r, _) in good.items()}
        tsv = self.file("t2.tsv", self.read(self.arms("s.tsv", small)).replace("\nx\t", "\nt1\t"))
        self.assertFalse(table_v1.gate(tsv, census, "t1", 0.5, 0.3)[0])

    def test_gate_writes_verdict(self):
        good = {"o%d" % i: ("rank%d-band3" % i, 1.0) for i in range(30)}
        tsv = self.file("t1.tsv", self.read(self.arms("g.tsv", good)).replace("\nx\t", "\nt1\t"))
        out = os.path.join(self.dir, "gate.md")
        self.assertEqual(table_v1.main(["gate", tsv, self.census(), "--out", out]), 0)
        self.assertIn("PASS: t1", self.read(out))


if __name__ == "__main__":
    unittest.main()

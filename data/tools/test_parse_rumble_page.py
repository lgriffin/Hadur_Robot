import unittest
from pathlib import Path

import parse_rumble_page as p

PAGES = Path(__file__).resolve().parent.parent / "rumble" / "pages"


class ParseRumblePageTest(unittest.TestCase):
    def test_botdetails_rows_have_thirteen_cells(self):
        page = PAGES / "2026-09-30T1146Z_roborumble_botdetails_hadur2.Hadur_3.1.mht"
        rows = p.parse_botdetails(p.page_html(page))
        self.assertEqual(53, len(rows))
        self.assertTrue(all(len(r) == 13 for r in rows))
        self.assertEqual("2026-09-30 11:23:55", min(r[10] for r in rows))

    def test_rankings_rows_are_rank_name_aps(self):
        page = PAGES / "2026-09-30T1145Z_roborumble_rankings.mht"
        rows = p.parse_rankings(p.page_html(page))
        self.assertEqual(1216, len(rows))
        self.assertEqual(["1", "kc.mega.BeepBoop 2.0", "95.06"], rows[0])
        self.assertEqual(["16", "hadur2.Hadur 3.1", "86.74"], rows[15])

    def test_kind_from_snapshot_location(self):
        page = PAGES / "2026-09-30T1145Z_roborumble_rankings.mht"
        self.assertEqual("rankings", p.kind(page, page.read_bytes().decode("utf-8", "replace")))


if __name__ == "__main__":
    unittest.main()

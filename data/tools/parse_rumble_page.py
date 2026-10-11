#!/usr/bin/env python3
"""Parse a saved LiteRumble page (.mht) into the archive's table format.

    python3 data/tools/parse_rumble_page.py PAGE.mht [OUT]

A BotDetails page becomes a CSV with the columns the 3.0 table used (rank, flag, name,
compare, APS, APS CI, NPP, survival, KNNPBI, battles, latest battle, opponent APS, opponent
survival); a BotCompare page (bot A against bot B over their common opponents) becomes a CSV
of the opponent, both bots' APS and survival, A minus B, and the opponent's APS and survival;
a Rankings page becomes a TSV of rank, name, APS. With no OUT the table is
written next to the page under rumble/parsed/ with the page's stem. Standard library only.
"""
import csv
import email
import html
import re
import sys
from pathlib import Path

TAG = re.compile(r"<[^>]*>")
ROW = re.compile(r"<tr>(.*?)</tr>", re.DOTALL)
CELL = re.compile(r"<td[^>]*>(.*?)</td>", re.DOTALL)


def page_html(path):
    with open(path, "rb") as f:
        msg = email.message_from_binary_file(f)
    for part in msg.walk():
        if part.get_content_type() == "text/html":
            return part.get_payload(decode=True).decode("utf-8", "replace")
    raise SystemExit(f"no text/html part in {path}")


def kind(path, text):
    loc = re.search(r"^Snapshot-Content-Location:\s*(\S+)", text, re.M)
    url = loc.group(1) if loc else path.name
    if "BotCompare" in url or "botcompare" in path.name:
        return "botcompare"
    if "BotDetails" in url or "botdetails" in path.name:
        return "botdetails"
    if "Rankings" in url or "rankings" in path.name:
        return "rankings"
    raise SystemExit(f"unknown page type: {url}")


def cells_of(row):
    return [html.unescape(TAG.sub("", c)).strip() for c in CELL.findall(row)]


def parse_botdetails(doc):
    rows = []
    for row in ROW.findall(doc):
        cells = cells_of(row)
        if len(cells) >= 13 and cells[0].isdigit():
            rows.append(cells[:13])
    return rows


def parse_botcompare(doc):
    """Opponent rows: index, flag, name, A APS, A survival, B APS, B survival, APS diff,
    survival diff, opponent APS, opponent survival (11 cells)."""
    rows = []
    for row in ROW.findall(doc):
        cells = cells_of(row)
        if len(cells) >= 11 and cells[0].isdigit():
            rows.append(cells[:11])
    return rows


def parse_rankings(doc):
    rows = []
    for row in ROW.findall(doc):
        cells = cells_of(row)
        # rank, flag, name, (details/compare links...), APS, ...
        if len(cells) >= 4 and cells[0].isdigit():
            nums = [c for c in cells[3:] if re.fullmatch(r"-?\d+(\.\d+)?", c)]
            if nums:
                rows.append([cells[0], cells[2], nums[0]])
    return rows


def main(argv):
    page = Path(argv[1])
    raw = page.read_bytes().decode("utf-8", "replace")
    doc = page_html(page)
    what = kind(page, raw)
    parsed_dir = page.parent.parent / "parsed"
    if what == "botdetails":
        rows = parse_botdetails(doc)
        out = Path(argv[2]) if len(argv) > 2 else parsed_dir / (page.stem + ".csv")
        with open(out, "w", newline="") as f:
            w = csv.writer(f)
            w.writerow(["rank", "flag", "name", "compare", "aps", "aps_ci", "npp", "survival",
                        "knnpbi", "battles", "latest_battle_utc", "opponent_aps",
                        "opponent_survival"])
            w.writerows(rows)
    elif what == "botcompare":
        rows = parse_botcompare(doc)
        out = Path(argv[2]) if len(argv) > 2 else parsed_dir / (page.stem + ".csv")
        with open(out, "w", newline="") as f:
            w = csv.writer(f)
            w.writerow(["index", "flag", "name", "a_aps", "a_survival", "b_aps", "b_survival",
                        "aps_diff", "survival_diff", "opponent_aps", "opponent_survival"])
            w.writerows(rows)
    else:
        rows = parse_rankings(doc)
        out = Path(argv[2]) if len(argv) > 2 else parsed_dir / (page.stem + ".tsv")
        with open(out, "w") as f:
            f.write("rank\tname\taps\n")
            for r in rows:
                f.write("\t".join(r) + "\n")
    print(f"{what}: {len(rows)} rows -> {out}")


if __name__ == "__main__":
    main(sys.argv)

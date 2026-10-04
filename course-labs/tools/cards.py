#!/usr/bin/env python3
"""Write an SVG title card for every course learning object that has no image.

Usage: python3 course-labs/tools/cards.py [--force]

A topic, talk, note, web link or lab without a .png/.jpg/.gif/.svg gets one named after
its key file (topic.svg, talk.svg, ...); a lab gets img/main.svg. The title is read from
the object's markdown. --force rewrites cards this script made before (it never touches
an image it did not write).
"""
import html
import pathlib
import re
import sys

ROOT = pathlib.Path(__file__).resolve().parents[2] / "course"
MARK = "<!-- hadur-course-card -->"
IMAGE_EXT = {".png", ".jpg", ".jpeg", ".gif", ".svg"}
PALETTE = {
    "topic": ("#1f3a5f", "#e8eef6"),
    "talk": ("#6b2d5c", "#f6e8f1"),
    "note": ("#2f5d3a", "#e9f4ec"),
    "web": ("#7a4b12", "#f8efe2"),
    "book": ("#7a1f1f", "#f8e6e6"),
    "quiz": ("#3f3f8f", "#ececfa"),
}
KIND_LABEL = {"topic": "TOPIC", "talk": "TALK", "note": "NOTE", "web": "LINK", "book": "LAB", "quiz": "QUIZ"}


def title_of(md: pathlib.Path) -> str:
    text = md.read_text(encoding="utf-8")
    text = re.sub(r"\A---\n.*?\n---\n", "", text, flags=re.S)
    for line in text.splitlines():
        if line.strip():
            return line.strip().lstrip("#").strip()
    return md.parent.name


def wrap(title: str, width: int = 22) -> list:
    words, lines, line = title.split(), [], ""
    for w in words:
        if line and len(line) + 1 + len(w) > width:
            lines.append(line)
            line = w
        else:
            line = f"{line} {w}".strip()
    if line:
        lines.append(line)
    return lines[:4]


def card(title: str, kind: str) -> str:
    fg, bg = PALETTE[kind]
    lines = wrap(title)
    y0 = 200 - (len(lines) - 1) * 26
    text = "".join(
        f'<text x="40" y="{y0 + i * 52}" font-size="40" font-weight="700" fill="{fg}">{html.escape(l)}</text>'
        for i, l in enumerate(lines)
    )
    return (
        f'<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 480 360" width="480" height="360">{MARK}'
        f'<rect width="480" height="360" fill="{bg}"/>'
        f'<rect width="480" height="14" fill="{fg}"/>'
        f'<text x="40" y="70" font-size="20" letter-spacing="4" fill="{fg}" opacity="0.7" '
        f'font-family="sans-serif">{KIND_LABEL[kind]}</text>'
        f'<g font-family="sans-serif">{text}</g>'
        f'<text x="40" y="330" font-size="18" fill="{fg}" opacity="0.6" font-family="sans-serif">Building Hadur</text>'
        "</svg>\n"
    )


def has_own_image(folder: pathlib.Path, force: bool) -> bool:
    for f in folder.iterdir():
        if f.suffix.lower() in IMAGE_EXT:
            if force and f.suffix == ".svg" and MARK in f.read_text(encoding="utf-8", errors="ignore"):
                continue
            return True
    return False


def main() -> None:
    force = "--force" in sys.argv
    written = 0
    for folder in sorted(p for p in ROOT.rglob("*") if p.is_dir()):
        kind = folder.name.split("-")[0]
        if kind not in PALETTE:
            continue
        if kind == "book":
            steps = sorted(folder.glob("*.md"))
            if not steps:
                continue
            img = folder / "img"
            img.mkdir(exist_ok=True)
            target = img / "main.svg"
            if target.exists() and not (force and MARK in target.read_text(encoding="utf-8")):
                continue
            if any(f.stem == "main" and f.suffix.lower() in IMAGE_EXT and f != target for f in img.iterdir()):
                continue
            target.write_text(card(title_of(steps[0]), kind), encoding="utf-8")
            written += 1
            continue
        key = {"topic": "topic.md", "talk": "talk.md", "note": "note.md", "web": "web.md", "quiz": "quiz.md"}[kind]
        md = folder / key
        if not md.exists():
            mds = sorted(folder.glob("*.md"))
            if not mds:
                continue
            md = mds[0]
        if has_own_image(folder, force):
            continue
        (folder / f"{md.stem}.svg").write_text(card(title_of(md), kind), encoding="utf-8")
        written += 1
    svg = ROOT / "course.svg"
    if not any((ROOT / f"course{e}").exists() for e in (".png", ".jpg")) and (force or not svg.exists()):
        svg.write_text(card("Building Hadur", "topic").replace(">TOPIC<", ">COURSE<"), encoding="utf-8")
        written += 1
    print(f"cards written: {written}")


if __name__ == "__main__":
    main()

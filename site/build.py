#!/usr/bin/env python3
"""Builds the Hadur 2 docs site (GitHub Pages) from the repository.

Run by site/build.sh after `mvn javadoc:aggregate` has written the API docs. Standard
library only, so it runs anywhere Python 3 does.

The site has four parts:
  index.html          the landing page
  requirements.html   every EARS requirement with the classes that implement it (from the
                      IDs the main sources cite) and the tests that verify it (the same
                      @Tag("ID") and feature @ID tags RequirementsTraceabilityTest reads)
  docs/*.html         the repository's design docs, rendered from Markdown
  api/                the Javadoc, with every requirement ID linked to its row

Usage: build.py REPO_ROOT OUT_DIR
"""

import html
import os
import re
import shutil
import sys
from collections import defaultdict

GITHUB = "https://github.com/lgriffin/Hadur_Robot"
BLOB = GITHUB + "/blob/master/"

# Docs rendered into the site, in menu order: (source, page, title).
DOCS = [
    ("docs/architecture.md", "architecture.html", "Architecture"),
    ("docs/testing.md", "testing.html", "Testing"),
    ("docs/strategy-evolution.md", "strategy-evolution.html", "Strategy evolution"),
    ("docs/bullet-shielding.md", "bullet-shielding.html", "Bullet shielding"),
    ("docs/requirements.md", "requirements-notes.html", "Requirement readings"),
    ("docs/architecture-evolution.md", "architecture-evolution.html", "Architecture evolution"),
    ("docs/bench/expected-3.7.md", "expected-3.7.html", "What 3.7 should score"),
    ("docs/rumble-submission.md", "rumble-submission.html", "Rumble entry"),
    ("docs/releases/v3.0.md", "release-3.0.html", "Release 3.0"),
    ("docs/releases/v3.7.md", "release-3.7.html", "Release 3.7"),
    ("followup.md", "followup.html", "Follow-ups"),
]

ID = r"[A-Z]+-\d+"
ROW = re.compile(r"^\|\s*(" + ID + r")\s*\|\s*([^|]+?)\s*\|\s*(.+?)\s*\|\s*([SMRA]\d+)\s*\|\s*$")
RETIRED = re.compile(r"^\|\s*(" + ID + r")\s*\|\s*(.+?)\s*\|\s*([SMRA]\d+)\s*\|\s*(.+?)\s*\|\s*$")
JAVA_TAG = re.compile(r'@Tag\("(' + ID + r')"\)')
FEATURE_TAG = re.compile(r"@(" + ID + r")\b")

GROUPS = [
    ("CORE", "Core"), ("RES", "Resilience"), ("REL", "Release"), ("WAVE", "Waves"),
    ("RADAR", "Radar"), ("MEM", "Memory"), ("ADAPT", "Adapt"), ("DIAL", "Dials"),
    ("DIST", "Distance"), ("POW", "Power"), ("END", "Endgame"), ("MOVE", "Movement"),
    ("TIME", "Time budget"), ("SHIELD", "Bullet shielding"), ("MELEE", "Melee (2.1)"),
    ("GATE", "Posture gate"), ("MRADAR", "Melee radar"), ("MSENSE", "Melee sensing"),
    ("MMOVE", "Melee movement"), ("MGUN", "Melee gun"), ("MMEM", "Melee memory"),
]


def read(path):
    with open(path, encoding="utf-8") as f:
        return f.read()


def write(path, text):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", encoding="utf-8") as f:
        f.write(text)


def esc(s):
    return html.escape(s, quote=True)


# ---------------------------------------------------------------- requirements

def requirements(root):
    """The live and retired rows of docs/requirements.md, in file order."""
    live, retired, in_retired = [], [], False
    for line in read(os.path.join(root, "docs/requirements.md")).splitlines():
        if line.startswith("## Retired"):
            in_retired = True
        m = (RETIRED if in_retired else ROW).match(line)
        if not m:
            continue
        if in_retired:
            retired.append(dict(id=m[1], text=m[2], stage=m[3], by=m[4]))
        else:
            live.append(dict(id=m[1], pattern=m[2], text=m[3], stage=m[4]))
    return live, retired


def java_sources(root, sub):
    for module in ("hadur-core", "hadur-robot", "hadur-bench"):
        base = os.path.join(root, module, sub)
        for d, _, files in os.walk(base):
            for f in sorted(files):
                if f.endswith(".java"):
                    yield module, base, os.path.join(d, f)


def implementations(root, ids):
    """ID -> {class: (module, path)} for main sources that cite the ID in a comment."""
    known = set(ids)
    out = defaultdict(dict)
    for module, base, path in java_sources(root, "src/main/java"):
        text = read(path)
        rel = os.path.relpath(path, base)[:-5].replace(os.sep, ".")
        for rid in set(re.findall(r"\b(" + ID + r")\b", text)) & known:
            out[rid][rel] = (module, os.path.relpath(path, root))
    return out


def verifications(root):
    """ID -> sorted repo paths of the tests tagged with it."""
    out = defaultdict(set)
    for module, _, path in java_sources(root, "src/test/java"):
        for rid in JAVA_TAG.findall(read(path)):
            out[rid].add(os.path.relpath(path, root))
    for module in ("hadur-core", "hadur-robot", "hadur-bench"):
        base = os.path.join(root, module, "src/test/resources")
        for d, _, files in os.walk(base):
            for f in files:
                if f.endswith(".feature"):
                    p = os.path.join(d, f)
                    for rid in FEATURE_TAG.findall(read(p)):
                        out[rid].add(os.path.relpath(p, root))
    return {k: sorted(v) for k, v in out.items()}


# ---------------------------------------------------------------- markdown

def inline(s, link_ids, page_for):
    """Inline Markdown (code, bold, italic, links) to HTML; requirement IDs become links."""
    parts = re.split(r"(`[^`]+`)", s)
    out = []
    for p in parts:
        if p.startswith("`") and p.endswith("`") and len(p) > 1:
            out.append("<code>" + esc(p[1:-1]) + "</code>")
            continue
        links = []

        def keep_link(m):
            label, target = m[1], m[2]
            links.append('<a href="%s">%s</a>' % (esc(page_for(target)), inline(label, link_ids, page_for)))
            return "\x00%d\x00" % (len(links) - 1)

        p = re.sub(r"\[([^\]]+)\]\(([^)\s]+)\)", keep_link, p)
        p = esc(p)
        p = re.sub(r"\*\*(.+?)\*\*", r"<strong>\1</strong>", p)
        p = re.sub(r"(?<![\w*])\*(?!\s)(.+?)(?<!\s)\*(?![\w*])", r"<em>\1</em>", p)
        p = re.sub(r"(?<![\w])_(?!\s)(.+?)(?<!\s)_(?![\w])", r"<em>\1</em>", p)
        p = link_ids(p)
        p = re.sub("\x00(\\d+)\x00", lambda m: links[int(m[1])], p)
        out.append(p)
    return "".join(out)


def markdown(text, link_ids, page_for):
    """A small Markdown renderer: headings, paragraphs, lists, tables, quotes, code fences
    (mermaid fences become diagrams). Enough for this repository's docs."""
    lines = text.splitlines()
    out, i = [], 0
    il = lambda s: inline(s, link_ids, page_for)
    while i < len(lines):
        line = lines[i]
        if line.startswith("```"):
            lang = line[3:].strip()
            body = []
            i += 1
            while i < len(lines) and not lines[i].startswith("```"):
                body.append(lines[i])
                i += 1
            i += 1
            if lang == "mermaid":
                out.append('<pre class="mermaid">' + esc("\n".join(body)) + "</pre>")
            else:
                out.append("<pre><code>" + esc("\n".join(body)) + "</code></pre>")
            continue
        m = re.match(r"^(#{1,6})\s+(.*)$", line)
        if m:
            level, title = len(m[1]), m[2].strip()
            anchor = re.sub(r"[^a-z0-9]+", "-", title.lower()).strip("-")
            out.append('<h%d id="%s">%s</h%d>' % (level, anchor, il(title), level))
            i += 1
            continue
        if line.startswith("|") and i + 1 < len(lines) and re.match(r"^\|[\s:|-]+\|\s*$", lines[i + 1]):
            cells = lambda l: [c.strip() for c in l.strip().strip("|").split("|")]
            head = cells(line)
            i += 2
            rows = []
            while i < len(lines) and lines[i].startswith("|"):
                rows.append(cells(lines[i]))
                i += 1
            t = ['<div class="table"><table><thead><tr>']
            t += ["<th>%s</th>" % il(c) for c in head]
            t.append("</tr></thead><tbody>")
            for r in rows:
                t.append("<tr>" + "".join("<td>%s</td>" % il(c) for c in r) + "</tr>")
            t.append("</tbody></table></div>")
            out.append("".join(t))
            continue
        if re.match(r"^\s*([-*]|\d+\.)\s+", line):
            ordered = bool(re.match(r"^\s*\d+\.", line))
            items = []
            while i < len(lines) and (re.match(r"^\s*([-*]|\d+\.)\s+", lines[i])
                                      or (lines[i].startswith("  ") and lines[i].strip() and items)):
                if re.match(r"^\s*([-*]|\d+\.)\s+", lines[i]):
                    items.append(re.sub(r"^\s*([-*]|\d+\.)\s+", "", lines[i]))
                else:
                    items[-1] += " " + lines[i].strip()
                i += 1
            tag = "ol" if ordered else "ul"
            out.append("<%s>%s</%s>" % (tag, "".join("<li>%s</li>" % il(x) for x in items), tag))
            continue
        if line.startswith(">"):
            body = []
            while i < len(lines) and lines[i].startswith(">"):
                body.append(lines[i].lstrip("> "))
                i += 1
            out.append("<blockquote><p>%s</p></blockquote>" % il(" ".join(body)))
            continue
        if not line.strip():
            i += 1
            continue
        para = []
        while i < len(lines) and lines[i].strip() and not re.match(r"^(#|```|\||>|\s*([-*]|\d+\.)\s)", lines[i]):
            para.append(lines[i].strip())
            i += 1
        if para:
            out.append("<p>%s</p>" % il(" ".join(para)))
        else:
            i += 1
    return "\n".join(out)


# ---------------------------------------------------------------- pages

def page(title, body, active, depth=0, mermaid=False):
    up = "../" * depth
    nav = [("index.html", "Home"), ("requirements.html", "Requirements"),
           ("docs/architecture.html", "Architecture"), ("docs/testing.html", "Testing"),
           ("api/index.html", "Javadoc")]
    links = "".join('<a href="%s%s"%s>%s</a>' % (up, href, ' aria-current="page"' if href == active else "", label)
                    for href, label in nav)
    script = ""
    if mermaid:
        script = ('<script type="module">import mermaid from "https://cdn.jsdelivr.net/npm/mermaid@11/dist/mermaid.esm.min.mjs";'
                  'mermaid.initialize({startOnLoad:true,theme:matchMedia("(prefers-color-scheme: dark)").matches?"dark":"default"});</script>')
    return """<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>%s</title>
<link rel="stylesheet" href="%sstyle.css">
</head>
<body>
<header><div class="wrap"><a class="brand" href="%sindex.html">Hadur 2</a><nav>%s<a href="%s">GitHub</a></nav></div></header>
<main class="wrap">
%s
</main>
<footer class="wrap">Built from <a href="%s">lgriffin/Hadur_Robot</a> by <code>site/build.sh</code>.</footer>
%s
</body>
</html>
""" % (esc(title), up, up, links, GITHUB, body, GITHUB, script)


def id_linker(ids, prefix):
    """Replaces requirement IDs in escaped HTML text with links to their rows."""
    pat = re.compile(r"(?<![\w#-])(" + "|".join(sorted(map(re.escape, ids), key=len, reverse=True)) + r")(?![\w-])")
    return lambda s: pat.sub(lambda m: '<a class="req" href="%srequirements.html#%s">%s</a>' % (prefix, m[1], m[1]), s)


def link_ids_in_html(doc, linker):
    """Links requirement IDs in an HTML document's text, leaving tags, attributes, code
    blocks and existing links alone."""
    out, depth = [], {"a": 0, "code": 0, "pre": 0, "script": 0, "title": 0}
    for tok in re.split(r"(<[^>]+>)", doc):
        if tok.startswith("<"):
            m = re.match(r"<(/?)(\w+)", tok)
            if m and m[2].lower() in depth:
                depth[m[2].lower()] += -1 if m[1] else 1
            out.append(tok)
        elif any(depth.values()):
            out.append(tok)
        else:
            out.append(linker(tok))
    return "".join(out)


def build(root, out):
    live, retired = requirements(root)
    ids = [r["id"] for r in live] + [r["id"] for r in retired]
    impl = implementations(root, ids)
    tests = verifications(root)
    have_api = os.path.isdir(os.path.join(out, "api"))

    rendered = {src: "docs/" + pg for src, pg, _ in DOCS}

    def linker_for(prefix, from_docs):
        """Resolves a Markdown link target: a rendered doc becomes its page (relative to
        the linking page), any other repository path a GitHub link."""
        def page_for(target):
            if re.match(r"^[a-z]+:", target) or target.startswith("#"):
                return target
            path, _, frag = target.partition("#")
            norm = os.path.normpath(os.path.join("docs", path)) if from_docs else os.path.normpath(path)
            tail = "#" + frag if frag else ""
            if norm in rendered:
                return prefix + os.path.basename(rendered[norm]) + tail
            return BLOB + norm.replace(os.sep, "/") + tail
        return page_for

    page_for_doc = linker_for("docs/", False)
    page_in_docs = linker_for("", True)

    # Requirement traceability page.
    by_group = defaultdict(list)
    for r in live:
        by_group[r["id"].rsplit("-", 1)[0]].append(r)
    linker0 = id_linker(ids, "")
    rows = []
    covered = sum(1 for r in live if tests.get(r["id"]))
    for prefix, name in GROUPS + [(g, g) for g in sorted(by_group) if g not in dict(GROUPS)]:
        if prefix not in by_group:
            continue
        rows.append('<h2 id="group-%s">%s</h2>' % (prefix, esc(name)))
        for r in by_group[prefix]:
            classes = impl.get(r["id"], {})
            code = []
            for fq, (module, path) in sorted(classes.items()):
                simple = fq.rsplit(".", 1)[-1]
                href = ("api/" + fq.replace(".", "/") + ".html") if have_api and module != "hadur-bench" and simple != "package-info" else BLOB + path
                if simple == "package-info" and have_api:
                    href = "api/" + fq.rsplit(".", 1)[0].replace(".", "/") + "/package-summary.html"
                    simple = fq.rsplit(".", 2)[-2] + " (package)"
                code.append('<a href="%s" title="%s">%s</a>' % (esc(href), esc(fq), esc(simple)))
            ver = ['<a href="%s">%s</a>' % (esc(BLOB + t), esc(os.path.basename(t))) for t in tests.get(r["id"], [])]
            rows.append("""<article class="req-card" id="%s">
<div class="req-head"><span class="rid">%s</span><span class="badge">%s</span><span class="badge stage">%s</span></div>
<p>%s</p>
<dl><dt>Implemented in</dt><dd>%s</dd><dt>Verified by</dt><dd>%s</dd></dl>
</article>""" % (r["id"], r["id"], esc(r["pattern"]), r["stage"], inline(r["text"], linker0, page_for_doc),
                 ", ".join(code) or '<span class="none">no citation in the sources</span>',
                 ", ".join(ver) or '<span class="none">no tagged test</span>'))
    if retired:
        rows.append('<h2 id="retired">Retired requirements</h2><p>A retired requirement keeps its ID; no new requirement reuses it.</p>')
        rows.append('<div class="table"><table><thead><tr><th>ID</th><th>Requirement</th><th>Retired</th><th>Replaced by</th></tr></thead><tbody>')
        for r in retired:
            rows.append('<tr id="%s"><td class="rid">%s</td><td>%s</td><td>%s</td><td>%s</td></tr>'
                        % (r["id"], r["id"], inline(r["text"], lambda s: s, page_for_doc), r["stage"], inline(r["by"], linker0, page_for_doc)))
        rows.append("</tbody></table></div>")
    intro = """<h1>EARS requirements</h1>
<p class="lede">Every requirement from <a href="%s">docs/requirements.md</a>, the source of truth. <em>Implemented in</em> lists
the classes whose documentation cites the ID; <em>Verified by</em> lists the tests tagged with it, the same tags the build's
traceability check reads. %d of %d live requirements have a tagged test. The readings behind the numbers are in
<a href="docs/requirements-notes.html">Requirement readings</a>.</p>
<nav class="toc">%s</nav>""" % (BLOB + "docs/requirements.md", covered, len(live),
                               " ".join('<a href="#group-%s">%s</a>' % (p, esc(n)) for p, n in GROUPS if p in by_group))
    write(os.path.join(out, "requirements.html"), page("Hadur 2 requirements", intro + "\n".join(rows), "requirements.html"))

    # Rendered docs.
    linker1 = id_linker(ids, "../")
    for src, pg, title in DOCS:
        p = os.path.join(root, src)
        if not os.path.exists(p):
            continue
        text = read(p)
        body = markdown(text, linker1, page_in_docs)
        body += '<p class="source">Source: <a href="%s">%s</a></p>' % (BLOB + src, src)
        write(os.path.join(out, "docs", pg), page(title, body, "docs/" + pg, depth=1, mermaid="```mermaid" in text))

    # Landing page.
    counts = defaultdict(int)
    for r in live:
        counts[r["stage"][0]] += 1
    readme = read(os.path.join(root, "README.md"))
    what = readme.split("## What it does", 1)[1].split("\n## ", 1)[0] if "## What it does" in readme else ""
    docs_list = "".join('<li><a href="docs/%s">%s</a></li>' % (pg, esc(t)) for src, pg, t in DOCS
                        if os.path.exists(os.path.join(root, src)))
    body = """<section class="hero">
<h1>Hadur 2</h1>
<p class="lede">A Robocode duelist that remembers every opponent, with a melee brain for free-for-alls, built on a
hexagonal core that never imports <code>robocode.*</code>. Every behaviour is an
<a href="requirements.html">EARS requirement</a>, cited in the code that implements it and tagged on the tests that prove it.</p>
<div class="stats"><div><b>%d</b><span>live requirements</span></div><div><b>%d</b><span>with a tagged test</span></div>
<div><b>%d</b><span>classes citing one</span></div></div>
<p class="cta"><a class="button" href="api/index.html">Browse the Javadoc</a> <a class="button ghost" href="requirements.html">Requirement map</a></p>
</section>
<section><h2>What it does</h2>%s</section>
<section><h2>Reading the code</h2>
<p>Start at <a href="api/hadur2/core/package-summary.html">hadur2.core</a> for the per-tick pipeline and the package map,
then <a href="api/hadur2/core/HadurCore.html">HadurCore</a>, which turns each tick's <code>BotInput</code> into
<code>BotOrders</code>. The adapter that connects it to Robocode is <a href="api/hadur2/Hadur.html">hadur2.Hadur</a>.
Requirement IDs in the Javadoc link back to their row on the requirement map.</p></section>
<section><h2>Design docs</h2><ul class="docs">%s</ul></section>
""" % (len(live), covered, len({c for v in impl.values() for c in v}), markdown(what, id_linker(ids, ""), page_for_doc), docs_list)
    write(os.path.join(out, "index.html"), page("Hadur 2", body, "index.html"))

    # Link requirement IDs inside the Javadoc.
    if have_api:
        api = os.path.join(out, "api")
        for d, _, files in os.walk(api):
            for f in files:
                if not f.endswith(".html"):
                    continue
                p = os.path.join(d, f)
                depth = os.path.relpath(p, out).count(os.sep)
                doc = read(p)
                write(p, link_ids_in_html(doc, id_linker(ids, "../" * depth)))

    shutil.copy(os.path.join(root, "site", "style.css"), os.path.join(out, "style.css"))
    write(os.path.join(out, ".nojekyll"), "")
    print("site: %d requirements (%d tested), %d citing classes -> %s"
          % (len(live), covered, len({c for v in impl.values() for c in v}), out))


if __name__ == "__main__":
    build(sys.argv[1], sys.argv[2])

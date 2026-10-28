#!/usr/bin/env python3
"""Sum of Code-attribute bytecode lengths over all methods of each .class file (the figure the rumble's codesize tool reports). From Leigh's kitlab (docs/kitlab.md)."""
import struct, sys, os, zipfile, io

def parse(data):
    b = io.BytesIO(data)
    u1 = lambda: struct.unpack('>B', b.read(1))[0]
    u2 = lambda: struct.unpack('>H', b.read(2))[0]
    u4 = lambda: struct.unpack('>I', b.read(4))[0]
    assert u4() == 0xCAFEBABE
    u2(); u2()  # minor, major
    n = u2(); cp = [None]*n; i = 1
    while i < n:
        t = u1()
        if t == 1: ln = u2(); cp[i] = b.read(ln).decode('utf-8', 'replace')
        elif t in (3, 4): b.read(4)
        elif t in (5, 6): b.read(8); i += 1
        elif t in (7, 8, 16, 19, 20): b.read(2)
        elif t in (9, 10, 11, 12, 17, 18): b.read(4)
        elif t == 15: b.read(3)
        else: raise ValueError('cp tag %d' % t)
        i += 1
    u2(); u2(); u2()
    for _ in range(u2()): u2()
    def skip_attrs():
        for _ in range(u2()):
            u2(); ln = u4(); b.read(ln)
    nf = u2()
    for _ in range(nf): u2(); u2(); u2(); skip_attrs()
    total = 0; methods = []
    for _ in range(u2()):
        u2(); name = cp[u2()]; desc = cp[u2()]
        for _ in range(u2()):
            an = cp[u2()]; ln = u4(); body = b.read(ln)
            if an == 'Code':
                cl = struct.unpack('>I', body[4:8])[0]
                total += cl; methods.append((name, desc, cl))
    return total, methods

def main(paths):
    grand = 0
    for p in paths:
        if p.endswith('.jar'):
            z = zipfile.ZipFile(p); items = [(n, z.read(n)) for n in z.namelist() if n.endswith('.class')]
        else:
            items = [(p, open(p, 'rb').read())]
        for name, data in items:
            t, ms = parse(data); grand += t
            print('%6d  %s' % (t, name))
            if '-v' in sys.argv:
                for m in ms: print('        %5d  %s%s' % (m[2], m[0], m[1]))
    print('%6d  TOTAL code bytes' % grand)

if __name__ == '__main__':
    main([a for a in sys.argv[1:] if not a.startswith('-')])

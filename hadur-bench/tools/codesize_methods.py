#!/usr/bin/env python3
"""Bytes per method, as Robocode's codesize counts them (docs/bench/kitlab-priors.md).

  python3 tools/codesize_methods.py JAR...

Codesize 1.3.1 adds up the Code attribute length of every method in the jar's classes; the
constant pool (strings, numbers, names) is not counted. This prints each method's share, largest
first, and the total, which matches codesize's own figure, to show where a size bot's bytes go.
"""
import struct
import sys
import zipfile


def parse(b):
    p=10; n=struct.unpack('>H',b[8:10])[0]; cp=[None]*n; i=1
    while i<n:
        t=b[p]; p+=1
        if t==1:
            l=struct.unpack('>H',b[p:p+2])[0]; cp[i]=b[p+2:p+2+l].decode('utf8','replace'); p+=2+l
        elif t in (3,4): p+=4
        elif t in (5,6): p+=8; i+=1
        elif t in (7,8,16,19,20): p+=2
        elif t in (9,10,11,12,17,18): p+=4
        elif t==15: p+=3
        i+=1
    p+=6; ic=struct.unpack('>H',b[p:p+2])[0]; p+=2+2*ic
    def members(p,code):
        c=struct.unpack('>H',b[p:p+2])[0]; p+=2; out=[]
        for _ in range(c):
            _,ni,di,ac=struct.unpack('>HHHH',b[p:p+8]); p+=8
            for _ in range(ac):
                an,al=struct.unpack('>HI',b[p:p+6])
                if code and cp[an]=='Code':
                    out.append((struct.unpack('>I',b[p+10:p+14])[0],cp[ni]+cp[di]))
                p+=6+al
        return p,out
    p,_=members(p,False); p,m=members(p,True); return m
tot = 0
rows = []
for f in sys.argv[1:]:
    z=zipfile.ZipFile(f)
    for n in z.namelist():
        if n.endswith('.class'):
            for l,m in parse(z.read(n)):
                tot += l
                rows.append((l, n.split('/')[-1][:-6], m))
for l, c, m in sorted(rows, reverse=True):
    print(f'{l:6d}  {c}.{m}')
print(f'{tot:6d}  total')

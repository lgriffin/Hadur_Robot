#!/bin/sh
# Resumable queue runner: ./queue.sh run|status|stop PLAN (see benchqueue.py and the README).
HERE=$(cd "$(dirname "$0")" && pwd)
PY=$(command -v python3 || command -v python) || { echo "queue.sh: python 3 not found" >&2; exit 2; }
exec "$PY" "$HERE/benchqueue.py" "$@"

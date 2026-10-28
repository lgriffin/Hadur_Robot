#!/usr/bin/env bash
# Wait for a process to end, then run a kitlab queue: after.sh PID JOB...
pid=$1; shift
while kill -0 "$pid" 2>/dev/null; do sleep 10; done
exec "$(dirname "$0")/queue.sh" "$@"

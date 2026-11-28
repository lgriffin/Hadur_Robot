#!/bin/sh
# TIME-11: the tick-time replay. Times every core call of recorded battles (bench --record transcripts)
# and checks the replay plays the recorded orders. Builds nothing: run `mvn -o install -DskipTests` and
# `mvn -o -pl hadur-robot test-compile` at the repo root first.
#
#   hadur-bench/tools/tickperf.sh [--passes N] [--allowance NANOS] [--ticks-out DIR] [--profile-loop S] FILE...
#
# Extra JVM flags go in TICKPERF_JVM, e.g. TICKPERF_JVM="-Xlog:gc:file=gc.log:uptime" for GC pauses or
# "-XX:StartFlightRecording=filename=perf.jfr,settings=profile" with --profile-loop 60 for a profile.
# Columns: docs/bench/tick-time.md.
set -e
ROOT=$(cd "$(dirname "$0")/../.." && pwd)
API=$(ls "$HOME"/.m2/repository/net/sf/robocode/robocode.api/1.12.0/robocode.api-1.12.0.jar 2>/dev/null || true)
[ -n "$API" ] || { echo "robocode.api 1.12.0 not in ~/.m2: run the bench once first" >&2; exit 2; }
CP="$ROOT/hadur-robot/target/test-classes:$ROOT/hadur-robot/target/classes:$ROOT/hadur-core/target/classes:$API"
exec java -Xmx2g -XX:ActiveProcessorCount=2 $TICKPERF_JVM -cp "$CP" hadur117.TickPerf "$@"

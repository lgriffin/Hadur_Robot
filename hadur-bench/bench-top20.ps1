<#
.SYNOPSIS
  Run the bench's top-20 set (or another set) locally, with the host's own CPU and parallel
  count (issue #102).
.DESCRIPTION
  Builds the robot jar (unless -SkipBuild), fetches the set's opponent jars (unless
  -SkipFetch), then runs `hadur.bench.Bench` with --set, --seeds, --rounds, --parallel and,
  when given, --robot-jar, --robot, --baseline/--baseline-robot and --cpu-constant. The main
  report goes to -Report and one report per opponent goes under -PerOpponent. The exec:java
  command is printed before it runs, and the script exits with the bench's own exit code.
  Windows PowerShell 5.1 and PowerShell 7 both run this.
.PARAMETER Set
  The opponent set file (a path, or a name in this directory). Default: top20.txt.
.PARAMETER Seeds
  Battles per opponent (--seeds). Default: 5.
.PARAMETER Rounds
  Rounds per battle (--rounds). Default: 35.
.PARAMETER Parallel
  Battles to run at once (--parallel). Default: a quarter of the logical processors,
  floored, at least 1. Issue #102's rule of thumb was one battle per two logical cores, but
  the width ladder in docs/bench/local/2026-10-06_parallel-ladder.md found that a quarter
  is what this host sustains without duress rounds while its rumble clients run.
.PARAMETER RobotJar
  The robot jar (--robot-jar). Default: the bench's own default, which follows
  robot.release in hadur-robot/pom.xml.
.PARAMETER Robot
  The robot's name as Robocode lists it (--robot). Default: the bench's own default.
.PARAMETER ChildCpus
  Processors each battle JVM is told it has (--child-cpus). Default: Bench's own, 2 when
  -Parallel is above 1.
.PARAMETER ChildHeap
  Heap cap for each battle JVM (--child-heap), for example 512M. Default 2G; "none" for no cap.
.PARAMETER ForceMemory
  Start even when the memory check says the run will not fit in free memory (--force-memory).
.PARAMETER Baseline
  A baseline jar for a paired A/B run (--baseline, BENCH-2). Requires -BaselineRobot.
.PARAMETER BaselineRobot
  The baseline robot's name as Robocode lists it (--baseline-robot), distinct from -Robot.
.PARAMETER SeedBase
  Engine seeds are SeedBase+1..SeedBase+Seeds (--seed-base, BENCH-72): fresh seeds for a
  confirmation run. Default 0.

.PARAMETER CpuConstant
  Pin robocode.cpu.constant (--cpu-constant NANOS) in every worker home. Default: if
  C:\robocode\config\robocode.properties exists, read robocode.cpu.constant from it (and say
  so); otherwise the bench calibrates once itself and copies the result to every worker.
  -NoCpuPin skips that file lookup.
.PARAMETER NoCpuPin
  Skip the C:\robocode\config\robocode.properties lookup above.
.PARAMETER Label
  A name for this run, used in the default -Out, -Report and -PerOpponent paths. Default:
  top20.
.PARAMETER Out
  The bench's working directory (Robocode homes, logs). Default:
  work/<Label>-<yyyyMMdd-HHmmss>.
.PARAMETER Report
  Where to also write the report (--report). Default:
  ../docs/bench/local/<yyyy-MM-dd>_<Label>.md.
.PARAMETER PerOpponent
  Where to write one report per opponent (--per-opponent). Default:
  ../docs/bench/local/<yyyy-MM-dd>_<Label>.
.PARAMETER Repeat
  Fight each (jar, opponent, seed) this many times (--repeat K, BENCH-53) and print the
  score-share SD; writes repeat.tsv. Default: off.
.PARAMETER ColdWarm
  Fight each seed cold, then warm on the shelf the cold battle left (--cold-warm true,
  BENCH-54); writes cold-warm.tsv. Default: off.
.PARAMETER Retries
  Run a failed battle again up to this many times (--retries N, BENCH-55). Default: the
  bench's own, 1.
.PARAMETER Field
  The arena as WIDTHxHEIGHT (--field). Default: the bench's own for the mode.
.PARAMETER Publish
  After a finished run, add its analysis to the project site (data/tools/publish_run.py run). HADUR_BENCH_PUBLISH=1 does the same. A failed publish never changes the exit code.
.PARAMETER DryRun
  Print what would be built, fetched and run, and the bench's argument list, and run nothing.
  The argument file is not written.
.PARAMETER SkipBuild
  Skip `mvn -q package -DskipTests -Dmaven.javadoc.skip` at the repo root before the bench.
.PARAMETER Engine
  Run the battles on this Robocode release from Maven Central (-Drobocode.version), e.g.
  1.11.1, the version the rumble clients run. Default: the bench pom's version.
.PARAMETER SkipFetch
  Skip fetching the set's opponent jars (fetch-opponents.ps1 -Set <Set>) before the bench.
.EXAMPLE
  .\bench-top20.ps1
.EXAMPLE
  .\bench-top20.ps1 -Seeds 10 -Parallel 8
.EXAMPLE
  .\bench-top20.ps1 -Baseline C:\robocode\robots\hadur2.Hadur_3.7.jar -BaselineRobot "hadur2.Hadur 3.7" -Seeds 5
#>
param(
    [string]$Set = "top20.txt",
    [int]$Seeds = 5,
    [int]$Rounds = 35,
    [int]$Parallel = 0,
    [string]$RobotJar = "",
    [string]$Robot = "",
    [string]$Baseline = "",
    [string]$BaselineRobot = "",
    [string]$CpuConstant = "",
    [switch]$NoCpuPin,
    [string]$Label = "top20",
    [string]$Out = "",
    [string]$Report = "",
    [string]$PerOpponent = "",
    [int]$Repeat = 0,
    [int]$SeedBase = 0,
    [switch]$ColdWarm,
    [int]$Retries = -1,
    [string]$Field = "",
    [int]$ChildCpus = -1,
    [string]$ChildHeap = "",
    [switch]$ForceMemory,
    [switch]$DryRun,
    [switch]$Publish,
    [switch]$SkipBuild,
    [switch]$SkipFetch,
    [string]$Engine = ""
)

$ErrorActionPreference = "Stop"
Set-Location $PSScriptRoot

. (Join-Path $PSScriptRoot "bench-args.ps1")

if ($Parallel -le 0) {
    $cores = [Environment]::ProcessorCount
    $Parallel = [Math]::Max(1, [Math]::Floor($cores / 4))
}

if ($Baseline -and -not $BaselineRobot) {
    Write-Error "-Baseline needs -BaselineRobot too"
    exit 2
}

$stamp = Get-Date -Format "yyyyMMdd-HHmmss"
if (-not $Out) { $Out = "work/$Label-$stamp" }
$day = Get-Date -Format "yyyy-MM-dd"
if (-not $Report) { $Report = "../docs/bench/local/${day}_$Label.md" }
if (-not $PerOpponent) { $PerOpponent = "../docs/bench/local/${day}_$Label" }

if ((-not $CpuConstant) -and (-not $NoCpuPin)) {
    $propsFile = "C:\robocode\config\robocode.properties"
    if (Test-Path -LiteralPath $propsFile) {
        $hit = Select-String -LiteralPath $propsFile -Pattern '^\s*robocode\.cpu\.constant\s*=\s*(\d+)' | Select-Object -First 1
        if ($hit) {
            $CpuConstant = $hit.Matches[0].Groups[1].Value
            Write-Host "using robocode.cpu.constant=$CpuConstant from $propsFile"
        }
    }
}

if ($DryRun) {
    if (-not $SkipBuild) { Write-Host "dry run, would run: mvn -q package -DskipTests -Dmaven.javadoc.skip (repo root)" }
} elseif (-not $SkipBuild) {
    Write-Host "mvn -q package -DskipTests -Dmaven.javadoc.skip (repo root)"
    Push-Location ..
    & mvn -q package "-DskipTests" "-Dmaven.javadoc.skip"
    $code = $LASTEXITCODE
    Pop-Location
    if ($code -ne 0) { exit $code }
}

if ($DryRun) {
    if (-not $SkipFetch) { Write-Host "dry run, would run: .\fetch-opponents.ps1 -Set $Set" }
} elseif (-not $SkipFetch) {
    Write-Host ".\fetch-opponents.ps1 -Set $Set"
    & .\fetch-opponents.ps1 -Set $Set
    if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
}

$parts = @(
    "--set", $Set,
    "--seeds", $Seeds,
    "--rounds", $Rounds,
    "--parallel", $Parallel,
    "--out", $Out,
    "--report", $Report,
    "--per-opponent", $PerOpponent
)
if ($RobotJar) { $parts += @("--robot-jar", $RobotJar) }
if ($Robot) { $parts += @("--robot", $Robot) }
if ($Baseline) {
    $parts += @("--baseline", $Baseline, "--baseline-robot", $BaselineRobot)
}
if ($CpuConstant) { $parts += @("--cpu-constant", $CpuConstant) }
if ($Repeat -gt 0) { $parts += @("--repeat", $Repeat) }
if ($SeedBase -ne 0) { $parts += @("--seed-base", $SeedBase) }
if ($ColdWarm) { $parts += @("--cold-warm", "true") }
if ($Retries -ge 0) { $parts += @("--retries", $Retries) }
if ($Field) { $parts += @("--field", $Field) }
if ($ChildCpus -ge 0) { $parts += @("--child-cpus", $ChildCpus) }
if ($ChildHeap) { $parts += @("--child-heap", $ChildHeap) }
if ($ForceMemory) { $parts += @("--force-memory", "true") }

# The engine is the bench's own Maven dependency, so another release is a property away;
# the bench's classpath file is rebuilt with it on this compile (issue #109).
$mvnArgs = @("-q")
if ($Engine) { $mvnArgs += "-Drobocode.version=$Engine" }
$execArgs = New-BenchArgFile -Parts $parts -Name "$Label-$stamp" -DryRun:$DryRun
$mvnArgs += @("compile", "exec:java", "-Dexec.args=$execArgs")
Write-Host ("mvn " + ($mvnArgs -join " "))
if ($DryRun) {
    Write-Host "dry run: nothing was built, fetched or run"
    exit 0
}
& mvn @mvnArgs
$benchCode = $LASTEXITCODE

Write-Host "report: $Report"
Write-Host "per-opponent reports: $PerOpponent"

# -Publish (or HADUR_BENCH_PUBLISH=1): add this run's analysis to the project site (issue #102).
# A failure here never changes the run's exit code.
if (($Publish -or $env:HADUR_BENCH_PUBLISH -eq "1") -and -not $DryRun -and $benchCode -eq 0) {
    $pubPy = $null
    foreach ($candidate in @("python3", "python", "py")) {
        if (Get-Command $candidate -ErrorAction SilentlyContinue) { $pubPy = $candidate; break }
    }
    if ($pubPy) {
        & $pubPy ../data/tools/publish_run.py run --work $Out --set $Set --label $Label
        if ($LASTEXITCODE -ne 0) { Write-Warning "publish failed; the run is unaffected" }
    } else {
        Write-Warning "publish skipped: python not found"
    }
}
exit $benchCode

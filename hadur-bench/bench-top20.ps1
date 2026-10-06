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
.PARAMETER Baseline
  A baseline jar for a paired A/B run (--baseline, BENCH-2). Requires -BaselineRobot.
.PARAMETER BaselineRobot
  The baseline robot's name as Robocode lists it (--baseline-robot), distinct from -Robot.
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
.PARAMETER SkipBuild
  Skip `mvn -q package -DskipTests -Dmaven.javadoc.skip` at the repo root before the bench.
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
    [switch]$SkipBuild,
    [switch]$SkipFetch
)

$ErrorActionPreference = "Stop"
Set-Location $PSScriptRoot

function QuoteIfNeeded([string]$value) {
    if ($value -match '\s') { return '"' + $value + '"' }
    return $value
}

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

if (-not $SkipBuild) {
    Write-Host "mvn -q package -DskipTests -Dmaven.javadoc.skip (repo root)"
    Push-Location ..
    & mvn -q package -DskipTests -Dmaven.javadoc.skip
    $code = $LASTEXITCODE
    Pop-Location
    if ($code -ne 0) { exit $code }
}

if (-not $SkipFetch) {
    Write-Host ".\fetch-opponents.ps1 -Set $Set"
    & .\fetch-opponents.ps1 -Set $Set
    if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
}

$parts = @(
    "--set", (QuoteIfNeeded $Set),
    "--seeds", $Seeds,
    "--rounds", $Rounds,
    "--parallel", $Parallel,
    "--out", (QuoteIfNeeded $Out),
    "--report", (QuoteIfNeeded $Report),
    "--per-opponent", (QuoteIfNeeded $PerOpponent)
)
if ($RobotJar) { $parts += @("--robot-jar", (QuoteIfNeeded $RobotJar)) }
if ($Robot) { $parts += @("--robot", (QuoteIfNeeded $Robot)) }
if ($Baseline) {
    $parts += @("--baseline", (QuoteIfNeeded $Baseline), "--baseline-robot", (QuoteIfNeeded $BaselineRobot))
}
if ($CpuConstant) { $parts += @("--cpu-constant", $CpuConstant) }

$execArgs = $parts -join " "
$cmd = 'mvn -q compile exec:java "-Dexec.args=' + $execArgs + '"'
Write-Host $cmd
& mvn -q compile exec:java "-Dexec.args=$execArgs"
$benchCode = $LASTEXITCODE

Write-Host "report: $Report"
Write-Host "per-opponent reports: $PerOpponent"
exit $benchCode

<#
.SYNOPSIS
  Run the TeamRumble top-20 set (team-top20.txt) locally: HadurTeam (five hadur2.Hadur)
  against each team in turn at TeamRumble settings, 1200x1200, 10 rounds.
.DESCRIPTION
  Builds the jars (unless -SkipBuild), fetches the set's team jars (unless -SkipFetch), then
  runs `hadur.bench.Bench` with --team true. Team mode takes the same width and pairing
  options as the duel modes (issue #102), so they are passed to Bench directly:
  -Parallel N fights N battles at once (the seeds of the opponents) on worker homes
  (unmeasured: five robots a side is about 10 robots per battle, so keep N well under the
  1v1 width); -ChildCpus and -ChildHeap size each battle JVM; -CpuConstant is pinned in every
  home by Bench, which also names it and the host in the report (without it the script reads
  C:\robocode\config\robocode.properties when that exists, unless -NoCpuPin); -Baseline fights
  a baseline team on the same seeds (RANDOMSEED is the seed number in both, as in the T1
  gate) and adds a paired table, per opponent, to the one report. One report file per
  opposing team goes under <Report>_per-opponent\ (-NoPerOpponent skips them).
  Windows PowerShell 5.1 and PowerShell 7 both run this.
.PARAMETER Set
  The team set file (a path, or a name in this directory). Default: team-top20.txt.
.PARAMETER Seeds
  Battles per team (--seeds). Default: 5.
.PARAMETER Rounds
  Rounds per battle (--rounds). Default: 10, the TeamRumble's.
.PARAMETER Parallel
  Battles fought at once, each on its own worker home (--parallel). Default: 1.
.PARAMETER ChildCpus
  Processors each battle JVM is told it has (--child-cpus). Default: Bench's own, 2 when
  -Parallel is above 1.
.PARAMETER ChildHeap
  Heap cap for each battle JVM (--child-heap), for example 512M.
.PARAMETER Only
  Only teams whose name contains this text (--only).
.PARAMETER RobotJar
  Our team jar (--robot-jar). Default: the bench's own, ../hadur-robot/target/hadur2.HadurTeam_<release>.jar.
.PARAMETER Robot
  Our team's name as Robocode lists it (--robot). Derived from -RobotJar's file name when
  that is given alone.
.PARAMETER Baseline
  A baseline team jar (--baseline), e.g. baselines\hadur2.HadurTeam_3.7.jar.
.PARAMETER BaselineRobot
  The baseline team's name as Robocode lists it. Default: derived from the file name
  (hadur2.HadurTeam_3.7.jar becomes "hadur2.HadurTeam 3.7").
.PARAMETER CpuConstant
  robocode.cpu.constant for every home (--cpu-constant). Default: if
  C:\robocode\config\robocode.properties exists, read from it (and say so). -NoCpuPin skips
  that lookup.
.PARAMETER NoCpuPin
  Skip the C:\robocode\config\robocode.properties lookup above.
.PARAMETER NoPerOpponent
  Skip the per-opponent report files.
.PARAMETER Label
  A name for this run, used in the default -Out and -Report. Default: team-top20.
.PARAMETER Out
  The bench's working directory (Robocode homes, battle logs). Default:
  work/<Label>-<yyyyMMdd-HHmmss>. It holds hundreds of MB of logs, so it stays under work/.
.PARAMETER Report
  The report. Default: ../docs/bench/local/<yyyy-MM-dd>_<Label>.md.
.PARAMETER SkipBuild
  Skip `mvn -q package -DskipTests -Dmaven.javadoc.skip` at the repo root before the bench.
.PARAMETER SkipFetch
  Skip fetching the set's team jars (fetch-opponents.ps1 -Set <Set>) before the bench.
.EXAMPLE
  .\bench-team-top20.ps1
.EXAMPLE
  .\bench-team-top20.ps1 -Seeds 10 -SkipBuild
.EXAMPLE
  .\bench-team-top20.ps1 -Parallel 4 -Baseline baselines\hadur2.HadurTeam_3.7.jar -Seeds 5
#>
param(
    [string]$Set = "team-top20.txt",
    [int]$Seeds = 5,
    [int]$Rounds = 10,
    [int]$Parallel = 1,
    [int]$ChildCpus = -1,
    [string]$ChildHeap = "",
    [string]$Only = "",
    [string]$RobotJar = "",
    [string]$Robot = "",
    [string]$Baseline = "",
    [string]$BaselineRobot = "",
    [string]$CpuConstant = "",
    [switch]$NoCpuPin,
    [switch]$NoPerOpponent,
    [string]$Label = "team-top20",
    [string]$Out = "",
    [string]$Report = "",
    [switch]$SkipBuild,
    [switch]$SkipFetch
)

$ErrorActionPreference = "Stop"
Set-Location $PSScriptRoot

function QuoteIfNeeded([string]$value) {
    if ($value -match '\s') { return '"' + $value + '"' }
    return $value
}

if ($Parallel -lt 1) {
    Write-Error "-Parallel must be at least 1"
    exit 2
}

# A name that differs from ours is needed for the baseline; both come from the jar's file name
# when not given (hadur2.HadurTeam_3.7.jar becomes "hadur2.HadurTeam 3.7").
if ($Baseline -and -not $BaselineRobot) {
    $BaselineRobot = ([IO.Path]::GetFileNameWithoutExtension($Baseline)) -replace '_', ' '
}
if ($RobotJar -and -not $Robot) {
    $Robot = ([IO.Path]::GetFileNameWithoutExtension($RobotJar)) -replace '_', ' '
}
if ($Baseline -and -not (Test-Path -LiteralPath $Baseline)) {
    Write-Error "no baseline jar at $Baseline"
    exit 2
}

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

$stamp = Get-Date -Format "yyyyMMdd-HHmmss"
if (-not $Out) { $Out = "work/$Label-$stamp" }
$day = Get-Date -Format "yyyy-MM-dd"
if (-not $Report) { $Report = "../docs/bench/local/${day}_$Label.md" }
$perOpponentDir = $Report -replace '\.md$', '_per-opponent'
New-Item -ItemType Directory -Force -Path (Split-Path -Parent $Report) | Out-Null

if (-not $SkipBuild) {
    Write-Host "mvn -q package -DskipTests -Dmaven.javadoc.skip (repo root)"
    Push-Location ..
    & mvn -q package "-DskipTests" "-Dmaven.javadoc.skip"
    $code = $LASTEXITCODE
    Pop-Location
    if ($code -ne 0) { exit $code }
}

if (-not $SkipFetch) {
    Write-Host ".\fetch-opponents.ps1 -Set $Set"
    & .\fetch-opponents.ps1 -Set $Set
    if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
}

$parts = @("--team", "true", "--set", (QuoteIfNeeded $Set), "--seeds", $Seeds, "--rounds", $Rounds,
    "--label", $Label, "--out", (QuoteIfNeeded $Out), "--report", (QuoteIfNeeded $Report))
if ($Parallel -gt 1) { $parts += @("--parallel", $Parallel) }
if ($ChildCpus -ge 0) { $parts += @("--child-cpus", $ChildCpus) }
if ($ChildHeap) { $parts += @("--child-heap", $ChildHeap) }
if ($CpuConstant) { $parts += @("--cpu-constant", $CpuConstant) }
if ($Only) { $parts += @("--only", (QuoteIfNeeded $Only)) }
if ($RobotJar) { $parts += @("--robot-jar", (QuoteIfNeeded $RobotJar)) }
if ($Robot) { $parts += @("--robot", (QuoteIfNeeded $Robot)) }
if ($Baseline) {
    $parts += @("--baseline", (QuoteIfNeeded $Baseline), "--baseline-robot", (QuoteIfNeeded $BaselineRobot))
}
if (-not $NoPerOpponent) { $parts += @("--per-opponent", (QuoteIfNeeded $perOpponentDir)) }
$execArgs = $parts -join " "

Write-Host ('mvn -q compile exec:java "-Dexec.args=' + $execArgs + '"')
& mvn -q compile exec:java "-Dexec.args=$execArgs"
$benchCode = $LASTEXITCODE

Write-Host "report: $Report"
if (-not $NoPerOpponent) { Write-Host "per-opponent reports: $perOpponentDir" }
Write-Host "battle directories (engine.log, member-N.log, rounds.csv, team.csv): $Out/battles"
exit $benchCode

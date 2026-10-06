<#
.SYNOPSIS
  Run the melee top-20 bench locally: five overlapping fields of Hadur and nine opponents
  (melee-top20.txt, melee-top20-a.txt .. melee-top20-e.txt) at the MeleeRumble's 1000x1000.
.DESCRIPTION
  Builds the robot jar (unless -SkipBuild), fetches the opponent jars (unless -SkipFetch),
  then runs `hadur.bench.Bench`. By default that is one suite run (--suite melee-top20.txt):
  the fields one after another in one process, one combined report. With -FieldsParallel N
  (N > 1) or -Fields, each field is its own bench process (a PowerShell job), N at a time,
  with its own report. Either way, afterwards data/tools/melee_pairwise.py pools Hadur's
  pairwise share per opponent across the fields into a per-opponent table.

  Melee mode takes the same width and pairing options as the duel modes (issue #102):
  -Parallel N fights N seeds of a field at once on worker homes (with -FieldsParallel F that
  is F x N battles of about ten robots each, so size them together), -ChildCpus and
  -ChildHeap are passed to Bench, -CpuConstant is pinned in every home by Bench (which also
  names it and the host in the report), and -Baseline/-BaselineRobot fight a baseline on the
  same seeds and add a paired table per field and per opponent. Each field also gets one
  report file per opponent under <Report>_per-opponent\<field>\ (-NoPerOpponent skips them).
  Windows PowerShell 5.1 and PowerShell 7 both run this.
.PARAMETER Seeds
  Battles per field (--seeds). Default: 5.
.PARAMETER Rounds
  Rounds per battle (--rounds). Default: 35.
.PARAMETER Fields
  Fields to run, a comma-separated list of A to E. Default: all five. Giving it runs the
  fields as separate processes.
.PARAMETER FieldsParallel
  Fields at once as separate processes. Default: 1, the single suite run.
.PARAMETER RobotJar
  The robot jar (--robot-jar). Default: the bench's own default, which follows
  robot.release in hadur-robot/pom.xml.
.PARAMETER Robot
  The robot's name as Robocode lists it (--robot). Default: the bench's own default.
.PARAMETER Parallel
  Seeds of a field fought at once, each on its own worker home (--parallel). Default: 1.
.PARAMETER ChildCpus
  Processors each battle JVM is told it has (--child-cpus). Default: Bench's own, 2 when
  -Parallel is above 1.
.PARAMETER ChildHeap
  Heap cap for each battle JVM (--child-heap), for example 512M.
.PARAMETER Baseline
  A baseline robot jar (--baseline), fought on the same seeds, for the paired tables.
.PARAMETER BaselineRobot
  The baseline's name as Robocode lists it (--baseline-robot). Default: derived from the
  jar's file name (hadur2.Hadur_3.7.jar becomes "hadur2.Hadur 3.7").
.PARAMETER NoPerOpponent
  Skip the per-opponent report files.
.PARAMETER CpuConstant
  robocode.cpu.constant to pin in every home (--cpu-constant). Default: if
  C:\robocode\config\robocode.properties exists, read it from there (and say so); otherwise
  the engine calibrates on its own. -NoCpuPin skips the lookup.
.PARAMETER NoCpuPin
  Skip the C:\robocode\config\robocode.properties lookup above.
.PARAMETER Label
  A name for this run, used in the default -Out and -Report paths. Default: melee-top20.
.PARAMETER Out
  The bench's working directory. Default: work/<Label>-<yyyyMMdd-HHmmss>.
.PARAMETER Report
  The combined report (suite run). Default: ../docs/bench/local/<yyyy-MM-dd>_<Label>.md. With
  separate processes, one report per field: <yyyy-MM-dd>_<Label>_<field>.md.
.PARAMETER SkipBuild
  Skip `mvn -q package -DskipTests -Dmaven.javadoc.skip` at the repo root before the bench.
.PARAMETER SkipFetch
  Skip fetching the opponent jars (fetch-opponents.ps1 -Set melee-top20-set.txt).
.EXAMPLE
  .\bench-melee-top20.ps1
.EXAMPLE
  .\bench-melee-top20.ps1 -Seeds 10 -FieldsParallel 5
.EXAMPLE
  .\bench-melee-top20.ps1 -Parallel 4 -Baseline baselines\hadur2.Hadur_3.7.jar -Seeds 10
#>
param(
    [int]$Seeds = 5,
    [int]$Rounds = 35,
    [string]$Fields = "",
    [int]$FieldsParallel = 1,
    [string]$RobotJar = "",
    [string]$Robot = "",
    [int]$Parallel = 1,
    [int]$ChildCpus = -1,
    [string]$ChildHeap = "",
    [string]$Baseline = "",
    [string]$BaselineRobot = "",
    [switch]$NoPerOpponent,
    [string]$CpuConstant = "",
    [switch]$NoCpuPin,
    [string]$Label = "melee-top20",
    [string]$Out = "",
    [string]$Report = "",
    [switch]$SkipBuild,
    [switch]$SkipFetch
)

$ErrorActionPreference = "Stop"
Set-Location $PSScriptRoot
$benchDir = $PSScriptRoot

function QuoteIfNeeded([string]$value) {
    if ($value -match '\s') { return '"' + $value + '"' }
    return $value
}

if ($Parallel -lt 1) {
    Write-Error "-Parallel must be at least 1"
    exit 2
}
if ($Baseline) {
    if (-not (Test-Path -LiteralPath $Baseline)) {
        Write-Error "no baseline jar at $Baseline"
        exit 2
    }
    if (-not $BaselineRobot) {
        $BaselineRobot = ([IO.Path]::GetFileNameWithoutExtension($Baseline)) -replace '_', ' '
    }
}

$separate = ($FieldsParallel -gt 1) -or ($Fields -ne "")
if (-not $Fields) { $Fields = "A,B,C,D,E" }
$fieldList = @($Fields.Split(",") | ForEach-Object { $_.Trim().ToUpper() } | Where-Object { $_ })
foreach ($f in $fieldList) {
    if ($f -notmatch '^[A-E]$') { Write-Error "unknown field: $f (A to E)"; exit 2 }
}

$stamp = Get-Date -Format "yyyyMMdd-HHmmss"
if (-not $Out) { $Out = "work/$Label-$stamp" }
$day = Get-Date -Format "yyyy-MM-dd"
if (-not $Report) { $Report = "../docs/bench/local/${day}_$Label.md" }
$reportBase = $Report -replace '\.md$', ''
New-Item -ItemType Directory -Force -Path (Split-Path -Parent $Report) | Out-Null

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
    Write-Host ".\fetch-opponents.ps1 -Set melee-top20-set.txt"
    & .\fetch-opponents.ps1 -Set melee-top20-set.txt
    if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
}

$robotParts = @()
if ($RobotJar) { $robotParts += @("--robot-jar", (QuoteIfNeeded $RobotJar)) }
if ($Robot) { $robotParts += @("--robot", (QuoteIfNeeded $Robot)) }

# Options every Bench run gets, whether the suite or a single field.
$commonParts = @("--seeds", $Seeds, "--rounds", $Rounds)
if ($Parallel -gt 1) { $commonParts += @("--parallel", $Parallel) }
if ($ChildCpus -ge 0) { $commonParts += @("--child-cpus", $ChildCpus) }
if ($ChildHeap) { $commonParts += @("--child-heap", $ChildHeap) }
if ($CpuConstant) { $commonParts += @("--cpu-constant", $CpuConstant) }
if ($Baseline) {
    $commonParts += @("--baseline", (QuoteIfNeeded $Baseline), "--baseline-robot", (QuoteIfNeeded $BaselineRobot))
}
if (-not $NoPerOpponent) {
    $commonParts += @("--per-opponent", (QuoteIfNeeded "${reportBase}_per-opponent"))
}

$benchCode = 0
if (-not $separate) {
    $parts = @("--suite", "melee-top20.txt") + $commonParts +
        @("--out", (QuoteIfNeeded $Out), "--report", (QuoteIfNeeded $Report)) + $robotParts
    $execArgs = $parts -join " "
    Write-Host ('mvn -q compile exec:java "-Dexec.args=' + $execArgs + '"')
    & mvn -q compile exec:java "-Dexec.args=$execArgs"
    $benchCode = $LASTEXITCODE
    Write-Host "report: $Report"
} else {
    # One compile up front; the field processes then only run exec:java, so none of them
    # recompiles the tree under another.
    Write-Host "mvn -q compile"
    & mvn -q compile
    if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
    New-Item -ItemType Directory -Force -Path $Out | Out-Null
    $fieldArgs = @{}
    foreach ($f in $fieldList) {
        $lower = $f.ToLower()
        $parts = @("--set", "melee-top20-$lower.txt", "--melee", "true", "--field", "1000x1000",
            "--label", $f) + $commonParts +
            @("--out", (QuoteIfNeeded "$Out/$f"), "--report", (QuoteIfNeeded "${reportBase}_$f.md")) + $robotParts
        $fieldArgs[$f] = $parts -join " "
    }
    $jobs = @{}
    $pending = New-Object System.Collections.Queue
    foreach ($f in $fieldList) { $pending.Enqueue($f) }
    $width = [Math]::Max(1, $FieldsParallel)
    $results = @{}
    while ($pending.Count -gt 0 -or $jobs.Count -gt 0) {
        while ($pending.Count -gt 0 -and $jobs.Count -lt $width) {
            $f = $pending.Dequeue()
            $log = Join-Path $benchDir "$Out/$f.log"
            Write-Host ("field ${f}: mvn -q exec:java ""-Dexec.args=" + $fieldArgs[$f] + """ (log $Out/$f.log)")
            $jobs[$f] = Start-Job -ArgumentList $benchDir, $fieldArgs[$f], $log -ScriptBlock {
                param($dir, $execArgs, $logFile)
                Set-Location $dir
                & mvn -q exec:java "-Dexec.args=$execArgs" *> $logFile
                $LASTEXITCODE
            }
        }
        $done = Wait-Job -Job @($jobs.Values) -Any
        foreach ($f in @($jobs.Keys)) {
            if ($jobs[$f].Id -eq $done.Id) {
                $results[$f] = [int](@(Receive-Job -Job $jobs[$f])[-1])
                Remove-Job -Job $jobs[$f]
                $jobs.Remove($f)
            }
        }
    }
    foreach ($f in $fieldList) {
        Write-Host "field $f exit $($results[$f]), report ${reportBase}_$f.md"
        if ($results[$f] -ne 0) { $benchCode = 1 }
    }
}

# Pool Hadur's pairwise share per opponent across the fields (non-fatal if no python).
$pairwise = "${reportBase}_per-opponent.md"
$py = $null
foreach ($candidate in @("python", "py")) {
    if (Get-Command $candidate -ErrorAction SilentlyContinue) { $py = $candidate; break }
}
if ($py) {
    & $py ../data/tools/melee_pairwise.py --work $Out --set melee-top20-set.txt --out $pairwise
    if ($LASTEXITCODE -eq 0) {
        Write-Host "per-opponent table: $pairwise"
    } else {
        Write-Warning "no per-opponent table (no finished battles, or python failed)"
    }
} else {
    Write-Warning "python not found; run data/tools/melee_pairwise.py --work $Out --set melee-top20-set.txt yourself"
}
exit $benchCode

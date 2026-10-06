<#
.SYNOPSIS
  Download the opponent jars the bench set files name into opponents\ (issue #102).
.DESCRIPTION
  A set line is `name | role | jar`; the jar is the third column, `-` for a sample bot the
  engine ships. Suite files (`label | options`) and session files have no third column
  ending in .jar, so they contribute nothing. Jars already present are left alone.
  Exit status is 1 if any download failed. Windows PowerShell 5.1+ and PowerShell 7.
.PARAMETER Set
  One set file (a path, or a name in this directory) instead of every *.txt here.
.PARAMETER Dir
  Where to put the jars; default: opponents next to this script.
.EXAMPLE
  .\fetch-opponents.ps1
  .\fetch-opponents.ps1 -Set top19.txt
  .\fetch-opponents.ps1 -Dir C:\temp\opp
#>
param(
    [string]$Set = "",
    [string]$Dir = ""
)

$ErrorActionPreference = "Stop"
$ProgressPreference = "SilentlyContinue"   # 5.1's progress bar makes downloads very slow
try { [Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12 } catch { }

$baseUrl = if ($env:HADUR_OPPONENT_URL) { $env:HADUR_OPPONENT_URL } else { "https://robocode-archive.strangeautomata.com/robots" }
$here = Split-Path -Parent $MyInvocation.MyCommand.Path
if (-not $Dir) { $Dir = Join-Path $here "opponents" }

if ($Set) {
    if (-not (Test-Path -LiteralPath $Set -PathType Leaf)) {
        $inHere = Join-Path $here $Set
        if (Test-Path -LiteralPath $inHere -PathType Leaf) { $Set = $inHere }
        else { Write-Error "no such set file: $Set"; exit 2 }
    }
    $files = @(Get-Item -LiteralPath $Set)
} else {
    $files = @(Get-ChildItem -LiteralPath $here -Filter "*.txt" -File)
}

New-Item -ItemType Directory -Force -Path $Dir | Out-Null

$jars = New-Object System.Collections.Generic.SortedSet[string]
foreach ($f in $files) {
    foreach ($line in Get-Content -LiteralPath $f.FullName) {
        $line = $line.Trim()
        if ($line -eq "" -or $line.StartsWith("#")) { continue }
        $cols = $line.Split("|")
        if ($cols.Count -lt 3) { continue }
        $jar = $cols[2].Trim()
        if ($jar.EndsWith(".jar")) { [void]$jars.Add($jar) }
    }
}

$downloaded = 0; $present = 0; $failed = 0
foreach ($jar in $jars) {
    $target = Join-Path $Dir $jar
    if ((Test-Path -LiteralPath $target -PathType Leaf) -and (Get-Item -LiteralPath $target).Length -gt 0) {
        $present++
        continue
    }
    $part = "$target.part"
    try {
        Invoke-WebRequest -UseBasicParsing -Uri "$baseUrl/$jar" -OutFile $part -ErrorAction Stop
        Move-Item -LiteralPath $part -Destination $target -Force -ErrorAction Stop
        $downloaded++
        Write-Host "downloaded $jar"
    } catch {
        if (Test-Path -LiteralPath $part) { Remove-Item -LiteralPath $part -Force }
        $failed++
        [Console]::Error.WriteLine("FAILED     $jar ($($_.Exception.Message))")
    }
}

Write-Host "opponents: $downloaded downloaded, $present present, $failed failed (dir: $Dir)"
if ($failed -gt 0) { exit 1 }
exit 0

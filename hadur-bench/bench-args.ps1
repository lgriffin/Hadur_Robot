# Dot-sourced by the bench-*.ps1 scripts (BENCH-59).
#
# Maven's -Dexec.args is one string that the command interpreter splits again. A quoted value
# inside it (a robot name with a space, say) makes Windows PowerShell 5.1 hand mvn.cmd a command
# line that cmd.exe rejects: "The syntax of the command is incorrect". So the bench's arguments
# go to a file, one per line, and -Dexec.args is only "@<file>", with no quote or space in it.
# hadur.bench.Bench reads the file when that is its only argument.
function New-BenchArgFile {
    param(
        [object[]]$Parts,
        [string]$Name,
        [switch]$DryRun
    )
    $path = "work/args-$Name.txt"
    $lines = @($Parts | ForEach-Object { [string]$_ })
    if ($DryRun) {
        Write-Host "dry run, would write $path :"
        $lines | ForEach-Object { Write-Host "  $_" }
    } else {
        New-Item -ItemType Directory -Force -Path "work" | Out-Null
        [IO.File]::WriteAllLines((Join-Path (Get-Location).Path $path), $lines, (New-Object Text.UTF8Encoding($false)))
    }
    return "@$path"
}

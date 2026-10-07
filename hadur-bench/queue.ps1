# Resumable queue runner: .\queue.ps1 run|status|stop PLAN (see benchqueue.py and the README).
$py = (Get-Command python -ErrorAction SilentlyContinue)
if (-not $py) { $py = Get-Command python3 -ErrorAction SilentlyContinue }
if (-not $py) { Write-Error "queue.ps1: python 3 not found"; exit 2 }
& $py.Source (Join-Path $PSScriptRoot "benchqueue.py") @args
exit $LASTEXITCODE

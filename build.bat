@echo off
echo === Building Hadur Robot ===

where javac >nul 2>&1
if %ERRORLEVEL% neq 0 (
    echo ERROR: javac not found. Install JDK 8+.
    exit /b 1
)

if exist "bin\hadur117" rmdir /s /q "bin\hadur117"

javac -sourcepath src -cp "lib\robocode.jar" -d bin src\hadur117\Hadur.java
if %ERRORLEVEL% neq 0 (
    echo ERROR: Compilation failed.
    exit /b 1
)

copy /y "src\hadur117\Hadur.properties" "bin\hadur117\Hadur.properties" >nul
echo Build complete: hadur117.Hadur

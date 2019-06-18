@echo off
set path=bin\1.pid
echo %path%
if not exist %path% (goto nofile) else (goto file)


:file
for /f %%a in (%path%) do (
set txt=%%~a
goto Show
)

:Show
echo content:%txt%
pause
start taskkill /pid %txt% /f
pause

:nofile
echo  no find (path:%path%) file
pause
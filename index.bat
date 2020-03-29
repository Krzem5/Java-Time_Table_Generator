echo off
echo NUL>_.class&&del /s /f /q *.class
cls
javac com/krzem/time_table_generator/Main.java&&java com/krzem/time_table_generator/Main data.tdt ./tables/
start /min cmd /c "echo NUL>_.class&&del /s /f /q *.class"
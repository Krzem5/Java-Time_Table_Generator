@echo off
cls
if exist build rmdir /s /q build
mkdir build
cd src
javac -d ../build com/krzem/time_table_generator/Main.java&&jar cvmf ../manifest.mf ../build/time_table_generator.jar -C ../build *&&goto run
cd ..
goto end
:run
cd ..
pushd "build"
for /D %%D in ("*") do (
	rd /S /Q "%%~D"
)
for %%F in ("*") do (
	if /I not "%%~nxF"=="time_table_generator.jar" del "%%~F"
)
popd
cls
java -jar build/time_table_generator.jar
:end

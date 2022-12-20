@echo off
REM echo表示しない >null

REM 文字コード設定
chcp 65001 >null

REM 各パス設定
set output_file="C:\work\JavaBatch\primitiveJavaBatch\BatchProject\src\com\test\output.txt"
set dir_path="C:\work\JavaBatch\PrimitiveJavaBatch\BatchProject\src\com\test"

REM 色々出力　
echo test01
echo %date% %time%
echo %output_file% 
echo Tody is %date%  %time% > %output_file%
REM echo %dir%  %dir_path%>>  %output_file% 
dir >>  %output_file% 


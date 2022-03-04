#!/usr/bin/bash
cd langRef
echo " ==== Generating Parser ==== "
./compile.sh
cd ..

cd pykquery
echo " ==== Parsing Example ==== "
python3 KQProcessor.py ../examples/test1.kquery
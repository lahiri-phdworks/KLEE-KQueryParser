#!/usr/bin/bash
java -jar antlr_lib/antlr-4.9.2-complete.jar -Dlanguage=Python3 -visitor -o python_kquery kquery.g4
cd python_kquery
python3 kparser.py input.txt
cd ..
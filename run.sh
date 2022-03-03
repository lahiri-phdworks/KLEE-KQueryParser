#!/usr/bin/bash
cd python_kquery
java -jar antlr_lib/antlr-4.9.2-complete.jar -Dlanguage=Python3 -visitor -o . kquery.g4
python3 kparser.py input.txt
cd ..
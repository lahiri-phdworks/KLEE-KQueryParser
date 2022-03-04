java -jar ../lib/antlr-4.9.2-complete.jar -Dlanguage=Python3 -visitor -o ../pykquery KQuery.g4
java -jar ../lib/antlr-4.9.2-complete.jar -Dlanguage=Python3 -visitor -o ../gokquery KQuery.g4
java -jar ../lib/antlr-4.9.2-complete.jar KQuery.g4
javac -cp ../lib/antlr-4.9.2-complete.jar KQuery*.java
#!/bin/sh
BASENAME=$1
TEXFile="$BASENAME.tex"

cd ../.tmp_PANDOC

echo "pandoc --to epub --listings -o ../latex/$BASENAME.epub $TEXFile"
pandoc --to epub --listings -o ../latex/$BASENAME.epub $TEXFile

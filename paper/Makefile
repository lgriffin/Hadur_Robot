# Build the paper: `make` (needs pdflatex, bibtex and the pgfplots/TikZ packages).
main.pdf: main.tex refs.bib figures/*.tex
	pdflatex -interaction=nonstopmode main
	bibtex main
	pdflatex -interaction=nonstopmode main
	pdflatex -interaction=nonstopmode main

clean:
	rm -f *.aux *.bbl *.blg *.log *.out build.log

.PHONY: clean

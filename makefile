# Instalar o make: sudo apt install make
# Rodar o makefile: make all
# Excluir os arquivos .class: make clean
# OBS: o escopo de cada "alvo" (target) no makefile deve ser identado com TABULAÇÃO obrigatoriamente.

all:
	javac Pesquisa.java MainPesquisaSequencial.java MainPesquisaSequencialComSentinela.java MainPesquisaBinaria.java

clean:
	rm -f *.class

git:
	# Note que aqui é uma tabulação, e não espaços
	git add .
	git commit -m "Nova versão"
	git push

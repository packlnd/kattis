FLAGS = -pedantic -Wall -std=c++11

all: main.o
	g++ -o main $(FLAGS) main.o

main.o: src/main.cc
	g++ $(FLAGS) -c src/main.cc

clean:
	rm *.out *.o

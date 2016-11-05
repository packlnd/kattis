FLAGS = -pedantic -Wall -std=c++11

all: main.o
	g++ -o main $(FLAGS) main.o

main.o: main.cc
	g++ $(FLAGS) -c main.cc

clean:
	rm *.out *.o

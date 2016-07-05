#include<iostream>
#include<algorithm>

int main() {
  int T;
  std::cin >> T;
  for (int i=0; i<T; ++i) {
    int Ng=0, Nm=0;
    std::cin >> Ng >> Nm;
    long maxg=0,maxm=0;
    for (int j=0; j<Ng; ++j) {
      long e;
      std::cin >> e;
      maxg = std::max(e, maxg);
    }
    for (int j=0; j<Nm; ++j) {
      long e;
      std::cin >> e;
      maxm = std::max(e, maxm);
    }
    if (maxg >= maxm)
      std::cout << "Godzilla" << std::endl;
    else
      std::cout << "MechaGodzilla" << std::endl;
  }
  return 0;
}

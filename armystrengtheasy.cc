#include<iostream>
#include<algorithm>
#include<vector>

int main() {
  int T;
  std::cin >> T;
  for (int i=0; i<T; ++i) {
    int Ng=0, Nm=0;
    std::cin >> Ng >> Nm;
    std::vector<long> G,M;
    for (int j=0; j<Ng; ++j) {
      long e;
      std::cin >> e;
      G.push_back(e);
    }
    for (int j=0; j<Nm; ++j) {
      long e;
      std::cin >> e;
      M.push_back(e);
    }
    std::sort(G.begin(), G.end());
    std::sort(M.begin(), M.end());
    while (true) {
      if (G.size() == 0) {
        std::cout << "MechaGodzilla" << std::endl;
        break;
      }
      if (M.size() == 0) {
        std::cout << "Godzilla" << std::endl;
        break;
      }
      if (G[0] >= M[0]) {
        M.erase(M.begin());
      } else {
        G.erase(G.begin());
      }
    }
  }
  return 0;
}

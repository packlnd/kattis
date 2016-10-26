#include<iostream>
#include<algorithm>
#include<vector>

int main() {
  int N;
  std::cin >> N;
  std::vector<int> v;
  for (int i=0; i<N; ++i) {
    int e;
    std::cin >> e;
    v.push_back(e);
  }
  std::sort(v.begin(), v.end());
  //for (auto e : v)
  //  std::cout << e << ' ';
  //std::cout << std::endl;
  int cost=0,gcount=1;
  for (int i=v.size()-1; i>=0; --i) {
    if (gcount == 3) {
      gcount = 1;
      continue;
    }
    cost += v[i];
    gcount += 1;
  }
  std::cout << cost << std::endl;
  return 0;
}

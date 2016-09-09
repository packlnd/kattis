#include<iostream>
#include<vector>
#include<algorithm>
#include<unordered_map>
#include<string>

int main() {
  int T,N;
  std::cin >> T;
  for (int t=0; t<T; ++t) {
    std::cout << t << std::endl;
    std::unordered_map<std::string, int> map;
    std::cin >> N;
    for (int n=0; n<N; ++n) {
      std::string s1, s2;
      std::cin >> s1 >> s2;
      if (map.count(s2) > 0)
        map[s2] += 1;
      else
        map[s2] = 0;
    }
    for (auto i : map) {
      std::cout << i.first << ": " << i.second << std::endl;
    }
  }
  return 0;
}

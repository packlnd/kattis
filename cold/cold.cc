#include<iostream>

int main() {
  int N, i, count=0;
  std::cin >> N;
  for (int j=0; j<N;++j) {
    std::cin >> i;
    if (i < 0) ++count;
  }
  std::cout << count << std::endl;
  return 0;
}

#include <iostream>

int main() {
  long a,b;
  while (std::cin >> a >> b)
    std::cout << (a > b ? a-b : b-a) << std::endl;
  return 0;
}

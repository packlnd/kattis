#include<iostream>

int main() {
  std::string input;
  std::cin >> input;
  int change=0;
  for (int i=0; i<input.length(); i+=) {
    if (input[i] != 'P') ++change;
    if (input[i+1] != 'E') ++change;
    if (input[i+2] != 'R') ++change;
  }
  std::cout << change << std::endl;
  return 0;
}

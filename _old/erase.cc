#include<iostream>
#include<string>

int main() {
  int n;
  std::string s1, s2;
  std::cin >> n >> s1 >> s2;
  if (n % 2 != 0) {
    for (int i=0; i<s2.length(); ++i)
      s2[i] = (s2[i] == '1' ? '0' : '1');
  }
  std::cout << "Deletion " << (s1.compare(s2) != 0 ? "failed" : "succeeded") << std::endl;
}

#include<iostream>
#include<vector>
#include<algorithm>
#include<unordered_map>
#include<string>

void recur(std::vector<long> nums, std::vector<long> dyn, long i) {
  
}

int main() {
  int T = 0;
  while (std::cin >> T) {
    std::vector<long> nums, dyn(T, -1);
    long n = 0;
    std::cin >> n;
    nums.push_back(n);
    recur(nums, dyn, 0);
    std::cout << dyn[0] << std::endl;
  }
  return 0;
}

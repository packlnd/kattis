#include<iostream>
#include<algorithm>
#include<vector>
#include<string>
#include<unordered_map>
#include<unordered_set>

struct node {
  std::string s;
  node *next;
};
struct set {
  std::string rep;
  node *first;
  int size;
};

int main() {
  int N,M;
  std::cin >> N;
  std::unordered_map<std::string, set*> sts;
  for (int i=0; i<N; ++i) {
    std::string s;
    std::cin >> s;
    node *n = new node{s, NULL};
    sts[s] = new set{s, n, 1};
  }
  std::cin >> M;
  for (int i=0; i<M; ++i) {
    std::string s1, s2;
    std::cin >> s1 >> s2;
    set *set1 = sts[s1], *set2 = sts[s2];
    if (set1->rep.compare(set2->rep) != 0) {
      set1->size += set2->size;
      if (set1->size > 2) {
        std::cout << "impossible" << std::endl;
        return 0;
      }
      for (node *n = set2->first; n != NULL; n=n->next) {
        node *z = new node{n->s, set1->first};
        set1->first = z;
        if (set1->rep.compare(set2->rep) > 0) {
          set1->rep = set2->rep;
        }
        sts[n->s] = set1;
      }
    }
  }
  std::unordered_set<std::string> b1, b2;
  for (std::pair<std::string, set*> kv : sts) {
    if (kv.second->size == 1) {
      b1.insert(kv.second->first->s);
    } else if (kv.second->size == 2) {
      b1.insert(kv.second->first->s);
      b2.insert(kv.second->first->next->s);
    }
  }
  for (auto it = b1.begin(); it != b1.end(); ++it) {
    if (it != b1.begin()) std::cout << " ";
    std::cout << *it;
  }
  std::cout << std::endl;
  for (auto it = b2.begin(); it != b2.end(); ++it) {
    if (it != b2.begin()) std::cout << " ";
    std::cout << *it;
  }
  std::cout << std::endl;
  return 0;
}

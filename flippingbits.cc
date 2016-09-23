#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int T;
    cin >> T;
    unsigned long mask = 0xFFFFFFFF;
    for (int i=0; i<T; ++i) {
        long t;
        cin >> t;
        long res = t^mask;
        cout << res << endl;
    }
    return 0;
}

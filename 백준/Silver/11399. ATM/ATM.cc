#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
	cout.tie(0);

    int N = 0;
    cin >> N;
    vector<int> v(N);
    for(int i = 0; i < N; i ++){
        cin >> v[i];
    }
    sort(v.begin(), v.end());
    int temp = 0;
    int ans = 0;
    for(int i = 0; i < N; i ++){
        temp += v[i];
        ans += temp;
    }
    cout << ans;

    return 0;
}
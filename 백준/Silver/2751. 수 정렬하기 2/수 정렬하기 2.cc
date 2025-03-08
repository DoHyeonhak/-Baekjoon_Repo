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
    for(int i = 0; i < N; i++){
        cin >> v[i];
    }
    sort(v.begin(), v.end());
    for(int i = 0; i < N; i ++){
        cout << v[i] << "\n";
    }

    return 0;
}
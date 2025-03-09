#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
	cout.tie(0);

    int N = 0;
    int M = 0;
    cin >> N;
    
    vector<int> v1(N);
    for(int i = 0; i < N; i ++){
        cin >> v1[i];
    }
    
    sort(v1.begin(), v1.end());

    cin >> M;
    for(int i = 0; i < M; i ++){
        int num = 0;
        cin >> num;
        if(binary_search(v1.begin(), v1.end(), num)){
            cout << "1" << " ";
        }else{
            cout << "0" << " ";
        }
    }


    return 0;
}
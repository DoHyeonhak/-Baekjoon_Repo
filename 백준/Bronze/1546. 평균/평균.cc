#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    ios_base::sync_with_stdio(false);
	cout.tie(0);

    int N = 0;
    double sum = 0;
    cin >> N;
    double arr[1001];
    for(int i = 0; i < N; i++){
        cin >> arr[i];
    }
    sort(arr, arr + N);
    
    for(int i = 0; i < N; i ++){
        sum += arr[i]/arr[N-1]*100;
    }
    cout << sum/N;
    return 0;
}
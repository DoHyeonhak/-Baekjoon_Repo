#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;



int main(){
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int n = 0, m = 0;

    cin >> n >> m;
    vector<vector<int>> A(n, vector<int>(m));

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cin >> A[i][j];
        }
    }
    int input = 0;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cin >> input;
            A[i][j] += input;
            cout << A[i][j] << " ";
        }
        cout << endl;
    }
   
    return 0;
}
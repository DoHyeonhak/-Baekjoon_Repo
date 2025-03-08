#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;


int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
	cout.tie(0);

    int N = 0;
    string str = "";
    int sum = 0;
    cin >> N;
    cin >> str;
    for(int i = 0; i < str.length(); i ++){
        sum += str[i] - '0';
    }

    cout << sum;
    return 0;
}
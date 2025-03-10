#include <iostream>
#include <map>
#include <string>
#include <algorithm>
using namespace std;


int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(0);
	cout.tie(0);

    int N = 0;
    cin >> N;
    map<string, string, greater<string>> m;

    string key, value;
    for(int i = 0; i < N; i++){
        cin >> key >> value;
        if(value == "enter") m.insert({key, value});
        else m.erase(key);
    }
    for(auto m : m){
        cout << m.first << "\n";
    }

    return 0;
}
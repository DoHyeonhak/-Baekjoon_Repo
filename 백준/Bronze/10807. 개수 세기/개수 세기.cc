#include <iostream>
#include <vector>
using namespace std;



int main(){
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);

    int size = 0;
    cin >> size;

    vector<int> v(size);
    for(int i = 0; i < size; i ++){
        cin >> v[i];
    }
    int num = 0;
    cin >> num;

    size = 0;
    for(int i = 0; i < v.size(); i ++){
        if(v[i] == num) size++;
    }
    cout << size;
    



    return 0;
}
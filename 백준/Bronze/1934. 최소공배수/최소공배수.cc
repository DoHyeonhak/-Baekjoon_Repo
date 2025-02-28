#include <iostream>
using namespace std;

int gcd(int a, int b){
    int c = 0;
    while(b!=0){
        c = a%b;
        a = b;
        b = c;
    }
    return a;
}

int main()
{
    int n;
    cin >> n;

    for(int i = 0; i < n; i++){
        int a = 0, b = 0;
        cin >> a >> b;
        cout << (a*b)/gcd(a,b) << endl;
    }
    return 0;
}
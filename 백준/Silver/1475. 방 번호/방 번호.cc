#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;



int main(){
    ios::sync_with_stdio(false);
    cin.tie(0); cout.tie(0);
    // 6, 9는 거꾸로 사용 가능

    vector<int> nums(10);

    string num;
    cin >> num;


    for(int i = 0; i < nums.size(); i ++){
        nums[num[i] - '0'] ++;
    }
    
    
    int temp = nums[6] + nums[9];
    if((temp%2) == 0){ // if even
        temp/=2;
    }else{  // if odd
        temp/=2;
        temp++;
    }
    nums[6] = temp;
    nums[9] = 0;

    sort(nums.begin(), nums.end());
    cout << nums.back();
   
   
    return 0;
}
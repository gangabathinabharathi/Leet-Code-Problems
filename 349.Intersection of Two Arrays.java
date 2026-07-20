class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        int n=nums1.size();
        int m=nums2.size();
        vector<int>ans;
        vector<int>num1(1001,0);
        vector<int>num2(1001,0);
        for(int i=0;i<n;i++){
            num1.at(nums1.at(i))++;
        }
        for(int i=0;i<m;i++){
            num2.at(nums2.at(i))++;
        }
        for(int i=0;i<1001;i++){
            if( num1.at(i)!=0 && num2.at(i)!=0){
                ans.push_back(i);
            }
        }
        
        return ans;
    }
};

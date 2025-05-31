class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 0;
        while(i<nums.size()) {
            if (i == 0 || nums[i] != nums[i-1]) {
                i++;
                continue;
            }
            nums.erase(nums.begin() + i);
        }
        return nums.size();
    }
};


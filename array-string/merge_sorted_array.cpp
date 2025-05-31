class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
            vector<int> temp;
            int nums2s = 0;
            for (int i=0; i < m; i++) {
                for (int j=nums2s; j < n; j++) {
                    if (nums1[i] > nums2[j]) {
                        temp.push_back(nums2[j]);
                        nums2s++;
                    }
                }
                temp.push_back(nums1[i]);
            }
            for (int i=nums2s; i < n; i++) {
                temp.push_back(nums2[i]);
            }
            for (int i=0; i < m + n; i++) {
                nums1[i] = temp[i];
            }
    }
};

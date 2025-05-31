#include <iostream>
#include <string>

class Solution {
public:
    bool isSubsequence(string s, string t) {
        int ps = 0;

        for (int i=0; i < t.length(); i++)
            if (s[ps] == t[i]) 
                ps++;

        if (s.length() == ps) 
            return true;
        else
            return false;
    }
};

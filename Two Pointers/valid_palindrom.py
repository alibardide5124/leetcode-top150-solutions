class Solution:
    def isPalindrome(self, s: str) -> bool:
        si, ei = 0, len(s)-1
        while si < ei:
            while not s[si].isalnum() and si < ei:
                si+=1
            while not s[ei].isalnum() and ei > si:
                ei-=1
            if s[si].lower() != s[ei].lower() and si < ei:
                return False
            si += 1
            ei -= 1
        return True

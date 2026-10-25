class Solution:
    def isPalindrome(self, x: int) -> bool:
        a=str(x)
        n=len(a)
        for i in range(0,n//2):
            if(a[i]!=a[n-1-i]):
                return False
        return True
        
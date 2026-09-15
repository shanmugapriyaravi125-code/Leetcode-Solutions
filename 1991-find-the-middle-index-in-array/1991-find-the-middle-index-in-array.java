class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int prefix,suffix ;
     
        for (int i = 0; i < n; i++) {
            prefix=0;
            suffix=0;
            for (int j = n - 1; j > i; j--)
                suffix += nums[j];
            for (int k = 0; k < i; k++)
                prefix += nums[k];
            System.out.println(prefix+" "+suffix);
            if (prefix == suffix)
                return i;
        }
        return -1;
    }
}
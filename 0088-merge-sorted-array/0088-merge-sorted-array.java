/*
 * Time: O(m+n)
 * Space: O(1)
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length != m+n || nums2 == null || nums2.length != n)
            return;
        
        int read1 = m-1;
        int read2 = n-1;
        int write = m+n-1;
        
        while(read1 >= 0 && read2 >= 0){
            if(nums1[read1] > nums2[read2])
                nums1[write--] = nums1[read1--];
            else
                nums1[write--] = nums2[read2--];
        }
        
        while(read2 >= 0)
            nums1[write--] = nums2[read2--];
    }
}
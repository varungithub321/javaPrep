class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 1)
            return 0;
        
        int left = 0,  right = height.length - 1;
        int area = 0;
        while(left < height.length-1 && right > 0) {
            if(height[left] < height[right]){
                area = Math.max(area, (Math.min(height[left], height[right])) * (right - left));
                left++;
            }
            else{
                area = Math.max(area, (Math.min(height[left], height[right])) * (right - left));
                right--;
            }
        }
        return area;
    }
    
}
class Solution {
    public int maxArea(int[] heights) {
        int low = 0, high = heights.length-1,maxArea = 0;

        while(low <= high)
        {
            int minHeight = Math.min(heights[low], heights[high]);
            int width = high-low;
            maxArea = Math.max(maxArea, (minHeight*width));

            System.out.println(maxArea);

            if(heights[low] <= heights[high]){
                low++;
            }    
            else{
                high--;
            }
        }
        return maxArea;
    }
}

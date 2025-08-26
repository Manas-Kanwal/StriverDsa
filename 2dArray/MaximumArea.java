class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        // number of rectangles given
        int size = dimensions.length; 
        
        // variables to track best rectangle
        int maxarea = 0;       // stores the maximum area among candidates
        int maxDiagonal = 0;   // stores the largest diagonal (squared value)

        // loop through each rectangle (length, width)
        for (int i = 0; i < size; i++) {
            int length = dimensions[i][0];  // first element = length
            int width  = dimensions[i][1];  // second element = width

            // calculate diagonal^2 = (length^2 + width^2)
            // we don't take square root because comparison works the same
            int diagonal = length * length + width * width; 
            
            // calculate area of rectangle
            int area = length * width;  

            // CASE 1: found a rectangle with strictly larger diagonal
            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal; // update the "largest diagonal" seen so far
                maxarea = area;         // reset maxarea to this rectangle’s area
            }
            // CASE 2: found another rectangle with same diagonal
            else if (diagonal == maxDiagonal) {
                // choose the one with larger area
                maxarea = Math.max(maxarea, area);  
            }
            // CASE 3: if diagonal < maxDiagonal → ignore
        }

        // return the best area found
        return maxarea;
    }
}

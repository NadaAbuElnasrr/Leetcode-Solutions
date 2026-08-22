class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int colBegin = 0, colEnd = matrix[0].length - 1;
        int rowBegin = 0, rowEnd = matrix.length - 1;
        List<Integer> res = new LinkedList<>();

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            //traverse right
            for (int j = colBegin; j <= colEnd; j++) {
                res.add(matrix[rowBegin][j]);

            }
            rowBegin++;
            //traverse down
            for (int i = rowBegin; i <= rowEnd; i++) {
                res.add(matrix[i][colEnd]);

            }
            colEnd--;
            //traverse left
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    res.add(matrix[rowEnd][j]);

                }
                rowEnd--;
            }
            //traverse top
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res.add(matrix[i][colBegin]);

                }
                colBegin++;
            }
        }
        return res;
    }
}
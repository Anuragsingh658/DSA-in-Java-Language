public class SetMatrixZeroes {
        public void setZeroes(int[][] matrix) {
            int row[n] = matrix.length;
            int col[m] = matrix[0].length;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(matrix[i][j] == 0){
                        row[i] = 1;
                        col[j] = 1;
                    }
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(row[i] || col[j]){
                        matrix[i][j] = 0;
                    }
                }
            }   
        }
    }


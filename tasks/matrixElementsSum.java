int matrixElementsSum(int[][] matrix) {
    int sum=0;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(i!=matrix.length-1){
                sum+=matrix[i][j];
                if(matrix[i][j]==0){
                    matrix[i+1][j]=0;
                }
            }
            else{
                sum+=matrix[i][j];
            }
        }
    }
    return sum;
}


public class Optional {
    public static void main(String[] args) {
        //A Largest row sum
        int[][] matrixA = {
                { 1, 2, 3, 4 },
                { 10, 20, 30, 40 },
                { 5, 6, 7, 8 }
        };
        int maxRow = -999999999;
        int maxIndex = 0;
        for(int i = 0; i < matrixA.length; i++) {
            int rowSum = 0;
            for(int j = 0; j < matrixA[i].length; j++) {
                rowSum += matrixA[i][j];
            }
            if(rowSum > maxRow) {
                maxRow = rowSum;
                maxIndex = i;
            }
        }
        System.out.println("Row " + maxIndex + " has the  largest sum of " + maxRow);

        //B Transpose
        int[][] matrixB = {{ 1, 2, 3 },
                           { 4, 5, 6 }};
        int[][] transposed = new int[3][2];

        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                transposed[j][i] = matrixB[i][j];
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("B. Transposed matrix (3x2):");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

        //C Add two matrices
        int[][] matrixC1 = {{ 1, 2, 3 },
                { 4, 5, 6 }};
        int[][] matrixC2 = {{ 7, 8, 9 },
                { 10, 11, 12 }};
        int[][] sumMatrix = new int[2][3];

        for (int i = 0; i < matrixC1.length; i++) {
            for (int j = 0; j < matrixC1[i].length; j++) {
                sumMatrix[i][j] = matrixC1[i][j] + matrixC2[i][j];
            }
        }
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}

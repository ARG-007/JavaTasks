package tasks.library;


public class Matrix{
    int matrix[][];
    int rows,columns;
    public String matrixType;

    public Matrix(int[][] array){
        matrix=this.copy(array);
        rows=matrix.length;
        columns=matrix[0].length;
        matrixType=this.getMatrixType();
    }


    private int[][] copy(int[][] array){
        int[][] copyMat=new int[array.length][array[0].length];
        for (int i=0;i<array.length;i++)
            System.arraycopy(array[i], 0, copyMat[i], 0, array[i].length);
        return copyMat;
    }


    public String getMatrixType(){
        boolean lowerM=true,upperM=true,identityM=true;
        int n=this.rows;
        int[][] matrix=this.copy(this.matrix);


        uppercheck:
        for (int i=1;i<n;i++)
            for (int j=0;j<i;j++)
                if (matrix[i][j]!=0){
                    upperM=false;
                    break uppercheck;
                }


        lowercheck:
        for (int i=0;i<n;i++)
            for (int j=i+1;j<n;j++)
                if (matrix[i][j]!=0){
                    lowerM=false;
                    break lowercheck;
                }



        int FE=matrix[0][0];
        if (upperM && lowerM){
            diagnalcheck:
            for (int i=1;i<n;i++)
                if (matrix[i][i]!=FE){
                    identityM=false;
                    break diagnalcheck;
                    //This has same effect as break yet given label to get an completeness
                }
        }
        else
            identityM=false;



        if (upperM && lowerM && identityM && FE==0)
            /*if upper triangle and lower triangle and identity is true
            and First element is 0 then everything is 0 which means
            it is an Null matrix*/
            return "Null";
        if (upperM && lowerM && identityM)
            /*If FE is not an zero then the matrix should be an Identity Matrix*/
            return "Identity";
        if (upperM && lowerM)
            /*If the matrix isn't an identity but only its diagnal contains
            Non-Zero elements then it can be considered as Sparse Matrix*/
            return "Sparse";
        if (upperM)
            return "UpperTriangle";
        if (lowerM)
            return "LowerTriangle";
        return (rows==columns)?"Square":"Normal";
    }



    public int[][] add(Matrix B){ //Vector Addition
        int[][] Amatrix=this.matrix.clone();
        int[][] Bmatrix=B.matrix;
        for (int i=0;i<this.rows;i++){
            for (int j=0;j<this.columns;j++)
                Amatrix[i][j]+=Bmatrix[i][j];
        }
        //this.matrix=Amatrix;
        return Amatrix;
    }




    public int[][] add(int integer){//Scalar Addition
        int[][] Amatrix=this.matrix.clone();
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.columns;j++)
                Amatrix[i][j]+=integer;
        }
        //this.matrix=Amatrix;
        return Amatrix;
    }



    public int[][] subract(Matrix B){ //Vector Subraction
        int[][] Amatrix=this.copy(this.matrix);
        int[][] Bmatrix=B.matrix;
        for (int i=0;i<this.rows;i++){
            for (int j=0;j<this.columns;j++)
                Amatrix[i][j]-=Bmatrix[i][j];
        }
        //this.matrix=Amatrix;
        return Amatrix;
    }



    public int[][] subract(int integer){//Scalar Subraction
        int[][] Amatrix=this.copy(this.matrix);
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.columns;j++)
                Amatrix[i][j]-=integer;
        }
        //this.matrix=Amatrix;
        return Amatrix;
    }



    public int[][] multiply(Matrix B){
        if (this.columns!=B.rows)
            throw new ArithmeticException("Cannot Multiply Incompactible Matrices");
        int[][] Amatrix=this.matrix;
        int[][] Bmatrix=B.matrix;
        int[][] resultMatrix=new int[this.rows][B.columns];
        for (int i=0;i<this.rows;i++)
            for (int j=0;j<B.columns;j++)
                for (int k=0;k<B.rows;k++)
                    resultMatrix[i][j]+=Amatrix[i][k]*Bmatrix[k][j];
        return resultMatrix;
    }



    public int[][] multiply(int integer){
        int[][] Amatrix=this.copy(this.matrix);
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.columns;j++)
                Amatrix[i][j]*=integer;
        }
        return Amatrix;
    }
}
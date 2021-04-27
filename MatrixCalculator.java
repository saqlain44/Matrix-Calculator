import java.util.Scanner;

class Heading{
public void HeadingMethod() {
	System.out.println();
	System.out.println("\t\t\t**        *     **    ******** ******   ******* *       *    	 ");
	System.out.println("\t\t\t*  *   *  *    *  *       *    *    *      *      *   *          ");
	System.out.println("\t\t\t*    *    *   ******      *    *  *        *        *           ");
	System.out.println("\t\t\t*         *  *      *     *    *   *       *      *    *       ");
	System.out.println("\t\t\t*         * *        *    *    *     *  ******* *         *     ");
	System.out.println("\n\n");
	System.out.println();
	System.out.println("\t* * * * *     **     *       * * * * *  *     * *          **     ******** * * * *  ****** ");
	System.out.println("\t*            *  *    *       *          *     * *         *  *        *    *     *  *   *  ");
	System.out.println("\t*           ******   *       *          *     * *        ******       *    *     *  * *     ");
	System.out.println("\t*          *      *  *       *          *     * *       *      *      *    *     *  *   *  ");
	System.out.println("\t* * * * * *        * ******* * * * * *  ******* ****** *        *     *    * * * *  *     * ");
	System.out.println("\t______________________________________________________________________________________________");
	System.out.println("\n\n\t\t\t\t\t\t\t\tBy: SAQLAIN MUSTAFA");
	System.out.println("\n\n\n\t\t\t\t\tPress \"ENTER\" to continue...");
	for (int i=0; i<50; ++i)System.out.println();
	   Scanner scanner = new Scanner(System.in);
	   scanner.nextLine();
	   
}
}

class MainMenu{
	 public void MainMenuMethod() { 
		 try {
		 int SelectOperation=0;
		 while (SelectOperation!=7) {
		System.out.println("\t\t\t\t\t\t\t ---------");
		System.out.println("\t\t\t\t\t\t\t|MAIN MENU|");
		System.out.println("\t\t\t\t\t\t\t ---------");
		System.out.println("\n\t\t\t\t\t1.Matrix Addition");
		System.out.println("\t\t\t\t\t2.Matrix Subtraction");
		System.out.println("\t\t\t\t\t3.Matrix Multiplication");
		System.out.println("\t\t\t\t\t4.Determinant");
		System.out.println("\t\t\t\t\t5.Trace of the Matrix");
		System.out.println("\t\t\t\t\t6.Transpose of the Matrix");
		System.out.println("\t\t\t\t\t7.Exit");
		System.out.print("\n\t\t\t\t\tSelect an operation number, you want to perform..!!!");
		Scanner input = new Scanner(System.in);
		SelectOperation=input.nextInt();
		for (int i = 0; i < 50; ++i) System.out.println();
		
			switch(SelectOperation) {
				case 1:
					MatrixAddition();
					break;
				case 2:
					MatrixSub();
					break;
				case 3:
					MatrixMulti();
					break;
				case 4:
					Determinant();
					break;
				case 5:
					Trace();
					break;
				case 6:
					Transpose();
					break;
				case 7:
					System.out.println("\n\n\n\t\t\t\t\tThank You...!!!\n\n");
					break;
					default: {
						System.out.println("\t\t\t\tInvalid Choice, try again with given operation numbers.\n\n\n\n");
					}
				
			}
			
		}
		 }
		 catch(Exception e) {
			System.out.println("Error: Input Mismatch");
		}
	 }
	
	 
public void MatrixAddition() {
	try {
	String d="";
	do {
	System.out.println("\n\n\t\t\t\t\t\t***ADDITION OF TWO MATRICES***");
	System.out.println("\t\t\t\t\t\t------------------------------");
		 int p, q, m, n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("\n\nEnter number of rows in first matrix:");
	        p = s.nextInt();
	        System.out.print("Enter number of columns in first matrix:");
	        q = s.nextInt();
	        System.out.print("Enter number of rows in second matrix:");
	        m = s.nextInt();
	        System.out.print("Enter number of columns in second matrix:");
	        n = s.nextInt();
	        if (p == m && q == n) 
	        {
	            int a[][] = new int[p][q];
	            int b[][] = new int[m][n];
	            int c[][] = new int[m][n];
	            System.out.println("\n\nEnter all the elements of first matrix:");
	            for (int i = 0; i < p; i++) 
	            {
	                for (int j = 0; j < q; j++) 
	                {
	                    a[i][j] = s.nextInt();
	                }
	            }
	            System.out.println("Enter all the elements of second matrix:");
	            for (int i = 0; i < m; i++) 
	            {
	                for (int j = 0; j < n; j++) 
	                {
	                    b[i][j] = s.nextInt();
	                }
	            }
	            
	            System.out.println("\n\nFirst Matrix:");
	            for (int i = 0; i < p; i++) 
	            {
	                for (int j = 0; j < q; j++) 
	                {
	                    System.out.print(a[i][j]+"  ");
	                }
	                System.out.println("");
	            }
	            System.out.println("\nSecond Matrix:");
	            for (int i = 0; i < m; i++) 
	            {
	                for (int j = 0; j < n; j++) 
	                {
	                    System.out.print(b[i][j]+"  ");
	                }
	                System.out.println("");
	            }
	            for (int i = 0; i < p; i++) 
	            {
	                for (int j = 0; j < n; j++) 
	                {
	                    for (int k = 0; k < q; k++) 
	                    {
	                        c[i][j] = a[i][j] + b[i][j];
	                    }
	                }
	            }
	            System.out.println("\nMatrix after addition:");
	            for (int i = 0; i < p; i++) 
	            {
	                for (int j = 0; j < n; j++) 
	                {
	                    System.out.print(c[i][j]+"   ");
	                }
	                System.out.println("");
	            }
	        }
	        else
	        {
	            System.out.println("\n\n\t\t\tSORRY, condition Unsatisfied; Addition would not be possible..!!  :( \n\n");
	        }
	        System.out.print("\n\t\tDo you want to peform another addition (y/n) ?");
	        Scanner input=new Scanner(System.in);
	        d = input.nextLine();
	        for (int i=0; i<50; ++i)System.out.println();
	}
	while(d.equalsIgnoreCase("Y"));
	}
	catch(Exception e) {
		System.out.println("Error: Input Mismatch");
	}
	        
}


	 public void MatrixSub() {
		 try {
		 String d="";
		 do {
		 System.out.println("\n\n\t\t\t\t\t\t***SUBTRACTION OF TWO MATRICES***");
			System.out.println("\t\t\t\t\t\t  ------------------------------");
		 int p, q, m, n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("\n\nEnter number of rows in first matrix:");
	        p = s.nextInt();
	        System.out.print("Enter number of columns in first matrix:");
	        q = s.nextInt();
	        System.out.print("Enter number of rows in second matrix:");
	        m = s.nextInt();
	        System.out.print("Enter number of columns in second matrix:");
	        n = s.nextInt();
	        if (p == m && q == n) 
	        {
	            int a[][] = new int[p][q];
	            int b[][] = new int[m][n];
	            int c[][] = new int[m][n];
	            System.out.println("\n\nEnter all the elements of first matrix:");
	            for (int i = 0; i < p; i++) 
	            {
	                for (int j = 0; j < q; j++) 
	                {
	                    a[i][j] = s.nextInt();
	                }
	            }
	            System.out.println("Enter all the elements of second matrix:");
	            for (int i = 0; i < m; i++) 
	            {
	                for (int j = 0; j < n; j++) 
	                {
	                    b[i][j] = s.nextInt();
	                }
	            }
	         
	            System.out.println("\n\nFirst Matrix:");
	            for (int i = 0; i < p; i++) 
	            {
	                for (int j = 0; j < q; j++) 
	                {
	                    System.out.print(a[i][j]+"  ");
	                }
	                System.out.println("");
	            }
	            System.out.println("\nSecond Matrix:");
	            for (int i = 0; i < m; i++) 
	            {
	                for (int j = 0; j < n; j++) 
	                {
	                    System.out.print(b[i][j]+"  ");
	                }
	                System.out.println("");
	            }
	            for (int i = 0; i < p; i++) 
	            {
	                for (int j = 0; j < n; j++) 
	                {
	                    for (int k = 0; k < q; k++) 
	                    {
	                        c[i][j] = a[i][j] - b[i][j];
	                    }
	                }
	            }
	            System.out.println("\nMatrix after subtraction:");
	            for (int i = 0; i < p; i++) 
	            {
	                for (int j = 0; j < n; j++) 
	                {
	                    System.out.print(c[i][j]+"   ");
	                }
	                System.out.println("");
	            }
	            
	        }
	        else
	        {
	            System.out.println("\n\n\t\t\tSORRY, condition Unsatisfied; Subtraction would not be possible..!! :(\n\n");
	        }
	        System.out.print("\n\t\tDo you want to peform another subtraction (y/n) ?");
	        Scanner input=new Scanner(System.in);
	        d = input.nextLine();
	        for (int i=0; i<50; ++i)System.out.println();
		 }
		 while(d.equalsIgnoreCase("Y"));
		 }
		 catch(Exception e) {
	System.out.println("Error: Input Mismatch");
		 }
		 }
			
		
	 public void MatrixMulti() {
		 try {
		 String d="";
		 do {
		 System.out.println("\n\n\t\t\t\t\t\t***MULTIPLICATION OF TWO MATRICES***");
			System.out.println("\t\t\t\t\t\t   ------------------------------");
		 Scanner output = new Scanner(System.in);
				System.out.print("\n\nEnter The number of rows of 1st matrix: ");
				int row1=output.nextInt();
				System.out.print("Enter The number of columns of 1st matrix: ");
				int clm1=output.nextInt();
				System.out.print("Enter The number of rows of 2nd matrix: ");
				int row2=output.nextInt();
				System.out.print("Enter The number of columns of 2nd matrix: ");
				int clm2=output.nextInt();
				if(row1!=clm2) {
					System.out.println("\n\n\t\t\tSORRY, condition Unsatisfied; Multiplication is impossible!!! :(");
				}
				else {
				int A[][]=new int[row1][clm1];
				System.out.println("\nEnter values for 1st matrix:");
				for(int i=0; i<row1; i++) {
					for(int j=0; j<clm1; j++) {
						A[i][j]=output.nextInt();
					}
					System.out.println();
				}
				int B[][]=new int[row2][clm2];
				System.out.println("Enter values for 2nd matrix matrix:");
				for(int i=0; i<row2; i++) {
					for(int j=0; j<clm2; j++) {
						B[i][j]=output.nextInt();
					}
					System.out.println();
					
	  }

				int R[][]=new int[row1][clm2];
				for(int i=0; i<row1; i++) {
					for(int j=0; j<clm2; j++) {
						for (int k=0; k<row2; k++) {
							R[i][j]=R[i][j]+A[i][k]*B[k][j];
						}
				}
	  }
				System.out.println("\nThe product is: ");
				for(int i=0; i<row1; i++) {
					for(int j=0; j<clm2; j++) {
						System.out.print(R[i][j]+ "   ");
					}
					System.out.println();
	     }
	}
				System.out.print("\n\t\tDo you want to peform another multiplication (y/n) ?");
		        Scanner input=new Scanner(System.in);
		        d = input.nextLine();
		        for (int i=0; i<50; ++i)System.out.println();
	 }
		 while(d.equalsIgnoreCase("Y"));}catch(Exception e) {
			System.out.println("Error: Input Mismatch");
		}
			
}
			
	 public void Determinant() {
		 try {
		 String d="";
		 do {
			 System.out.println("\n\n\t\t\t\t\t\t***CALCULATE DETERMINANT OF 2*2 OR 3*3 MATRIX***");
				System.out.println("\t\t\t\t\t\t   ------------------------------------------");
				Scanner output = new Scanner(System.in);
				System.out.print("\n\nEnter The number of rows: ");
				int row=output.nextInt();
				System.out.print("Enter The number of columns: ");
				int clm=output.nextInt();
				if((row!=clm) || (row==1) || (clm==1) || (clm>3) || (row>3)) {
					System.out.println("\n\n\t\t\tSORRY, try again!!! :(");
				}
				else {
					if((row==2) && (clm==2)) {
						int A[][]=new int[row][clm];
						System.out.println("\nEnter values of 2*2 Matrix:");
						for(int i=0; i<row; i++) {
							for(int j=0; j<clm; j++) {
								A[i][j]=output.nextInt();
							}
							System.out.println();
					}
					
						int D=0;
							 
						D=A[0][0]*A[1][1] - A[1][0]*A[0][1];
						System.out.println("\nThe Determinant is: ");
						
								System.out.print(D);
							
						}
					else {
						int A[][]=new int[row][clm];
						System.out.println("\nEnter values of 3*3 Matrix:");
						for(int i=0; i<row; i++) {
							for(int j=0; j<clm; j++) {
								A[i][j]=output.nextInt();
							}
							System.out.println();
					}
					
						int D=0;
							 
						D=A[0][0]*(A[1][1]*A[2][2]-A[1][2]*A[2][1])-A[0][1]*(A[1][0]*A[2][2]-A[1][2]*A[2][0])+A[0][2]*(A[1][0]*A[2][1]-A[1][1]*A[2][0]);  
						System.out.println("\nThe Determinant is: ");
						
								System.out.print(D);
			
				}
					}
			 
			 System.out.print("\n\t\tDo you want to Calculate another determinant (y/n) ?");
		        Scanner input=new Scanner(System.in);
		        d = input.nextLine();
		        for (int i=0; i<50; ++i)System.out.println();
		}while(d.equalsIgnoreCase("Y"));}catch(Exception e) {
			System.out.println("Error: Input Mismatch");
		}
	 }
	 public void Trace() {
		 try {
		 String d="";
		 do {
			 int trace=0;
			 System.out.println("\n\n\t\t\t\t\t\t***CALCULATE TRACE OF MATRIX***");
				System.out.println("\t\t\t\t\t\t   -------------------------");
				Scanner output = new Scanner(System.in);
				System.out.print("\n\nEnter The number of rows: ");
				int row=output.nextInt();
				System.out.print("Enter The number of columns: ");
				int clm=output.nextInt();
				if(row!=clm){
					System.out.println("\n\n\t\t\tSORRY, condition Unsatisfied: No of Rows should be equal to no of Coloumns!!! :(");
				}
				else {
					int A[][]=new int[row][clm];
					System.out.println("Enter matrix:");
					for(int i=0; i<row; i++) {
						for(int j=0; j<clm; j++) {
							A[i][j]=output.nextInt();
						}
						System.out.println();
				}
					System.out.println("The entered Matrix is :");
				 	for(int i = 0; i < row; i++)
				        {
				      	    for(int j = 0; j < clm; j++)
				            {
				         	System.out.print(A[i][j]+" ");
				            }
				            System.out.println(" ");
				    	}
				 	System.out.print("\nIts TRACE is :\t");
				 	  for (int i = 0; i < row; i++) {
				 	   for (int j = 0; j < clm; j++) {
				 	    if (i == j)
				 	     trace = trace + A[i][j];

				 	   }
				 	  }
				 	  System.out.print(trace);
				 	 }
			
				System.out.print("\n\t\tDo you want to Calculate another trace? (y/n) ?");
		        Scanner input=new Scanner(System.in);
		        d = input.nextLine();
		        for (int i=0; i<50; ++i)System.out.println();
	 }
		 while(d.equalsIgnoreCase("Y"));}catch(Exception e) {
			System.out.println("Error: Input Mismatch");
		}
		 }
	 
	public void Transpose() {
		try {
		 String d="";
		 do {
			 System.out.println("\n\n\t\t\t\t\t\t***DISPLAY TRANSPOSE OF MATRIX***");
				System.out.println("\t\t\t\t\t\t   ---------------------------");
				int i, j;
				Scanner s = new Scanner(System.in);
				System.out.print("\n\nEnter Number of rows: ");
				int row = s.nextInt();
				System.out.print("Enter Number of columns: ");
				int column = s.nextInt();
				int array[][] = new int[row][column];
				System.out.println("\nEnter matrix:");
			 	for(i = 0; i < row; i++)
			  	{
			   	    for(j = 0; j < column; j++) 
			     	    {
			        	array[i][j] = s.nextInt();
			        	System.out.print(" ");
			            }
			  	}
				System.out.println("\nThe above matrix before Transpose is ");
			  	for(i = 0; i < row; i++)
			    	{
			      	    for(j = 0; j < column; j++)
			            {
			          	System.out.print(array[i][j]+" ");
			            }
			            System.out.println(" ");
			        }
			 	System.out.println("\nThe above matrix after Transpose is ");
			  	for(i = 0; i < column; i++)
			    	{
			      	    for(j = 0; j < row; j++)
			            {
			                System.out.print(array[j][i]+" ");
			            }
			            System.out.println(" ");
			        }
			 
				System.out.print("\n\t\tDo you want to calculate another transpose? (y/n) ?");
		        Scanner input=new Scanner(System.in);
		        d = input.nextLine();
		        for (int z=0; z<50; ++z)System.out.println();
		}
		 while(d.equalsIgnoreCase("Y"));
		}
		catch(Exception e) {
			System.out.println("Error: Input Mismatch");
		}
		}
}

	public class MatrixCalculator {
		public static void main(String args[]) {
			Heading h= new Heading();
			h.HeadingMethod();
			MainMenu m=new MainMenu();
			m.MainMenuMethod(); 
	}
}
package testTask;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import task.Laba1;
import task.Laba1.If16;
import task.Laba1.While16;

public class Laba1Test {
	  private Laba1 oblab1 = new Laba1();
	
	  @DataProvider
	  public Object[][] begin16Data(){
		  return new Object[][] {
			  {2,oblab1.begin16(2, 4)},
			  {3,oblab1.begin16(-2, 1)},
			  {5,oblab1.begin16(4, 9)}
		  };
	  }
	  
	  
	  @Test(dataProvider="begin16Data")
	  public void testbegin16(int rez, int des) {
		  Assert.assertEquals(rez,des );
	  }
	  
	  
	  ////////////////////////////////
	  @DataProvider
	  public Object[][]integer16Data(){
		  return new Object[][] {
			  {123,132},
			  {125,152},
			  {251,215},
			  {154,145}
		  };
	  }
	  
	  
	  @Test(dataProvider="integer16Data")
	  public void testinteger16(int inp, int outp) {
		  Assert.assertEquals(oblab1.integer16(inp),outp);  
	  }
	  
	  

	  
	  
	  //////////////////////////////////
	  @DataProvider
	  public Object[][] boolean16Data(){
		  return new Object[][] {
			  {22,true},
			  {33,false},
			  {87,false},
			  {88,true}  
		  };
	  }
	
	
	  @Test(dataProvider="boolean16Data")
	  public void testboolean16(int var, boolean varb) {
		  Assert.assertEquals(oblab1.boolean16(var),varb);
	  }
	  
	  
	  
	  ///////////////////////
	  @DataProvider
	  public Object[][] array33Data(){
		  return new Object[][] {
			  {new int[] {4,2,3,4,5,6,7,2},8,7},
			  {new int[] {2,1,2,3,5,15,3,5,8,2},10,9}
		  };
	  }
	  
	  @Test(dataProvider="array33Data")
	  public void testarray33(int[] array, int n, int ch) {
		  Assert.assertEquals(oblab1.array33(array, n), ch);
	  }
	  
	  
	  
	  /////////////////////////////////
	  @DataProvider
	  public Object[][]if16Data(){
		  return new Object[][]{
			  {1,2,3,2,4,6},
			  {1,0.5,-3.2,-1,-0.5,3.2},
			  {0.3,1.5,2.1,0.6,3.0,4.2}
			  
		  };
	  }
	  
	  @Test(dataProvider="if16Data")
	  public void testif16(double A1,double B1, double C1,double A2,double B2,double C2) {
		  Assert.assertEquals(oblab1.if16(A1, B1, C1), new If16(A2,B2,C2));
	  }
	  
	  
	  ////////////////////////////////
	  @DataProvider
	  public Object[][] while16Data(){
		  return new Object[][] {
			  {30,8,238.576907},
			  {20,9,207.9890176}
		  };  
	  }
	  
	  
	  @Test(dataProvider="while16Data")
	  public void testwhile16(int P,int K,double S){
		  Assert.assertEquals(oblab1.while16(P),new While16(K,S));
	  }
	  
	  @DataProvider
	  public Object[][] IncorrectInputProvider(){
		  return new Object[][] {
			  {2100},
			  {70},
			  {95}
		  };
	  }
	  
	  @Test(expectedExceptions = AssertionError.class, dataProvider="IncorrectInputProvider")
	  public void IncorrectInputTest(int P) {
		  oblab1.while16(P);
	  }
	 
	  //////////////////////////////////
	  @DataProvider
	  public Object[][] case16Data(){
		  return new Object[][] {
			  {45,"сорок п'€ть рок≥в"},
			  {32,"тридц€ть два роки"},
			  {21,"двадц€ть один р≥к"}
		  };
	  }
	  
	  @Test(dataProvider="case16Data")
	  public void testcase16(int n,String str) {
		  str.equals(oblab1.case16(n));
	  }
	  
	  
	  //////////////////////////
	  @DataProvider
	  public Object[][] for16Data(){
		  double[] arr1= {1.0,1.0,1.0};
		  double[] arr2= {3,9,27,81};
		  return new Object[][] {
			  {1,3,arr1},
			  {3,4,arr2}
		  };
	  }
	  
	  @Test(dataProvider="for16Data")
	  public void testfor16(double A,int n,double[] arr){
		  Assert.assertEquals(oblab1.for16(A, n), arr);
		  
	  }
	  
	  
	  
	  ///////////////////////////////
	  @DataProvider
	  public Object[][] matrix62Data(){
		  int[][] input1= {{1,2,3},{4,5,6},{7,8,9}};
		  int[][] res1= {{1,3},{4,6},{7,9}};
		  
		  int[][] input2= {{2,3,11,2},{4,5,1,5},{3,2,4,7}};
		  int[][] res2= {{3,11,2},{5,1,5},{2,4,7}};
		  
		  int[][] input3= {{5,2},{4,3},{12,8}};
		  int[][] res3= {{5},{4},{12}};
		  
		  return new Object[][] {
			  {input1,3,3,2,res1},
			  {input2,3,4,1,res2},
			  {input3,3,2,2,res3}
		  }; 
	  }
	  
	  @Test(dataProvider="matrix62Data")
	  public void testmatrix62(int[][] matr,int n, int m, int k, int[][] res_matr) {
		  res_matr.equals(oblab1.matrix62(matr, n, m, k));
		  
	  }
	  
	  

}

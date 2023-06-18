                                              Arrays Problems
                                             -----------------


1)Print Array

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			3,5,4,2,6,8,7,5,1,9
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	public static void myCode(int[]a)
	{
		//Write code here
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

Output-
3 5 4 2 6 8 7 5 1 9 

-----------------------------------------------------------------------------------------------------------

2)Find index of Element

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,6,2,3,4,5,6,7
		}
		;
		int ele=6;
		myCode(a,ele);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int ele) 	
	{
		//WriteCode Here
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				cnt++;
				System.out.println(i);
			}
		}
		if(cnt==0)
		{
			System.out.println("not found");
		}
	}
}


Output-
1
6

-------------------------------------------------------------------------------------------------------------------


3)Find Count of even,odd,positive ,negative element


public class MyClass
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a=
		{
			11,22,33,44,55,66,-77,88
		}
		;
		element(a);
	}
	//EndOfMainMethod
	private static void element(int[] a) 
	{
		//code here
		int even=0;
		int odd=0;
		int pos=0;
		int neg=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				pos++;
			}
			else
			{
				neg++;
			}
		}
		System.out.println("Even Count "+even);
		System.out.println("Odd Count "+odd);
		System.out.println("Positive Count "+pos);
		System.out.println("Negative Count "+neg);
	}
}


Output-

Even Count 4
Odd Count 4
Positive Count 7
Negative Count 1

---------------------------------------------------------------------------------------------------------

4)Replace 0 t0 1

public class MyClass
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a=
		{
			1,0,1,0,1,0,1,0
		}
		;
		replace(a);
	}
	//EndOfMainMethod
	private static void replace(int[] a) 
	{
		//code here
		for(int i=0;i<a.length;i++)
		{
			a[i]=1;
			System.out.print(a[i]+" ");
		}
	}
}


output-
1 1 1 1 1 1 1 1 

------------------------------------------------------------------------------------------------------------

5)Find max Element

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a=
		{
			1,4,2,5,7,5,8,9
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	public static void myCode(int[]a)
	{
		//Write code here
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max element is: "+max);
	}
}


Output-
Max element is: 9

----------------------------------------------------------------------------------------------------

6)Find Min Element

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a=
		{
			1,4,2,5,7,5,8,9
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	public static void myCode(int[]a)
	{
		//Write code here
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min is: "+min);
	}
}


Output-
min is: 1


---------------------------------------------------------------------------------------------------------------------

7)Rotate Array Left

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			3,2,4,6,5,6,8
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//WriteCode Here
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

Output-
2 4 6 5 6 8 3 

----------------------------------------------------------------------------------------------------------------


8)Rotate array Right

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			3,4,5,2,3,6,7,4
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	public static void myCode(int[]a)
	{
		//Write code here
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

Output-
4 3 4 5 2 3 6 7 

-----------------------------------------------------------------------------------------------------------------------------------------------------

9)reverse array using third veriable

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,4,5,6,7,8
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//Write code here
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
			i++;
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
}

Output-
8 7 6 5 4 3 2 1


10)Remove Duplicate

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,3,5,6,2,3,4,5,97,1,23,
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//WriteCode Here
		int cnt;
		for(int i=0;i<a.length;i++)
		{
			cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}

Output-
1 3 5 6 2 4 97 23 

-------------------------------------------------------------------------------------------------------------


11)Basic Sort

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			33,78,90,20,5,50,40
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//WriteCode Here
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{

		
			System.out.print(a[i]+" ");
		}
	}
}


Output-
After Sorting- 5 20 33 40 50 78 90 

------------------------------------------------------------------------------------------------------------------------------------------------

12)Interleaving of Array

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		char[] a= 
		{
			'a','b','c','d','e','f','g'
		}
		;
		char[] b= 
		{
			'w','x','y','z'
		}
		;
		myCode(a,b);
	}
	//EndOfMainMethod
	private static void myCode(char[] a,char[] b) 
	{
		//WriteCode Here
		char []c=new char[a.length+b.length];
		int index =0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			c[index++]=a[i];
			if(i<b.length)
			c[index++]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}


Output-
a w b x c y d z e f g 

----------------------------------------------------------------------------------------------------------------

13)Addition of Two Matrix

public class MyClass
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a=
		{
			{
				1,2,3
			}
			,
			{
				4,5,6
			}
			,
			{
				7,8,9
			}
		}
		;
		int[][] b=
		{
			{
				1,2,3
			}
			,
			{
				4,5,6
			}
			,
			{
				7,8,9
			}
		}
		;
		int[][] c=new int[a.length][a[0].length];
		add(a,b,c);
	}
	//EndOfMainMethod
	private static void add(int[][] a, int[][] b, int[][] c) 
	{
		//code here
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}


Output-
2 4 6 
8 10 12 
14 16 18 

----------------------------------------------------------------------------------------------------------

14)Print Max ELement of Matrix

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a= 
		{
			{
				1,2,3
			}
			,
			{
				4,23,5
			}
			,
			{
				5,4,7
			}
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[][] a) 
	{
		//WriteCode Here
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println("Max is: "+max);
	}
}

output-
Max is: 23

------------------------------------------------------------------------------------------------------------------


15)Transpose of Matrix

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a= 
		{
			{
				1,52,3
			}
			,
			{
				4,23,5
			}
			,
			{
				5,4,52
			}
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[][] a) 
	{
		//WriteCode Here
		int b[][]=new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}

Output-
1 4 5 
52 23 4 
3 5 52 

-------------------------------------------------------------------------------------------------------------------

16)Find Sum and Avg 

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,4,5,6,7,8
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//WriteCode Here
		int sum=0;
		double avg;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+avg);
	}
}

Output-
Sum : 36
Avg : 4.0

----------------------------------------------------------------------------------------------------------

17)Remove Specific Element

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			33,7,90,20,5,50,40
		}
		;
		int ele=78;
		myCode(a,ele);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int ele) 
	{
		//WriteCode Here
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				cnt++;
			}
		}
		int [] b=new int [a.length-cnt];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=ele)
			{
				b[index++]=a[i];
			}
		}
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[j]+" ");
		}
	}
}

Output-
33 7 90 20 5 50 40 

------------------------------------------------------------------------------------------------------------------------------------------------------

18)RemoveDuplicate print Unique Count

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a = 
		{
			2,1,5,4,3,2,1,6,4,2
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 	
	{
		//WriteCode Here
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			count++;
		}
		System.out.println("new length of array : "+count);
	}
}

Output-
new length of array : 6

---------------------------------------------------------------------------------------------------------------------------------------------------

19)sum of diagonal

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a= 
		{
			{
				5,1,3,
			}
			,
			{
				2,4,3
			}
			,
			{
				4,3,2
			}
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[][] a) 
	{
		//WriteCode Here
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i][a.length-i-1];
		}
		System.out.println("Sum of Diagonal is : "+sum);
	}
}


Output-
Sum of Diagonal is : 11

-------------------------------------------------------------------------------------------------------------------------------------------------------

20)Find Sum and Average of non diagonal Matrix

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a= 
		{
			{
				1,12,3,4
			}
			,
			{
				5,6,6,8
			}
			,
			{
				9,1,2,5
			}
			,
			{
				7,2,4,45
			}
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[][] a) 
	{
		//WriteCode Here
		double sum=0;
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j+i!=a.length-1 && j-i!=0)
				{
					sum=sum+a[i][j];
					cnt++;
				}
			}
		}
		double avg=sum/cnt;
		System.out.println("Sum : "+sum);
		System.out.println("avg : "+avg);
	}
}

Output-
Sum : 48.0
Avg : 6.0

------------------------------------------------------------------------------------------------------------------------------------------------

21)Binary Search

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a=
		{
			23,45,67,88,90
		}
		;
		int num=90;
		int start=0;
		int end=a.length-1;
		binarysearch(a,num,start,end);
	}
	//EndOfMainMethod
	private static void binarysearch(int[] a, int num, int start, int end) 
	{
	
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(a[mid]==num)
			{
				System.out.println("found at index "+start);
				break;
			}
			else if(num>a[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		if(start>end)
		{
			System.out.println("index not found");
		}
	}
}

-----------------------------------------------------------------------------------------------------------------------------

22)Multiplication of Matrix

public class MyClass
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a=
			{
					{
						1,2
					}
					,
					{
						3,4
					}
					,
					{
						5,6
					}
			}
		;
		int[][] b=
			{
					{
						1,2,3
					}
					,
					{

						4,5,6
					}
			}
		;
		int[][] c=new int[a.length][b[0].length];
		multi(a,b,c);
	}
	//EndOfMainMethod
	private static void multi(int[][] a, int[][] b, int[][] c) 
	{
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c[i].length; j++)
			{
				for(int k=0; k<b.length; k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c[i].length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}


output:-
9 12 15 
19 26 33 
29 40 51 

-------------------------------------------------------------------------------------------------------------------------------------------------

23)Check Equality 

public class euix {

	public static void main(String[] args) 
	{
		int[] a= 
			{
					1,2,3,5,4
			}
		;
		int[] b= 
			{
					1,2,3,5,5
			}
		;

		myCode(a,b);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int[] b) 
	{
		if(a.length==b.length)
		{
			int cnt=0;
			for(int i=0; i<a.length; i++)
			{
				if(a[i]!=b[i])
				{
					cnt++;
					break;
				}
			}
			if(cnt==0)
				System.out.println("same");
			else
				System.out.println("not same");
		}
		else
			System.out.println("not same");
	}
}


Output:-
not same

--------------------------------------------------------------------------------------------------------------------------------


24)Unique Pair 

Method-1
--------	

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,2,3
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//WriteCode Here
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
		}
		int[]b=new int[a.length-cnt];
		int index=0;
		//int cnt1;
		for(int i=0;i<a.length;i++)
		{
			int cnt1=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					cnt1++;
				}
			}
			if(cnt1==0)
			b[index++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.println(b[i]+ " "+b[j]);
			}
		}
	}
}

Output-
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
	
	
	
Method-2
----------	
	
	
	public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,2,3
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//WriteCode Here
		int[]b=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0;i<index;i++)
		{
			for(int j=0;j<index;j++)
			{
				System.out.println(b[i]+ " "+b[j]);
			}
		}
	}
}


Output-
	
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3

	
-------------------------------------------------------------------------------------------------------------------------------------------
	
25)Remove Specific Element from Array

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			33,7,90,20,5,50,40
		}
		;
		int ele=78;
		myCode(a,ele);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int ele) 
	{
		//WriteCode Here
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				cnt++;
			}
		}
		int []b=new int[a.length-cnt];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=ele)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}

Output:-
	37 7 90 20 5 50 40
	
----------------------------------------------------------------------------------------------------------------------------------------------
	
26)Average of inner element in 2D array

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a= 
		{
			{
				1,2,3,4
			}
			,
			{
				5,6,7,8
			}
			,
			{
				9,4,2,5
			}
			,
			{
				7,2,4,9
			}
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[][] a) 
	{
		//WriteCode Here
		int sum=0;
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i!=0 && j!=0 && i!=a.length-1 && j!=a.length-1)
				{
					sum=sum+a[i][j];
					cnt++;
				}
			}
		}
		double avg=sum/cnt;
		System.out.println(sum);
		System.out.println(avg);
	}
}

Output-
19
4.0

	
--------------------------------------------------------------------------------------------------------------------------
	
27)Find Unique pair of given element

Method-1
--------	

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			2, 4, 3, 5, 6, -2, 4, 7, 8, 9
		}
		;
		int ele=7;
		myCode(a,ele);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int ele) 	
	{
		//WriteCode Here
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
		}
		int []b=new int [a.length-cnt];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt1=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					cnt1++;
				}
			}
			if(cnt1==0)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]+b[j]==ele)
				{
					System.out.println(b[i]+" "+b[j]);
				}
			}
			//System.out.println();
		}
	}
}

Output-
2 5
4 3
-2 9
	
		
	
Method-2
---------		
	
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			2, 4, 3, 5, 6, -2, 4, 7, 8, 9
		}
		;
		int ele=7;
		myCode(a,ele);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int ele) 	
	{
		//WriteCode Here
		int[]b=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0;i<index;i++)
		{
			for(int j=i+1;j<index;j++)
			{
				if(b[i]+b[j]==ele)
				{
					System.out.println(b[i]+ " "+b[j]);
				}
			}
		}
	}
}


Output-
2 5
4 3
-2 9
	
	
--------------------------------------------------------------------------------------------------------------------------------------------------	
	

28)Remove 1st from 2nd elements in Array

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a = 
		{
			1,1,1,1,1,2,2,3,4,4,4
		}
		;
		int[] b= 
		{
			1,2,4
		}
		;
		myCode(a,b);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int[] b) 	
	{
		//WriteCode Here
		int []num=
		{
			1,2,4
		}
		;
		for(int j=0;j<num.length;j++)
		{
			int cnt=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==num[j])
				{
					cnt++;
				}
			}
			if(cnt>2)
			cnt=2;
			b=new int[a.length-cnt];
			int index=0;
			int cnt2=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=num[j] || cnt2==2)
				{
					b[index++]=a[i];
				}
				else
				{
					cnt2++;
				}
			}
			a=b;
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}


Output-
	1 1 1 3 4
	
	
----------------------------------------------------------------------------------------------------------------------
	
	
	
29)Least of Subarray

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			3,7,90,20,5,50,40
		}
		;
		int k=3;
		myCode(a,k);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int k) 
	{
		//WriteCode Here
		int min=Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<a.length-k+1;i++)
		{
			int sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum=sum+a[j];
			}
			int avg=sum/k;
			if(avg<min)
			{
				min=avg;
				index=i;
			}
		}
		System.out.println(min+" "+index);
	}
}


Output-
25 3
	
----------------------------------------------------------------------------------------------------------------------------------------------	
	
30)Find Sadal Point

public class MyClass
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[][] a=
		{
			{
				6,3,9
			}
			,
			{
				9,7,8
			}
			,
			{
				2,4,5
			}
			,
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[][] a) 
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				boolean row=smallestRow(a,i,j);
				boolean col=largestCol(a,i,j);
				if(row==true && col==true)
				{
					System.out.println(a[i][j]);
					cnt++;
				}
			}
		}
		if(cnt==0)
		{
			System.out.println("no saddle");
		}
	}
	public static boolean smallestRow(int[][]a,int i,int j)
	{
		for(int k=0;k<a.length;k++)
		{
			if(a[i][k]<a[i][j])
			return false;
		}
		return true;
	}
	public static boolean largestCol(int [][]a,int i,int j)
	{
		for(int k=0;k<a.length;k++)
		{
			if(a[k][j]>a[i][j])
			return false;
		}
		return true;
	}
}


Output-
	7
	
---------------------------
  
  
  
2-> 

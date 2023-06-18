--------------------------------------------------String Codes------------------------------------------------------------------------

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
1)print String

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
		}
		
	
}

Output-
abcd
4

-----------------------------------------------------------------------------------------


2)	Create a Character Array Containing The Contents Of a String

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="aabbccd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i)+" ");
		}
	}
}

Output-
a a b b c c d

---------------------------------------------------------------------------------------


3)repeat Each Of The Character Twice

import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "welcome";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			s2=s2+ch+ch;
		}
		System.out.print(s2);
	}
}

Output-
wweellccoommee

--------------------------------------------------------------------------------------


4)	string Contains Only Digits

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="1f23";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		int cnt=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch<'0' || ch>'9')
			{
				cnt++;
			}
		}
		if(cnt==0)
		{
			System.out.println("contains only digit);
		}
		else
		{
			System.out.println("not contains only digit);
		}
	}
}

Output-
not contains only digit


---------------------------------------------------------------------------------------

5)sumOf The Digits Present In The Given String


public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1="a2ba1ca3d";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>'0' && ch<'9')
			{
				sum=sum+(ch-48);
			}
		}
		System.out.println(sum);
	}
}

Output-
6

----------------------------------------------------------------------------------------

6)Find Frequency Of each Character

import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "aabbcc";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			int count=0;
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
			if(cnt==0)
			{
				System.out.println(s1.charAt(i)+" "+count);
			}
		}
	}
}

Output-
a 2
b 2
c 2
	
-----------------------------------------------------------------------------------------------------------------------	
	

7)Index Of All The Characters Of The Alphabet


public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			System.out.println(i+" "+ch);
		}
	}
}

Output-
0 a
1 b
2 c
3 d


--------------------------------------------------------------------------------------------------------------------------

8)remove A Specified Character From AString

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1="Aabcd";
		char ch='a';
		myCode(s1,ch);
	}
	//EndOfMainMethod
	private static void myCode(String s1,char ch) 
	{
		//WriteCode Here
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=ch)
			{
				System.out.print(s1.charAt(i));
			}
		}
	}
}

Output-
Abcd
	
------------------------------------------------------------------------------------------------------------------------------
	

9)replace D with F	
	
	
import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "dddaa";
		char ch1='d';
		char ch2='f';
		myCode(s1,ch1,ch2);
	}
	//EndOfMainMethod
	private static void myCode(String s1,char ch1,char ch2) 
	{
		//write code here
		String s="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch1)
			{
				s=s+ch2;
			}
			else
			{
				s=s+s1.charAt(i);
			}
		}
		System.out.println(s);
	}
}
			
			
Output-
        fffaa
	
--------------------------------------------------------------------------------------------------------------------------------------	
	

10)String Convert To Upper Case


import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "welcome";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
			}
			s2=s2+ch;
		}
		System.out.println(s2);
	}
}

Output-
WELCOME

	
----------------------------------------------------------------------------------------------------------------------------------------


11)String Convert To LowerCase

import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "WELCOME";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
			}
			s2=s2+ch;
		}
		System.out.println(s2);
	}
}

Output-
welcome
	
-------------------------------------------------------------------------------------------------------------------------------	
	

12)remove Duplicate Ele From String

import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "abbcfedafbcd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				System.out.print(s1.charAt(i));
			}
		}
	}
}

Output-
abcfed
	
------------------------------------------------------------------------------------------------------------	
	
13)print All The Duplicates In  TheInput String
	
	
	public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcdabcd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		int cnt=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
		char[]c=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					System.out.print(c[i]);
					break;
				}
			}
		}
	}
}
			
			
Output-
4
abcd
	
	
---------------------------------------------------------------------------------------------------------------------	
	
14)sort Numbers In A String.
		
import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "43521";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		char []s2=s1.toCharArray();
		for(int i=0;i<s2.length;i++)
		{
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i]>s2[j])
				{
					char temp=s2[i];
					s2[i]=s2[j];
					s2[j]=temp;
				}
			}
		}
		s1=new String(s2);
		System.out.println(s1);
	}
}


Outpur-
	12345
	
	
---------------------------------------------------------------------------------------------------------------------	
	
15)String Array Sort By Length

	
import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "welcome to hef";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		String []c=s1.split(" ");
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i].length()>c[j].length())
				{
					String temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
			

Output-
	to hef welcome
	
	
------------------------------------------------------------------------------------------------------------------------------	
	
16)compare A Given String To The Specified character Sequence
	
	
	
	public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="bacd";
		myCode(s1,s2);
	}
	//EndOfMainMethod
	private static void myCode(String s1,String s2) 
	{
		//WriteCode Here
		int cnt=0;
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					cnt++;
					System.out.println(false);
					break;
				}
			}
			if(cnt==0)
			{
				System.out.println(true);
			}
		}
		else
		{
			System.out.println(false);
		}
	}
}
			
			
Output-
	false
	
----------------------------------------------------------------------------------------------------------------------------	

17)reverse Every Word In AS tring
	
	
import java.util.Iterator;
import java.util.Arrays;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "I am a good boy";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		String []s2=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			String s3=s2[i];
			String s4="";
			for(int j=0;j<s3.length();j++)
			{
				s4=s3.charAt(j)+s4;
			}
			s2[i]=s4;
		}
		for(int i=0;i<s2.length;i++)
		{
			System.out.print(s2[i]+"  ");
		}
	}
}
			
			
Output-
	I  ma  a  doog  yob  
	
----------------------------------------------------------------------------------------------------------------------------------	
	
18)	remove duplicate print unique count
	
	
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
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				cnt++;
			}
			if(cnt==0)
			{
				count++;
			}
		}
		System.out.println("new length of array : "+count);
	}
}
			

Output-
	new length of array : 6
		
		
------------------------------------------------------------------------------------------------------------------------------------		
		
19)lowest Frequency Of String Character 
		
		
import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "weLcome";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		char [] a=s1.toCharArray();
		char ch=0;
		int min=Integer.MAX_VALUE;;
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
			int cnt1=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt1++;
				}
			}
			if(cnt==0)
			{
				if(cnt1<min)
				{
					min=cnt1;
					ch=a[i];
				}
			}
		}
		System.out.println(min);
		System.out.println(ch);
	}
}
			
			
			
Output-
	1
	w
	
-----------------------------------------------------------------------------------------------------------------------	
	
	
20)Maximum Frequency Of String Character
	
import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "abcaabcb";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//Write code here
		char []a=s1.toCharArray();
		int max=0;
		char ch=0;
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
			int cnt1=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt1++;
				}
			}
			if(cnt==0)
			{
				if(cnt1>max)
				{
					max=cnt1;
					ch=a[i];
				}
			}
		}
		System.out.println(max);
		System.out.println(ch);
	}
}
			
			
			
Output-
	3
	a
	
--------------------------------------------------------------------------------------------------------------------------------	


22)Second Most Frequent Char
	
import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "abcad";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		char []a=s1.toCharArray();
		int max=0;
		char ch=0;
		int max2=0;
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
			int cnt1=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt1++;
				}
			}
			if(cnt==0)
			{
				if(cnt1>max)
				{
					max=cnt1;
				}
				if(cnt1>max2 && cnt1!=max)
				{
					max2=cnt1;
					ch=a[i];
				}
			}
		}
		System.out.println(ch+" "+max2);
	}
}

			
			
Output-
	b 1
	
	
	
	

23)find Largest & Smallest Word In A String.
	
	
import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "welcome to hefshine soft pvt ltd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		String [] a=s1.split(" ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].length()>a[j].length())
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("smallest word : "+a[0]);
		System.out.println("largest word: "+a[a.length-1]);
	}
}
			
			
			
Output-
       smallest word : to
       largest word: hefshine
	       
	       
	       
	       
	       
24)Get The Character At TheG iven Index
	       
	         
	       public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		int index=3;
		myCode(s1,index);
	}
	//EndOfMainMethod
	private static void myCode(String s1,int index) 
	{
		//write code here
		char []a=s1.toCharArray();
		if(index<a.length)
		{
			System.out.println(a[index]);
		}
		else
		{
			System.out.println("out of range index");
		}
	}
}

			
Output-
	d
	
	
	
25)ends with
	
	
	public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		String s2="efg";
		myCode(s1,s2);
	}
	//EndOfMainMethod
	private static void myCode(String s1,String s2) 
	{
		//write code here
		int cnt=0;
		if(s2.length()>s1.length())
		{
			System.out.println("false");
		}
		else
		{
			int j=s1.length()-1;
			int k=s2.length()-1;
			while(k>=0)
			{
				if(s1.charAt(j)!=s2.charAt(k))
				{
					cnt++;
				}
				j--;
				k--;
			}
			if(cnt==0)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
	}
}

			
			
output-
	false
	
	
	
26)start with
	
	
	public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="Priyaabcd";
		String s2 ="abcd";
		myCode(s1,s2);
	}
	//EndOfMainMethod
	private static void myCode(String s1,String s2) 
	{
		//write code here
		if(s1.length()>=s2.length())
		{
			int j=0;
			int cnt=0;
			while(j<s2.length())
			{
				if(s1.charAt(j)!=s2.charAt(j))
				{
					cnt++;
				}
				j++;
			}
			if(cnt==0)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}
		else
		{
			System.out.println(false);
		}
	}
}
			
			
			output-
				false
				
				
				
				
				
				
				
27)sort Array Like Dictionary
				
				
							
import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "welcome to hefshine";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		boolean b;
		String []s2=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			for(int j=i+1;j<s2.length;j++)
			{
				if(compair(s2[i],s2[j])>0)
				{
					String temp=s2[i];
					s2[i]=s2[j];
					s2[j]=temp;
				}
			}
			System.out.print(s2[i]+" ");
		}
	}
	public static int compair(String s1,String s2)
	{
		int leng=0;
		if(s1.length()<s2.length())
		{
			leng=s1.length();
		}
		else
		{
			s2.length();
		}
		for(int i=0;i<leng;i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
	}
}
			
		
Output-
	hefshine to welcome
	
	
	
28)	two strings lexicographically, ignoring casedifferences
	
	
	public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		String s2 ="abCd";
		myCode(s1,s2);
	}
	//EndOfMainMethod
	private static void myCode(String s1,String s2) 
	{
		//write code here
		int diff=mycompare(s1,s2);
		System.out.println(diff);
	}
	public static int mycompare(String s1,String s2)
	{
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		for(int i=0;i<s1.length() && i<s2.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
	}
}

			
			
Output-
	0
	
	
	
	
29)implement Trim Method
		
	
import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "   ab   cd  ";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		int start=0;
		int end=s1.length()-1;
		while(true)
		{
			if(s1.charAt(start)==' ')
			{
				start++;
			}
			else
			{
				break;
			}
		}
		while(true)
		{
			if(s1.charAt(end)==' ')
			{
				end--;
			}
			else
			{
				break;
			}
		}
           System.out.println("start : "+start);
           System.out.println("end : "+end);
		for(int i=start; i<=end; i++)
		{
			System.out.print(s1.charAt(i));
		}
	}
}

						
Output-
start : 3
end : 9
ab   cd
	
	
	
	
30)implement index Of Method
	
		
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		String s2="cd";
		myCode(s1,s2);
	}
	//EndOfMainMethod
	private static void myCode(String s1,String s2) 
	{
		//write code here
		if(s2.length()==0)
		{
			System.out.println(0);
		}
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					int j=i;
					int k=0;
					int cnt=0;
					while(j<s1.length() && k<s2.length())
					{
						if(s1.charAt(j)==s2.charAt(k))
						{
							cnt++;
						}
						else
						{
							break;
						}
						j++;
						k++;
					}
					if(cnt==s2.length())
					{
						System.out.println(i);
						break;
					}
					else
					{
						System.out.println(-1);
						break;
					}
				}
			}
		}
	}
}			
			
			
output-
	2

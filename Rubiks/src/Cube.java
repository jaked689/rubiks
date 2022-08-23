import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Cube {
	String[][] white,blue,orange,green,red,yellow;
	private int max;
	private String alg;
	private Map<Integer,Integer> map;
	private Map<Integer,String> map2;
	public Cube()
	{
		map=new HashMap();
		map2=new HashMap();
		max=0;
		alg="null";
		white=new String[3][3];
		blue=new String[3][3];
		orange=new String[3][3];
		green=new String[3][3];
		red=new String[3][3];
		yellow=new String[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				white[i][j]="W";
				blue[i][j]="B";
				orange[i][j]="O";
				green[i][j]="G";
				red[i][j]="R";
				yellow[i][j]="Y";
			}
		}
	}
	public String toString()
	{
		ArrayList<String[][]> cubic=new ArrayList<String[][]>();
		cubic.add(white);
		cubic.add(blue);
		cubic.add(orange);
		cubic.add(green);
		cubic.add(red);
		cubic.add(yellow);
		for(String[][] s:cubic)
		{
			for(int r=0;r<3;r++)
			{
				for(int c=0;c<3;c++)
				{
					System.out.print(s[r][c]);
				}
				System.out.println();
			}
			System.out.println();
		}
		return "";
	}
	public boolean isSolved()
	{
		boolean s=true;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(!white[i][j].equals("W"))s=false;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(!blue[i][j].equals("B"))s=false;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(!orange[i][j].equals("O"))s=false;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(!green[i][j].equals("G"))s=false;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(!red[i][j].equals("R"))s=false;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(!yellow[i][j].equals("Y"))s=false;
			}
		}
		return s;
	}
	public void rotate(String[][] face)

	{
		String t=face[0][0];
		face[0][0]=face[2][0];
		face[2][0]=face[2][2];
		face[2][2]=face[0][2];
		face[0][2]=t;
		t=face[0][1];
		face[0][1]=face[1][0];
		face[1][0]=face[2][1];
		face[2][1]=face[1][2];
		face[1][2]=t;	
	}
	public void r()
	{
		String temp=white[0][2];
		white[0][2]=blue[0][2];
		blue[0][2]=yellow[0][2];
		yellow[0][2]=green[2][0];
		green[2][0]=temp;
		temp=white[1][2];
		white[1][2]=blue[1][2];
		blue[1][2]=yellow[1][2];
		yellow[1][2]=green[1][0];
		green[1][0]=temp;
		temp=white[2][2];
		white[2][2]=blue[2][2];
		blue[2][2]=yellow[2][2];
		yellow[2][2]=green[0][0];
		green[0][0]=temp;
		rotate(orange);
	}
	public void rprime()
	{
		r();
		r();
		r();
	}
	public void u()
	{
		String t=blue[0][2];
		blue[0][2]=orange[0][2];
		orange[0][2]=green[0][2];
		green[0][2]=red[0][2];
		red[0][2]=t;
		t=blue[0][1];
		blue[0][1]=orange[0][1];
		orange[0][1]=green[0][1];
		green[0][1]=red[0][1];
		red[0][1]=t;
		t=blue[0][0];
		blue[0][0]=orange[0][0];
		orange[0][0]=green[0][0];
		green[0][0]=red[0][0];
		red[0][0]=t;
		rotate(white);
	}
	public void uprime()
	{
		u();
		u();
		u();
	}
	public void l()
	{
		String temp=white[0][0];
		white[0][0]=green[2][2];
		green[2][2]=yellow[0][0];
		yellow[0][0]=blue[0][0];
		blue[0][0]=temp;
		temp=white[1][0];
		white[1][0]=green[1][2];
		green[1][2]=yellow[1][0];
		yellow[1][0]=blue[1][0];
		blue[1][0]=temp;
		temp=white[2][0];
		white[2][0]=green[0][2];
		green[0][2]=yellow[2][0];
		yellow[2][0]=blue[2][0];
		blue[2][0]=temp;
		rotate(red);
	}
	public void lprime()
	{
		l();
		l();
		l();
	}
	public void d()
	{
		String temp=blue[2][0];
		blue[2][0]=red[2][0];
		red[2][0]=green[2][0];
		green[2][0]=orange[2][0];
		orange[2][0]=temp;
		temp=blue[2][1];
		blue[2][1]=red[2][1];
		red[2][1]=green[2][1];
		green[2][1]=orange[2][1];
		orange[2][1]=temp;
		temp=blue[2][2];
		blue[2][2]=red[2][2];
		red[2][2]=green[2][2];
		green[2][2]=orange[2][2];
		orange[2][2]=temp;
		rotate(yellow);
	}
	public void dprime()
	{
		d();
		d();
		d();
	}
	public void fprime()
	{
		String temp=red[0][2];
		red[0][2]=white[2][2];
		white[2][2]=orange[2][0];
		orange[2][0]=yellow[0][0];
		yellow[0][0]=temp;
		temp=red[1][2];
		red[1][2]=white[2][1];
		white[2][1]=orange[1][0];
		orange[1][0]=yellow[0][1];
		yellow[0][1]=temp;
		temp=red[2][2];
		red[2][2]=white[2][0];
		white[2][0]=orange[0][0];
		orange[0][0]=yellow[0][2];
		yellow[0][2]=temp;
		rotate(blue);
		rotate(blue);
		rotate(blue);
	}
	public void f()
	{
		fprime();
		fprime();
		fprime();
	}
	public void b()
	{
		String temp=red[0][0];
		red[0][0]=white[0][2];
		white[0][2]=orange[2][2];
		orange[2][2]=yellow[2][0];
		yellow[2][0]=temp;
		temp=red[1][0];
		red[1][0]=white[0][1];
		white[0][1]=orange[1][2];
		orange[1][2]=yellow[2][1];
		yellow[2][1]=temp;
		temp=red[2][0];
		red[2][0]=white[0][0];
		white[0][0]=orange[0][2];
		orange[0][2]=yellow[2][2];
		yellow[2][2]=temp;
		rotate(green);
	}
	public void bprime()
	{
		b();
		b();
		b();
	}
	public void convert(String s)
	{
		while(s.length()>0)
		{
			if(s.substring(0,1).equals("b"))b();
			if(s.substring(0,1).equals("a"))bprime();
			if(s.substring(0,1).equals("9"))dprime();
			if(s.substring(0,1).equals("8"))d();
			if(s.substring(0,1).equals("7"))lprime();
			if(s.substring(0,1).equals("6"))fprime();
			if(s.substring(0,1).equals("5"))uprime();
			if(s.substring(0,1).equals("4"))l();
			if(s.substring(0,1).equals("3"))rprime();
			if(s.substring(0,1).equals("2"))f();
			if(s.substring(0,1).equals("1"))u();
			if(s.substring(0,1).equals("0"))r();
			s=s.substring(1);
		}
	}
	public int num(String alg)
	{
		int count=0;
		while(!isSolved()||count==0)
		{
			convert(alg);
			count++;
		}
		return count;
	}
	public String con(int[] it)
	{
		String ret="";
		for(int i=0;i<it.length;i++)
		{
			if(it[i]==10)ret+="a";
			else if(it[i]==11)ret+="b";
			else ret+=it[i];
		}
		return ret;
	}
	public int sum(int[] a)
	{
		int count=0;
		for(int i:a)
		{
			count+=i;
		}
		return count;
	}
	public int[] fix(int[] a)
	{
		for(int i=a.length-1;i>0;i--)
		{
			if(a[i]==12)
			{
				a[i]=0;
				a[i-1]+=1;
			}
		}
		return a;
	}
	public void maxIter(int leng)
	{
		int[] count=new int[leng];
		while(sum(count)<=11*leng)
		{
			count=fix(count);
			if(num(con(count))>=max)
			{
				max=num(con(count));
				alg=con(count);
			}
			if(!map.containsKey(num(con(count))))
				{
					map.put(num(con(count)),0);
					map2.put(num(con(count)),change(con(count)));
				}
			map.put(num(con(count)),map.get(num(con(count)))+1);
			count[leng-1]+=1;
		}
	}
	public static String change(String al)
	{
		String ret="";
		for(int i=0;i<al.length();i++)
		{
			if(al.substring(i,i+1).equals("b"))ret+="b ";
			if(al.substring(i,i+1).equals("a"))ret+="b' ";
			if(al.substring(i,i+1).equals("9"))ret+="d' ";
			if(al.substring(i,i+1).equals("8"))ret+="d ";
			if(al.substring(i,i+1).equals("7"))ret+="l' ";
			if(al.substring(i,i+1).equals("6"))ret+="f' ";
			if(al.substring(i,i+1).equals("5"))ret+="u' ";
			if(al.substring(i,i+1).equals("4"))ret+="l ";
			if(al.substring(i,i+1).equals("3"))ret+="r' ";
			if(al.substring(i,i+1).equals("2"))ret+="f ";
			if(al.substring(i,i+1).equals("1"))ret+="u ";
			if(al.substring(i,i+1).equals("0"))ret+="r ";
		}
		return ret.substring(0,ret.length()-1);
	}
	public void print()
	{
		System.out.println("Algorithm: "+change(alg)+" - "+max+" iterations");
	}
	public void printMap()
	{
		Object[] arr=map.keySet().toArray();
		Object[] arr2=map2.keySet().toArray();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Iterations: "+arr[i]+" - "+map.get(arr[i])+" instances - Example: "+map2.get(arr2[i]));
		}
		System.out.println("Total Length: "+arr.length);
	}
	public void setFaces(String code)
	{
		ArrayList<String[][]> cubic=new ArrayList<String[][]>();
		cubic.add(white);
		cubic.add(blue);
		cubic.add(orange);
		cubic.add(green);
		cubic.add(red);
		cubic.add(yellow);
		int w=0,g=0,o=0,re=0,b=0,y=0;
		for(String[][] s:cubic)
		{
			for(int r=0;r<3;r++)
			{
				for(int c=0;c<3;c++)
				{
					s[r][c]=code.substring(0,1);
					if(code.substring(0,1).equals("W"))w++;
					if(code.substring(0,1).equals("B"))b++;
					if(code.substring(0,1).equals("O"))o++;
					if(code.substring(0,1).equals("G"))g++;
					if(code.substring(0,1).equals("R"))re++;
					if(code.substring(0,1).equals("Y"))y++;
					code=code.substring(1);
				}
			}
		}
		if(w!=9||b!=9||o!=9||g!=9||re!=9||y!=9)
			System.out.println("<CUBE PATTERN ENTERED INCORRECTLY>");
	}
}

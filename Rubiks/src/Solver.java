
public class Solver {
	private Cube c;
	private String tot;
	public Solver(Cube cu)
	{
		tot="";
		c=cu;
	}
	public void setFirstWhite()
	{
		if(c.white[1][2].equals("W"))return;
		if(c.orange[1][2].equals("W")||c.green[1][0].equals("W"))
		{
			c.r();
			c.dprime();
			c.rprime();
			tot+="r d' r' ";
		}
		if(c.red[1][0].equals("W")||c.green[1][2].equals("W"))
		{
			c.lprime();
			c.d();
			c.l();
			tot+="l' d l ";
		}
		if(c.blue[0][1].equals("W"))
		{
			c.f();
			c.f();
			tot+="f f ";
		}
		if(c.red[0][1].equals("W"))
		{
			c.l();
			c.l();
			tot+="l l ";
		}
		if(c.green[0][1].equals("W"))
		{
			c.b();
			c.b();
			tot+="b b ";
		}
		if(c.orange[0][1].equals("W"))
		{
			c.r();
			c.r();
			tot+="r r ";
		}
		if(c.blue[1][0].equals("W")||c.red[1][2].equals("W"))
		{
			c.fprime();
			tot+="f' ";
		}
		if(c.orange[1][0].equals("W")||c.blue[1][2].equals("W"))
		{
			c.f();
			tot+="f ";
		}
		while(!c.blue[2][1].equals("W")&&!c.yellow[0][1].equals("W"))
		{
			c.d();
			tot+="d ";
		}
		if(c.yellow[0][1].equals("W"))
		{
			c.f();
			c.f();
			tot+="f f ";
		}
		else
		{
			c.d();
			c.r();
			c.fprime();
			c.rprime();
			tot+="d r f' r' ";
		}
		while(!c.white[1][2].equals("W"))
		{
			c.u();
			tot+="u ";
		}
		tot+="";
	}
	public void setSecondWhite()
	{
		if(c.orange[1][2].equals("W")||c.green[1][0].equals("W"))
		{
			c.r();
			c.dprime();
			c.rprime();
			tot+="r d' r' ";
		}
		if(c.red[1][0].equals("W")||c.green[1][2].equals("W"))
		{
			c.lprime();
			c.d();
			c.l();
			tot+="l' d l ";
		}
		if(c.blue[0][1].equals("W"))
		{
			c.f();
			c.f();
			tot+="f f ";
		}
		if(c.red[0][1].equals("W"))
		{
			c.l();
			c.l();
			tot+="l l ";
		}
		if(c.green[0][1].equals("W"))
		{
			c.b();
			c.b();
			tot+="b b ";
		}
		if(c.blue[1][0].equals("W")||c.red[1][2].equals("W"))
		{
			c.fprime();
			tot+="f' ";
		}
		if(c.orange[1][0].equals("W")||c.blue[1][2].equals("W"))
		{
			c.f();
			tot+="f ";
		}
		while(!c.blue[2][1].equals("W")&&!c.yellow[0][1].equals("W"))
		{
			c.d();
			tot+="d ";
		}
		if(c.yellow[0][1].equals("W"))
		{
			c.f();
			c.f();
			tot+="f f ";
		}
		else
		{
			c.d();
			c.r();
			c.fprime();
			c.rprime();
			tot+="d r f' r' ";
		}
		if(c.white[1][0].equals("W"))
		{
			c.l();
			c.uprime();
			c.lprime();
			c.u();
			tot+="l u' l' u ";
		}
		if(c.white[2][1].equals("W"))
		{
			c.uprime();
			tot+="u' ";
		}
		tot+="";
	}
	public void setThirdWhite()
	{
		if(c.orange[1][2].equals("W")||c.green[1][0].equals("W"))
		{
			c.r();
			c.dprime();
			c.rprime();
			tot+="r d' r' ";
		}
		if(c.red[1][0].equals("W")||c.green[1][2].equals("W"))
		{
			c.lprime();
			c.d();
			c.l();
			tot+="l' d l ";
		}
		if(c.blue[0][1].equals("W"))
		{
			c.f();
			c.f();
			tot+="f f ";
		}
		if(c.red[0][1].equals("W"))
		{
			c.l();
			c.l();
			tot+="l l ";
		}
		if(c.blue[1][0].equals("W")||c.red[1][2].equals("W"))
		{
			c.fprime();
			tot+="f' ";
		}
		if(c.orange[1][0].equals("W")||c.blue[1][2].equals("W"))
		{
			c.f();
			tot+="f ";
		}
		if(c.red[1][2].equals("W"))
		{
			c.fprime();
			tot+="f' ";
		}
		while(!c.blue[2][1].equals("W")&&!c.yellow[0][1].equals("W"))
		{
			c.d();
			tot+="d ";
		}
		if(c.yellow[0][1].equals("W"))
		{
			c.f();
			c.f();
			tot+="f f ";
		}
		else
		{
			c.d();
			c.r();
			c.fprime();
			c.rprime();
			tot+="d r f' r' ";
		}
		if(!c.white[1][0].equals("W"))
		{
			c.uprime();
			tot+="u' ";
		}
		if(!c.white[1][2].equals("W"))
		{
			c.u();
			tot+="u ";
		}
		if(!c.white[0][1].equals("W"))
		{
			c.u();
			c.u();
			tot+="u u ";
		}
		tot+="";
	}
	public void setLastWhite()
	{
		if(c.white[2][1].equals("W"))
			{
			tot+="";
				return;
			}
		if(c.orange[1][2].equals("W")||c.green[1][0].equals("W"))
		{
			c.r();
			c.dprime();
			c.rprime();
			tot+="r d' r' ";
		}
		if(c.red[1][0].equals("W")||c.green[1][2].equals("W"))
		{
			c.lprime();
			c.d();
			c.l();
			tot+="l' d l ";
		}
		if(c.blue[0][1].equals("W"))
		{
			c.f();
			c.f();
			tot+="f f ";
		}
		if(c.blue[1][0].equals("W")||c.red[1][2].equals("W"))
		{
			c.fprime();
			tot+="f' ";
		}
		if(c.orange[1][0].equals("W")||c.blue[1][2].equals("W"))
		{
			c.f();
			tot+="f ";
		}
		while(!c.blue[2][1].equals("W")&&!c.yellow[0][1].equals("W"))
		{
			c.d();
			tot+="d ";
		}
		if(c.yellow[0][1].equals("W"))
		{
			c.f();
			c.f();
			tot+="f f ";
		}
		else
		{
			c.d();
			c.r();
			c.fprime();
			c.rprime();
			tot+="d r f' r' ";
		}
		tot+="";
	}
	public void fixWhite()
	{
		while(!c.blue[0][1].equals("B"))
		{
			c.u();
			tot+="u ";
		}
		if(c.green[0][1].equals("G")&&!c.orange[0][1].equals("O"))
		{
			c.r();
			c.r();
			c.l();
			c.l();
			c.d();
			c.d();
			c.r();
			c.r();
			c.l();
			c.l();
			tot+="r r l l d d r r l l ";
		}
		if(!c.orange[0][1].equals("O")&&!c.green[0][1].equals("G")&&!c.red[0][1].equals("R"))
		{
			while(!c.orange[0][1].equals("O")&&!c.green[0][1].equals("G")&&!c.red[0][1].equals("R"))
			{
				c.f();
				c.u();
				c.fprime();
				c.uprime();
				c.f();
				c.u();
				tot+="f u f' u' f u ";
			}
		}
		if(c.red[0][1].equals("G"))
		{
			c.l();
			c.u();
			c.u();
			c.lprime();
			c.uprime();
			c.l();
			c.uprime();
			c.lprime();
			c.uprime();
			tot+="l u u l' u' l u' l' u' ";
		}
		if(c.orange[0][1].equals("G"))
		{
			c.b();
			c.u();
			c.u();
			c.bprime();
			c.uprime();
			c.b();
			c.uprime();
			c.bprime();
			c.uprime();
			tot+="b u u b' u' b u' b' u' ";
		}
		tot+="";
	}
	public int numOfWhite()
	{
		int count=0;
		if(c.white[0][1].equals("W"))count++;
		if(c.white[1][0].equals("W"))count++;
		if(c.white[2][1].equals("W"))count++;
		if(c.white[1][2].equals("W"))count++;
		return count;
	}
	public void get()
	{
		System.out.println(tot);
	}
	public void cross()
	{
		tot+="Unaligned Cross: ";
		setFirstWhite();
		setSecondWhite();
		setThirdWhite();
		setLastWhite();
		tot+="\nAligned Cross: ";
		fixWhite();
	}
	public void firstCorner()
	{
		if(!c.white[2][2].equals("W"))
		{	
			if(c.blue[2][2].equals("W"))
			{
				c.dprime();
				c.rprime();
				c.d();
				c.r();
				tot+="d' r' d r ";
			}
			else if(c.blue[2][0].equals("W"))
			{
				c.d();
				c.d();
				c.f();
				c.dprime();
				c.fprime();
				tot+="d d f d' f' ";
			}
			else if(c.blue[0][0].equals("W"))
			{
				c.l();
				c.dprime();
				c.lprime();
				c.d();
				c.rprime();
				c.d();
				c.r();
				tot+="l d' l' d r' d r ";
			}
			else if(c.blue[0][2].equals("W"))
			{
				c.rprime();
				c.d();
				c.r();
				c.dprime();
				c.rprime();
				c.d();
				c.r();
				tot+="r' d r d' r' d r ";
			}
			else if(c.orange[0][0].equals("W"))
			{
				c.f();
				c.dprime();
				c.fprime();
				c.d();
				c.f();
				c.dprime();
				c.fprime();
				tot+="f d' f' d f d' f' ";
			}
			else if(c.orange[0][2].equals("W"))
			{
				c.r();
				c.dprime();
				c.dprime();
				c.rprime();
				c.rprime();
				c.d();
				c.r();
				tot+="r d' d' r' r' d r ";
			}
			else if(c.orange[2][0].equals("W"))
			{
				c.rprime();
				c.dprime();
				c.r();
				tot+="r' d' r ";
			}
			else if(c.orange[2][2].equals("W"))
			{
				c.dprime();
				c.dprime();
				c.rprime();
				c.dprime();
				c.r();
				tot+="d' d' r' d' r ";
			}
			else if(c.green[0][0].equals("W"))
			{
				c.r();
				c.dprime();
				c.rprime();
				c.f();
				c.dprime();
				c.fprime();
				tot+="r d' r' f d' f' ";
			}
			else if(c.green[0][2].equals("W"))
			{
				c.b();
				c.dprime();
				c.dprime();
				c.bprime();
				c.dprime();
				c.rprime();
				c.d();
				c.r();
				tot+="b d' d' b' d' r' d r ";
			}
			else if(c.green[2][0].equals("W"))
			{
				c.f();
				c.dprime();
				c.fprime();
				tot+="f d' f' ";
			}
			else if(c.green[2][2].equals("W"))
			{
				c.rprime();
				c.dprime();
				c.dprime();
				c.r();
				tot+="r' d' d' r ";
			}
			else if(c.red[0][0].equals("W"))
			{
				c.lprime();
				c.dprime();
				c.l();
				c.f();
				c.dprime();
				c.fprime();
				tot+="l' d' l f d' f' ";
			}
			else if(c.red[0][2].equals("W"))
			{
				c.l();
				c.rprime();
				c.d();
				c.lprime();
				c.r();
				tot+="l r' d l' r ";
			}
			else if(c.red[2][0].equals("W"))
			{
				c.f();
				c.dprime();
				c.dprime();
				c.fprime();
				tot+="f d' d' f' ";
			}
			else if(c.red[2][2].equals("W"))
			{
				c.rprime();
				c.d();
				c.r();
				tot+="r' d r ";
			}
			else if(!c.yellow[2][2].equals("W"))
			{
				while(!c.yellow[2][2].equals("W"))
				{
					c.dprime();
					tot+="d' ";
				}
			}
			if(c.yellow[2][2].equals("W"))
			{
				c.r();
				c.dprime();
				c.rprime();
				c.rprime();
				c.d();
				c.r();
				tot+="r d' r' r' d r ";
			}
		}
		tot+="";
	}
	public void secondCorner()
	{
		if(!c.white[0][2].equals("W"))
		{
		if(c.blue[0][0].equals("W"))
		{
			c.fprime();
			c.dprime();
			c.f();
			c.r();
			c.dprime();
			c.rprime();
			tot+="f' d' f r d' r' ";
		}
		else if(c.blue[2][0].equals("W"))
		{
			c.r();
			c.dprime();
			c.dprime();
			c.rprime();
			tot+="r d' d' r' ";
		}
		else if(c.blue[2][2].equals("W"))
		{
			c.bprime();
			c.d();
			c.b();
			tot+="b' d b ";
		}
		else if(c.orange[0][2].equals("W"))
		{
			c.r();
			c.d();
			c.rprime();
			c.d();
			c.bprime();
			c.dprime();
			c.dprime();
			c.b();
			tot+="r d r' d b' d' d' b ";
		}
		else if(c.orange[2][0].equals("W"))
		{
			c.dprime();
			c.r();
			c.dprime();
			c.dprime();
			c.rprime();
			tot+="d' r d' d' r' ";
		}
		else if(c.orange[2][2].equals("W"))
		{
			c.dprime();
			c.bprime();
			c.d();
			c.b();
			tot+="d' b' d b ";
		}
		else if(c.green[0][0].equals("W"))
		{
			c.r();
			c.dprime();
			c.rprime();
			c.d();
			c.r();
			c.dprime();
			c.rprime();
			tot+="r d' r' d r d' r' ";
		}
		else if(c.green[0][2].equals("W"))
		{
			c.b();
			c.d();
			c.bprime();
			c.bprime();
			c.dprime();
			c.dprime();
			c.b();
			tot+="b d b' b' d' d' b ";
		}
		else if(c.green[2][0].equals("W"))
		{
			c.d();
			c.r();
			c.dprime();
			c.rprime();
			tot+="d r d' r' ";
		}
		else if(c.green[2][2].equals("W"))
		{
			c.dprime();
			c.r();
			c.d();
			c.rprime();
			tot+="d' r d r' ";
		}
		else if(c.red[0][0].equals("W"))
		{
			c.lprime();
			c.dprime();
			c.l();
			c.bprime();
			c.dprime();
			c.b();
			tot+="l' d' l b' d' b ";
		}
		else if(c.red[0][2].equals("W"))
		{
			c.fprime();
			c.d();
			c.f();
			c.d();
			c.bprime();
			c.d();
			c.b();
			tot+="f' d f d b' d b ";
		}
		else if(c.red[2][0].equals("W"))
		{
			c.r();
			c.dprime();
			c.rprime();
			tot+="r d' r' ";
		}
		else if(c.red[2][2].equals("W"))
		{
			c.bprime();
			c.dprime();
			c.dprime();
			c.b();
			tot+="b' d' d' b ";
		}
		else if(!c.yellow[2][2].equals("W"))
		{
			while(!c.yellow[2][2].equals("W"))
			{
				c.dprime();
				tot+="d' ";
			}
		}
		if(c.yellow[2][2].equals("W"))
		{
			c.bprime();
			c.d();
			c.b();
			c.r();
			c.d();
			c.d();
			c.rprime();
			tot+="b' d b r d d r' ";
		}
		}
		tot+="";
	}
	public void transfer()
	{
		c.rprime();
		c.dprime();
		c.r();
		c.l();
		c.d();
		c.lprime();
		tot+="r' d' r l d l' ";
		c.bprime();
		c.dprime();
		c.b();
		c.lprime();
		c.dprime();
		c.dprime();
		c.l();
		tot+="b' d' b l' d' d' l ";
	}
	public void fixCorners()
	{
		if(c.orange[0][2].equals("B")&&(c.green[0][0].equals("O")))
		{
			c.rprime();
			c.dprime();
			c.r();
			c.bprime();
			c.dprime();
			c.dprime();
			c.b();
			c.rprime();
			c.d();
			c.r();
			tot+="r' d' r b' d' d' b r' d r ";
		}
		if(c.green[0][2].equals("B")&&c.red[0][0].equals("O"))
		{
			c.rprime();
			c.dprime();
			c.r();
			c.d();
			c.lprime();
			c.dprime();
			c.dprime();
			c.l();
			c.dprime();
			c.rprime();
			c.d();
			c.r();
			tot+="r' d' r d l' d' d' l d' r' d r ";
		}
		if(c.red[0][2].equals("B")&&c.blue[0][0].equals("O"))
		{
			c.l();
			c.d();
			c.lprime();
			c.rprime();
			c.dprime();
			c.r();
			c.dprime();
			c.fprime();
			c.d();
			c.f();
			tot+="l d l' r' d' r d' f' d f ";
		}
		tot+="";
		if(c.green[0][2].equals("O")&&c.red[0][0].equals("G"))
		{
			c.bprime();
			c.d();
			c.b();
			c.d();
			c.d();
			c.b();
			c.dprime();
			c.bprime();
			c.dprime();
			c.dprime();
			c.bprime();
			c.d();
			c.b();
			tot+="b' d b d d b d' b' d' d' b' d b ";
		}
		if(c.red[0][2].equals("O")&&c.blue[0][0].equals("G"))
		{
			c.l();
			c.dprime();
			c.lprime();
			c.bprime();
			c.d();
			c.d();
			c.b();
			c.dprime();
			c.fprime();
			c.d();
			c.f();
			tot+="l d' l' b' d d b d' f' d f ";
		}
		tot+="";
		if(c.red[0][2].equals("G")&&c.blue[0][0].equals("R"))
		{
			c.l();
			c.dprime();
			c.lprime();
			c.dprime();
			c.b();
			c.d();
			c.bprime();
			c.d();
			c.l();
			c.dprime();
			c.lprime();
			tot+="l d' l' d' b d b' d l d' l' ";
		}
		tot+="";
	}
	public void firstLayer()
	{
		cross();
		tot+="\nFirst 2 Corners: ";
		firstCorner();
		secondCorner();
		transfer();
		tot+="\nSecond 2 Corners: ";
		firstCorner();
		secondCorner();
		tot+="\nAligned Corners: ";
		fixCorners();
	}
	public void blueOrange()
	{
		if(c.blue[1][2].equals("O")&&c.orange[1][0].equals("B"))
		{
			c.rprime();
			c.d();
			c.r();
			c.d();
			c.f();
			c.dprime();
			c.fprime();
			tot+="r' d r d f d' f' ";
		}
		if((c.orange[1][2].equals("B")&&c.green[1][0].equals("O"))||(c.orange[1][2].equals("O")&&c.green[1][0].equals("B")))
		{
			c.r();
			c.dprime();
			c.rprime();
			c.dprime();
			c.bprime();
			c.d();
			c.b();
			tot+="r d' r' d' b' d b ";
		}
		if((c.green[1][2].equals("O")&&c.red[1][0].equals("B"))||(c.green[1][2].equals("B")&&c.red[1][0].equals("O")))
		{
			c.b();
			c.dprime();
			c.bprime();
			c.dprime();
			c.lprime();
			c.d();
			c.l();
			tot+="b d' b' d' l' d l ";
		}
		if((c.red[1][2].equals("B")&&c.blue[1][0].equals("O"))||(c.red[1][2].equals("O")&&c.blue[1][0].equals("B")))
		{
			c.l();
			c.dprime();
			c.lprime();
			c.dprime();
			c.fprime();
			c.d();
			c.f();
			tot+="l d' l' d' f' d f ";
		}
		if((c.orange[2][1].equals("B")&&c.yellow[1][2].equals("O"))||(c.green[2][1].equals("B")&&c.yellow[2][1].equals("O"))
				||(c.red[2][1].equals("B")&&c.yellow[1][0].equals("O"))||(c.blue[2][1].equals("B")&&c.yellow[0][1].equals("O")))
		{
			while(!(c.blue[2][1].equals("B")&&c.yellow[0][1].equals("O")))
			{
				c.d();
				tot+="d ";
			}
			c.dprime();
			c.rprime();
			c.d();
			c.r();
			c.d();
			c.f();
			c.dprime();
			c.fprime();
			tot+="d' r' d r d f d' f' ";
		}
		if((c.orange[2][1].equals("O")&&c.yellow[1][2].equals("B"))||(c.green[2][1].equals("O")&&c.yellow[2][1].equals("B"))
				||(c.red[2][1].equals("O")&&c.yellow[1][0].equals("B"))||(c.blue[2][1].equals("O")&&c.yellow[0][1].equals("B")))
		{
			while(!(c.blue[2][1].equals("O")&&c.yellow[0][1].equals("B")))
			{
				c.d();
				tot+="d ";
			}
			c.dprime();
			c.dprime();
			c.f();
			c.dprime();
			c.fprime();
			c.dprime();
			c.rprime();
			c.d();
			c.r();
			tot+="d' d' f d' f' d' r' d r ";
		}
		tot+="";
	}
	public void greenRed() 
	{
		if(c.green[1][2].equals("R")&&c.red[1][0].equals("G"))
		{
			c.b();
			c.dprime();
			c.bprime();
			c.dprime();
			c.lprime();
			c.d();
			c.l();
			tot+="b d' b' d' l' d l ";
		}
		if((c.red[1][2].equals("G")&&c.blue[1][0].equals("R"))||(c.red[1][2].equals("R")&&c.blue[1][0].equals("G")))
		{
			c.l();
			c.dprime();
			c.lprime();
			c.dprime();
			c.fprime();
			c.d();
			c.f();
			tot+="l d' l' d' f' d f ";
		}
		if((c.blue[2][1].equals("G")&&c.yellow[0][1].equals("R"))||(c.green[2][1].equals("G")&&c.yellow[2][1].equals("R"))
				||(c.red[2][1].equals("G")&&c.yellow[1][0].equals("R"))||(c.orange[2][1].equals("G")&&c.yellow[1][2].equals("R")))
		{
			while(!(c.green[2][1].equals("G")&&c.yellow[2][1].equals("R")))
			{
				c.d();
				tot+="d ";
			}
			c.dprime();
			c.lprime();
			c.d();
			c.l();
			c.d();
			c.b();
			c.dprime();
			c.bprime();
			tot+="d' l' d l d b d' b' ";
		}
		if((c.blue[2][1].equals("R")&&c.yellow[0][1].equals("G"))||(c.green[2][1].equals("R")&&c.yellow[2][1].equals("G"))
				||(c.red[2][1].equals("R")&&c.yellow[1][0].equals("G"))||(c.orange[2][1].equals("R")&&c.yellow[1][2].equals("G")))
		{
			while(!(c.red[2][1].equals("R")&&c.yellow[1][0].equals("G")))
			{
				c.d();
				tot+="d ";
			}
			c.d();
			c.b();
			c.dprime();
			c.bprime();
			c.dprime();
			c.lprime();
			c.d();
			c.l();
			tot+="d b d' b' d' l' d l ";
		}
		tot+="";
	}
	public void orangeGreen()
	{
		if(c.orange[1][2].equals("G")&&c.green[1][0].equals("O"))
		{
			c.bprime();
			c.d();
			c.b();
			c.d();
			c.r();
			c.dprime();
			c.rprime();
			tot+="b' d b d r d' r' ";
		}
		if((c.green[1][2].equals("O")&&c.red[1][0].equals("G"))||(c.green[1][2].equals("G")&&c.red[1][0].equals("O")))
		{
			c.b();
			c.dprime();
			c.bprime();
			c.dprime();
			c.lprime();
			c.d();
			c.l();
			tot+="b d' b' d' l' d l ";
		}
		if((c.red[1][2].equals("G")&&c.blue[1][0].equals("O"))||(c.red[1][2].equals("O")&&c.blue[1][0].equals("G")))
		{
			c.l();
			c.dprime();
			c.lprime();
			c.dprime();
			c.fprime();
			c.d();
			c.f();
			tot+="l d' l' d' f' d f ";
		}
		if((c.blue[2][1].equals("G")&&c.yellow[0][1].equals("O"))||(c.green[2][1].equals("G")&&c.yellow[2][1].equals("O"))
				||(c.red[2][1].equals("G")&&c.yellow[1][0].equals("O"))||(c.orange[2][1].equals("G")&&c.yellow[1][2].equals("O")))
		{
			while(!(c.orange[2][1].equals("G")&&c.yellow[1][2].equals("O")))
			{
				c.d();
				tot+="d ";
			}
			c.dprime();
			c.dprime();
			c.r();
			c.dprime();
			c.rprime();
			c.dprime();
			c.bprime();
			c.d();
			c.b();
			tot+="d' d' r d' r' d' b' d b ";
		}
		if((c.blue[2][1].equals("O")&&c.yellow[0][1].equals("G"))||(c.green[2][1].equals("O")&&c.yellow[2][1].equals("G"))
				||(c.red[2][1].equals("O")&&c.yellow[1][0].equals("G"))||(c.orange[2][1].equals("O")&&c.yellow[1][2].equals("G")))
		{
			while(!(c.orange[2][1].equals("O")&&c.yellow[1][2].equals("G")))
			{
				c.d();
				tot+="d ";
			}
			c.dprime();
			c.bprime();
			c.d();
			c.b();
			c.d();
			c.r();
			c.dprime();
			c.rprime();
			tot+="d' b' d b d r d' r' ";
		}
		tot+="";
	}
	public void redBlue() 
	{
		if((c.red[1][2].equals("B")&&c.blue[1][0].equals("R")))
		{
			c.l();
			c.dprime();
			c.lprime();
			c.dprime();
			c.fprime();
			c.d();
			c.f();
			tot+="l d' l' d' f' d f ";
		}
		if(
				(c.blue[2][1].equals("B")&&c.yellow[0][1].equals("R"))
				||(c.green[2][1].equals("B")&&c.yellow[2][1].equals("R"))
				||(c.red[2][1].equals("B")&&c.yellow[1][0].equals("R"))
				||(c.orange[2][1].equals("B")&&c.yellow[1][2].equals("R")))
		{
			while(!(c.blue[2][1].equals("B")&&c.yellow[0][1].equals("R")))
			{
				c.d();
				tot+="d ";
			}
			c.d();
			c.l();
			c.dprime();
			c.lprime();
			c.dprime();
			c.fprime();
			c.d();
			c.f();
			tot+="d l d' l' d' f' d f ";
		}
		if((c.blue[2][1].equals("R")&&c.yellow[0][1].equals("B"))||(c.green[2][1].equals("R")&&c.yellow[2][1].equals("B"))
				||(c.red[2][1].equals("R")&&c.yellow[1][0].equals("B"))||(c.orange[2][1].equals("R")&&c.yellow[1][2].equals("B")))
		{
			while(!(c.red[2][1].equals("R")&&c.yellow[1][0].equals("B")))
			{
				c.d();
				tot+="d ";
			}
			c.dprime();
			c.fprime();
			c.d();
			c.f();
			c.d();
			c.l();
			c.dprime();
			c.lprime();
			tot+="d' f' d f d l d' l' ";
		}
		tot+="";
	}
	public void secondLayer()
	{
		blueOrange();
		orangeGreen();
		tot+="\nSecond 2 Edges: ";
		greenRed();
		redBlue();
	}
	public void bottomCross()
	{
		if(!c.yellow[0][1].equals("Y")&&!c.yellow[2][1].equals("Y")&&!c.yellow[1][2].equals("Y")&&!c.yellow[1][0].equals("Y"))
		{
			c.f();
			c.l();
			c.d();
			c.lprime();
			c.dprime();
			c.fprime();
			tot+="f l d l' d' f' ";
		}
		if(!(c.yellow[0][1].equals("Y")&&c.yellow[2][1].equals("Y"))&&!(c.yellow[1][0].equals("Y")&&c.yellow[1][2].equals("Y")))
		{
			while(!(c.yellow[0][1].equals("Y")&&c.yellow[1][0].equals("Y")))
			{
				c.d();
				tot+="d ";
			}
				c.b();
				c.d();
				c.r();
				c.dprime();
				c.rprime();
				c.bprime();
				tot+="b d r d' r' b' ";
			
		}
		if(!(c.yellow[0][1].equals("Y")&&c.yellow[2][1].equals("Y")&&c.yellow[1][2].equals("Y")&&c.yellow[1][0].equals("Y")))
		{
			while(c.yellow[0][1].equals("Y"))
			{
				c.d();
				tot+="d ";
			}
			c.b();
			c.r();
			c.d();
			c.rprime();
			c.dprime();
			c.bprime();
			tot+="b r d r' d' b' ";
		}
		tot+="";
	}
	public void allign()
	{
		int b=0,o=0,g=0,r=0;
		while(b+o+g+r<2)
		{
			b=0;
			o=0;
			g=0;
			r=0;
			c.d();
			tot+="d ";
			if(c.blue[1][1].equals(c.blue[2][1]))b++;
			if(c.red[1][1].equals(c.red[2][1]))r++;
			if(c.green[1][1].equals(c.green[2][1]))g++;
			if(c.orange[1][1].equals(c.orange[2][1]))o++;
			if(b+o+g+r==4)return;
		}
		if(b==1&&g==1)
		{
			 c.l();
	            c.d();
	            c.d();
	            c.lprime();
	            c.dprime();
	            c.l();
	            c.dprime();
	            c.lprime();
	            c.d();
	            c.l();
	            c.d();
	            c.d();
	            c.lprime();
	            c.dprime();
	            c.l();
	            c.dprime();
	            c.lprime();
	            c.d();
	            c.d();
	            tot+="l d d l' d' l d' l' d l d d l' d' l d' l' d d ";
	            return;
		}
		if(b==1&&o==1)
		{
			c.dprime();
			tot+="d' ";
		}
		if(o==1&&g==1)
		{
			c.d();
			c.d();
			tot+="d d ";
		}
		if(g==1&&r==1)
		{
			c.d();
			tot+="d ";
		}
		c.r();
		c.d();
		c.d();
		c.rprime();
		c.dprime();
		c.r();
		c.dprime();
		c.rprime();
		tot+="r d d r' d' r d' r' ";
		while(!c.blue[1][1].equals(c.blue[2][1]))
		{
			c.d();
			tot+="d ";
		}
		tot+="";
	}
	public boolean correct(int row,int col)
	{
		if(row==0&&col==0)
		{
			if(c.blue[2][0].equals("B")&&c.red[2][2].equals("R"))return true;
			if(c.blue[2][0].equals("R")&&c.yellow[0][0].equals("B"))return true;
			if(c.red[2][2].equals("B")&&c.yellow[0][0].equals("R"))return true;
		}
		if(row==0&&col==2)
		{
			if(c.blue[2][2].equals("B")&&c.orange[2][0].equals("O"))return true;
			if(c.blue[2][2].equals("O")&&c.yellow[0][2].equals("B"))return true;
			if(c.orange[2][0].equals("B")&&c.yellow[0][2].equals("O"))return true;
		}
		if(row==2&&col==0)
		{
			if(c.red[2][0].equals("R")&&c.green[2][2].equals("G"))return true;
			if(c.green[2][2].equals("R")&&c.yellow[2][0].equals("G"))return true;
			if(c.red[2][0].equals("G")&&c.yellow[2][0].equals("R"))return true;
		}
		if(row==2&&col==2)
		{
			if(c.orange[2][2].equals("O")&&c.green[2][0].equals("G"))return true;
			if(c.orange[2][2].equals("G")&&c.yellow[2][2].equals("O"))return true;
			if(c.green[2][0].equals("O")&&c.yellow[2][2].equals("G"))return true;
		}
		return false;
	}
	public void corners()
	{	
		if(correct(0,0)&&correct(2,0)&&correct(0,2)&&correct(2,2))return;
		if(!correct(0,0)&&!correct(2,0)&&!correct(0,2)&&!correct(2,2))
		{
			c.l();
			c.dprime();
			c.rprime();
			c.d();
			c.lprime();
			c.dprime();
			c.r();
			c.d();
			tot+="l d' r' d l' d' r d ";
		}
		if(correct(0,0))
		{
			c.d();
			tot+="d ";
		}
		else if(correct(2,2))
		{
			c.dprime();
			tot+="d' ";
		}
		else if(correct(2,0))
		{
			c.d();
			c.d();
			tot+="d d ";
		}
		c.l();
		c.dprime();
		c.rprime();
		c.d();
		c.lprime();
		c.dprime();
		c.r();
		c.d();
		tot+="l d' r' d l' d' r d ";
		while(!c.blue[1][1].equals(c.blue[2][1]))
		{
			c.d();
			tot+="d ";
		}
		if(correct(0,0)&&correct(2,0)&&correct(0,2)&&correct(2,2))return;
		if(correct(0,0))
		{
			c.d();
			tot+="d ";
		}
		else if(correct(2,2))
		{
			c.dprime();
			tot+="d' ";
		}
		else if(correct(2,0))
		{
			c.d();
			c.d();
			tot+="d d ";
		}
		c.l();
		c.dprime();
		c.rprime();
		c.d();
		c.lprime();
		c.dprime();
		c.r();
		c.d();
		tot+="l d' r' d l' d' r d ";
		while(!c.blue[1][1].equals(c.blue[2][1]))
		{
			c.d();
			tot+="d ";
		}
		tot+="";
	}
	public void fin()
	{
		boolean b=true;
		while(!(c.yellow[0][0].equals("Y")&&c.yellow[2][0].equals("Y")&&c.yellow[0][2].equals("Y")&&c.yellow[2][2].equals("Y")))
		{
			if(c.yellow[0][0].equals("Y"))
			{
				c.dprime();
				tot+="d' ";
			}
			else
			{
				c.lprime();
				c.uprime();
				c.l();
				c.u();
				tot+="l' u' l u ";
				if(b)tot+="";
			}
		}
		while(!c.blue[1][1].equals(c.blue[2][1]))
		{
			c.d();
			tot+="d ";
		}
		while(!c.blue[1][1].equals(c.blue[0][1]))
		{
			c.u();
			tot+="u ";
		}
		
	}
	public void solve()
	{
		firstLayer();
		tot+="\nFirst 2 Edges: ";
		secondLayer();
		tot+="\nBottom Cross: ";
		bottomCross();
		tot+="\nAligned Bottom Cross: ";
		allign();
		tot+="\nBottom Corners: ";
		corners();
		tot+="\nFinsished Cube: ";
		fin();
	}
	public void convert()
	{
		String temp="";
		while(tot.length()>=3)
		{
			if(tot.substring(0,3).equals("r' "))
			{
				temp+="000";
				tot=tot.substring(3);
			}
			else if(tot.substring(0,3).equals("l' "))
			{
				temp+="111";
				tot=tot.substring(3);
			}
			else if(tot.substring(0,3).equals("u' "))
			{
				temp+="222";
				tot=tot.substring(3);
			}
			else if(tot.substring(0,3).equals("d' "))
			{
				temp+="333";
				tot=tot.substring(3);
			}
			else if(tot.substring(0,3).equals("f' "))
			{
				temp+="444";
				tot=tot.substring(3);
			}
			else if(tot.substring(0,3).equals("b' "))
			{
				temp+="555";
				tot=tot.substring(3);
			}
			else if(tot.substring(0,2).equals("r "))
			{
				temp+="0";
				tot=tot.substring(2);
			}
			else if(tot.substring(0,2).equals("l "))
			{
				temp+="1";
				tot=tot.substring(2);
			}
			else if(tot.substring(0,2).equals("u "))
			{
				temp+="2";
				tot=tot.substring(2);
			}
			else if(tot.substring(0,2).equals("d "))
			{
				temp+="3";
				tot=tot.substring(2);
			}
			else if(tot.substring(0,2).equals("f "))
			{
				temp+="4";
				tot=tot.substring(2);
			}
			else if(tot.substring(0,2).equals("b "))
			{
				temp+="5";
				tot=tot.substring(2);
			}
		}
		if(tot.length()!=0)
		{
			if(tot.substring(0,2).equals("r "))
			{
				temp+="0";
				tot=tot.substring(2);
			}
			else if(tot.substring(0,2).equals("l "))
			{
				temp+="1";
				tot=tot.substring(2);
			}
			else if(tot.substring(0,2).equals("u "))
			{
				temp+="2";
				tot=tot.substring(2);
			}
			else if(tot.substring(0,2).equals("d "))
			{
				temp+="3";
				tot=tot.substring(2);
			}
			else if(tot.substring(0,2).equals("f "))
			{
				temp+="4";
				tot=tot.substring(2);
			}
			else if(tot.substring(0,2).equals("b "))
			{
				temp+="5";
				tot=tot.substring(2);
			}
		}
		tot=temp;
	}
	public void simplify()
	{
		for(int i=0;i<tot.length()-4;i++)
		{
			String a=tot.substring(i,i+1);
			if(tot.substring(i+1,i+2).equals(a)&&tot.substring(i+2,i+3).equals(a)&&tot.substring(i+3,i+4).equals(a))
				tot=tot.substring(0,i)+tot.substring(i+4);
		}
	}
	public void read()
	{
		String temp="";
		int stor=0;
		for(int i=1;tot.length()>0;i++)
		{
			if(tot.length()>2)
			{
				if(tot.substring(0,3).equals("000"))
				{
					temp+="r'";
					tot=tot.substring(3);
				}
				else if(tot.substring(0,3).equals("111"))
				{
					temp+="l'";
					tot=tot.substring(3);
				}
				else if(tot.substring(0,3).equals("222"))
				{
					temp+="u'";
					tot=tot.substring(3);
				}
				else if(tot.substring(0,3).equals("333"))
				{
					temp+="d'";
					tot=tot.substring(3);
				}
				else if(tot.substring(0,3).equals("444"))
				{
					temp+="f'";
					tot=tot.substring(3);
				}
				else if(tot.substring(0,3).equals("555"))
				{
					temp+="b'";
					tot=tot.substring(3);
				}
			}
			if(tot.length()==0)System.out.print("");
			else if(tot.substring(0,1).equals("0"))
			{
				temp+="r ";
				tot=tot.substring(1);
			}
			else if(tot.substring(0,1).equals("1"))
			{
				temp+="l ";
				tot=tot.substring(1);
			}
			else if(tot.substring(0,1).equals("2"))
			{
				temp+="u ";
				tot=tot.substring(1);
			}
			else if(tot.substring(0,1).equals("3"))
			{
				temp+="d ";
				tot=tot.substring(1);
			}
			else if(tot.substring(0,1).equals("4"))
			{
				temp+="f ";
				tot=tot.substring(1);
			}
			else if(tot.substring(0,1).equals("5"))
			{
				temp+="b ";
				tot=tot.substring(1);
			}
			if(i%25==0)temp+="\n";
			stor=i;
		}
		tot=temp;
		System.out.println("Moves: "+stor);
	}
	public String to()
	{
		return tot;
	}
}
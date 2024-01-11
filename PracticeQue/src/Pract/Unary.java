package Pract;

public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x=454;
    int y=56;
    int z;
     
      z=(x++)-(++y)-(--y)+(y++)+(x--)+(--x)+y+(x/2)+(y--);
      
      z=(x++)-(y*2)-(y--)-(++x)-(--y)-(y++)-y;
      
      z=(x--)-(y++)-(y--)-(--x)-(y++)-(x--)-(x/2);
      System.out.println(x+","+y+","+z);
	}

}

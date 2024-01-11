package Pract;
import java.util.Scanner;
public class Gamer {
    String name, achievement;
    int level, magic, melee, distance, defence, exp;
     
    public void setData(String n, String achiv, int lvl, int mage, int mel, int dist, int def, int ex)
    {
    	name=n;
    	achievement=achiv;
    	level=lvl;
    	magic=mage;
    	melee=mel;
    	distance=dist;
    	defence=def;
    	exp=ex;
    	
    }
    public void display()
    {
    	System.out.println("Player name = " + name);
    	System.out.println("Player achievement = " + achievement);
    	System.out.println("Player level = " + level);
    	System.out.println("Player magic = " + magic);
    	System.out.println("Player melee = " + melee);
    	System.out.println("Player distance = " + distance);
    	System.out.println("Player defence = " + defence);
    	System.out.println("Player exp = " + exp);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Gamer obj =new  Gamer();
		 obj.setData("suraj", "dragonslayerv", 390, 391, 334, 101, 411, 400000);
		 obj.display();
	}

}

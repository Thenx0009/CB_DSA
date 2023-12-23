package Leetcode;
import java.util.*;
public class Path_Crossing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "NESWW";
		System.out.println(isPathCrossing(path));
	}
	
	public static boolean isPathCrossing(String path) {
		HashSet<String> set = new HashSet<>();
		int x =0;
		int y =0;
		set.add(0+","+0);
        for(int i=0;i<path.length();i++) {
        	char dir = path.charAt(i);
        	if(dir=='N') {
        		y++;
        	}
        	else if(dir=='S') {
        		y--;
        	}
        	else if(dir=='E') {
        		x++;
        	}
        	else {
        		x--;
        	}
        	String coor = x+","+y;
        	if(set.contains(coor)) {
        		return true;
        	}
        	set.add(coor);
        }
        return false;
    }

}

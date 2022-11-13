/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pp843
 */
public class DFS {
    public static boolean searchPath(int[][] maze,int x,int y,List<Integer>path){
        if(maze[x][y]==9){
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[x][y]==0){
            maze[x][y]=2;
            
            int[] dx ={1,0,-1,0};
            int[] dy = {0,1,0,-1};
            
            for(int d=0; d<dx.length;d++){
                int newx = x+dx[d];
                int newy = y+dy[d];
                if(newx>=0 && newx<maze.length && newy>=0 && newy<maze[0].length && searchPath(maze,newx,newy,path))
                {  
                path.add(x);
                path.add(y);
                return true;
            }
        }
    }
    return false;
    }
    
    
public static void main(String[] args){
    DFS obj = new DFS();
    int[][] maze={
        {0,0,1},
        {0,1,9},
        {0,0,0},  
};
List<Integer> path=new ArrayList<Integer>();
boolean reach=obj.searchPath(maze, 0, 0, path);
for(int i=0;i<path.size();i++){
    System.out.print(path.get(i)+" ");
}
    }
}

import java.awt.*;

public class World {
    Integer ax,ay,bx,by,cx,cy,smileyx,smileyy;
    Integer size = 4;
    public World(Integer ax,Integer ay,Integer bx,Integer by, Integer cx, Integer cy, Integer sx, Integer sy) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
        this.cx = cx;
        this.cy = cy;
        this.smileyx = sx;
        this.smileyy = sy;
    }

    public World moveUp()
    {

        if(smileyx==0)
            return null;
        else
        {
           World newWorld = new World(ax,ay,bx,by,cx,cy,smileyx,smileyy);
           if(newWorld.ax == newWorld.smileyx-1 && newWorld.ay == newWorld.smileyy)
           {
               newWorld.ax = smileyx;
               newWorld.smileyx-=1;
           }
           else if(newWorld.bx == newWorld.smileyx-1 && newWorld.by == newWorld.smileyy)
               {
                   newWorld.bx = smileyx;
                   newWorld.smileyx-=1;
               }
                else if(newWorld.cx == newWorld.smileyx-1 && newWorld.cy == newWorld.smileyy)
                   {
                       newWorld.cx = smileyx;
                       newWorld.smileyx-=1;
                   }
                     else
                         newWorld.smileyx -=1;
           return newWorld;
        }
    }
    public World moveDown()
    {

        if(smileyx==size-1)
            return null;
        else
        {
            World newWorld = new World(ax,ay,bx,by,cx,cy,smileyx,smileyy);
            if(newWorld.ax == newWorld.smileyx+1 && newWorld.ay == newWorld.smileyy)
            {
                newWorld.ax = smileyx;
                newWorld.smileyx+=1;
            }
            else if(newWorld.bx == newWorld.smileyx+1 && newWorld.by == newWorld.smileyy)
            {
                newWorld.bx = smileyx;
                newWorld.smileyx+=1;
            }
            else if(newWorld.cx == newWorld.smileyx+1 && newWorld.cy == newWorld.smileyy)
            {
                newWorld.cx = smileyx;
                newWorld.smileyx+=1;
            }
            else
                newWorld.smileyx +=1;
            return newWorld;
        }
    }
    public World moveRight()
    {

        if(smileyy == size -1)
            return null;
        else
        {
            World newWorld = new World(ax,ay,bx,by,cx,cy,smileyx,smileyy);
            if(newWorld.ay == newWorld.smileyy+1 && newWorld.ax == newWorld.smileyx)
            {
                newWorld.ay = smileyy;
                newWorld.smileyy+=1;
            }
            else if(newWorld.by == newWorld.smileyy+1 && newWorld.bx == newWorld.smileyx)
            {
                newWorld.by = smileyy;
                newWorld.smileyy+=1;
            }
            else if(newWorld.cy == newWorld.smileyy+1 && newWorld.cx == newWorld.smileyx)
            {
                newWorld.cy = smileyy;
                newWorld.smileyy+=1;
            }
            else
                newWorld.smileyy +=1;
            return newWorld;
        }
    }
    public World moveLeft()
    {

        if(smileyy==0)
            return null;
        else
        {
            World newWorld = new World(ax,ay,bx,by,cx,cy,smileyx,smileyy);
            if(newWorld.ay == newWorld.smileyy-1 && newWorld.ax == newWorld.smileyx)
            {
                newWorld.ay = smileyy;
                newWorld.smileyy-=1;
            }
            else if(newWorld.by == newWorld.smileyy-1 && newWorld.bx == newWorld.smileyx)
            {
                newWorld.by = smileyy;
                newWorld.smileyy-=1;
            }
            else if(newWorld.cy == newWorld.smileyy-1 && newWorld.cx == newWorld.smileyx)
            {
                newWorld.cy = smileyy;
                newWorld.smileyy-=1;
            }
            else
                newWorld.smileyy -=1;
            return newWorld;
        }
    }
/*
    public void swap(Integer xx, Integer xy, Integer yx, Integer yy)
    {
        Integer auxx = xx, auxy=xy;
        xx = new Integer(yx);
        xy = new Integer(yy);
        yx = new Integer(auxx);
        yy = new Integer(auxy);
    }*/
    public void printWorld()
    {
        System.out.println("--------------------------------");
        for (int i = 0;i < 4 ; i++)
        {
            for (int j = 0; j < 4; j++)
                if(this.ax == i && this.ay == j)
                    System.out.print("-A-");
                else
                if(this.bx == i && this.by == j)
                    System.out.print("-B-");
                else
                if(this.cx == i && this.cy == j)
                    System.out.print("-C-");
                else
                if(this.smileyx == i && this.smileyy == j)
                    System.out.print("-:)-");
                else
                    System.out.print("-0-");
            System.out.println();

        }
        System.out.println("--------------------------------");

    }
    public Boolean checkGoal(World goal)
    {
        if(ax == goal.ax && ay == goal.ay && bx == goal.bx && by == goal.by && cx == goal.cx && cy == goal.cy)
            return true;
        else
            return false;
    }
}

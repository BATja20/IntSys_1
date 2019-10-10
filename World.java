import java.awt.*;

public class World {
    Point a,b,c,smiley;

    public World(Integer ax,Integer ay,Integer bx,Integer by, Integer cx, Integer cy, Integer sx, Integer sy) {
        a = new Point(ax, ay);
        b = new Point(bx, by);
        c = new Point(cx,cy);
        smiley = new Point(sx,sy);
    }

    public World moveUp()
    {

        if(smiley.x==0)
            return null;
        else
        {
           World newWorld = new World(a.x,a.y,b.x,b.y,c.x,c.y,smiley.x,smiley.y);
           if(newWorld.a.x == newWorld.smiley.x-1)
               swap(newWorld.smiley,newWorld.a);
           else if(newWorld.b.x == newWorld.smiley.x-1)
                    swap(newWorld.smiley,newWorld.b);
                else if(newWorld.c.x == newWorld.smiley.x-1)
                        newWorld.swap(newWorld.smiley,newWorld.c);
                     else
                         newWorld.smiley.x -=1;
           return newWorld;
        }
    }
    public World moveDown()
    {

        if(smiley.x==3)
            return null;
        else
        {
            World newWorld = new World(a.x,a.y,b.x,b.y,c.x,c.y,smiley.x,smiley.y);
            if(newWorld.a.x == newWorld.smiley.x+1)
                swap(newWorld.smiley,newWorld.a);
            else if(newWorld.b.x == newWorld.smiley.x+1)
                swap(newWorld.smiley,newWorld.b);
            else if(newWorld.c.x == newWorld.smiley.x+1)
                newWorld.swap(newWorld.smiley,newWorld.c);
            else
                newWorld.smiley.x +=1;
            return newWorld;
        }
    }
    public World moveRight()
    {

        if(smiley.y == 3)
            return null;
        else
        {
            World newWorld = new World(a.x,a.y,b.x,b.y,c.x,c.y,smiley.x,smiley.y);
            if(newWorld.a.y == newWorld.smiley.y+1)
                swap(newWorld.smiley,newWorld.a);
            else if(newWorld.b.y == newWorld.smiley.y+1)
                swap(newWorld.smiley,newWorld.b);
            else if(newWorld.c.y == newWorld.smiley.y+1)
                newWorld.swap(newWorld.smiley,newWorld.c);
            else
                newWorld.smiley.y +=1;
            return newWorld;
        }
    }
    public World moveLeft()
    {

        if(smiley.y==0)
            return null;
        else
        {
            World newWorld = new World(a.x,a.y,b.x,b.y,c.x,c.y,smiley.x,smiley.y);
            if(newWorld.a.y == newWorld.smiley.y-1)
                swap(newWorld.smiley,newWorld.a);
            else if(newWorld.b.y == newWorld.smiley.y-1)
                swap(newWorld.smiley,newWorld.b);
            else if(newWorld.c.y == newWorld.smiley.y-1)
                newWorld.swap(newWorld.smiley,newWorld.c);
            else
                newWorld.smiley.y -=1;
            return newWorld;
        }
    }

    public void swap(Point x , Point y)
    {
        Integer auxx = x.x, auxy=x.y;
        x.x = y.x;
        x.y = y.y;
        y.x = auxx;
        y.y = auxy;
    }

}

public class HeuristicWorld extends World
{
    World goalState= null;
    Integer misplacedTiles;
    Integer f ;
    public HeuristicWorld(Integer ax, Integer ay, Integer bx, Integer by, Integer cx, Integer cy, Integer sx, Integer sy,World goalState) {
        super(ax, ay, bx, by, cx, cy, sx, sy);
        this.goalState = goalState;
        //calcMisplacedTiles();
        f = manDistance(ax,ay,goalState.ax,goalState.ay) + manDistance(bx,by,goalState.bx,goalState.by) + manDistance(cx,cy,goalState.cx,goalState.cy);
    }
    public void calcMisplacedTiles()
    {
        misplacedTiles = size-1;
        if (ax==goalState.ax && ay == goalState.ay)
            misplacedTiles--;
        if (bx==goalState.bx && by == goalState.by)
            misplacedTiles--;
        if (cx==goalState.cx && cy == goalState.cy)
            misplacedTiles--;
    }

    public HeuristicWorld moveUp()
    {
        World w =super.moveUp();
        if (w==null)
            return null;
        else
            return new HeuristicWorld(w.ax,w.ay,w.bx,w.by,w.cx,w.cy,w.smileyx,w.smileyy,this.goalState);
    }
    public HeuristicWorld moveDown()
    {
        World w =super.moveDown();
        if (w==null)
            return null;
        else
            return new HeuristicWorld(w.ax,w.ay,w.bx,w.by,w.cx,w.cy,w.smileyx,w.smileyy,this.goalState);
    }
    public HeuristicWorld moveLeft()
    {
        World w =super.moveLeft();
        if (w==null)
            return null;
        else
            return new HeuristicWorld(w.ax,w.ay,w.bx,w.by,w.cx,w.cy,w.smileyx,w.smileyy,this.goalState);
    }
    public HeuristicWorld moveRight()
    {
        World w =super.moveRight();
        if (w==null)
            return null;
        else
            return new HeuristicWorld(w.ax,w.ay,w.bx,w.by,w.cx,w.cy,w.smileyx,w.smileyy,this.goalState);
    }

    public Integer manDistance(Integer x1, Integer y1, Integer x2, Integer y2)
    {
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
}

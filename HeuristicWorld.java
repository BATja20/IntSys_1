public class HeuristicWorld extends World
{
    World goalState= null;
    Integer misplacedTiles;
    public HeuristicWorld(Integer ax, Integer ay, Integer bx, Integer by, Integer cx, Integer cy, Integer sx, Integer sy,World goalState) {
        super(ax, ay, bx, by, cx, cy, sx, sy);
        this.goalState = goalState;
        calcMisplacedTiles();
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
}

import java.util.PriorityQueue;

public class AStar {
    World goalState = new World(1, 1, 2, 1, 3, 1, 0, 0);
    HeuristicWorld startState = new HeuristicWorld(3, 0, 3, 1, 3, 2, 3, 3, goalState);
    PriorityQueue<HeuristicNode> queue = new PriorityQueue<HeuristicNode>();

    public AStar()
    {
        queue.add(new HeuristicNode(startState,null,0));
    }

    public void AStar()
    {
        HeuristicNode goalNode = null;
        Integer i=0;
        while (true) {
            HeuristicNode currNode = queue.poll();
            currNode.world.printWorld();
            if (currNode.world.checkGoal(goalState)) {
                goalNode = currNode;
                break;
            }
            if (currNode.world.moveLeft() != null)
            {
                if(currNode.parent==null || currNode.world.moveLeft().isDifferent(currNode.parent.world))
                {
                    HeuristicWorld temp = new HeuristicWorld(currNode.world.moveLeft().ax, currNode.world.moveLeft().ay, currNode.world.moveLeft().bx, currNode.world.moveLeft().by, currNode.world.moveLeft().cx, currNode.world.moveLeft().cy, currNode.world.moveLeft().smileyx, currNode.world.moveLeft().smileyy, goalState);
                    temp.f = temp.f + currNode.world.f-2;
                    queue.add(new HeuristicNode(temp, currNode, currNode.level + 1));
                }
            }
            if (currNode.world.moveRight() != null)
            {
                if(currNode.parent==null || currNode.world.moveRight().isDifferent(currNode.parent.world))
                {
                    HeuristicWorld temp = new HeuristicWorld(currNode.world.moveRight().ax, currNode.world.moveRight().ay, currNode.world.moveRight().bx, currNode.world.moveRight().by, currNode.world.moveRight().cx, currNode.world.moveRight().cy, currNode.world.moveRight().smileyx, currNode.world.moveRight().smileyy, goalState);
                    temp.f = temp.f + currNode.world.f-2;
                    queue.add(new HeuristicNode(temp, currNode, currNode.level + 1));
                }
            }
            if (currNode.world.moveDown() != null) {
                if(currNode.parent==null || currNode.world.moveDown().isDifferent(currNode.parent.world))
                {
                    HeuristicWorld temp = new HeuristicWorld(currNode.world.moveDown().ax, currNode.world.moveDown().ay, currNode.world.moveDown().bx, currNode.world.moveDown().by, currNode.world.moveDown().cx, currNode.world.moveDown().cy, currNode.world.moveDown().smileyx, currNode.world.moveDown().smileyy, goalState);
                    temp.f = temp.f + currNode.world.f-2;
                    queue.add(new HeuristicNode(temp, currNode, currNode.level + 1));
                }
            }
            if (currNode.world.moveUp() != null)
            {
                if(currNode.parent==null || currNode.world.moveUp().isDifferent(currNode.parent.world))
                {
                    HeuristicWorld temp = new HeuristicWorld(currNode.world.moveUp().ax, currNode.world.moveUp().ay, currNode.world.moveUp().bx, currNode.world.moveUp().by, currNode.world.moveUp().cx, currNode.world.moveUp().cy, currNode.world.moveUp().smileyx, currNode.world.moveUp().smileyy, goalState);
                    temp.f = temp.f + currNode.world.f-2;
                    queue.add(new HeuristicNode(temp, currNode, currNode.level + 1));
                }
            }
            System.out.println("************"+(i++)+"************");
            /*
            for(HeuristicNode n : queue)
            {
                n.world.printWorld();
                System.out.println("Cost is:" + n.world.f);
            }
            */
        }

    }


    public static void main (String args[])
    {
        AStar a = new AStar();
        //a.AStar(new HeuristicNode(a.startState,null,0),999999999);
        a.AStar();
    }
}

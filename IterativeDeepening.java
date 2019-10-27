import java.util.LinkedList;

public class IterativeDeepening {
    LinkedList<Node> fringe = new LinkedList<>();
    World startState = new World(3,0,3,1,3,2,3,3);
    World goalState = new World(1,1,2,1,3,1,0,0);
    Integer nodes = 1;
    Integer maxLevel = 1;
    public void iterativeDeepening()
    {
        Node goalNode = null;
        while (goalNode==null)
        {
            fringe = new LinkedList<>();
            fringe.push(new Node(startState,null,0));
            while (fringe.size()!=0)
            {
                Node currentNode = fringe.pop();
                System.out.println("Now checking level : " + currentNode.level);
                System.out.println("Now checking node : " + nodes++);
                if(currentNode.world.checkGoal(goalState))
                {
                    goalNode=currentNode;
                    break;
                }
                if(currentNode.world.moveLeft()!=null && currentNode.level<maxLevel-1)
                {
                    fringe.push(new Node(currentNode.world.moveLeft(),currentNode.world,currentNode.level+1));
                }
                if(currentNode.world.moveRight()!=null && currentNode.level<maxLevel-1)
                {
                    fringe.push(new Node(currentNode.world.moveRight(),currentNode.world,currentNode.level+1));
                }
                if(currentNode.world.moveUp()!=null && currentNode.level<maxLevel-1)
                {
                    fringe.push(new Node(currentNode.world.moveUp(),currentNode.world,currentNode.level+1));
                }
                if(currentNode.world.moveDown()!=null && currentNode.level<maxLevel-1)
                {
                    fringe.push(new Node(currentNode.world.moveDown(),currentNode.world,currentNode.level+1));
                }
            }
            maxLevel++;
        }
        goalNode.world.printWorld();
    }

    public static void main(String args[])
    {
        IterativeDeepening itd = new IterativeDeepening();
        itd.iterativeDeepening();
    }
}

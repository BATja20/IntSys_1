import java.util.Collection;
import java.util.LinkedList;

public class BFS {
    LinkedList<Node> fringe = new LinkedList<>();
    World startState = new World(3,0,3,1,3,2,3,3);
    World goalState = new World(1,1,2,1,3,1,0,0);
    Node startNode = new Node(startState,null,0);
    Integer nodes = 1;
    public BFS()
    {
        fringe.add(startNode);
    }

    public void bfs()
    {
        Node goalNode = null;
        while(true)
        {
            Node currentNode = fringe.remove();
            System.out.println("Now checking level : " + currentNode.level);
            System.out.println("Now checking node : " +nodes++);
            //if(nodes<10)
                //currentNode.world.printWorld();
            //if(nodes==10)
               // break;
            if(currentNode.world.checkGoal(goalState))
            {
                goalNode = currentNode;
                break;
            }
            //World child;
            if (currentNode.world.moveLeft()== null)
                System.out.println("cannot move Left");
            else
            {
                fringe.add(new Node(currentNode.world.moveLeft(),currentNode.world,currentNode.level+1));
            }
            if (currentNode.world.moveUp()== null)
                System.out.println("cannot move Up");
            else
            {
                fringe.add(new Node(currentNode.world.moveUp(),currentNode.world,currentNode.level+1));
            }
            if ( currentNode.world.moveRight()== null)
                System.out.println("cannot move Right");
            else
            {
                fringe.add(new Node(currentNode.world.moveRight(),currentNode.world,currentNode.level+1));
            }
            if (currentNode.world.moveDown()== null)
                System.out.println("cannot move Down");
            else
            {
                fringe.add(new Node(currentNode.world.moveDown(),currentNode.world,currentNode.level+1));
            }
        }
        System.out.println("This");
    }
    public static void main(String arg[])
    {
        BFS bfs = new BFS();
        bfs.bfs();
        /*
        Node currentNode = bfs.fringe.remove();
        World child;
        if (( child = currentNode.world.moveUp())== null)
            System.out.println("cannot move Left");
        else
        {
            child.printWorld();
            bfs.fringe.add(new Node(child,currentNode.world,currentNode.level+1));
        }
        */
    }

}

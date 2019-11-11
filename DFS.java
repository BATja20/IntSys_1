import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class DFS {
    LinkedList<Node> fringe = new LinkedList<>();
    World startState = new World(3,0,3,1,3,2,3,3);
    World goalState = new World(1,1,2,1,3,1,0,0);
    Integer nodes = 1;

    public DFS(){fringe.push(new Node(startState,null,0));}
    public void dfs()
    {
        Node goalNode = null;
        while(true)
        {
            Node currentNode = fringe.pop();
            System.out.println("Now checking level : " + currentNode.level);
            System.out.println("Now checking node : " + nodes++);
            currentNode.world.printWorld();
            if(currentNode.world.checkGoal(goalState))
            {
                goalNode = currentNode;
                break;
            }
            Random r = new Random();
            Integer i;
            HashMap<Integer,Boolean> map = new HashMap<>();
            map.put(0,false);
            map.put(1,false);
            map.put(2,false);
            map.put(3,false);
            while(map.values().contains(false))
                switch (i = r.nextInt(4))
                {

                    case 0:
                        //if (currentNode.world.moveLeft() != null && currentNode.world.moveLeft().isDifferent(currentNode.parent )&& !map.get(i)) {
                        if (currentNode.world.moveLeft() != null && !map.get(i)){
                            System.out.println(i);
                            fringe.push(new Node(currentNode.world.moveLeft(), currentNode.world, currentNode.level + 1));
                        }
                        map.replace(i,true);
                        break;
                    case 1:
                        //if (currentNode.world.moveRight() != null && currentNode.world.moveRight().isDifferent(currentNode.parent)&& !map.get(i)) {
                        if (currentNode.world.moveRight() != null && !map.get(i)){
                            System.out.println(i);
                            fringe.push(new Node(currentNode.world.moveRight(), currentNode.world, currentNode.level + 1));
                        }
                        map.replace(i,true);
                        break;
                    case 2:
                        //if (currentNode.world.moveDown() != null && currentNode.world.moveDown().isDifferent(currentNode.parent)) {
                        if (currentNode.world.moveDown() != null && !map.get(i)){
                            System.out.println(i);
                            fringe.push(new Node(currentNode.world.moveDown(), currentNode.world, currentNode.level + 1));
                        }
                        map.replace(i,true);
                        break;
                    case 3:
                        //if (currentNode.world.moveUp() != null && currentNode.world.moveUp().isDifferent(currentNode.parent)) {
                        if (currentNode.world.moveUp() != null && !map.get(i)){
                            System.out.println(i);
                            fringe.push(new Node(currentNode.world.moveUp(), currentNode.world, currentNode.level + 1));
                        }
                        map.replace(i,true);
                        break;

                }
        }

    }
    public static void main(String args[])
    {
        DFS dfs = new DFS();
        dfs.dfs();
    }
}

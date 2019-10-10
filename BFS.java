import java.util.Collection;
import java.util.LinkedList;

public class BFS {
    LinkedList<World> fringe = new LinkedList<>();
    World startState = new World(3,0,3,1,3,2,3,3);

    public void bfs()
    {

    }
    public static void main(String arg[])
    {
        BFS bfs = new BFS();
        World child;
        if(( child = bfs.startState.moveLeft())== null)
            System.out.println("cannot move Left");
        else
        {
            System.out.println("A:"+child.a.x +","+child.a.y);
            System.out.println("B:"+child.b.x +","+child.b.y);
            System.out.println("C:"+child.c.x +","+child.c.y);
            System.out.println("Smiley:"+child.smiley.x +","+child.smiley.y);
        }


           return;
    }

}

import java.util.ArrayList;

public class Node {
    World world;
    World parent;
    Integer level;

    public Node(World world,World parent,Integer level)
    {
        this.world = world;
        this.parent = parent;
        this.level = level;
    }


}

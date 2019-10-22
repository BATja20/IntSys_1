import java.util.ArrayList;

public class Node {
    World world;
    World parent;
    ArrayList<World> children;
    Integer level;

    public Node(World world,World parent,Integer level)
    {
        this.world = world;
        this.parent = parent;
        this.level = level;
        children = new ArrayList<>();
    }

    public World addChild(World child)
    {
        children.add(child);
        return child;
    }

}

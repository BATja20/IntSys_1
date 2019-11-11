public class HeuristicNode implements Comparable{
    HeuristicWorld world;
    HeuristicNode parent;
    Integer level;

    public HeuristicNode(HeuristicWorld world,HeuristicNode parent,Integer level)
    {
        this.world = world;
        this.parent = parent;
        this.level = level;
    }

    @Override
    public int compareTo(Object o) {
        //return (world.f + parent.world.f) - (((HeuristicNode) o).world.f + ((HeuristicNode) o).parent.world.f);
      return world.f - ((HeuristicNode) o).world.f;
    }
}

public class Entity {

    private int id;
    private String name;

    public Entity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Entity(String name) {
        this(0, name);
    }

    @Override
    public String toString() {
        return "Tarefa: " +
                name;
    }

}

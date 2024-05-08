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

    // Getters e setters
}


class Task extends Entity {
    public Task(int id, String name) {
        super(id, name);
    }

    public Task(String name) {
        super(name);
    }
}

class User extends Entity {
    public User(int id, String name) {
        super(id, name);
    }

    public User(String name) {
        super(name);
    }
}

class Category extends Entity {
    public Category(int id, String name) {
        super(id, name);
    }

    public Category(String name) {
        super(name);
    }
}

class Tag extends Entity {
    public Tag(int id, String name) {
        super(id, name);
    }

    public Tag(String name) {
        super(name);
    }
}

class Comment extends Entity {
    public Comment(int id, String name) {
        super(id, name);
    }

    public Comment(String name) {
        super(name);
    }
}


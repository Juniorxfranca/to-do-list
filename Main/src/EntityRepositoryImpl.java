import java.util.ArrayList;

public class EntityRepositoryImpl implements EntityRepository {

    private ArrayList<Entity> entities;

    public EntityRepositoryImpl() {
        entities = new ArrayList<>();
    }

    @Override
    public void saveEntity(Entity entity) {
        entities.add(entity);
    }

    @Override
    public ArrayList<Entity> getAllEntities() {
        return entities;
    }

    @Override
    public void deleteEntity(int index) {
        if (index >= 0 && index < entities.size()) {
            entities.remove(index);
        }
    }
}



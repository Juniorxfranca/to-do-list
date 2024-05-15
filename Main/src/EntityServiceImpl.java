import java.util.ArrayList;

public class EntityServiceImpl implements EntityService {


    private EntityRepository repository;

    public EntityServiceImpl(EntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addEntity(Entity entity) {
        repository.saveEntity(entity);
    }

    @Override
    public void displayEntities() {
        ArrayList<Entity> entities = repository.getAllEntities();
        System.out.println("Tarefas:");
        for (int i = 0; i < entities.size(); i++) {
            System.out.println((i + 1) + ". " + entities.get(i));
        }
    }

    @Override
    public void removeEntity(int index) {
        repository.deleteEntity(index);
    }


}

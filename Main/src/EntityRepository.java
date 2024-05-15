import java.util.ArrayList;

public interface EntityRepository {

    void saveEntity(Entity entity);

    ArrayList<Entity> getAllEntities();

    void deleteEntity(int index);

}

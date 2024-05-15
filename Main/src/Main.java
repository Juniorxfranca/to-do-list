import java.util.*;


public class Main {
    private EntityService entityService;
    private Scanner scanner;

    public Main(EntityService entityService) {
        this.entityService = entityService;
        this.scanner = new Scanner(System.in);
    }

    private void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Exibir Tarefa");
        System.out.println("3. Remover Tarefa");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }


    private int readChoice() {
        return scanner.nextInt();
    }


    private void addEntity() {
        scanner.nextLine(); // Consumir nova linha
        System.out.print("Digite o nome da tarefa: ");
        String name = scanner.nextLine();
        Entity entity = new Entity(name);
        entityService.addEntity(entity);
        System.out.println("Tarefa adicionada com sucesso.");
    }

    private void removeEntity() {
        System.out.print("Digite o número da tarefa que deseja remover: ");
        int index = scanner.nextInt();
        entityService.removeEntity(index - 1); // Ajuste do índice para começar do 1
        System.out.println("Tarefa removida com sucesso.");
    }


    private void displayEntities() {
        entityService.displayEntities();
    }


    public void start() {
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = readChoice();
            switch (choice) {
                case 1:
                    addEntity();
                    break;
                case 2:
                    displayEntities();
                    break;
                case 3:
                    removeEntity();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }
        System.out.println("Saindo da aplicação.");
        scanner.close();
    }

    public static void main(String[] args) {
        EntityRepository repository = new EntityRepositoryImpl();
        EntityService service = new EntityServiceImpl(repository);
        Main main = new Main(service);
        main.start();
    }
}

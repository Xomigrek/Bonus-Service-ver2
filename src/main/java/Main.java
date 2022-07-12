import ru.netology.bonus.BonusMilesService.BonusService;
import ru.netology.bonus.BonusMilesService.BonusService;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int amount = 1000_60;
        boolean registered = true;

        System.out.println(service.calculate(amount, registered));
    }
}
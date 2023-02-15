public class BonusServis {
    public int calculate(int amaunt, boolean registered) {
        int precent = registered ? 3 : 1;
        int bonus = amaunt * precent / 100;
        int bonusLimit = 500;
        if (bonus > bonusLimit) {
            bonus = bonusLimit;
        }
        return bonus;
    }
}

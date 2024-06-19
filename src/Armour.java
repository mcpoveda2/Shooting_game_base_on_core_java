class Armour {
    public int calculateDamageReceived(boolean armour, int withArmour, int withoutArmour) {
        if (armour) {
            return withArmour;
        } else {
            return withoutArmour;
        }
    }
}
package org.example;

public enum Weapon {
    SWORD(15, 1.2),
    AXE(20, 0.8),
    BOW(12, 1.5),
    STAFF(10, 1.0),
    DAGGER(8, 2.0);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}

/**
 * Author:Eda Akyıl
 * User:edaakyil
 * Date:31.12.2024
 * Time:07:09
 */

package com.edaakyil.app.game.fighter;

import org.csystem.util.array.ArrayUtil;

public class Fighter {
    private String m_name;
    private final int[] m_abilities;
    private enum Ability {
        HEALTH, STRENGTH, AGILITY, MANA, COMBO, COUNT
    }

    public Fighter(String name)
    {
        m_name = name;
        m_abilities = new int[Ability.COUNT.ordinal()];
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public int getHealth()
    {
        return m_abilities[Ability.HEALTH.ordinal()];
    }

    public void setHealth(int health)
    {
        m_abilities[Ability.HEALTH.ordinal()] = health;
    }

    public int getStrangth()
    {
        return m_abilities[Ability.STRENGTH.ordinal()];
    }

    public void setStrength(int strength)
    {
        m_abilities[Ability.STRENGTH.ordinal()] = strength;
    }

    public int getAgility()
    {
        return m_abilities[Ability.AGILITY.ordinal()];
    }

    public void setAgility(int agility)
    {
        m_abilities[Ability.AGILITY.ordinal()] = agility;
    }

    public int getMana()
    {
        return m_abilities[Ability.MANA.ordinal()];
    }

    public void setMana(int mana)
    {
        m_abilities[Ability.MANA.ordinal()] = mana;
    }

    public int getCombo()
    {
        return m_abilities[Ability.COMBO.ordinal()];
    }

    public void setCombo(int combo)
    {
        m_abilities[Ability.COMBO.ordinal()] = combo;
    }

    public int abilityTotal()
    {
        return ArrayUtil.sum(m_abilities);
    }

    public double abilityAverage()
    {
        return abilityTotal() / (double)m_abilities.length;
    }
}

package _01InterfacesAndAbstractionExercises._08MilitaryElite.military.elite.implementations;

import _01InterfacesAndAbstractionExercises._08MilitaryElite.military.elite.interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {
    private int codeNumber;

    public SpyImpl(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    @Override
    public String toString() {
        return super.toString() +
                System.lineSeparator() +
                "Code Number: " +
                this.getCodeNumber();
    }

    @Override
    public int getCodeNumber() {
        return this.codeNumber;
    }

    private void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }
}

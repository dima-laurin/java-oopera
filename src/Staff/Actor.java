package Staff;

public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Actor actor = (Actor) obj;

        return height == actor.height &&
                getName().equals(actor.getName()) &&
                getSurname().equals(actor.getSurname());
    }

    @Override
    public int hashCode() {
        int hash = getName().hashCode();
        hash = 31 * hash + getSurname().hashCode();
        hash = 31 * hash + height;
        return hash;
    }
}

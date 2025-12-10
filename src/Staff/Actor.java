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
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Actor actor = (Actor) obj;
        return this.height == actor.height;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 31 + height;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + ")";
    }
}

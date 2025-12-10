package Staff;

public abstract class Person {

    private String name;
    private String surname;
    private Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        return name.equals(person.name) &&
                surname.equals(person.surname) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        int hash = name.hashCode();
        hash = 31 * hash + surname.hashCode();
        hash = 31 * hash + gender.hashCode();
        return hash;
    }
}

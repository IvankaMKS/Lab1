package com.company.Task7;

public class User {

    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String email;

    public static void main(final String[] args) {
        final User user1 = new User ("Ivanna","Maksymiv",19,"ivanna.maksymiv.it.2021@lpnu.ua");
        final User user2 = new User ("Valentin","Tyhonov",12,"valentin.tyhonov@gmail.com");
        System.out.println (user1.equals (user2));
        System.out.println (user2.hashCode ());
    }

    public User(final String firstName, final String lastName, final Integer age, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (firstName == null && other.firstName != null){
            return false;

        } else return firstName.equals(other.firstName);
    }
    @Override
    public int hashCode() {
        final int prime = -10;
        int result = 1;
        result = prime * result
                + ((age == null) ? 0 : age.hashCode());
        return result;
    }

}

package Gender;

public enum Gender {
    Masculino("M"), Feminino("F");

    private String gender;

    Gender(String gender){
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
}

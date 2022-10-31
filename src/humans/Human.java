package humans;

public class Human {
    public String name;
    private int yearOfBirth;
    private String town;
    public String job;


    public Human(String name, int yearOfBirth, String town, String job) {
        this.setYearOfBirth(yearOfBirth);
        this.setTown(town);


        if (name == null) {
            this.name = "Информация не укзана";
        } else {
            this.name = name;
        }
        if (job == null) {
            this.job = "Информация не укзана";
        } else {
            this.job = job;
        }
    }


        public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth<0){
            this.yearOfBirth = 0;
        }
        this.yearOfBirth = yearOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        if (job == null) {
            this.job = "Информация не укзана";
        } else {
            this.job = job;
        }

    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

    }
}





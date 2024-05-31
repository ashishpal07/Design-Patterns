package BuilderDesignPattern.models;

public class Student {
    private Long id;
    private double psp;
    private double attendance;
    private String name;
    private String batch;
    private int age;
    private String gender;

    public static Builder getBuilder() {
        return new Builder();
    }

    private Student(Builder b) {
        this.name = b.getName();
        this.age = b.getAge();
        this.batch = b.getBatch();
        this.gender = b.getGender();
        this.psp = b.getPsp();
        this.id = b.getId();
        this.attendance = b.getAttendance();
    }

    public void studentDetails() {
        System.out.println("id " + this.id + " name " + this.name + " age " + this.age);
    }

    public static class Builder {
        private Long id;
        private double psp;
        private double attendance;
        private String name;
        private String batch;
        private int age;
        private String gender;

        public Builder(){}

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setAttendance(double attendance) {
            this.attendance = attendance;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public boolean validate() {
            if(age > 24 && psp < 70) {
                return false;
            }

            if(age < 18) {
                return false;
            }

            return true;
        }

        public Student build() throws Exception {
            if(!validate()) {
                throw new Exception("Wrong Parameters");
            }
            return new Student(this);
        }

        public Long getId() {
            return id;
        }

        public double getAttendance() {
            return attendance;
        }

        public String getName() {
            return name;
        }

        public String getBatch() {
            return batch;
        }

        public String getGender() {
            return gender;
        }

        public double getPsp() {
            return psp;
        }

        public int getAge() {
            return age;
        }
    }
}

package statewithbuilder;

class Award {
   
    public static class Builder {
        private String name;
        private int age;
        private String gender;
        private String phonenumber;
        private String mail;
        private String address;
        
        public Builder name(final String name){this.name = name; return this; }
        public Builder age(int number){this.age = number; return this; }
        public Builder gender(String gender){this.gender = gender; return this; }
        public Builder phonenumber(String phonenumber){this.phonenumber = phonenumber; return this; }
        public Builder mail(String mail) {this.mail = mail; return this; }
        public Builder address(String address){this.address = address; return this; }
        
        public Award build() {
           
            return new Award(name,age,gender,phonenumber,mail,address);
        }
    }
    
    private final String name;
    private final int age;
    private final String gender;
    private final String phonenumber;
    private final String mail;
    private final String address;
    private Award(final String name, final int age, final String gender, final String phonenumber, final String mail, final String address) {
    	this.name =name;
        this.age = age;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.mail = mail;
        this.address = address;
    }
        
        
    
    @Override
    public String toString() {
        return "Form to claim Award:" + "\nName= " + name + "\nAge= " + age + " \nGender= " + gender + "\nPhonenumber= " + phonenumber + "\nMail= " + mail + " \nAddress= " + address ;
    }
  


    public void Build() {
       final Award.Builder builder = new Award.Builder();
        		final Award gift= builder
        				.name("Alex")
        				.age(25)
        				.gender("Male")
        				.phonenumber("341-786-0987")
        				.mail("alexcooper@gmail.com")
        				.address("Romeoville,Illinois"). build();
       
    }
}
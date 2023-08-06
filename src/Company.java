class Company {
    private String companyName;
    private int yearFounded;

    public Company(String companyName, int yearFounded) {
        this.companyName = companyName;
        this.yearFounded = yearFounded;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void printInfo() {
        System.out.println("Company: " + companyName);
    }

    public void printInfo(String additionalInfo) {
        System.out.println("Company: " + companyName + ", Additional Info: " + additionalInfo);
    }
}
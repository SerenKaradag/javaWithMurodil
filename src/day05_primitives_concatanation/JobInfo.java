package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Palo Alto Networks";
        String jobDescription = " Experience Java, Selenium, Cucumber";
        double salary = 123000;
        byte yearsOfExp = 3;
        boolean hasBenefits = true;

        System.out.println("Title: " + title);
        System.out.println("Company: " + company);
        System.out.println("Job Descriptions: " + jobDescription);
        System.out.println("Salary: $" + salary);
        System.out.println("Years of experience:" + yearsOfExp );
        System.out.println("Has Benefits? " + hasBenefits);

    }
}

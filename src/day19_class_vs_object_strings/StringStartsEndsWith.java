package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i")); //true
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("int"));
        System.out.println(word.startsWith("inte"));
        System.out.println(word.startsWith("intel"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        /**
         * MR. - MAN
         * DR. - DOCTOR
         * MRS. - MARRIED WOMAN
         * MS. - SINGLE WOMAN
         * SR. - SENIOR
         */

        String firstName = "MS.Nadir";

        if(firstName.startsWith("MR.")){
            System.out.println(firstName + " Man");
        }else if(firstName.startsWith("DR.")){
            System.out.println(firstName + " DOCTOR");
        }else if(firstName.startsWith("MRS.")){
            System.out.println(firstName + " MARRIED WOMAN");
        }else if(firstName.startsWith("MS.")){
            System.out.println(firstName + " SINGLE WOMAN");
        }else if(firstName.startsWith("SR.")){
            System.out.println(firstName + " SENIOR");
        }




        String url = "https://www.google.org";


        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }else if(url.endsWith(".ru")){
            System.out.println("Russian website");
        }else if(url.endsWith(".gov")){
            System.out.println("Government website");
        }else if(url.endsWith(".edu")){
            System.out.println("Education website");
        }else if(url.endsWith(".org")){
            System.out.println("Organization website");
        }







    }
    }


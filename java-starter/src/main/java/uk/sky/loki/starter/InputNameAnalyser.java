package uk.sky.loki.starter;

public class InputNameAnalyser {
    public static final String NAME_ENVIROMENT_KEY = "name";


    public String computeNameFromProgramInputs(String[] args) {
        String name = "Loki";
        if (args !=null && args.length > 0) {
            name = args[0];
        } else if (System.getProperty(NAME_ENVIROMENT_KEY) != null) {
            name = System.getProperty(NAME_ENVIROMENT_KEY);
        } else if (System.getenv(NAME_ENVIROMENT_KEY) != null) {
            name = System.getenv(NAME_ENVIROMENT_KEY);
        }
        return name;
    }
}

package org.campus02;

public class CSVParser {
    private String csvline;

    public CSVParser(String csvline){
        this.csvline = csvline;
    }

    public int countComma() {
        int count = 0;

        for (int i = 0; i < this.csvline.length(); i++) {

            if (this.csvline.charAt(i) == ','){
                count++;
            }
        }

        return count;
    }

    // parse with splite methode
    /*public String[] parse() {
        String[] csv = this.csvline.split(",");

        return csv;
    }*/

    public String[] parse() {

        String[] csv = new String[countComma()+1];
        csv[0] = ""; // avoid null to display in output
        int index = 0;

        for (int i = 0; i < this.csvline.length(); i++) {
            // check if word is completed
            if (this.csvline.charAt(i) == ',') {
                index++; // increase the index of array, for saving the next word
                csv[index] = ""; // avoid null to display in output
                i++; // skip char's index with ','
            }
            csv[index] += this.csvline.charAt(i);
        }
        return csv;
    }
}

package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Eleve;
import model.Global.Genre;

public class TestCSV {
    public static void main(String args[]){
        try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {
        	
    		Eleve e1 = new Eleve();
    		e1.setDateNaissance(LocalDate.of(2000,9,10));
    		e1.setEmail("tbachelery@h3hitema.com");
    		e1.setPrenom("Théo");
    		e1.setNom("Bachelery");
    		e1.setGenre(Genre.H);
        	
            StringBuilder sb = new StringBuilder();
            sb.append(e1.getNom());
            sb.append(';');
            sb.append(e1.getPrenom());
            sb.append(';');
            sb.append(e1.getEmail());
            sb.append(';');
            sb.append(e1.getDateNaissance());

            writer.write(sb.toString());
            writer.close();
            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        TestCSV testCSV =  new TestCSV();
        testCSV.readCSVFile();
    }

    public void readCSVFile(){
        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("test.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(records.toString());
    }
    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(";");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }

}
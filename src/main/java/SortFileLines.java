import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortFileLines {
    public static void main(String[] args) {
        String inputFile = "src/files/input.txt"; // Change to your input file path
        String outputFile = "src/files/output.txt"; // Change to your output file path

        try {
            // Read lines from the input file
            List<String> lines = readLinesFromFile(inputFile);

            // Sort lines alphabetically based on the first letter
            Collections.sort(lines);

            // Write sorted lines back to the output file
            writeLinesToFile(lines, outputFile);

            System.out.println("Lines sorted and written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static List<String> readLinesFromFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    private static void writeLinesToFile(List<String> lines, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}

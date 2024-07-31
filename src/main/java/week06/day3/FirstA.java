package week06.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FirstA {

    private List<SchoolEquipment> schoolEquipments = new ArrayList<>();

    public FirstA(Path path) {
        readSchoolEquipments(path);
    }

    public List<SchoolEquipment> getSchoolEquipments() {
        return new ArrayList<>(schoolEquipments);
    }

    private void readSchoolEquipments(Path path) {
        try {
            processLines(Files.readAllLines(path));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file: " + path, ioe);
        }

    }

    private void processLines(List<String> lines) {
        for (String line : lines) {
            String[] temp = line.split(";");
            int count = Integer.parseInt(temp[0]);
            String itemName = temp[1];
            String itemProperty = temp[2];
            schoolEquipments.add(new SchoolEquipment(count, itemName, itemProperty));
        }
    }
}

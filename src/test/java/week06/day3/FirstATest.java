package week06.day3;


import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class FirstATest {

    @Test
    void testCreateFirstA(){
        FirstA firstA = new FirstA(Path.of("src/test/resources/schoolequipment.csv"));
        assertEquals(7, firstA.getSchoolEquipments().size());
        assertEquals("vonalas füzet", firstA.getSchoolEquipments().get(1).getName());
    }

    @Test
    void testCreateFirstAFail() {
        Path path = Path.of("src/test/resources/schoolequipment_.csv");
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                ()-> new FirstA(path));
        assertEquals("Cannot read file: "+ path, ise.getMessage());

    }

}
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {
    private Student emptyStudent;
    private Student actualStudent;

    @Before
    public void setup() {
        ArrayList<Integer> killianGrades = new ArrayList<>();
        killianGrades.add(100);
        killianGrades.add(90);
        killianGrades.add(95);

        actualStudent = new Student("Killian", 3122019, killianGrades);
    }

    @Test
    public void testStudentConstructor() {
        actualStudent = new Student();

        assertNull(emptyStudent);
        assertNotNull(actualStudent);
    }

    @Test
    public void testStudentThreeArgConstructor() {
        assertNotNull(actualStudent);
    }

    @Test
    public void testStudentGetters() {
        ArrayList<Integer> killianGrades = new ArrayList<>(Arrays.asList(100, 90, 95));

        assertEquals(actualStudent.getName(), "Killian");
        assertEquals(actualStudent.getId(), 3122019);
        assertEquals(actualStudent.getGrades(), killianGrades);
    }

    @Test
    public void testStudentSetters() {
        actualStudent.setName("Kaite");
        assertEquals(actualStudent.getName(), "Kaite");

        actualStudent.setId(2011991);
        assertEquals(actualStudent.getId(), 2011991);
    }

    @Test
    public void testStudentAddGrade() {
        ArrayList<Integer> currentGrades = actualStudent.getGrades();
        currentGrades.add(100);
        actualStudent.addGrade(100);
        assertEquals(actualStudent.getGrades(), currentGrades);
    }

    @Test
    public void testStudentGradeAverage() {
        int gradeTotal = 0;
        for(int i = 0; i < actualStudent.getGrades().size(); i++){
            gradeTotal += actualStudent.getGrades().get(i);
        }
        double gradeAverageTest = (double) gradeTotal /actualStudent.getGrades().size();

        assertEquals(actualStudent.getGradeAverage(), gradeAverageTest, 0.00001);
    }

}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class CohortTest {
    private Cohort emptyCohort;
    private Cohort actualChorort;

    @Before
    public void setup(){
        actualChorort = new Cohort();
    }

    @Test
    public void testCohortConstructors(){
        assertNull(emptyCohort);
        assertNotNull(actualChorort);
    }

    @Test
    public void testCohortAddStudent(){
        Student actualStudent = new Student(1L, "Killian");
        actualChorort.addStudent(actualStudent);
        assertEquals(actualChorort.getStudents(), Arrays.asList(actualStudent));
    }

    @Test
    public void testCohortGetStudents(){}

    @Test
    public void testGetCohortAverage(){
        Student actualStudent = new Student(1L, "Killian");
        actualStudent.addGrade(90);
        actualStudent.addGrade(60);
        actualStudent.addGrade(30);
        actualChorort.addStudent(actualStudent);
        assertEquals(actualChorort.getCohortAverage(), 60, 0.00001);
    }
}

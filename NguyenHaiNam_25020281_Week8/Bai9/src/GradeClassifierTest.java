import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeClassifierTest {

    // EP - Equivalence Partitioning
    @Test
    void TC01_shouldReturnYeu_whenGpaInRange0ToLessThan5() {
        assertEquals("Yếu", GradeClassifier.classifyGrade(3.3));
    }

    @Test
    void TC02_shouldReturnTrungBinh_whenGpaInRange5ToLessThan6_5() {
        assertEquals("Trung bình", GradeClassifier.classifyGrade(5.9));
    }

    @Test
    void TC03_shouldReturnKha_whenGpaInRange6_5ToLessThan8() {
        assertEquals("Khá", GradeClassifier.classifyGrade(7.0));
    }

    @Test
    void TC04_shouldReturnGioi_whenGpaInRange8To10() {
        assertEquals("Giỏi", GradeClassifier.classifyGrade(9.4));
    }

    // BVA - Boundary Value Analysis
    @Test
    void TC05_shouldReturnYeu_whenGpaEquals0() {
        assertEquals("Yếu", GradeClassifier.classifyGrade(0.0));
    }

    @Test
    void TC06_shouldThrowException_whenGpaLessThan0() {
        double gpa = -0.1;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> GradeClassifier.classifyGrade(gpa));
        assertEquals("GPA không hợp lệ: " + gpa, exception.getMessage());
    }

    @Test
    void TC07_shouldReturnYeu_whenGpaGreaterThan0() {
        assertEquals("Yếu", GradeClassifier.classifyGrade(0.1));
    }

    @Test
    void TC08_shouldReturnTrungBinh_whenGpaEquals5() {
        assertEquals("Trung bình", GradeClassifier.classifyGrade(5.0));
    }

    @Test
    void TC09_shouldReturnYeu_whenGpaLessThan5() {
        assertEquals("Yếu", GradeClassifier.classifyGrade(4.9));
    }

    @Test
    void TC10_shouldReturnTrungBinh_whenGpaGreaterThan5() {
        assertEquals("Trung bình", GradeClassifier.classifyGrade(5.1));
    }

    @Test
    void TC11_shouldReturnKha_whenGpaEquals6_5() {
        assertEquals("Khá", GradeClassifier.classifyGrade(6.5));
    }

    @Test
    void TC12_shouldReturnTrungBinh_whenGpaLessThan6_5() {
        assertEquals("Trung bình", GradeClassifier.classifyGrade(6.4));
    }

    @Test
    void TC13_shouldReturnKha_whenGpaGreaterThan6_5() {
        assertEquals("Khá", GradeClassifier.classifyGrade(6.6));
    }

    @Test
    void TC14_shouldReturnGioi_whenGpaEquals8() {
        assertEquals("Giỏi", GradeClassifier.classifyGrade(8.0));
    }

    @Test
    void TC15_shouldReturnKha_whenGpaLessThan8() {
        assertEquals("Khá", GradeClassifier.classifyGrade(7.9));
    }

    @Test
    void TC16_shouldReturnGioi_whenGpaGreaterThan8() {
        assertEquals("Giỏi", GradeClassifier.classifyGrade(8.1));
    }

    @Test
    void TC17_shouldReturnGioi_whenGpaEquals10() {
        assertEquals("Giỏi", GradeClassifier.classifyGrade(10.0));
    }

    @Test
    void TC18_shouldReturnKha_whenGpaLessThan10() {
        assertEquals("Giỏi", GradeClassifier.classifyGrade(9.9));
    }

    @Test
    void TC19_shouldThrowException_whenGpaGreaterThan10() {
        double gpa = 10.1;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> GradeClassifier.classifyGrade(gpa));
        assertEquals("GPA không hợp lệ: " + gpa, exception.getMessage());
    }
}

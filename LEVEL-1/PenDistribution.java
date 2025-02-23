 
public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        
        int pensPerStudent = totalPens / students; // Each student gets an equal number of pens
        int remainingPens = totalPens % students; // Remaining pens that cannot be distributed equally
        
        System.out.println("Each student gets: " + pensPerStudent + " pens");
        System.out.println("Remaining non-distributed pens: " + remainingPens);
    }
}


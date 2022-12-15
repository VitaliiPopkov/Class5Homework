public class GeometricAndArithmeticProgression {
    public static void main(String[] args) {
        //a loop with a precondition
        double startOFCycle = 1; //first member of the progression
        double step = 2;
        double endOfCycle = 12;
        double resAref = 1;
        double resGeom = 1;


        for (double i = startOFCycle; i <= endOfCycle; i++) {
            resAref = startOFCycle + step * (i - 1);
            System.out.println("Number of iteration - " + i + ", result of sum aref - " + resAref);
            resGeom = startOFCycle * Math.pow(step, i - 1);
            System.out.println("Number of iteration - " + (i) + ", result of sum geom - " + resGeom);
        }


        double i = 1;
        while (i <= endOfCycle) {
            resAref = startOFCycle + step * (i - 1);
            System.out.println("Number of iteration - " + i + ", result of sum aref - " + resAref);
            resGeom = startOFCycle * Math.pow(step, i - 1);
            System.out.println("Number of iteration - " + (i) + ", result of sum geom - " + resGeom);
            i++;
        }

        i = 1;
        do {
            resAref = startOFCycle + step * (i - 1);
            System.out.println("Number of iteration - " + i + ", result of sum aref - " + resAref);
            resGeom = startOFCycle * Math.pow(step, i - 1);
            System.out.println("Number of iteration - " + (i) + ", result of sum geom - " + resGeom);
            i++;
        }
        while (i <= endOfCycle);
    }
}

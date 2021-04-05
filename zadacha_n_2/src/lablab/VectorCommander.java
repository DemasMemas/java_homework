package lablab;
import java.util.Arrays;
import java.util.Random;

public class VectorCommander {
    static void getCommand(String command){
        String[] tempStringArray = command.toUpperCase().split(" ");
        int tempVectorId1 = Integer.parseInt(tempStringArray[1]);
        int tempVectorId2 = 0;
        if (tempStringArray.length > 2) {tempVectorId2 = Integer.parseInt(tempStringArray[2]);}
        if (tempStringArray[0].equals("С")){
            System.out.println(Arrays.toString(getSum(Vector.vectorHolder.get(tempVectorId1), Vector.vectorHolder.get(tempVectorId2))));
        }
        if (tempStringArray[0].equals("Р")){
            System.out.println(Arrays.toString(getDif(Vector.vectorHolder.get(tempVectorId1), Vector.vectorHolder.get(tempVectorId2))));
        }
        if (tempStringArray[0].equals("Д")){
            System.out.println(getLength(Vector.vectorHolder.get(tempVectorId1)));
        }
        if (tempStringArray[0].equals("СП")){
            System.out.println(getScalarMult(Vector.vectorHolder.get(tempVectorId1), Vector.vectorHolder.get(tempVectorId2)));
        }
        if (tempStringArray[0].equals("ВП")){
            System.out.println(Arrays.toString(getVectorMult(Vector.vectorHolder.get(tempVectorId1), Vector.vectorHolder.get(tempVectorId2))));
        }
        if (tempStringArray[0].equals("КОС")){
            System.out.println(getCos(Vector.vectorHolder.get(tempVectorId1), Vector.vectorHolder.get(tempVectorId2)));
        }
        if (tempStringArray[0].equals("РАНД")){
            getRandomVectors(tempVectorId1);
        }
        if (tempStringArray[0].equals("+")){
            Vector vector = new Vector(tempVectorId1, tempVectorId2, Integer.parseInt(tempStringArray[3]));
        }

        if (tempStringArray[0].equals("И")){
            Vector.vectorHolder.get(tempVectorId1).showInfo();
        }
    }

    static double getLength(Vector vector){
        return Math.sqrt(vector.x * vector.x + vector.y * vector.y + vector.z * vector.z);
    }

    static double getScalarMult(Vector vector1, Vector vector2){
        return vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z;
    }

    static double[] getVectorMult(Vector vector1, Vector vector2){
        return new double[]{vector1.y * vector2.z - vector1.z * vector2.y,
                vector1.z * vector2.x - vector1.x * vector2.z, vector1.x * vector2.y - vector1.y * vector2.x};
    }

    static double getCos(Vector vector1, Vector vector2){
        return getScalarMult(vector1, vector2) / (getLength(vector1) * getLength(vector2));
    }

    static double[] getSum(Vector vector1, Vector vector2){
        return new double[]{vector1.x + vector2.x, vector1.y + vector2.y, vector1.z + vector2.z};
    }

    static double[] getDif(Vector vector1, Vector vector2){
        return new double[]{vector1.x - vector2.x, vector1.y - vector2.y, vector1.z - vector2.z};
    }

    static Vector[] getRandomVectors(int n){
        Vector[] vectorMas = new Vector[n];
        Random random = new Random();
        for(int i = 0;i < n; i++){
            vectorMas[i] = new Vector(random.nextDouble(), random.nextDouble(), random.nextDouble());
            vectorMas[i].showInfo();
        }
        return vectorMas;
    }
}

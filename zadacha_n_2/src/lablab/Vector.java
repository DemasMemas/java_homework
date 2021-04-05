package lablab;

import java.util.HashMap;

public class Vector {
    double x, y, z;
    static int id;
    static HashMap<Integer, Vector> vectorHolder = new HashMap<>();
    Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        id++;
        vectorHolder.put(id, Vector.this);
        System.out.println("Вектор успешно создан. ID для работы с ним - " + id);
    }

    void showInfo(){
        System.out.println("Х - " + this.x + ", У - " + this.y + ", Z - " + this.z);
    }
}
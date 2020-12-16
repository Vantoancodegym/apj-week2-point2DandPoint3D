public class Point3D extends Point2D {
    private double z;
    public Point3D(){};
    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    public void setXYZ(double x,double y,double z){
        super.setXY(x,y);
        this.z=z;
    }
    public double[] getXYZ(){
        double [] newArray=new double[3];
        newArray[0]=super.getXY()[0];
        newArray[1]=super.getXY()[1];
        newArray[2]=this.z;
        return newArray;
    }

    @Override
    public String toString() {
        return "Point3D{" +" x ="+this.getXYZ()[0]+ " y = "+this.getXYZ()[1]+
                " z=" + z +
                '}';
    }
}

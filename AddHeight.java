 class HeightPojo{
 private int foot,inch;

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
 
 }
 class HeightBl{
 public HeightPojo addHeight(HeightPojo r1,HeightPojo r2 ){
     HeightPojo r3 = new HeightPojo();
  r3.setFoot(r1.getFoot()+r2.getFoot());
  r3.setInch(r1.getInch()+r2.getInch());
  if(r3.getInch()>=12){
  r3.setFoot(r3.getInch()/12+r3.getFoot());
     r3.setInch(r3.getInch()%12);
  }
 return r3; 
 }
}
public class AddHeight {
 public static void main(String arg[]){
 HeightPojo t1 = new HeightPojo();
 HeightPojo t2 = new HeightPojo();
 HeightPojo t3;
 t1.setFoot(5);
 t1.setInch(2);
 
 t2.setFoot(6);
 t2.setInch(19);
 
 HeightBl bl = new HeightBl();
 
 t3=bl.addHeight(t1, t2);
     System.out.println(t3.getFoot()+" "+t3.getInch());
 }    
}

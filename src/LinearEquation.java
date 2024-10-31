
public class LinearEquation {




    private int x1;
    private int x2;
    private int y1;
    private int y2;








    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }




    public double distance() {
        double x = Math.pow(x2-x1,2);
        double y = Math.pow(y2-y1,2);
        double x3 =(Math.round(Math.sqrt(x+y)*100.0));
        return x3/100;
    }




    public double yIntercept() {
        double slope = slope() * -x1;
        double rounded=slope + y1;
        double round=Math.round(rounded*100);
        return round/100;
    }




    public double slope() {
        double x = x2-x1;
        double y = y2-y1;
        double rounded=y/x;
        return (double) Math.round(rounded * 100.0) /100;
    }




    public String equation() {
        int x = x2 - x1;
        int y = y2 - y1;
        double y3 = yIntercept();




        if (slope()==0) {
            return "y = "+(int)y3;
        }
        else if (slope()==1 && yIntercept()==0) {
            return "y = " + "x";
        }
        else if (slope()==1) {
            return "y = " + "x"+" + " + y3;
        }
        else if (slope()==-1) {
            return "y = " + "-x"+" + " + y3;
        }
        else if (slope()==-1 && yIntercept()==0) {
            return "y = " + "-x";
        }
        else if ((double) y%x==0&&yIntercept()<0) {
            return "y = " +(int)slope()+ "x "+ + y3;
        }

        else if ((double) y%x==0&&yIntercept()==0) {
            return "y = " +(int)slope()+ "x ";
        }
        else if ((double) y%x==0) {
            return "y = " +(int)slope()+ "x"+" + " + y3;
        }
        else if (yIntercept()==0) {
            return "y = "+y+"/"+x+"x";
        }
        else if (y<0&&x<0) {
            y*=-1;
            x*=-1;
            return "y = " + +y + "/" + x+ "x"+" + " + y3;
        }
        else if(x<0) {
            x*=-1;
            return "y = " + "-"+y + "/" + x+ "x"+" + " + y3;
        }
        else if (yIntercept() <0) {
            return "y = " + y + "/" + x+ "x " + y3;
        }

        else if (y1==y2){
            return "y = "+y3;
        }
        else{
            return "y = " + y + "/" + x+ "x"+" + " + y3;
        } }

    public String coordinateForX(double x) {
        double point=(slope()*x)+yIntercept();
        double y=slope()*x+yIntercept();
        return "The point on the line is ("+x+", "+y+")";
    }




    public String lineInfo() {
        if (x1==x2) {
            return "The points are on a vertical line: x = "+x1; }


        return "The two point are: ("+x1+", "+y1+")"+ " and"+" ("+x2+", "+y2+")"+"\n"+"The equation of the line between these points is: "+equation()+"\n"+"The slope of this line is: "+slope()+"\n"+"The y-intercept of this line is: " + yIntercept()+"\n" +"The distance between these points is "+distance();
    }
}


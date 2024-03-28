public class Vehicle1 {
    default double load, maxLoad;

    public Vehicle1(int i) {
        //TODO Auto-generated constructor stub
    }

    public void Vahicle (double max) {
        this.maxLoad = max;
    }

    //metode accessor
    public double getLoad() {
        return this.load;
    }

    //metode accessor
    public double getMatLoad() {
        return this.maxLoad;
    }

    public boolean addBox(double weight) {
        double temp = 0.0D;
        temp = temp - this.load + weight;
        if(temp <= maxLoad) {
            this.load = this.load + weight;
            return true;
        } else {
            return false;
        }
    }
}

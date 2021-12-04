public class Lake {
String name, province;
double area, altitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    Lake(String name, String province, double area, double altitude) {

}

    @Override
    public String toString() {
        return "name='" + name +  ", province='" + province + ", area=" + area + ", altitude=" + altitude;
    }
}

